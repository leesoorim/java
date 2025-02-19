package study14;

// interface 키워드 :: 명세처리 메소드 세팅
// public abstract Cookie{
public interface Cookie {
	
	// 인스턴트변수이지만 인터페이스 파일에서는 모두 공유(static)변수 처리됨
	int a = 100;	// 맴버변수,인스턴스변수	
	
	static int b = 90;  // 맴버변수,클래스변수(공유메모리)
	
	// public abstract void makeCookie();
	public void makeCookie();
	// public abstract void makeSalad();
	public void makeSalad();
	
	// 완성형의 메소드 세팅 불가
	//public void abc() {
	//	System.out.println("aaa");
	//}

}
