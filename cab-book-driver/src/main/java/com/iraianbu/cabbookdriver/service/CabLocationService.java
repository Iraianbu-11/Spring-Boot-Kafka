package com.iraianbu.cabbookdriver.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class CabLocationService {
    @Autowired
    private KafkaTemplate<String,Object> kafkaTemplate;
    public void updateLocation(String location){
        kafkaTemplate.send("cab-location",location);
    }

}
