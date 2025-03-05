package myThread;

public class Lotto4 {

	public static void main(String[] args) {

		int[] a = new int[6];	// 0 ~ 5
		System.out.println(a.length); // 6
		System.out.println(a[0]); // 0
		System.out.println(a[5]); // 0
		
		String[] b = new String[6];
		System.out.println(a.length); // 6
		System.out.println(b[0]); // null
		System.out.println(b[5]); // null
		
		boolean[] c = new boolean[3];
		System.out.println(c.length);
		System.out.println(c[0]);
		System.out.println(c[2]);
		
	}

}
