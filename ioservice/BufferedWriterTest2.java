package ioservice;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class BufferedWriterTest2 {

	public static void main(String[] args) throws Exception{

		Scanner scn = new Scanner(System.in);
		String filePath = "c:\\mytemp/member_db.txt";
		
		FileWriter fw = new FileWriter(filePath,true);
		BufferedWriter buffer = new BufferedWriter(fw);	// 단독으로는 못 쓰임 filePath 대입시 오류
		String data = "";
		while(true) {
			System.out.print("학생정보등록(완료:\".\")>>");
			
			String text = scn.next();			
			if(text.equals(".")) break;
			data += text;
			data += "\n";
			System.out.print(data);
		}
		buffer.write(data);
		buffer.close();
		System.out.println("-- 저장완료 --");

		
	}

}
