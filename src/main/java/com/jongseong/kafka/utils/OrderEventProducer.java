package com.jongseong.kafka.utils;

import com.jongseong.kafka.event.OrderRequestEvent;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class OrderEventProducer {
    private final KafkaTemplate<String, OrderRequestEvent> kafkaTemplate;

    public OrderEventProducer(KafkaTemplate<String, OrderRequestEvent> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void publishOrderEvent(OrderRequestEvent event) {
        kafkaTemplate.send("order-events", event);
    }
}
