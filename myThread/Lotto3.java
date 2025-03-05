package myThread;

import java.util.Random;

public class Lotto3 {

	public static void main(String[] args) {

		Random rn = new Random();
		
		int[] lotto = new int[6];
		String ss = "";
		
		int i= 0;	// 배열번호는 꼭 무조건 0번부터
		while(true) {	
			int num = rn.nextInt(45)+1;				
			
			int cnt=0;
			for(int a=0; a<lotto.length; a++) {
				if(lotto[a]==num) {
					cnt=1;
					ss +=num+",";
				}
			}
			if(cnt == 0) {
				lotto[i] = num;
				i++;
			}
		
			if(i==6) break;
			
		}
		for(int j=0; j<6; j++) {
			System.out.print(lotto[j]+" ");
		}
		System.out.println("\n"+ss);
	}

}
