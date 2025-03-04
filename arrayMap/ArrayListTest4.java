package arrayMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ArrayListTest4 {

	public static void main(String[] args) {

		List<Map> list = new ArrayList<Map>();
		
		Map<String,String> map = new HashMap<String,String>();
		map.put("학번", "1001");
		map.put("이름", "홍길동");
		map.put("생일", "2000-04-23");
		map.put("성별", "M");
		
		list.add(map);
		
		map = new HashMap<String,String>();
		map.put("학번", "1002");
		map.put("이름", "강호동");
		map.put("생일", "1990-01-25");
		map.put("성별", "M");
		
		list.add(map);
		//System.out.println(list);
		
		for(int i=0; i<list.size(); i++) {		
			System.out.println(list.get(i));
		}
		
		System.out.println("--------------------");
		
		for(int i=0; i<list.size(); i++) {		
			//System.out.println("학번 : "+list.get(i).get("학번"));
			//System.out.println("이름 : "+list.get(i).get("이름"));
			//System.out.println("생일 : "+list.get(i).get("생일"));
			//System.out.println("성별 : "+list.get(i).get("성별"));
			//System.out.println("--------------------");
		}
		

		System.out.println("--------------------");
		
		for(int i=0; i<list.size(); i++) {		
			
			Iterator<String> keys = list.get(i).keySet().iterator();
			while(keys.hasNext()) {
				String key = keys.next();
				System.out.println(key+" : "+list.get(i).get(key));
			}
			
			
			
			System.out.println("--------------------");
		}
		
		
		
		
		
		
		
		
		
		
		

		
	}

}
