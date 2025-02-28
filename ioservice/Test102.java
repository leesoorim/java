package ioservice;

import java.util.Scanner;

public class Test102 {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		while(true) {
			System.out.println("00");	
			System.out.println("11");
			System.out.print("계속:Y,종료:N,다시실행:R >> ");
			String str = scn.next();
			if(str.toUpperCase().equals("N")) {
				break;
			}else if(str.toUpperCase().equals("R")) {
				continue;
			}else {
				System.out.println("진행");
			}
			
			System.out.println("22");
			System.out.println("----");
			
		}
		System.out.println("====== 종료 =====");
		
	}

}
