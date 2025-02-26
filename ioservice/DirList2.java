package ioservice;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class DirList2 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		
		String dirPath = "C:/eclipse";
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
