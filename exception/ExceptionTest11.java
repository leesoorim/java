package exception;

public class ExceptionTest11 {

	public static String dateChange(String date) throws MyDateException {
		
		String date1 = "";
		if(date.length() != 10) {
			throw new MyDateException(); // 내가 만든 클래스의 활성화
		}else {
			date1=date.replace("-", "/");
		}
		
		return date1;
	}
	
	
	public static String getGenderValue (String jumin) throws MyGenderException{
		
		String number = jumin.charAt(7)+"";
		String gender = "";
		if(number.equals("1") || number.equals("3") ) {
			gender = "남성";
		}else if(number.equals("2")  || number.equals("4") ) {
			gender = "여성";
		}else {
			// 예외상황 발생
			throw new MyGenderException();
		}
		
		return gender;
	}
	
	public static void main(String[] args) {

		try {
			System.out.println(dateChange("2025-12-25"));
		}catch(MyDateException e) {
			System.out.println(e.toString());
		}
		
		System.out.println("-------------------");
		
		
		// 820225-1012345 -> 남성
		
		try {
			System.out.println(getGenderValue("820225-4012345"));
		}catch(MyGenderException e) {
			System.out.println(e.toString());
		}catch(IllegalArgumentException e) {
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
