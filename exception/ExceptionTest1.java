package exception;

public class ExceptionTest1 {

	public static void main(String[] args) {

		/*System.out.println(200/2);
		System.out.println(0.12131212/7);
		// System.out.println( 홍길동/2); 	문법오류
		// System.out.println(홍길동/홍길동);  문법오류
		// System.out.println(true/true);   문법오류
		System.out.println(0.12131212/0.12131212);
		System.out.println(200/0); // 예외상황*/
		
		// 예제1
		try {
			System.out.println("-나누기 프로그램-");      // 출력 o
			System.out.println(0/200); // 정상	 	  // 출력 o
			System.out.println(200/0); // 불허	 	  // 출력 x
		 	} catch(Exception e) {
		 		// 예외상황(오류)이 발생했을 경우 실행함
		 		System.out.println("0으로 나누기 불허"); // 출력 o
		 	}
		System.out.println("자바스크립트");
		
		
		
	
			// System.out.println("-나누기 프로그램-");      // 출력 o
			// System.out.println(0/200); // 정상	 	  // 출력 o
			// System.out.println(200/0); // 불허	 	  // 출력 x 	프로그램 stop
			// System.out.println("자바스크립트");
		
		System.out.println("==========================");
		// 예제2) 배열관련 예외처리
		
		try {
		int[] array = {100,200};
		System.out.println(array[0]); // 100
		System.out.println(array[1]); // 200
		//System.out.println(array(0)); // 문법오류
		//System.out.println(array{0});	// 문법오류
		System.out.println(array[2]);	// 인덱스(index)번호를 잘못입력
		}catch(Exception e) {
			System.out.println("잘못된 인덱스번호 입력");
		}
		
		
		System.out.println("==========================");
		// 예제2-1) charAt()메소드의 예외처리
		
		try {
			String str = "java";
			System.out.println(str.substring(0,1)); // j
			System.out.println(str.substring(1,2)); // a
			System.out.println(str.substring(2,3)); // v
			System.out.println(str.substring(3,4)); // a
			System.out.println(str.substring(3,5)); // error
		}catch(Exception e) {
			System.out.println("잘못된 인덱스번호 세팅됨");
		}
		
		
		System.out.println("==========================");
		// 예제3) 예외상황 이후의 내용물 실행 여부
		
		System.out.println("100"); // 실행 o
		System.out.println("200"); // 실행 o
		try {
			System.out.println("300"); // 실행 o
			System.out.println(0/0); // 0으로 나누기 금지 (오류)
			System.out.println("400"); // 실행 x
		}catch(Exception e) {
			System.out.println("0으로 나누기 금지"); // 실행 o
		}
		System.out.println("500"); // 실행 o
		
		
		
		System.out.println("==========================");
		// 예제3-1) 예외상황 이후의 내용물 실행 여부
		
		System.out.println("100"); // 실행 o
		System.out.println("200"); // 실행 o
		try {
			System.out.println("300"); // 실행 o
			System.out.println(0/0); // 0으로 나누기 금지 (오류)
			System.out.println("400"); // 실행 x
		}catch(Exception e) {
			System.out.println("0으로 나누기 금지"); // 실행 o
		}finally { // 마지막 실행; 무조건 실행;
			System.out.println("500"); // 실행 o
		}
		System.out.println("600"); // 실행 o
		
		
		

		System.out.println("==========================");
		// 예제3-2) 예외상황 이후의 내용물 실행 여부
		
		System.out.println("100"); // 실행 o
		System.out.println("200"); // 실행 o
		try {
			System.out.println("300"); // 실행 o
			System.out.println("400"); // 실행 o
		}catch(Exception e) {
			System.out.println("0으로 나누기 금지"); // 실행 o
		}finally { // 마지막 실행; 무조건 실행;
			System.out.println("500"); // 실행 o
		}
		System.out.println("600"); // 실행 o
		
		
	}

}
