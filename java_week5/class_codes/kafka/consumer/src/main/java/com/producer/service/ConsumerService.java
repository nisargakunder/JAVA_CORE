package com.producer.service;

import com.producer.dto.Product;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {
    @KafkaListener(topics = "t-hello2", groupId = "t_hello2_group_id")
    public void consume(Product product) {
        System.out.println("Received Message in group_id: " + product);
    }
}
