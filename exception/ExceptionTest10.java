package exception;

/**
 * 내가 만든 익셉션 클래스 (User Exception)
 */



public class ExceptionTest10 {
	
	public static String myMethod1(String date) throws Exception {
		String date2 = "";
		if(date.length()!=10) {
			throw new MyException();
		}else {
			date2 = date.replace("-", "/");
		}

		return date2;
	}
	
	

	public static void main(String[] args) {
		
		try {
			System.out.println(myMethod1("20250303"));
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		
		
		
		
		
		

		/*try {
			System.out.println("11");
			System.out.println(100/10);
			throw new MyException();
			
		}catch(MyException e) {
			System.out.println(e.toMessage());
		}*/
		
	}

}
