package pattern;

public class MemberCheck {

	public static void main(String[] args) {

		// 아이디 (영문+숫자) 6~12
		String userid = "test1212";	// true
		//userid = "7test112";
		String ptn1 = "[a-zA-z]{1}[0-9a-zA-Z]{5,11}";
		System.out.println("아이디:"+userid.matches(ptn1));
		
		// 암호 (영문+숫자+특수문자(#,%,@,-,_,.)) 8~20
		String pass = "a1234_@_";
		String ptn2 = "[0-9a-zA-Z-_@#$]{8,30}";
		System.out.println("암호:"+pass.matches(ptn2));
		
		// 이름 (영문+한글) 2~20
		String name = "김철수";
		String ptn3 = "[a-zA-Z가-힣]{2,20}";
		System.out.println("이름:"+name.matches(ptn3));
		
		// 생일 2000-12-25
		String date = "1998-03-20";
		String ptn4 = "[1-2]{1}[0-9]{3}-[0-9]{1,2}-[0-9]{1,2}";
		System.out.println("날짜:"+date.matches(ptn4));
		
		// 성별 M or F
		String gender = "F";
		String ptn5 = "(M|F){1}";
		//String ptn5 = "^(M|F).*";
		System.out.println("성별:"+gender.matches(ptn5));
				
		
		// 핸드폰 010(011)-1234-1234
		String phone = "011-1234-1234";
		String ptn6 = "(010|011)-[0-9]{4}-[0-9]{4}";
		System.out.println("휴대폰번호:"+phone.matches(ptn6));
		
		// 이메일 aa@naver.com
		// 아이디@도메인명.(com)(co.kr)(net)
		String email = "test12@naver.com";
		String ptn7 = "[a-zA-z]{1}[0-9a-zA-Z]{5,11}@[a-zA-Z0-9]+\\.[a-zA-Z0-9.]+";	// "\\" 뒤에올 기호 의미없음 기능
		System.out.println("이메일:"+email.matches(ptn7));
		
		
		// 문자열에 숫자 포함 여부
		String  str = "문자열에 0 숫자 포함 여부"; // true
		str = "abcdef"; // false
		str = "1";	// true
		String ptn8 = ".*[0-9]+.*";
		System.out.println("숫자포함여부:"+str.matches(ptn8));
		
		// IP 주소 확인
		// 192.168.0.61 //0.0.0.0 ~ 255.255.255.255
		// 숫자(1~3).숫자(1~3).숫자(1~3).숫자(1~3)
		String ip = "192.168.0.61";
		String ptn9 ="[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}";
		System.out.println("IP:"+ip.matches(ptn9));
		
		// 한글 아닌 값이 1개 이상 있어야 함 ( 전체 값이 한글만으로는 안됨)
		String str10 = "자바스크립트";
		str10 = "자바스크립트100";
		str10="1234567";
		String ptn10 = ".*[^가-힣].*";
		System.out.println("한글포함여부:"+str10.matches(ptn10));
		
	}

}
