package ioservice;

import java.io.File;
import java.util.Calendar;

public class FileInfo2 {

	public static void main(String[] args) {

		String filepath = "c:/mytemp/test1.txt";
		File file = new File(filepath);
		
		System.out.println("파일이름 : "+file.getName());	// text1.txt - 파일명
		System.out.println("파일크기 : "+file.length()+"byte");	// 10 - 크기(바이트) 영문 한 글자가 1byte
		System.out.println("존재여부 : "+((file.exists())?"존재":"미존재"));	// true - 존재여부
		System.out.println("파일경로 : "+file.getPath());	// c:\mytemp\test1.txt - 파일경로
		System.out.println("파일여부 : "+((file.isFile())?"파일":"파일아님") );	// true - 파일인지에 대한 여부
		System.out.println("폴더여부 : "+((file.isDirectory())?"폴더":"폴더아님"));	// false - 폴더인지에 대한 여부
		
		
		// 1740462588251 - 마지막수정날짜(유닉스시간)
		long unix = file.lastModified();	
		
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(unix);
		int yy = cal.get(Calendar.YEAR);
		int mm = cal.get(Calendar.MONTH)+1;
		int dd = cal.get(Calendar.DATE);
		
		System.out.println("생성날짜 : "+ yy+"-"+mm+"-"+dd);
		
		
		
		
		
		
		//try {
		//	methodTest1();
		//}catch(Exception e) {
		//	System.out.println("~~");
		//}
		
	}
	static void methodTest1() throws Exception{
		System.out.println("test");
	}

}
