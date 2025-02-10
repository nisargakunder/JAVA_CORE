package com.producer;

import com.producer.dto.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerService {
    private KafkaTemplate<String,Product> kafkaTemplate;
    @Autowired
    public ProducerService(KafkaTemplate<String, Product> kafkaTemplate){
        this.kafkaTemplate=kafkaTemplate;
    }
    public  void sendmessage(Product product){
       kafkaTemplate.send("t-hello2",product);
    }
}
