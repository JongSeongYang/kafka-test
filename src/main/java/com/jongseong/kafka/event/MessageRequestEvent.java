package com.jongseong.kafka.event;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@AllArgsConstructor
public class MessageRequestEvent {
    private String message;

    @Override
    public String toString() {
        return "MessageRequestEvent{" +
                "message='" + message + '\'' +
                '}';
    }
}
