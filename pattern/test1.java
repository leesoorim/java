package pattern;

public class test1 {
	/**
	 * matches() : 패턴 매소드
	 * @param args
	 */

	public static void main(String[] args) {
		// 단 한개의 문자만 허용
		String text = "홍";	// true
		text = "A";			// true
		text = "AA";		// false; 단 하나의 문자만 허용
		text = "";			// false; 공백허용안됨
		text = " ";			// true;  빈공간(한칸)은 문자한개로 인식
		text = "  ";		// false;
		text = "#";			// true;  허용된 특수문자
		text = "/";			// true;
		text = "\\";		// true;  \\ 역슬래쉬 두개는 한개로 인식
		String pattern = ".";
		
		// "문자(열)".matches(패턴)
		System.out.println(text.matches(pattern));	
		//System.out.println("홍".matches(pattern));	// 맞는 형식
		//System.out.println(pattern.matches(text));	// 잘못된 형식
		
		
		// 에제2 - 문자가 1개 이상
		
		String text2 = "사전구매";	// true
		text2 = "전";				// true
		text2 = "야양";					// false
		String pattern2 = ".+";		// "앞의 문자가 한개이상"의 의미 
		System.out.println("2번:"+text2.matches(".+"));
		
		
		// 예제3 - 시작 문자열(단어)를 체크	*0개이상
		String text3 = "정보처리 산업기사";
		text3 = "정보처리";	// true
		text3 = "정보처";		// false ; "정보처리"라는 단어로 시작하지 않았음
		text3 = "정바처리";	// false
		// ^ : 뒤에 올 문자(열)로 시작
		// "정보처리"라는 단어로 시작해야하고 뒤의 문자가 0개 이상 올 수가 있다.
		String pattern3 = "^정보처리.*";	// true
		System.out.println("3번:"+text3.matches(pattern3));
		
		// 예제4 
		String text4 = "yellow";	// true
		text4 = "red";	// true
		text4 = "banana";	// true
		text4 = "a";	// false
		String pattern4 = "^(r|y|b).*";	// r 또는 y 또는 b로 시작되는 문자열
		System.out.println("4번:"+text4.matches(pattern4));
		
		// 예제5 ( html 또는 java 또는 oracle로 시작하는 문자열 )
		String text5 = "html css java";
		text5 = "java";	// true
		text5 = "oracle 수업";	// true
		text5 = "css oracle";	// false
		String pattern5 = "^(html|java|oracle).*";
		
		System.out.println("5번:"+text5.matches(pattern5));
		
		
		// 예제6 
		String text6 = "html css java";	// true
		text6 = "java";	// false
		
		String pattern6 = "^(html|java|oracle).+";	// + 아무문자나 한 개 이상
		System.out.println("6번:"+text6.matches(pattern6));

	
		// 예제7 ( html 또는 java 또는 oracle로 시작하는 문자열 )
		String text7 = "html css java";
		text7 = "java";	
		text7 = "oracle 수업";	
		text7 = "css oracle";	
		text7 = " java ";	// false
		String pattern7 = "^(html|java|oracle).";
		
		System.out.println("7번:"+text7.matches(pattern5));

		
		// 예제8 - 날짜형식
		String date = "2025-02-15";	// true
		date = "2025/02/15";	// false : "-" 기호누락
		date = "aaaa-09-25";
		String pattern8 = "[0-9]{4}-[0-9]{1,2}-[0-9]{1,2}";	// [숫자]{개수범위}
		System.out.println("8번:"+date.matches(pattern8));
		
		if(date.matches(pattern8)) {
			System.out.println("올바른 날짜형식");
		}else {
			System.out.println("올바른 날짜형식이 아님");
		}
		
		// 예제9 - 주민등록번호 체크
		// 숫자6자리 - 숫자7자리 / [1~4]
		String text9 = "801225-1012345";	// false
		text9 = "801225-12345";				// false
		String pattern9 = "[0-9]{6}-[1-4]{1}[0-9]{6}";
		System.out.println(text9.matches(pattern9));
		
		// 예제10 - 영어점수 체크 
		// 숫자 1 ~ 3
		String eng = "90";
		String pattern10 = "[0-9]{1,3}";	// 1개 ~ 3개 ","는 범위를 의미
		System.out.println("10번:"+eng.matches(pattern10));
		
		// 예제11 - 한글만 허용 (2~20자리)
		String name = "홍길동";
		name = "홍길동 ";
		String pattern11 = "[가-힣]{2,20}";
		System.out.println("11번:"+name.matches(pattern11));
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
