package myThread;

public class MyThreadTest1 {

	public static void main(String[] args) {

		for(int i=1; i<=5; i++) {
			System.out.println("호떡"+i);
			try {
				Thread.sleep(300); // 1000 -> 1초
			}catch(Exception e) {}
		}
		
		
		
		for(int i=1; i<=5; i++) {
			System.out.println("꿀떡 "+i);
			try {
				Thread.sleep(300); // 1000 -> 1초
			}catch(Exception e) {}
		}
		
		
		
		
	}

}
