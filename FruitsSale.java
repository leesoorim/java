package study13;

public class FruitsSale extends CherryInfo{
	
	// 맴버변수, 클래스(전역)변수
	// 공유메모리에 올라감
	static String maker = "한국"; 

	public static void main(String[] args) {

		//CherryInfo cherry = new CherryInfo();
		FruitsSale cherry = new FruitsSale();
		
		System.out.println(FruitsSale.maker);
		// System.out.println(cherry.maker); 올바른 건 위
		
		System.out.println(cherry.price); // 5000
		cherry.discount();
		System.out.println(cherry.price); // 4500
		
	}

}
