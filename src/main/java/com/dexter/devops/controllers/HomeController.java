package com.dexter.devops.controllers;

import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//import com.dexter.devops.dto.Person;
import com.dexter.devops.service.ProducerServices;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1")
public class HomeController {
	private final ProducerServices producerServices;

	@GetMapping("send-topic-1")
	public void sendTopic1(@RequestParam String message) {
		producerServices.sendTopic1(message);
	}
	
	@GetMapping("send-topic-2")
	public void sendTopic3(@RequestParam String message) {
		producerServices.sendTopic2(message);
	}
}
