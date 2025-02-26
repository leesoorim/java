package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest4 {

	public static void main(String[] args) {

		// 풀어보기 1
		String str = "java";
		int index = 0;
		
		try {		
			
		System.out.println("문자열 "+str+"의 "+index+"번은 \""+str.charAt(index)+"\"입니다.");
		
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println("문자열 "+str+"의 "+index+"번은 없는 번호입니다.");
		}
		
		System.out.println("-----------------------------");
		
		// 풀어보기2
		try {
			Scanner scn=new Scanner(System.in);
			
			int number1 = 10;
			System.out.print("번호입력>> ");
			int number2 = scn.nextInt();
			
			System.out.println("10을 "+number2+"으로 나눈 나머지는 "+number1%number2+"입니다.");
		}catch(InputMismatchException e){
			System.out.println("문자열이 입력되었습니다.");
		}
		
		catch(Exception e) {
			System.out.println("10을 0으로 나눌 수 없습니다.");
		}
				
		
	}

}
