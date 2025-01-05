package com.jongseong.kafka.utils;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class BasicProducer {

    private final KafkaTemplate<String, String> basicKafkaTemplate;

    public BasicProducer(KafkaTemplate<String, String> basicKafkaTemplate) {
        this.basicKafkaTemplate = basicKafkaTemplate;
    }

    public void publishMessageEvent(String message) {
        basicKafkaTemplate.send("message-events", message);
    }
}
