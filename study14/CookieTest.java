package study14;

public class CookieTest {

	public static void main(String[] args) {
		
		// 인터페이스 파일은 인스턴스(객체) 처리 불가함
		// Coodie cc = new Cookie(); error

		MyCook my = new MyCook();
		my.makeCookie();
		my.makeSalad(); 
		System.out.println(my.a);
		System.out.println(Cookie.a);
	}

}
