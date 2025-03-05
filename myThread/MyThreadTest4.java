package myThread;

class ThreadSum extends Thread{
	private int sno;
	private int eno;
	private int sum;
	
	ThreadSum(int sno,int eno){
		this.sno=sno;
		this.eno=eno;
	}
	
	public int getSum() {
		return this.sum;
	}
	
	public void run() {
		for(int i=sno; i<=eno; i++) {
			sum+=i;
		}
		System.out.println("sum1:"+this.getSum());
	}
	
}

public class MyThreadTest4 {

	public static void main(String[] args) {

		ThreadSum ts = new ThreadSum(50,300);
		ts.start();
		System.out.println("sum2:"+ts.getSum());
	}

}
