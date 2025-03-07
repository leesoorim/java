package javaExamMe;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class SearchAddress8 {

	public static void main(String[] args) throws Exception{

		String filePath = "C:\\mytemp\\post1.csv";
		FileReader fr = new FileReader(filePath);
		BufferedReader buffer = new BufferedReader(fr);
		
		Scanner scn = new Scanner(System.in);
		System.out.print("주소검색>>");
		
		String put = scn.next();
		
		int number=0;
		while(true) {
			String line=buffer.readLine();
			if(line==null)break; 
			
			if(line.contains(put)) {
				number++;
				System.out.println(number+"."+line);
			}
		}buffer.close();
		fr.close();
		
		
	}

}
