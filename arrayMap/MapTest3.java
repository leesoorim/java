package arrayMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTest3 {

	public static void main(String[] args) {

		Map<String,String> map = new HashMap<String,String>();
		
		map.put("학번", "1001");
		map.put("이름", "홍길동");
		map.put("생일", "2000-04-23");
		map.put("성별", "M");
		
		map.put("학번", "1001");
		map.put("이름", "강호동");
		map.put("생일", "1990-04-23");
		map.put("성별", "M");
		
		System.out.println(("학번: "+map.get("학번")));
		System.out.println(("이름: "+map.get("이름")));
		System.out.println(("생년: "+map.get("생일").substring(0,4)));;
		// (조건식)?참:거짓
		System.out.println("성별: "+(map.get("성별").equals("M")?"남성":"여성")        );
		
		System.out.println("-------------------------");
		
		Iterator<String> keys = map.keySet().iterator();
		while(keys.hasNext()) {	// 키값의 존재 유무
			String key = keys.next();	// 실제 키값을 가져옴
			System.out.println(map.get(key));
		}
		
		
	}

}
