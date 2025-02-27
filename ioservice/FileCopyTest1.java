package ioservice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class FileCopyTest1 {

	public static void main(String[] args) throws Exception{

		String filePath1 = "c:/mytemp/post1.csv";		
		String filePath2 = "c:/mytemp/Test5.java.back"; // 백업파일
		
		FileReader file = new FileReader(filePath1);
		BufferedReader buffer = new BufferedReader(file);
		
		FileWriter fw = new FileWriter(filePath2,true);
		
		while(true) {
			String str = buffer.readLine();
			if(str==null) break;
			
			fw.write(str+"\n");
		}
		fw.close();
		file.close();
		buffer.close();
		System.out.println("카피완료!");
	}

}
