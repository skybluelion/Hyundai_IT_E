package oop9;

import java.io.FileInputStream;
import java.util.Properties;

public class TVTest {

	public static void main(String[] args) {
		TV tv1 = new HyundaiTV(); // upcasting
		tv1.powerOn();
		tv1.channelUp();
		tv1.channelUp();
		tv1.soundUp();
		tv1.powerOff();
	
		System.out.println("---------------");
		
		TV tv2 = new SamsungTV(); // new로 인한 의존도가 높아짐.
		tv2.setSpeaker(new OrangeSpeaker());
		tv2.powerOn();
		tv2.channelUp();
		tv2.channelUp();
		tv2.soundUp();
		tv2.powerOff();
		
		
		System.out.println("-----------");
		Properties pr = new Properties(); // 설정파일을 사용하여 의존관계를 낮춤
		try {
			pr.load(new FileInputStream("src/oop9/product.properties"));
			String tvClass = pr.getProperty("tv");
			String speakerClass = pr.getProperty("speaker");
			Class tvClazz = Class.forName(tvClass);
			Class speakerClazz = Class.forName(speakerClass);
			TV tv3 = (TV) tvClazz.getConstructor(null).newInstance();
			Speaker sp = (Speaker) speakerClazz.getConstructor(null).newInstance();
			tv3.setSpeaker(sp);
			tv3.powerOn();
			tv3.channelUp();
			tv3.channelUp();
			tv3.soundUp();
			tv3.powerOff();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
