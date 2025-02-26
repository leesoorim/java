package exception;

import java.util.Scanner;

/**
 * 숫자 맞추기 게임
 */
public class ExceptionTest5 {

	public static void main(String[] args) {

		
			int number1 = (int)(Math.random()*100)+1;
	
			Scanner scn = null;
			int i = 0;
			
			while(true) { // 무한루프
				try {
					i++;
					scn = new Scanner(System.in);
					System.out.print("번호입력>>");
					
					int number2 = scn.nextInt();
					
					if(number2 < number1 ) {
						System.out.println(number2+"보다 크다.");
					}else if(number2 > number1) {
						System.out.println(number2+"보다 작다.");
					}else {
						System.out.println("정답입니다."+i+"번만에 맞춤");
						break;	// 반복문의 종료
					}
			}catch(Exception e) {
				System.out.println("***숫자만 입력하세요.***");
			}
		}
		
	}

}
