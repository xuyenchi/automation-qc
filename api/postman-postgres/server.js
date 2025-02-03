const express = require('express');
const bodyParser = require('body-parser');
const { Client } = require('pg');
const dotenv = require('dotenv');

// xử lý cho nhiều DB
// Load environment variables from .env file
dotenv.config();

const app = express();
const port = 3000;

// Function to create a new database client
const createClient = (databaseUrl) => {
  return new Client({
    connectionString: databaseUrl,
  });
};

// Middleware to set the database connection based on a request header or query parameter
app.use((req, res, next) => {
  const dbIdentifier = req.query.db || req.headers['x-database'];
  const env_ = req.headers['base-url']; // req.url.host[0];
  let databaseUrl;

  switch(env_){ //process.env.RUN_ENV
    case 'https://api-stg.finan.one': // 'api-stg':
      switch (dbIdentifier) {
        case 'business':
          databaseUrl = process.env.DB_STG_URL_BUSINESS;
          break;
        case 'banking':
          databaseUrl = process.env.DB_STG_URL_BANKING;
          break;
        default:
          return res.status(400).send('Invalid database identifier');
      }
      break;
    case "https://dev-api.finan.one": //'dev-api':
      switch (dbIdentifier) {
        case 'business':
          databaseUrl = process.env.DATABASE_URL_BUSINESS;
          break;
        case 'banking':
          databaseUrl = process.env.DATABASE_URL_BANKING;
          break;
        default:
          return res.status(400).send('Invalid database identifier');
      }
      break;
    case "https://api.finan.one": // 'api': // prod env
    default:
        return res.status(400).send('Invalid env' + env_);
  }

  req.dbClient = createClient(databaseUrl);
  req.dbClient.connect()
    .then(() => next())
    .catch(err => {
      console.error('Database connection error', err.stack);
      res.status(500).send('Database connection error');
    });
});

app.use(bodyParser.json());

// Example endpoint to get current time from PostgreSQL
app.get('/time', async (req, res) => {
  try {
    const result = await req.dbClient.query('SELECT NOW()');
    res.json(result.rows);
  } catch (err) {
    console.error('Query error', err.stack);
    res.status(500).json({ error: 'Database query failed' });
  } finally {
    req.dbClient.end();
  }
});

// Example endpoint to get list business from PostgreSQL
app.get('/bank-merchant/get-list', async (req, res) => {
  try {
    const result = await req.dbClient.query(
      'SELECT *'
      + ' FROM public.business_kyc'
      + ' WHERE business_id = ' + req.query.business_id
      // + ' AND usage_type = ' + req.query.usage_type.toString()
    );
    let meta ={
      "total_rows":result.rows.length
    }
    let resp = {
      "data":result.rows,
      "meta":meta
    }
    res.json(resp);
    // res.json(result.rows);
  } catch (err) {
    console.error(err);
    res.status(500).json({ error: 'Database query failed' });
  }
});

// Get list product
app.get('/product/get-list', async (req, res) => {
  try {
    const result = await req.dbClient.query(
      'SELECT x.id, x.created_at, x.org_id, x.business_id, x.product_name,' 
      + ' x.product_type, x.uom, x.category_id, x.brand_id, x.track_inventory'
      + ' FROM public.product x'
      + ' WHERE business_id = ' + req.query.business_id
    );
    let meta ={
      "total_rows":result.rows.length
    }
    let resp = {
      "data":result.rows,
      "meta":meta
    }
    res.json(resp);
  } catch (err) {
    console.error(err);
    res.status(500).json({ error: 'Database query failed' });
  }
});

// manual create kyc shinhan account
app.post('/bank-merchant/kyc-shinhan/create', async (req, res) => {
  const {
    creator_id,
    created_at,
    updated_at,
    deleted_at,
    description,
    name,
    provider_code,
    provider_owner_id,
    provider_business_id,
    provider_business_kyc_number,
    business_id,
    kyc_status,
    sme_id,
    client_bank_id,
    usage_type
  } = req.body;

  try {
    const result = await req.dbClient.query(
      `INSERT INTO public.business_kyc (
        creator_id, created_at, updated_at, deleted_at, description, "name",
        provider_code, provider_owner_id, provider_business_id,
        provider_business_kyc_number, business_id, kyc_status, sme_id,
        client_bank_id, usage_type
      ) VALUES ($1, $2, $3, $4, $5, $6, $7, $8, $9, $10, $11, $12, $13, $14, $15) RETURNING *`,
      [
        creator_id,
        created_at,
        updated_at,
        deleted_at,
        description,
        name,
        provider_code,
        provider_owner_id,
        provider_business_id,
        provider_business_kyc_number,
        business_id,
        kyc_status,
        sme_id,
        client_bank_id,
        usage_type
      ]
    );
    
    res.status(201).json(result.rows[0]);
  } catch (err) {
    console.error(err);
    res.status(500).json({ error: 'Database error' });
  }
});

// edit language
app.patch('/business/:id', async (req, res) => {
  try {
    const businessId = parseInt(req.params.id);
    const language = req.body.language;

    let resp;
    if(language == "en" || language == "vi"){
      const result = await req.dbClient.query(
      "UPDATE business_detail"
        + " SET language = \'" + language + "\'"
        + " WHERE business_id = " + businessId
      );
      resp = {
        "message":"successful"
      }
    } else {
      resp = {
        "error":"invalid language, we only support vi or en"
      }
    }
    res.json(resp);
  } catch (err) {
    console.error(err);
    res.status(500).json({ error: 'Database query failed' });
  }
})

// get business detail
app.get('/business/:id', async (req, res) => {
  try {
    const businessId = parseInt(req.params.id);

    const result = await req.dbClient.query(
      'SELECT bd.id, bd.business_id, bd.country_code, bd."language", bd.currency, bd.timezone' 
      + ' FROM business_detail bd'
      + ' WHERE business_id = ' + businessId
    );
    let resp = {
      "data":result.rows
    }
    res.json(resp);
  } catch (err) {
    console.error(err);
    res.status(500).json({ error: 'Database query failed' });
  }
});

app.listen(port, () => {
  console.log(`Server running on http://localhost:${port}`);
});