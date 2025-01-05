package com.jongseong.kafka.utils;

import com.jongseong.kafka.event.OrderRequestEvent;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class OrderEventConsumer {
    @KafkaListener(topics = "order-events", groupId = "my-group")
    public void listenOrderEvents(OrderRequestEvent event) {
        System.out.println("Received OrderRequestEvent: " + event);
    }

    @KafkaListener(topics = "message-events", groupId = "my-group")
    public void listenMessageEvents(String message) {
        System.out.println("Received listenMessageEvents: " + message);
    }
}
