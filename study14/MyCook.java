package study14;

// 상속 키워드가 다름 : implements
public class MyCook implements Cookie{
	
	int eng = 100;
	static int kor = 80;
	
	@Override
	public void makeCookie() {
		System.out.println("내가만든 과자");
	}
	@Override
	public void makeSalad() {
		System.out.println("내가만든 샐러드");
	}

}
