package exception;

public class ExceptionTest2 {

	public static void main(String[] args) {

		// ArithmeticException	: 0으로 나누기 오류
		// ArrayIndexOutOfBoundsException : 배열에서 잘못된 인덱스 번호 오류
		// StringIndexOutOfBoundsException
		// Exception : 예외처리 클래스
		try {
			int[] a = {10,20};
			System.out.println(100/10);
			System.out.println(a[0]);
			
			String b = "java";
			System.out.println(b.substring(0,100));
			
		}catch(ArithmeticException e) {
			System.out.println("0으로 나누기 오류");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("잘못된 배열번호 오류");
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println("잘못된 문자열번호 오류");
		}catch(Exception e) {
			System.out.println("기타 오류");
		}
		finally {
			System.out.println("== 프로그램 끝 ==");
		}
		
		
		
		
		
		
		
	}

}
