package study12;

class WooriBankInfo{
	
	String branchName = "강남지점";				// 맴버변수, 인스턴스 변수
	String branchLocation = "서울시 서초구 123";
	
	// (1) 생성자 : new 키워드를 통해 객체 생성시 자동 실행되는 메소드
	// (2) static 또는 리턴 타입이 붙지 못함 ( void는 내장되어 있음)
	// (3) 클래스 이름과 동일한 이름으로 형성함
	// (4) 일반메소드처럼 호출 불가
	WooriBankInfo(){
		System.out.println("<< 우리은행 >>");
	}
	WooriBankInfo(String name){ //객체변수 this 붙여야함 생략도되지만
		this.branchName = name;    
		System.out.println("<< 우리은행 >>");
	}
	
	WooriBankInfo(String name, String location){
		this.branchName = name;
		this.branchLocation = location;
		System.out.println("<< 우리은행 >>");
	}
	
	// 기본값 :: 기본생성자는 생략가능
	// WooriBankInfo(){} 원래는 아무것도 없는 기본값 상태인데 위에처럼 의미추가 가능
}

public class WooriBank {
	
	WooriBank(){}

	public static void main(String[] args) {
		
		// 생성자가 들어가 있는 클래스를 객체처리한다.(new가 있을 때)
		// 참조클래스		 참조변수 = new(키워드) 생성자
		WooriBankInfo wooribank1 = new WooriBankInfo();
		System.out.println("지점이름 : "+wooribank1.branchName);
		System.out.println("지점위치 : "+wooribank1.branchLocation);
		
		System.out.println("-----------------------");
		
		
		WooriBankInfo wooribank2 = new WooriBankInfo("구리역점");
		wooribank2.branchLocation =" 구리시 인창동";
		System.out.println("지점이름 : "+wooribank2.branchName);
		System.out.println("지점위치 : "+wooribank2.branchLocation);
		
		System.out.println("-----------------------");
		
		WooriBankInfo wooribank3 = new WooriBankInfo("부산역점","부산시 해운대구");
		System.out.println("지점이름 : "+wooribank3.branchName);
		System.out.println("지점위치 : "+wooribank3.branchLocation);
		
	}

}
