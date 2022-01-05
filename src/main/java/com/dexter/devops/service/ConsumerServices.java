package com.dexter.devops.service;

public interface ConsumerServices {
	void listen1(String message);
	void listen2(String message, int partition);
}