package javaExamMe;

public class TestThread10 extends Thread{
	
	private int num;
	TestThread10(int num){
		this.num=num;
	}
	
	public void run() {
		for(int i=1; i<101; i++) {
			if(i==1) {
				System.out.println(num+"번 출발");
			}
			if(i%30==0) {
				System.out.println(num+"번 반복문 "+i+"M 통과");
			}
			try {
				Thread.sleep(100);
			}catch(Exception e) {}
		}System.out.println(num+"번 반복문 종료");
	}

	public static void main(String[] args) {

		TestThread10 th1 = new TestThread10(1);
		TestThread10 th2 = new TestThread10(2);
		TestThread10 th3 = new TestThread10(3);
		th1.start();
		th2.start();
		th3.start();
		
		
	}

}
