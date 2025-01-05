package com.jongseong.kafka.controller;

import com.jongseong.kafka.dto.Message;
import com.jongseong.kafka.dto.Order;
import com.jongseong.kafka.service.OrderRequestService;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/order")
@RequiredArgsConstructor
@Slf4j
public class OrderController {
    private final OrderRequestService orderRequestService;

    @ApiOperation(value= "Order Create")
    @PostMapping(value = "/create", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Order.OrderResponse> createOrder(@RequestBody Order.OrderRequest orderRequest) {
        log.info(" >> createOrder: {}", orderRequest);
        Order.OrderResponse response = orderRequestService.createOrder(orderRequest);
        return ResponseEntity.ok(response);
    }

    @ApiOperation(value= "Message Create")
    @PostMapping(value = "/message", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Message.MessageResponse> getMessage(@RequestBody Message.MessageRequest messageRequest) {
        log.info(" >> getMessage: {}", messageRequest);
        Message.MessageResponse response = orderRequestService.getMessage(messageRequest);
        return ResponseEntity.ok(response);
    }

}
