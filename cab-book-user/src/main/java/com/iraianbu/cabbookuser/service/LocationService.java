package com.iraianbu.cabbookuser.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class LocationService {
    @KafkaListener(topics = "cab-location",groupId = "cab-user")
    public void cabLocation(String location){
        System.out.println(location);
    }
}
