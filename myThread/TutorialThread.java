package myThread;

/**
 *  객체지향의 4대요소 : 상속(extends), 다형성(오버로딩), 캡슐화(접근지정자), 추상화(추상클래스,인터페이스)
 */

class MultiThread extends Thread{
	
	String name;	// 맴버변수, 인스턴스변수
	
	MultiThread(){} // 있는셈 치는 것
	
	public MultiThread(String name) {	// 매개변수
		System.out.println(getName()+" 스레드 실행");
		this.name=name;
	}
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println(getName()+"("+name+")");
			try {
				sleep(300);
			}catch(Exception e) {}
		}
	}
	
}

public class TutorialThread {

	public static void main(String[] args) {

		MultiThread mt1 = new MultiThread("첫번째");	// 인스턴스화
		MultiThread mt2 = new MultiThread("두번째");
		MultiThread mt3 = new MultiThread("세번째");
		mt1.start();
		mt2.start();
		mt3.start();
		
	}

}
