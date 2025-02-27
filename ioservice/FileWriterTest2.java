package ioservice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class FileWriterTest2 {

	public static void main (String[] args) throws Exception {
		
		Scanner scn = new Scanner(System.in);

		String filePath = "C:\\mytemp/test102.txt";
		System.out.print("내용입력>>");
		
		String text = scn.next();
	
		
			FileWriter fw = new FileWriter(filePath,true);
			fw.write(text+"\n");
			fw.close();

			System.out.println("성공");
			
	
		
			FileReader file = new FileReader(filePath);
			BufferedReader buffer = new BufferedReader(file);
			while(true) {		
				String str = buffer.readLine();
				if(str == null) break;
				System.out.println(str);
			}
			buffer.close();
			file.close();
		}	
}
