package myThread;

class Player extends Thread{
	
	int num;
	Player(){}
	// 생성자 오버로딩
	public Player(int num) {
		this.num=num;
		System.out.println(">>"+num+"번말 입장");
	}
	public void run() {
		int cnt = 0;
		int lastCnt = 200;
		while(cnt < lastCnt) {
			cnt += 5;	// cnt -> 0,5.10,~
			try {
				Thread.sleep(100); // 0.1초
			}catch(Exception e) {
				
			}
			if( cnt%100 == 0 ) {
				System.out.println("("+num+"번말)"+cnt+"M 통과");
			}
			try {
				Thread.sleep(10); // 0.01초
			}catch(Exception e) {
				
			}
		}System.out.println("\n** "+num+"번말 도착 **");
	}
	
}

public class HorseRacing {

	public static void main(String[] args) {

		System.out.println("@@ 경주마 입장 @@\n");
		try {
			Thread.sleep(1000);
		}catch(Exception e) {	}
		
		Player p1 = new Player(1);
		Player p2 = new Player(2);
		Player p3 = new Player(3);
		Player p4 = new Player(4);
		Player p5 = new Player(5);
		Player p6 = new Player(6);
		System.out.println();
		p1.start();
		p2.start();
		p3.start();
		p4.start();
		p5.start();
		p6.start();
		
		
		
		
	}

}
