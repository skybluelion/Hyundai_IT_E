package threadstates.runnable2;

class MyThread extends Thread{
	@Override
	public void run() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			System.out.println(" -- sleep() 진행 중 interrupt() 발생");
			for(long i = 0; i < 1000000000L; i++) {} //시간 지연
		}
		
	}
}

public class YieldInRunnableState2 {

	public static void main(String[] args) {
		MyThread thread1 = new MyThread();
		thread1.start();
		try {Thread.sleep(100);} catch (InterruptedException e) {		} // 쓰레드 시작 준비 시간
		
		System.out.println("MyThread State = " + thread1.getState());
		// timed_wating
		thread1.interrupt(); // TIMED_WATING -> RUNNABLE 상태 전
		try {Thread.sleep(100);} catch (InterruptedException e) {		} // 인터럽트 준비 시간
		System.out.println("MyThread State = " + thread1.getState());
		
		
		
	}

}
