package com.example.demo.controller;

import com.example.demo.service.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/kafka")
public class kafkaTestingController {

    @Autowired
    Producer producer;

    @PostMapping( "/post")
    public void sendMessage(@RequestParam("msg") String msg){
        producer.publishTopic(msg);
    }
    @GetMapping("/")
    public String getTest(){
        return "hello";
    }



}
