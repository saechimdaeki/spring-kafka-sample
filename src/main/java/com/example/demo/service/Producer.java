package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {
    public static String topic="kjs";

    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;

    public void publishTopic(String message){
        this.kafkaTemplate.send(topic,message);
    }
}
