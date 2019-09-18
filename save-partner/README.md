## To package the jar:

Run on console

``
mvn package
``
## Publish on AWS:

Run on console

``
aws lambda create-function --function-name savePartners --role arn:aws:iam::174582726951:role/lambdaAS --zip-file fileb://target/save-partner-0.0.1-SNAPSHOT-aws.jar --handler org.springframework.cloud.function.adapter.aws.SpringBootStreamHandler --description "Spring Cloud Function Adapter for save partnerts" --runtime java8 --region us-east-1 --timeout 30 --memory-size 1024 --publish
`` 