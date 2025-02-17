package study12;

public class Test1 {
	
	int a;
	int b;
	/*
	 * 오버로딩된 생성자가 없는 경우 생략 가능
	 */
	Test1(){}
	//Test1(){System.out.println("100");}
	Test1(int a){ // 생성자 오버로딩
		this.a=a;
	}

	public static void main(String[] args) {

		Test1 test1 = new Test1();
		Test1 test2 = new Test1(200);
		
		System.out.println(test1.a);
	}

}
