package myThread;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Lotto6 {

	public static void main(String[] args) {

		Map<Integer,Integer> map = new HashMap<Integer,Integer>();

		while(true) {
			int num = (int)(Math.random()*45)+1;
			// ex) map.put(33,33); map은 똑같은 key값이 들어오면 안 받음
			if(map.size() < 6) {
				map.put(num, num);
			}
			if(map.size()==6) break;
		}
		Iterator<Integer> keys = map.keySet().iterator();
		while(keys.hasNext()) {
			System.out.print(keys.next()+" ");
		}	
	}

}
