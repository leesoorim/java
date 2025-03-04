package arrayMap;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ArrayMapTest1 {
	
	public static List setCalendarInfo(String year) {
		
		Calendar cal = Calendar.getInstance();
		
		List<Map> list = new ArrayList<Map>();			
		
		for(int m=1; m<=12; m++) {
			
			cal.set(Integer.parseInt(year), m-1,1);
			
			Map<String,String> map = new HashMap<String,String>();
			map.put("yearMonth", year+((m<10)?"0"+m:m));
			map.put("lastDay", cal.getActualMaximum(Calendar.DATE)+""); // 매달의 마지막 날짜
			map.put("dayOfWeek", cal.get(Calendar.DAY_OF_WEEK)+"");	// 매달 1일의 첫번째 요일
			
			list.add(map);
		}
		return list;
	}

	public static void main(String[] args) {

		List<Map> list =  setCalendarInfo("2025");		
		
		
		for(int i=0; i<list.size(); i++) {
			Iterator<String> keys = list.get(i).keySet().iterator();
			while(keys.hasNext()) {
				String key=keys.next();
				System.out.println(key+":"+list.get(i).get(key));
			}
			System.out.println("---------------------");
			
		}
		
		
	}

}
