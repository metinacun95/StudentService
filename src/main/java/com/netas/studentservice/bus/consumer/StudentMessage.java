package com.netas.studentservice.bus.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
@Component
public class StudentMessage {
	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
  
	@KafkaListener(topics="${kafka.topic.consumer}")
	public void listen(String message) {
		LOGGER.debug("[getMessage] : Message -> {}", message);
	}
}
