package ioservice;

import java.io.File;

public class FileInfo {

	public static void main(String[] args) {

		// 파일이름, 생성날짜, 파일종류, 파일크기
		String filepath = "c:/mytemp/test1.txt";
		File file = new File(filepath);
		
		System.out.println(file.getName());	// text1.txt - 파일명
		System.out.println(file.length());	// 10 - 크기(바이트) 영문 한 글자가 1byte
		System.out.println(file.exists());	// true - 존재여부
		System.out.println(file.getPath());	// c:\mytemp\test1.txt - 파일경로
		System.out.println(file.isFile());	// true - 파일인지에 대한 여부
		System.out.println(file.isDirectory());	// false - 폴더인지에 대한 여부
		System.out.println(file.lastModified());	// 1740462588251 - 마지막수정날짜(유닉스시간)
		
		System.out.println("--------------------");
		
		//try {
		//	file.createNewFile();	//- (빈)파일생성 메소드
		//}catch(Exception e) {
			
	//	}
		
		
		//file.delete();	- 파일삭제	
		//file.listFiles()	- 파일목록정보
		
		File file1 = new File("c:/mytemp/java");
		file1.mkdir();	// - 폴더생성
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
