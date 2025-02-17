package study12;

public class SampleSum {

	public static void main(String[] args) {

		sum(); // 30
		sum(40,50); // 90
		sum(100,300,500); // 900
		sum(100,300,500,300); // 1200
		
	}
	/**
	 * 매개변수의 개수 및 종류(타입)의 차이를 두고
	 * 같은 이름의 메소드를 만드는 방법을 다형성(오버로딩)이라고 한다.
	 */
	public static void sum() {
		System.out.println(10+20);
	}
	public static void sum(int a, int b) { // 매개변수
		System.out.println(a+b);
	}
	
	public static void sum(String a, int b) { // 형성가능
		System.out.println(a+b);
	}
	/*public static void sum(int c, int d) {  // 사용불가
		System.out.println(c+d);
	}*/
	public static void sum(int a, int b, int c) {
		System.out.println(a+b+c); // 연산처리
	}
	public static void sum(String a, int b, int c) {
		System.out.println(a+b+c); // 연결처리
	}
	
	/*public static void sum(int aa, int bb, int cc) { // 사용불가
		System.out.println(a+b+c);
	}*/
	
	public static void sum(int a, int b, int c, int d) {
		System.out.println(a+b+c+d);
	}
	
	
	
	
	
	
	
	
	
	
	

}
