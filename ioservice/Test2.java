package ioservice;

/**
 *  확장 for 문
 */

public class Test2 {

	public static void main(String[] args) {

		int[] numbers = {11,22,33};
		// for( 출력변수: 배열 )
		for(int a : numbers) {
			System.out.println(a);
		}
		System.out.println();
		
		for(int nn : numbers) {
			System.out.println(nn);
		}
		
		System.out.println();
		
		String[] subjects = {"html","java","oracle"};
		for(String a: subjects) {
			System.out.println(a);
		}
		
		//for(String nn : numbers) { xx
		//	System.out.println(nn);
		//}
		
		
		/*for(int i=0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}*/
		
	}

}
