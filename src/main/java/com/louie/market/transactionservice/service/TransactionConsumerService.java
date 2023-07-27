package com.louie.market.transactionservice.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.stereotype.Service;

@Service
public class TransactionConsumerService {

  @KafkaListener(topicPartitions = @TopicPartition(topic = "account-topic", partitions = "0"))
  public void consumePartition0(String message) {
    // Xử lý thông điệp từ partition 0 của Kafka topic "my-topic" ở đây
    System.out.println("Consumer from Partition 0 received message: " + message);
  }

  @KafkaListener(topicPartitions = @TopicPartition(topic = "account-topic", partitions = "1"))
  public void consumePartition1(String message) {
    // Xử lý thông điệp từ partition 1 của Kafka topic "my-topic" ở đây
    System.out.println("Consumer from Partition 1 received message: " + message);
  }
}
