package com.jongseong.kafka.config;

import com.jongseong.kafka.event.OrderRequestEvent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;

@Configuration
@EnableKafka
public class KafkaConfig {
    @Bean
    public KafkaTemplate<String, OrderRequestEvent> kafkaTemplate(ProducerFactory<String, OrderRequestEvent> producerFactory) {
        return new KafkaTemplate<>(producerFactory);
    }
}
