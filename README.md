# kafka-producer-spring-boot

In kafka directory, go to \bin\windows to execute the below commands.

## Zookeeper start 
zookeeper-server-start.bat ..\\..\\config\zookeeper.properties


## Kafaka Server Start 
kafka-server-start.bat ..\\..\\config\server.properties

## Create topic

kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 -topic Kafka_Example


## Kafaka Consumer 
kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic Kafka_Example --from-beginning


## Kafaka Producer 
kafka-console-producer.bat --broker-list localhost:9092 --topic Kafka_Example


## Delete Kafka Topic 
kafka-topics.bat --zookeeper localhost:2181 --delete --topic 'Kafka.*'


## To see the list of Topics 
kafka-topics.bat --list --zookeeper localhost:2181


## Kafka topic location
In windows, C:\tmp\kafka-logs has topic directories.
