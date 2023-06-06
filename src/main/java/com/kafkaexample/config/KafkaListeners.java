package com.kafkaexample.config;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {
	
	@KafkaListener(topics ="prkcode",groupId = "groupId")
	void listener(String data) {
		System.out.println("Listener recieved: " + data + " 😀");
		
	}

}
