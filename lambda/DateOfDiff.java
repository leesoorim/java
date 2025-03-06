package lambda;

import java.util.Calendar;

interface DateInterface{
	public int method(String date1,String date2);
}
interface DateUnixtime{
	public long method(String date);
}

public class DateOfDiff {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		
		DateUnixtime unix = (date)->{
			String[] str = date.split("-");
			int yy = Integer.parseInt(str[0]);
			int mm = Integer.parseInt(str[1]);
			int dd = Integer.parseInt(str[2]);
	
			cal.set(yy,(mm-1), dd);
			
			return cal.getTimeInMillis();
		};

		DateInterface df = (date1,date2)->{
			long d1 = unix.method(date1)/1000;
			long d2 = unix.method(date2)/1000;
			long minus = d2-d1;
			int result = (int)(minus/(60*60*24));
			result= Math.abs(result);
			
			return result;
		};
		
		String d1 = "2025-03-06";
		String d2 = "2025-03-08";
		int ret =df.method(d1, d2);
		System.out.println(d1+"과(와) "+d2+"의 차이는 "+ret+"일 입니다.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
