package exception;
/**
 * throw new : 특정 익셉션을(예외상황)을 발생시키는 키워드
 * ArithmeticException : 0으로 나누기 클래스
 * ArrayIndexOutOfBoundsException : 배열번호 오류 
 */

public class ExceptionTest8 {
	
	String userid;
	String pass;
	
	String getuserid() {
		return userid;
	}

	public static void main(String[] args) {
			
	
		try {
			//System.out.println(0/0);
			//int[] a = {11,22};
			//System.out.println(a[33]);
			// 관련(예외처리)클래스의 예외상황이 발생이 됨
			//throw new ArithmeticException("- 0으로 나누기 오류 발생 시킴 -");
			throw new ArrayIndexOutOfBoundsException("- 잘못된 배열번호 오류 발생 시킴 -");
			
		}catch(ArithmeticException e) {
			System.out.println("오류가 났습니다.");
			System.out.println(e.getMessage());	// 예외상황 메세지 
			System.out.println(e.toString());	// 관련클래스명 & 예외상황 메세지 출력
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		
		System.out.println("1004");
		
	}

}
