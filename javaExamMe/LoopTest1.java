package javaExamMe;

public class LoopTest1 {

	public static void main(String[] args) {

		for(int i=1; i<=31; i++) {
			if(i%7==0) {
				System.out.print(i+" ");
			}
		}
		
		System.out.println("\n----------------------");
		
		int i=1;
		while(i<32) {
			if(i%7==0) {
				System.out.print(i+" ");
			}
			i++;
		}
		
	}

}
