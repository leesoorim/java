package study13;

//클래스에 붙은 public : 일반클래스(메인클래스)라는 의미
public class Mouse extends Product {
	
	// 부모클래스의 메소드를 오버라이딩
	public void setPrice(int price) {
		if(price < 1000) price=1000;
		else if(price >10000) price=10000;
		
		// 부모 클래스의 매소드를 실행
		super.setPrice(price);
	}
	
	public Mouse() {}
	
	// 생성자 오버로딩
	public Mouse(String name, int price,String maker) {
		setName(name);
		setPrice(price);
		setMaker(maker);
	}
	
	public void input(String name, int price,String maker) {
		setName(name);
		setPrice(price);
		setMaker(maker);
	}
	
	public void output() {
		System.out.println(getName());
		System.out.println(getPrice());
		System.out.println(getMaker());
	}
	

	public static void main(String[] args) {

		Mouse m1 = new Mouse("파란마우스", 5000, "미국");
		Mouse m2 = new Mouse("검정마우스", 6000, "미국");
		//m1.input("파란마우스", 5000, "미국");
		//m2.input("검정마우스", 6000, "미국");
		m1.output();
		System.out.println("----------------------");
		m2.output();
		
	}

}
