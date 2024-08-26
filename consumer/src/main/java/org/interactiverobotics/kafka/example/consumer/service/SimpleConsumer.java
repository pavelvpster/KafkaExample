package org.interactiverobotics.kafka.example.consumer.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class SimpleConsumer {

    @KafkaListener(topics = "test-topic", groupId = "simple-consumer-group")
    public void onMessage(String data) {
        log.info("Message received: {}", data);
    }
}
