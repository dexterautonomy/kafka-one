package com.dexter.devops.service.impl;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import org.springframework.kafka.support.KafkaHeaders;

import com.dexter.devops.service.ConsumerServices;

@Service
public class ConsumerServiceImpl implements ConsumerServices {

	@Override
	@KafkaListener(topics = "test-topic-1", groupId = "test-group-1")
	public void listen1(String message) {
		System.out.println("--->>>: Topic 1 subscription message: " + message);
	}
	
	@Override
	@KafkaListener(topics = "test-topic-2", groupId = "test-group-1")
	public void listen2(@Payload String message, @Header(KafkaHeaders.RECEIVED_PARTITION_ID) int partition) {
		System.out.println("--->>>: Topic 2 subscription message: " + message + " : " + partition);
	}
}
