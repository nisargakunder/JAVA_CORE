package com.producer;


import com.producer.dto.OrderDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {
    private ProducerService producerService;
   @Autowired
    public ProducerController(ProducerService producerService) {
        this.producerService = producerService;
    }

    @PutMapping("/produce")
    public void produce(@RequestBody OrderDTO order) {
        {
            producerService.sendmessage(order);
        }
    }
}


