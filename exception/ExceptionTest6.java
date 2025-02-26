package exception;

import java.util.Scanner;

public class ExceptionTest6 {

	public static void main(String[] args) {

		int number1 = (int)(Math.random()*100)+1;
		System.out.println(number1);
		Scanner scn = new Scanner(System.in);
		int i = 0;
		
		while(i<20) {
			try {	
				/**
				 *  nextInt() 메소드의 오류발생 시 scn의 메모리 경로가 파손 됨
				 *  그래서 scn = new Scanner 를 다시 실행하여 다시 획득함
				 */
				scn = new Scanner(System.in);
				System.out.println("1~100사이 번호입력>>");
				int number2 = scn.nextInt();
				if(number2 < number1) {
					System.out.println(number2+"은(는) 시스템 값보다 작다.");
				}else if(number2 > number1) {
					System.out.println(number2+"은(는) 시스템 값보다 크다.");
				}else {
					System.out.println("정답입니다.");
					break;
				}
			}catch(Exception e) {
				System.out.println("숫자만 입력하세요");
			}
			i++;
		}
		
	}

}
