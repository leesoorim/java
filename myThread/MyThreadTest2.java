package myThread;

public class MyThreadTest2 extends Thread{

	public void run() {
		System.out.println("스레드의 시작");
	}
	
	public static void main(String[] args) {

		MyThreadTest2 my2 = new MyThreadTest2();
		my2.start();
		
	}

}
