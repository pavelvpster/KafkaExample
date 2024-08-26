package org.interactiverobotics.kafka.example.producer.service;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

@RequiredArgsConstructor
@Service
public class RandomNumberProducer {
    private final KafkaTemplate<String, String> kafkaTemplate;

    private final Random random = new Random(System.currentTimeMillis());

    @Scheduled(fixedRate = 5000)
    public void send() {
        kafkaTemplate.send("test-topic",
                ZonedDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME),
                Double.toString(random.nextDouble()));
    }
}
