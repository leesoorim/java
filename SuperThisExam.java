package study13;

class Program1{
	
	public void pgName() {
		System.out.println("java");
	}
}

class Program2 extends Program1{
	
	// 오버라이딩
	public void pgName() {
		System.out.println("jsp");
	}
	// 오버로딩
	public void pgName(String str) {
		System.out.println("oracle");
	}
	public void programAll() {
		super.pgName(); // java
		this.pgName();  // jsp
	}
}



public class SuperThisExam {

	public static void main(String[] args) {

		Program2 pg = new Program2();
		
		pg.programAll();
		
		
	}

}
