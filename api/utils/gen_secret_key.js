const crypto = require('crypto');

const algorithm = 'aes-256-gcm';
const IV_LEN = 12;
const AUTH_TAG_LEN = 16;

let SECRET_KEY = 'gVp3lxP5xr7lOAeeIa0ylzRBVGTBNs0V';

function encrypt(message) {

  const iv = Buffer.from(crypto.randomBytes(IV_LEN));

  const cipher = crypto.createCipheriv(algorithm, SECRET_KEY, iv, {
    authTagLength: AUTH_TAG_LEN,
  });

  const encryptedData = Buffer.concat([cipher.update(message), cipher.final()]);
  const authTag = cipher.getAuthTag();

  const raw = Buffer.concat([iv, encryptedData, authTag]).toString('hex');
  return raw;
}

function generateSecretKey(message) {
  const timeStamp = Math.floor(Date.now() / 1000);
  return encrypt(`${message}|${timeStamp}`);
}

// Example usage
(async function () {
  const message = JSON.stringify({
    loan_amount: 50000,
    term: 2,
    term_type: 'month',
    tax_code: '1234567890',
  });

  const encryptedMessage = generateSecretKey(message);
  console.log(encryptedMessage); // Outputs the encrypted message as a hex string
})();
