package myThread;

public class MyThreadLotto extends Thread{

	public void run() {	
		for(int i=0; i<2; i++) {	// 2번 회전
			int z = (int)Math.ceil(Math.random()*45);
			System.out.print(z+" ");
			try {
				sleep(1000);
			}catch(Exception e) { }
		}
	}
	
	public static void main(String[] args) {

		MyThreadLotto lotto1 = new MyThreadLotto();
		MyThreadLotto lotto2 = new MyThreadLotto();
		MyThreadLotto lotto3 = new MyThreadLotto();
		lotto1.start();
		lotto2.start();
		lotto3.start();
		
	}

}
