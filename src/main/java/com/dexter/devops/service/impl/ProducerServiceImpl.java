package com.dexter.devops.service.impl;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

//import com.dexter.devops.dto.Person;
import com.dexter.devops.service.ProducerServices;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProducerServiceImpl implements ProducerServices {
	private final String topic1 = "test-topic-1";
	private final String topic2 = "test-topic-2";
	private final KafkaTemplate<String, String> kafkaTemplate;

	@Override
	public void sendTopic1(String message) {
		kafkaTemplate.send(topic1, message);
	}
	
	@Override
	public void sendTopic2(String message) {
		kafkaTemplate.send(topic2, message);
	}
}
