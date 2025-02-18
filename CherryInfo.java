package study13;

public class CherryInfo {
	
	String name = "체리";		 // 맴버변수,인스턴스(객체)변수
	int price = 5000;
	
	void discount() { // 10% DC
		price = price - (price/10);
	}

}
