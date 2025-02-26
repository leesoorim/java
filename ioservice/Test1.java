package ioservice;

public class Test1 {
	
	public static void method1 () throws Exception{
		
		int[] numbers = {10,0,100};
		for(int i=0; i<numbers.length; i++) {
			if(i==0) {
				throw new ArithmeticException();
			}else {
			System.out.println(100/numbers[i]);
			}
		}
	}

	public static void main(String[] args) {

		try {
			Test1.method1();
		}catch(Exception e) {
			System.out.println("0으로 나누기 처리 오류");
		}
		System.out.println("= 1004 =");
		
	}

}
