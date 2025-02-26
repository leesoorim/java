package exception;

import java.util.Scanner;

public class ExceptionTest7 {

	public static void main(String[] args) {

	
		Scanner scn = new Scanner(System.in);
		System.out.println("#연산 시작#");
		int number1 = 0;
		scn = new Scanner(System.in);
		try {	
			System.out.print("숫자1>>");
			number1 = scn.nextInt();
		}catch(Exception e) {
			number1 = 0;
		}
		int number2 = 0;
		scn = new Scanner(System.in);
		try {	
			
			System.out.print("숫자2>>");
			number2 = scn.nextInt();
		}catch(Exception e) {
			number2 = 0;
		}
			scn = new Scanner(System.in);
			System.out.print("연산기호>>");
			String mark = scn.next();
			int result = 0;
			String message = "";
			switch(mark) {
				case "+" : result = number1 + number2;
				break;
				case "-" : result = number1 - number2;
				break;
				case "*" : result = number1 * number2;
				break;
				case "/" : result = number1 / number2;
				break;
				default : message = "잘못된 연산기호";
			}

			System.out.println("결과>> "+(message.equals("")? +result:message));
			
			System.out.println("#연산 종료#");
		
	}

}
