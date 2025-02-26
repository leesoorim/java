package ioservice;

import java.io.File;
import java.text.SimpleDateFormat;

public class DirList {

	public static void main(String[] args) {

		//String dirPath = "C:\\eclipse"; 밑에랑 같은 의미 슬러쉬는 1개이상가능
		String dirPath = "C:/eclipse";
		File dir = new File(dirPath);
		
		
		// 물리적인 파일 또는 폴더를 배열 형식으로 묶음
		File[] names = dir.listFiles();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		
		for(int i=0; i<names.length; i++) {
			String str = "[파일]";
			if(names[i].isDirectory()) str = "<폴더>";
			String name = names[i].getName();
			int len = (int)names[i].length();	// byte
			long unix = names[i].lastModified();
			String date = df.format(unix);
			int len2 = len/1024;
			
			// Byte < KByte < MByte < GByte
			// 1024byte -> 1kbyte
			// 1024kbyte -> 1mbyte
			// 1024mbyte -> 1gbyte
			
			System.out.println(str+" "+name+ " "+ len2+"KB"+" "+date);
				
		}
		
	}

}
