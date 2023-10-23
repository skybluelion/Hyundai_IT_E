package threadstates;

public class NewRunnableTerminated {

	public static void main(String[] args) {
		//쓰레드 상태 저장 클래스
		Thread.State state;
		
		//1. 객체 생성(NEW)
		Thread myThread = new Thread() {
			@Override
			public void run() {
				for(long i = 0; i < 10000000000L; i++) {} //시간 지
			}
		};
		state = myThread.getState();
		System.out.println("myThread state = " + state);
		
		//2. myThread 시작
		myThread.start();
		state = myThread.getState();
		System.out.println("myThread state = " + state);
		
		//3. myThread 종료
		try {
			myThread.join();
		} catch (InterruptedException e) {}
		state = myThread.getState();
		System.out.println("myThread state = " + state);
	}

}
