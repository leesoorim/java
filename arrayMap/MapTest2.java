package arrayMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTest2 {

	public static void main(String[] args) {

		/*Map<String,Integer> map = new HashMap<String,Integer>();
		
		map.put("영어", 100);
		map.put("국어", 80);
		map.put("수학", 90);
		
		Iterator<String> keys = map.keySet().iterator();
		int sum =0;
		while(keys.hasNext()) {
			String key = keys.next();
			sum += map.get(key);
		}
		int avg =sum/map.size();
		System.out.println("(1)총점:"+sum);
		System.out.println("(1)총점:"+avg);
		
		System.out.println("=======================");*/
		
		Map<String,Integer> map = new HashMap<String,Integer>();
		
		map.put("영어", 50);
		map.put("국어", 40);
		map.put("수학", 70);
		
		Iterator<String> keys = map.keySet().iterator();
		int sum = 0;
		double avg =0;
		String str = "";
		
		while(keys.hasNext()) {	// keys.hasNext() -> 존재할 내용있으면 true 없으면 false 처리 됨
			String key = keys.next();
			int score = map.get(key);
			if(score < 60) str += key+",";
			sum+=score;
		}
		//avg = (sum/map.size(); // 53.7 -> 53 -> 53.0
		avg = (double)sum/map.size(); // 53.7 -> 53.7
		String avg2 = Double.toString(avg);
		int dotIndex = avg2.indexOf(".");
		avg2 = avg2.substring(0,dotIndex+3);
		//String avg2 = avg+"";
		
		if(!str.equals("")) {
			str = str.substring(0,str.length()-1);
		}else {
			str = "없음";
		}
		
		System.out.println("(1)총점:"+sum);
		System.out.println("(2)평균:"+avg2);
		System.out.println("(3)과락:"+str);
		
		
		
		
		
		
		
		
		
		
	}

}
