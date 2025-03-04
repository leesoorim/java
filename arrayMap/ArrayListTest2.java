package arrayMap;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListTest2 {

	public static void main(String[] args) {
		
		// nano 시간(프로그램 속도 시스템 시간?)
		//System.out.println(System.nanoTime()); 
		
		// unix 시간(1970.1.1 0:0:0 -> 1/1000) 날짜 시간
		//System.out.println(System.currentTimeMillis()); 

		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		
		long nano1 = System.nanoTime();
		long unix1 = System.currentTimeMillis();
		for(int i=0; i<10000; i++) {
			list1.add(i+"");
		}
		long nano2 = System.nanoTime();
		long unix2 = System.currentTimeMillis();
		System.out.println(nano2-nano1);
		System.out.println(unix2-unix1);
		
		System.out.println("---------------------");
		
		nano1 = System.nanoTime();
		unix1 = System.currentTimeMillis();
		for(int i=0; i<10000; i++) {
			list2.add(i+"");
		}
		nano2 = System.nanoTime();
		unix2 = System.currentTimeMillis();
		System.out.println(nano2-nano1);
		System.out.println(unix2-unix1);
		
	}

}
