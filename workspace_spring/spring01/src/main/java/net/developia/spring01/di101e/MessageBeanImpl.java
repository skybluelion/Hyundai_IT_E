package net.developia.spring01.di101e;

public class MessageBeanImpl implements MessageBean{

	private String name;
	private String greeting;
	private FileOutputter fileOutputter;
	
	public void setFileOutputter(FileOutputter fileOutputter) {
		this.fileOutputter = fileOutputter;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setGreeting(String greeting) {
		this.greeting = greeting;
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
