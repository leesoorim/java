package study1;

public class Test3 {

	public static void main(String[] args) {
		
		String welcome = "안녕하세요?";
		String message = "변수란 무엇인가?";
		//System.out.println(welcome);
		//System.out.println("welcome"); //변수의기능상실(일반문자취급)
		System.out.println(welcome);
		System.out.println(message);
		
		int kor = 80;
		int eng = 100;
		System.out.println(kor);
		System.out.println(eng);
		System.out.println("--------");
		
		//초기변수 세팅은 변수 타입의 무조건 설정
		String mycolor = "blue";
		System.out.println(mycolor);
		
		//변수값의 재설정(타입설정 불가)
		mycolor = "red";
		System.out.println(mycolor);
		
		//변수값의 재설정
		mycolor = "yellow";
		System.out.println(mycolor);
		
		//문법오류 :: 변수 타입의 중복선언
		//String mycolor = "green";
		
		//String class = "abc";  예약어 오류(class)
		//String public = "abc";
		 
		//String name = '홍길동'; 문자열의 홀따옴표 처리 불가
		//String eng1 = 100; 문자열은 반드시 쌍따옴표 처리,or int사용
		String eng1 = "100"; //정상
		String book = "자바의 첫걸음"; //정상
		
		//int age = "55"; 숫자타입은 쌍따옴표 불가
		int weight = 300; //정상
		//int public = 80; 예약어
		//int #number = 77;  특수문자
		int number = 77; //정상
		//int 7number = 77; 변수 이름의 첫 글자는 무조간 영문
		int num7ber = 77; //정상
		int number_7 = 77; //정상
		String 하이미디어 = "himedia";
		
		System.out.println("--------");
		
		String lotte_tower_height = "555m";
		
		
		
		
		
		//System.out.println(풀스택개발자과정은); 쌍따옴표 붙이기
		
		
		
	}

}
