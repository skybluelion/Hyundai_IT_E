package net.developia.spring01.di101;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {
	public static void main(String[] args) {
		ApplicationContext context =
				new GenericXmlApplicationContext(TVUser.class, "beaninit.xml");
		System.out.println("------------------------------");
		TV tv = (TV)context.getBean("tv");
//		Speaker speaker = (Speaker)context.getBean("speaker");
//		tv.setSpeaker();
		tv.powerOn();
		tv.channelUp();
		tv.channelUp();
		tv.soundUp();
		tv.soundUp();
		tv.soundDown();
		tv.powerOff();

	}
}
