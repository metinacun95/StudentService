package com.netas.studentservice.bus.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.support.converter.StringJsonMessageConverter;

@EnableKafka
@Configuration
public class KafkaConsumerConfig {
	
	@Autowired
	ConsumerFactory<String, String> consumerFactory;
	
	@Bean
	public ConcurrentKafkaListenerContainerFactory<String, String> concurrentKafkaListenerContainerFactory(){
		System.out.println("");
		ConcurrentKafkaListenerContainerFactory<String , String> factory = new ConcurrentKafkaListenerContainerFactory<>();
		factory.setMessageConverter(new StringJsonMessageConverter());
		factory.setConsumerFactory(consumerFactory);
		return factory;
		
	}
}
