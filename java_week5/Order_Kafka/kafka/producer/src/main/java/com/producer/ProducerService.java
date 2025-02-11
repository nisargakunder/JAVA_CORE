package com.producer;

import com.producer.dto.OrderDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerService {
    private KafkaTemplate<String, OrderDTO> kafkaTemplate;
    @Autowired
    public ProducerService(KafkaTemplate<String, OrderDTO> kafkaTemplate){
        this.kafkaTemplate=kafkaTemplate;
    }
    public  void sendmessage(OrderDTO order){
       kafkaTemplate.send("t-hello2",order);
    }
}
