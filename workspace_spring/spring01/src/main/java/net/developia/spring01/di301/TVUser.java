package net.developia.spring01.di301;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TVUser {
	public static void main(String[] args) {
		ApplicationContext context =
				new AnnotationConfigApplicationContext("net.developia.spring01.di301");
		
		System.out.println("------------------------------");
		TV tv = (TV)context.getBean("tv");
		tv.powerOn();
		tv.channelUp();
		tv.channelUp();
		tv.soundUp();
		tv.soundUp();
		tv.soundDown();
		tv.powerOff();

	}
}
