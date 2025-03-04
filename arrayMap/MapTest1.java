package arrayMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTest1 {

	public static void main(String[] args) {

	// 		참조클래스    참조변수	  = new 생성자
		Map<Integer,Integer> map1 = new HashMap<Integer,Integer>();
		
		map1.put(0, 10);
		map1.put(1, 20);
		map1.put(2, 30);
		map1.put(3, 40);
		map1.put(4, 50);
		
		
		
		//System.out.println(map1);
		// 특정 위치 데이터 삭제와 다른 위치 데이터의 키값은 무관
		System.out.println(map1.get(1));
		System.out.println(map1.get(2));
		System.out.println(map1.get(3));
		map1.remove(1);
		System.out.println(map1.get(1)); // null
		System.out.println(map1.get(2));
		System.out.println(map1.get(3));
		
		
		
		
		
		
		
		Map<Integer,Integer> map2 = new HashMap<Integer,Integer>();
		Map<Integer,Integer> map3 = new HashMap<Integer,Integer>();
		Map<String,String> map4 = new HashMap<String,String>();
		
		map4.put("userid", "kim123");	// key, value(출력대상)
		map4.put("pass", "1234");
		map4.put("name", "홍길동");
		map4.put("gender", "M");
		
		Iterator<String> keys = map4.keySet().iterator();
		int i=0;
		while(keys.hasNext()) {	// 존재여부    
			String key = keys.next();
			System.out.println(map4.get(key));
		}
		
		//for() {
			// key 값이 자동으로 올 수 있으면 좋겠네~
		//System.out.println(keys.next());	// 홍길동
		//}
		
		
		
		
		
		
		/*map1.put(0, 10);
		map1.put(1, 20);
		map1.put(2, 30);
		map1.put(3, 40);
		map1.put(4, 50);
		System.out.println(map1.get(0));
		System.out.println(map1.get(1));
		
		map2.put(11, 100);
		map2.put(12, 200);
		map2.put(13, 300);	
		System.out.println(map2.get(11));
		System.out.println(map2.get(12));
		
		map3.put(77, 700);
		map3.put(23, 120);
		System.out.println(map3.get(77));
		System.out.println(map3.get(23));
		
		for(int i=0; i<map3.size(); i++) {
			
		}*/
		
		
		
		
		
		
		
		
		
		
		
	}

}
