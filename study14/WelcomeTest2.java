package study14;

public class WelcomeTest2 extends WelcomeTest1 {
	
	public void welcome1() {
		System.out.println("안녕~");
	}
	
	public String welcome2() {
		return "하이~~~";
	}
	
	public void welcome3(int aa, String bb) {
		
	}

	public static void main(String[] args) {

		WelcomeTest2 t2= new WelcomeTest2();
		
		t2.welcome1();
		t2.welcome5();
		
		System.out.println(t2.eng);
	}

}
