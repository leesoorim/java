package study12;

public class Books1004 {
	String bookName="";
	int price = 10000;
	
	public Books1004() {}

	
	public Books1004(String bookName) {
		 this.bookName = bookName;
	}
	
	Books1004(String bookName,int price){
		this.bookName = bookName; // 왼쪽이 매개변수
		this.price = price;
	}

	public static void main(String[] args) {
		/*
		 * 기본형 생성자 부재시 오류발생
		 */
		
		Books1004 books = new Books1004();
		
		Books1004 java = new Books1004("자바의 첫걸음");
		Books1004 linux = new Books1004("리눅스 마스터",35000);
		
		System.out.println("My Book:"+java.bookName+", 가격:"+java.price);
		System.out.println("Your Book:"+linux.bookName+", 가격:"+linux.price);
		
		
	}

}
