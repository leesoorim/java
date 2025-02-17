package study11;

public class Test3 {

	String s1 = ""; // 공백
	String s2;		// null (값의 세팅이 안되어있음)
	String s3 = null;//null
	int n1 = 0;		// 0
	int n2;			// 0
	boolean bn;		// false
	double d;		// 0.0
	
	public static void main(String[] args) {
		//지역변수
		String ss1=""; // 공백
		String ss2;		// null
		int nn1=0;		// 0
		int nn2;		// null
		
		System.out.println(ss1);
		//System.out.println(ss2);// null값은 단독출력 불가
		System.out.println("");
		//System.out.println(null); // null값은 단독출력 불가
		
		System.out.println(nn1);
		//System.out.println(nn2);	//null값
		
		System.out.println("====================");
		
		Test3 t3 = new Test3();
		System.out.println("s1 "+t3.s1); // 공백
		System.out.println("s2 "+t3.s2); // null
		
		System.out.println("n1 "+t3.n1); // 0
		System.out.println("n2 "+t3.n2); // 0
		
		System.out.println("bn "+t3.bn); // false
		System.out.println("d "+t3.d);  // 0.0
		
		
	}

}
