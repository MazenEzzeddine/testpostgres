package org.example.kafka;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.controller.CustomerController;
import org.example.entity.Customer;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class KafkaProducer {

    private static final Logger log = LogManager.getLogger(KafkaProducer.class);


    public KafkaProducer(KafkaTemplate<String, Customer> kafkatemplate) {
        this.kafkatemplate = kafkatemplate;
    }

    private KafkaTemplate<String, Customer> kafkatemplate;

    public  void sendMessage(Customer cust) {

        //Message<Customer> msg = MessageBuilder.withPayload(cust).build();
        kafkatemplate.send("testtopic1", "samiha",cust);
    }

    @PostConstruct
    void startSending() throws InterruptedException {
        for (int i = 0; i < 100; i++) {

           /* Customer cust = new Customer(i,"acp", "mazen",
                    "boss","aix", "en provence","Bouches", "13100", "France",
                    "13100","131000");
            sendMessage(cust);
            Thread.sleep(1000);*/

        }
    }





}
