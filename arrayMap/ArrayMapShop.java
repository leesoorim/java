package arrayMap;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ArrayMapShop {
	
	public static List setShopListDatas(String fileName)  {
		
		String filePath = "c:/mytemp/"+fileName;
		List<Map> list = new ArrayList<Map>();
		try {
			FileReader file = new FileReader(filePath);	// 경로인식
			BufferedReader buffer = new BufferedReader(file);
			
			while(true) {
				String str = buffer.readLine();
				if(str==null) break;
				String[] array = str.split("／");
				
				Map<String,String>map = new HashMap<String,String>();
				map.put("상품코드", array[0]);
				map.put("상품명", array[1]);
				map.put("가격",  array[2]);
				map.put("지은이", array[3]);
				list.add(map);
			}
			buffer.close();
			file.close();
		}
		catch(Exception e) {
			
		}
		return list;
	}

	public static void main(String[] args) {

		// 상품코드, 상품명,가격,지은이
		// 10001, "자바기초",20000,"홍길동"
		// 10002, "오라클마스터",25000,"마스터"
		// 10003, "리눅스",15000,"토마스"
		
		List<Map> list = setShopListDatas("shop_db.txt");
		
		/*map.put("상품코드", "1001");
		map.put("상품명", "자바기초");
		map.put("가격", "20000");
		map.put("지은이", "홍길동");
		list.add(map);
		
		map = new HashMap<String,String>();
		map.put("상품코드", "1002");
		map.put("상품명", "오라클마스터");
		map.put("가격", "25000");
		map.put("지은이", "마스터");
		list.add(map);
		
		map = new HashMap<String,String>();
		map.put("상품코드", "1003");
		map.put("상품명", "리눅스");
		map.put("가격", "15000");
		map.put("지은이", "토마스");
		list.add(map);*/
		
		
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).get("상품코드"));
			System.out.println(list.get(i).get("상품명"));
			System.out.println(list.get(i).get("가격"));
			System.out.println(list.get(i).get("지은이"));
			System.out.println(("-----------------------"));
		}
		
		
		
		
		
		
		/*Iterator<String> keys = map.keySet().iterator();
		while(keys.hasNext()) {
			String key = keys.next();
			System.out.println(key+":"+list.get(i).get(key));
		}
		System.out.println();*/
		
		
		
	}

}
