package exception.e1;

class A implements Cloneable{
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}


public class CheckedException1 {

	public static void main(String[] args) {
//		//checked Exception(일반예외)
//		
//		//1.InterruptedExeption
//		Thread.sleep(1000);
//		
//		//2.ClassNotFoundException
//		Class cls = Class.forName("java.lang.Object");
//		
//		//3. IOExeption
//		InputStreamReader in = new InputStreamReader(System.in);
//		in.read();
//		
//		//4. FileNotFoundException
//		FileInputStream fis = new FileInputStream("text.txt");
//		
//		//5.CloneNotSupportedException
//		A a1 = new A();
//		A a2 = (A)a1.clone();
	}

}
