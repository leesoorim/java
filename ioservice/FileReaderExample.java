package ioservice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class FileReaderExample {

	public static void main(String[] args) {
		
		String dirPath = "C:\\eclipse-workspace7\\sample1\\src\\study1";
		
		Scanner scn = new Scanner(System.in);
		
		method1();
		
		System.out.print("내용확인 파일명>> ");
		String filename = scn.next();

		String filePath = dirPath+"\\"+filename;
		try {	
			FileReader file = new FileReader(filePath);
			BufferedReader buffer = new BufferedReader(file);	// 한쌍으로 쓰이고 참조변수가 들어감, 메모리 위치가 들어가있음
				
			while(true) {
				String str = buffer.readLine();	// 한 줄을 읽어들임
				if(str==null) break;
				System.out.println(str);				
			}
			buffer.close();
			file.close();
			
		}catch(Exception e) { System.out.println("** 없는 파일명입니다. **"); }
		
		
		
	}
	public static void method1() {
		
		Scanner scn = new Scanner(System.in);
		
		String dirPath = "C:\\eclipse-workspace7\\sample1\\src\\study1";
		File dir = new File(dirPath);
		
		
		File[] names = dir.listFiles();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		
		for(int i=0; i<names.length; i++) {
			String str = "<폴더>";
			if(names[i].isDirectory()) {
			String name = names[i].getName();
			
			int len = (int)names[i].length();
			int len2 = len/1024;
			
			long unix = names[i].lastModified();
			String date = df.format(unix);

			System.out.println(str+" "+name+ " "+ len2+"KB"+" "+date);
			}
		}	
		
		for(int i=0; i<names.length; i++) {
			String str = "[파일]";
			if(!names[i].isDirectory()) {
			String name = names[i].getName();
			
			int len = (int)names[i].length();
			int len2 = len/1024;
			
			long unix = names[i].lastModified();
			String date = df.format(unix);

			System.out.println(str+" "+name+ " "+ len2+"KB"+" "+date);
			}
		}	

	}
}
