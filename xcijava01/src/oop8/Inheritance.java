package oop8;

class Human{
	String name;
	int age;
	void eat() {}
	void sleep() {}
}

class Student extends Human {
	int studentID;
	void goToSchool() {}
}

class Worker extends Human{
	int workerID;
	void goToWork() {}
}

public class Inheritance {
	public static void main(String[] args) {
		//Human 객체 생성
		Human h = new Human();
		h.name = "Steve";
		h.age = 11;
		h.eat();
		h.sleep();
		
		//Student 객체 생성
		Student s = new Student();
		s.name = "Elena";
		s.age = 20;
		s.studentID = 128;
		s.eat();
		s.sleep();
		s.goToSchool();
		
		//Worker 객체 생성
		Worker w = new Worker();
		w.name = "Ken";
		w.age = 34;
		w.workerID = 228;
		w.eat();
		w.sleep();
		w.goToWork();
		
	}
}
