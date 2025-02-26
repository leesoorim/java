package exception;

import java.util.Calendar;

/**
 * throws Exception
 * :: 예외처리를 다른 메소드에게 전가 시키는 메소드
 * :: 일반메소드의 뒤에 세팅을 하며, 해당 메소드를 호출하는 곳에서는 
 *    반드시 예외처리를 하게 유도하는 키워드임
 */

public class ExceptionTest9 {
	
	/**
	 * 암호를 통과하면 정상실행
	 * 암호가 맞지 않으며 예외상황 발생 시킴
	 */
	
	public static void unixTm (String pass) throws Exception {
		if(pass.equals("1234")){
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTimeInMillis());
		}else {
			throw new Exception();
		}
	}

	public static void main(String[] args) {

		try {
			unixTm("12341");
		} catch (Exception e) {
			System.out.println("- 암호 설정 오류 -");
		}
		
	}

}
