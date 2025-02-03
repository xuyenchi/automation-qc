# export NEWMAN="$(pwd)/node_modules/.bin/newman"
export NEWMAN="/usr/local/bin/newman"

############## run on dev environment #################
# must add '--insecure' when run newman to ignore ssl certificate
# must add '-x' => report fail will hook to slack (missing it will ignore fail case)

############## run on local #################
#cd /Users/[]/Documents/AutoAPI/

currentDate=$(date '+%Y-%m-%d')
# timestamp=$(date +%s)
dir=test_report

if [ ! -d $dir ]; then
    mkdir -p $dir;
fi;

./lark_notifier.sh "------- Start DAILY Test -------"
# ./lark_notifier.sh "Finan One - Sign Up Testing..." => chỉ run trên dev/stg
# for filename in ./finan_one/signup/*.json; do
# #  ./lark_notifier.sh $(basename $filename)
#   logfile=$(basename $filename)
#   logfile=${logfile%.json}
#   newman run $filename -e config/finone_dev.postman_environment.json --insecure -x >${dir}/${logfile}.log -r lark,cli
#   ./lark_notifier.sh "Log here: https://sbh-qc.s3.hcm-1.cloud.cmctelecom.vn/auto-test-api-output/${currentDate}/${logfile}.log"
# done

./lark_notifier.sh "Finan One - COA Testing..."
for filename in ./finan_one/book/coa/*.json; do
#  ./lark_notifier.sh $(basename $filename)
  logfile=$(basename $filename)
  logfile=${logfile%.json}
  $NEWMAN run $filename -e config/finone_stg.postman_environment.json --insecure -x >${dir}/${logfile}.log -r lark,cli
  ./lark_notifier.sh "Log here: https://sbh-qc.s3.hcm-1.cloud.cmctelecom.vn/auto-test-api-output/${currentDate}/${logfile}.log"
done


./lark_notifier.sh "Finan One - Customer Testing..."
for filename in ./finan_one/book/contact/*.json; do
#  ./lark_notifier.sh $(basename $filename)
  logfile=$(basename $filename)
  logfile=${logfile%.json}
  $NEWMAN run $filename -e config/finone_stg.postman_environment.json --insecure -x >${dir}/${logfile}.log -r lark,cli
  ./lark_notifier.sh "Log here: https://sbh-qc.s3.hcm-1.cloud.cmctelecom.vn/auto-test-api-output/${currentDate}/${logfile}.log"
done

./lark_notifier.sh "Finan One - Tax Testing..."
for filename in ./finan_one/book/tax/*.json; do
#  ./lark_notifier.sh $(basename $filename)
  logfile=$(basename $filename)
  logfile=${logfile%.json}
  $NEWMAN run $filename -e config/finone_stg.postman_environment.json --insecure -x >${dir}/${logfile}.log -r lark,cli
  ./lark_notifier.sh "Log here: https://sbh-qc.s3.hcm-1.cloud.cmctelecom.vn/auto-test-api-output/${currentDate}/${logfile}.log"
done

./lark_notifier.sh "Finan One - Product Testing..."
for filename in ./finan_one/book/product/*.json; do
#  ./lark_notifier.sh $(basename $filename)
  logfile=$(basename $filename)
  logfile=${logfile%.json}
  $NEWMAN run $filename -e config/finone_stg.postman_environment.json --insecure -x >${dir}/${logfile}.log -r lark,cli
  ./lark_notifier.sh "Log here: https://sbh-qc.s3.hcm-1.cloud.cmctelecom.vn/auto-test-api-output/${currentDate}/${logfile}.log"
done

./lark_notifier.sh "Finan One - Invoice Testing..."
for filename in ./finan_one/book/invoice/*.json; do
#  ./lark_notifier.sh $(basename $filename)
  logfile=$(basename $filename)
  logfile=${logfile%.json}
  $NEWMAN run $filename -e config/finone_stg.postman_environment.json --insecure -x >${dir}/${logfile}.log -r lark,cli
  ./lark_notifier.sh "Log here: https://sbh-qc.s3.hcm-1.cloud.cmctelecom.vn/auto-test-api-output/${currentDate}/${logfile}.log"
done

./lark_notifier.sh "Finan One - Bill Testing..."
for filename in ./finan_one/book/bill/*.json; do
#  ./lark_notifier.sh $(basename $filename)
  logfile=$(basename $filename)
  logfile=${logfile%.json}
  $NEWMAN run $filename -e config/finone_stg.postman_environment.json --insecure -x >${dir}/${logfile}.log -r lark,cli
  ./lark_notifier.sh "Log here: https://sbh-qc.s3.hcm-1.cloud.cmctelecom.vn/auto-test-api-output/${currentDate}/${logfile}.log"
done

./lark_notifier.sh "Finan One - Transaction Testing..."
for filename in ./finan_one/book/transaction/*.json; do
#  ./lark_notifier.sh $(basename $filename)
  logfile=$(basename $filename)
  logfile=${logfile%.json}
  $NEWMAN run $filename -e config/finone_stg.postman_environment.json --insecure -x >${dir}/${logfile}.log -r lark,cli
  ./lark_notifier.sh "Log here: https://sbh-qc.s3.hcm-1.cloud.cmctelecom.vn/auto-test-api-output/${currentDate}/${logfile}.log"
done

# upload file to cmc
npm start
#remove .log file
for filename in ./test_report/*.log; do
  rm $filename
done

./lark_notifier.sh "------- End DAILY Test -------"