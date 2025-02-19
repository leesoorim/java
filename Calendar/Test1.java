package Calendar;

import java.util.Calendar;

public class Test1 {

	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance(); // 인스턴스 처리
		
		// 100일 후
		cal.add(Calendar.DATE,100);
		
		// 3년 후
		//cal.add(Calendar.YEAR,3);
		
		// 3달후 
		// cal.add(Calendar.MONTH,3);
		
		int yy = cal.get(Calendar.YEAR);
		int mm = cal.get(Calendar.MONTH); // 0 ~ 11
		int dd = cal.get(Calendar.DATE);
		
		int hh = cal.get(Calendar.HOUR_OF_DAY);
		int mi = cal.get(Calendar.MINUTE);
		int ss = cal.get(Calendar.SECOND);
		
		System.out.println(yy+"년 "+(mm+1)+"월 "+dd+"일");
		
		
		
		
		
		
		
		System.out.println(hh+":"+mi+":"+ss);
		
		// 오전/오후 (am/pm) -> 0:오전, 1:오후
		int ampm=cal.get(Calendar.AM_PM);
		if(ampm==0) System.out.println("오전");
		else System.out.println("오후");

		// 요일 ( 1:일, 2:월, ~7:토)
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		String str = "";
		switch(dayOfWeek) {
		case 1: str="일요일";
		break;
		case 2: str="월요일";
		break;
		case 3: str="화요일";
		break;
		case 4: str="수요일";
		break;
		case 5: str="목요일";
		break;
		case 6: str="금요일";
		break;
		case 7: str="토요일";
		break;
		
		}
		System.out.println(str);
		
		System.out.println("올해의 몇번째 날:"+cal.get(Calendar.DAY_OF_YEAR));
		System.out.println("올해의 몇번째 주:"+cal.get(Calendar.WEEK_OF_YEAR));
		System.out.println("이번달의 몇번째 주:"+cal.get(Calendar.WEEK_OF_MONTH));
		System.out.println("이번달의 마지막 날:"+cal.getActualMaximum(Calendar.DATE));
		
		
		
		
		
		
		
		
	}

}
