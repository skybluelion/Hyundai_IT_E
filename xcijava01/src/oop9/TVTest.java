package oop9;

public class TVTest {

	public static void main(String[] args) {
		TV tv1 = new HyundaiTV(); // upcasting
		tv1.powerOn();
		tv1.channelUp();
		tv1.channelUp();
		tv1.soundUp();
		tv1.powerOff();
	
		System.out.println("---------------");
		TV tv2 = new SamsungTV();
		tv2.powerOn();
		tv2.channelUp();
		tv2.channelUp();
		tv2.soundUp();
		tv2.powerOff();
		
	}

}
