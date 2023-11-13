package io.system.property;

public class CreateFileObject {

	public static void main(String[] args) {
		System.out.println(System.getProperty("java.version"));
		
		for(Object obj: System.getProperties().keySet()) {
			String key =(String) obj;
			System.out.println(key + ":" + System.getProperty(key));
		}
	}

}
