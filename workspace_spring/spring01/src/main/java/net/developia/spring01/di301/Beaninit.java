package net.developia.spring01.di301;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Beaninit {
	
	
	@Bean
	public TV tv() { // 메소드명이 id
		return new SamsungTV();
	}
	
	@Bean
	public Speaker speaker() {
		return new MarshallSpeaker();
	}
}
