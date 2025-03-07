package javaExamMe;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class TestArrayList9 {

	public static void main(String[] args) throws Exception{

		String filePath = "c:/mytemp/post1.csv";
		FileReader file = new FileReader(filePath);
		BufferedReader buffer = new BufferedReader(file);
		
		List<String> list = new ArrayList<String>();
		
		while(true) {
			String str= buffer.readLine();
			if(str==null)break;
			
			
			String[] array = str.split(",");
			String zipCode = array[0];

			if(!list.contains(zipCode)) {
				list.add(zipCode);
				System.out.println(zipCode);
			}
		}
		buffer.close();
		file.close();
		
	}

}
