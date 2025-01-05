package com.jongseong.kafka.utils;

import com.jongseong.kafka.event.OrderRequestEvent;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class OrderEventConsumer {
    @KafkaListener(topics = "order-events", groupId = "my-group")
    public void listenOrderEvents(OrderRequestEvent event) {
        // 이벤트 처리 로직을 구현합니다.
        System.out.println("Received OrderRequestEvent: " + event);
        //
    }
}
