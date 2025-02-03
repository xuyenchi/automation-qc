# AutoTest_APIs

<style>
  h1 {color:blue;}
  p1 {color:red;}
  h3 {color:green;}
  h5 {color:yellow;}
</style>

<h1>API Testing with newman</h1>
<h3>1. Install npm</h3>
<h5>Install NodeJS</h5>

```bash
sudo apt install nodejs
```
<h5>Install NPM</h5>

```bash
sudo apt install npm
```

<h3>2. Install newman (global) - for user</h3>
<h5>Navigate to node_modules folder</h5>

```bash
cd /usr/local/lib
```
<h5>Install newman</h5>

```bash
npm install -g newman
```

<h5>Install newman-reporter-lar</h5>

```bash
npm install -g newman-reporter-lark
```

<h3>3. Install aws (up to S3)</h3>
<h5>Create package.json</h5>

```bash
npm init
```
<h5>Add dependencies into package.json</h5>

```bash
"dependencies": {
    "newman": "^5.3.2",
    "aws": "^0.0.3-2",
    "aws-sdk": "^2.1122.0"
  }
```
<h5>Install</h5>

```bash
npm install
```

<h3>4. Run newman</h3>
<p1>Use POSTMAN to compose Testscripts</p1>
<br>Export Testscripts to JSON format
<br>Export Environment to JSON format<br>
<h5>Run newman:</h5>

```bash
newman run testcase.json -e environment.json
```
<h5>Run newman with Slack Notification:</h5>

```bash
newman run [path]/testcase.json -e [path]/environment.json -r cli,lark
```
<h3>5. Install newman with package.json - for server only</h3>
<h5>Install dependencies</h5>

```bash
npm install
```

<h3>6. Note(s)</h3>
<p> - Syntax Testing: postman
<br> - Logic Testing (flow, scenario): newman
<br> - Khi install newman theo package.json phải alias lại newman: </p>

```bash
alias newman='./node_modules/.bin/newman'
```

### Dockerizing our application

#### Running our application in a container

```bash
make up
```

#### Stop and remove container

```bash
make down
```

#### Clean up dangling Docker images

```bash
make clean
```

### Crontab
# ┌───────────── minute (0 - 59)
# │ ┌───────────── hour (0 - 23)
# │ │ ┌───────────── day of month (1 - 31)
# │ │ │ ┌───────────── month (1 - 12)
# │ │ │ │ ┌───────────── day of week (0 - 6) (Sunday to Saturday; 7 is also Sunday on some systems)
# │ │ │ │ │
# │ │ │ │ │
# │ │ │ │ │
# * * * * *  command_to_execute

#### Sample crontab

# Empty temp folder every Friday at 5pm
```bash
0 5 * * 5 rm -rf /tmp/*
```

# Backup images to Google Drive every night at midnight
```bash
0 0 * * * rsync -a ~/Pictures/ ~/Google\ Drive/Pictures/
```

#### List all cron jobs
```bash
crontab -l
```

#### Edit list of cron jobs
```bash
crontab -e
```

#### Deleting crontabs
```bash
crontab -r.
```