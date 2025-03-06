package lambda;

public class Test2 {

	public static void main(String[] args) {

		/*String str = "함수11함수22함수33함수";
		String[] ar = str.split("함수");
					// {"","11","22","33"}
		System.out.println("개수:"+ar.length);
		for(String ss : ar) {
			System.out.print(ss+" ");
		}*/
		
		String str1 = "11,22,33,";
		String[] ar1 = str1.split(",");
		System.out.println("개수:"+ar1.length);
		
		String str2 = "11,22,33";
		String[] ar2 = str2.split(",");
		System.out.println("개수:"+ar2.length);
		
		String str3 = ",11,22,33";
		String[] ar3 = str3.split(",");
		System.out.println("개수:"+ar3.length);
		
		String str4 = ",11,22,33,";
		String[] ar4 = str4.split(",");
		System.out.println("개수:"+ar4.length);
		
		
		
		/*System.out.println("--------------"); // 8
		String str3 = "함수11함수22함수33";
		String[] ar3 = str3.split("함수");
		System.out.println("개수:"+ar3.length);
		
		// lastIndexOf -> 마지막 단어의 위치
		int last = str3.lastIndexOf("함수");
		
		System.out.println("개수:"+ar3.length);*/
		
		
		
		
		
	}

}
