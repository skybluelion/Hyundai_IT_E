package net.developia.spring01.di102e;

public class MessageBeanImpl implements MessageBean{

	private String name;
	private String greeting;
	private FileOutputter fileOutputter;
	
	public MessageBeanImpl(String name, String greeting, FileOutputter fileOutputter) {
		this.name = name;
		this.greeting = greeting;
		this.fileOutputter = fileOutputter;
	}

	@Override
	public void sayHello() {
		System.out.println(name+"님, " +greeting);
		try {
			fileOutputter.outputter(name + "님, " + greeting);
		} catch (Exception e) {
			e.getMessage();
		}
	}

}
