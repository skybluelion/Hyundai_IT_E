package oop9;

public interface TV {
	
	int voltage = 220;
	
	public abstract void powerOn(); //abstract 생략가능
	public void powerOff();
	public void channelUp();
	public void channelDown();
	public void soundUp();
	public void soundDown();
	public default void setSpeaker(Speaker orangeSpeaker) {	}
	//새로운 기능을 넣기 위해서 default를 사용해서 없으면 자동으로 적용되게 함.
}
