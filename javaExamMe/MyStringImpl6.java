package javaExamMe;
/**
 *  추상화(추상클래스,인터페이스) : 명세처리 메소드 생성
 */

import java.util.Calendar;

abstract class MyStringMethod{
	abstract public String sevenDay(int year,int month,int date);
	
	abstract public String lastday(int year,int month,int date);
}

public class MyStringImpl6 extends MyStringMethod{
	/**
	 *  다형성(오버로딩-같은 클래스에서 같은 이름의 메소드를 매개변수만 달리하여 구성하는 일
	 *  	,오버라이딩-상위클래스의 메소드를 재구성)
	 */
	@Override
	public String sevenDay(int year,int month,int date) {
		Calendar cal = Calendar.getInstance();
		cal.set(year,month-1, date);
		
		int day = cal.get(Calendar.DAY_OF_WEEK);
		String result = "";
		switch(day) {
			case 1: result = "일요일";
			break;
			case 2: result = "월요일";
			break;
			case 3: result = "화요일";
			break;
			case 4: result = "수요일";
			break;
			case 5: result = "목요일";
			break;
			case 6: result = "금요일";
			break;
			case 7: result = "토요일";
			break;
		}
		
		return result;
	}
	@Override
	public String lastday(int year,int month,int date) {
		Calendar cal = Calendar.getInstance();
		cal.set(year,month-1, date);
		
		int lastday = cal.getActualMaximum(Calendar.DATE);
		
		return lastday+"";
	}
	

	public static void main(String[] args) {
		
		MyStringImpl6 ms = new MyStringImpl6();
		int year = 2025;
		int month = 2;
		int date = 7;
		String day = ms.sevenDay(year,month, date);
		String lastday = ms.lastday(year,month, date);
		
		System.out.println("오늘은 "+day+"이고 이번달의 마지막 날짜는 "+lastday+"입니다.");
		
		
	}

}
