package study1;

public class Test5 {

	public static void main(String[] args) {
		
		
		String name1 = "하이미디어";
		String name2 = "컴퓨터학원";
		System.out.println(name1);
		System.out.println(name2);
		System.out.println("------");
		System.out.print(name1);
		System.out.print(name2);
		System.out.println("------");
		
		//System.out.println(name1 name2); 오류
		System.out.println(name1 + name2);
		System.out.println(name1 + " " + name2);
		System.out.println(name1 + "," + name2);
		System.out.println(name1 + "(" + name2 + ")");
		System.out.println("학원명" + name1 + "(" + name2 + ")");
		
		

	}

}
