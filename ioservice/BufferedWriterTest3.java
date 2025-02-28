package ioservice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class BufferedWriterTest3 {
	
	public static String filePath = "c:/mytemp/test1004.txt";

	public static void main(String[] args) throws Exception {
		
		Scanner scn = new Scanner(System.in);

		System.out.println("1. 학생정보등록");
		System.out.println("2. 학생정보출력");
		System.out.println("3. 학생정보검색");
		System.out.println("4. 학생정보삭제");
		System.out.println("5. 일괄정보등록");
		
		while(true) {
			System.out.print("메뉴번호>> ");
			int number = scn.nextInt();
			
			switch(number) {
				case 1 : setMemberInfo();
				break;
				case 2 : getMemberInfo();
				break;
				case 3 : searchMemberInfo();
				break;
				case 4 : delMemberInfo();
				break;
				case 5 : inputBatch();
				break;
				default : System.out.println("1~4번을 입력하시오.");
				return;
			}
		
		}
		
	}
	
	public static void setMemberInfo() throws Exception{
		
		Scanner scn = new Scanner(System.in);
		
		FileWriter fw = new FileWriter(filePath,true);
		BufferedWriter buffer = new BufferedWriter(fw);	// 단독으로는 못 쓰임 filePath 대입시 오류
		String data = "";
		while(true) {
			System.out.print("학생정보입력(완료:\".\")>>");
			
			String text = scn.next();			
			if(text.equals(".")) break;
			data += text;
			data += "\n";
		}
		buffer.write(data);
		buffer.close();
		System.out.println("-- 저장완료 --");
		
		
	}
	
	public static void getMemberInfo() throws Exception{
		FileReader fr = new FileReader(filePath);
		BufferedReader buffer = new BufferedReader(fr);
		
		while(true) {
			String bf = buffer.readLine();
			if(bf==null) break;
			System.out.println(bf);	
		}
		buffer.close();
		fr.close();
		
	}
	
	public static void searchMemberInfo() throws Exception{
		Scanner scn = new Scanner(System.in);
		
		FileReader fr = new FileReader(filePath);
		BufferedReader buffer = new BufferedReader(fr);

		System.out.print("학생이름>> ");
		String name = scn.next();
		while(true) {
			String bf = buffer.readLine();
			if(bf==null) break;	
			String[] split = bf.split(",");
			if(name.equals(split[0])) {
				System.out.println(bf);
			}
		}
		buffer.close();
		fr.close();
	}
	
	public static void delMemberInfo() throws Exception{
		Scanner scn = new Scanner(System.in);
		
		FileReader fr = new FileReader(filePath);
		BufferedReader buffer = new BufferedReader(fr);

		System.out.print("학생이름>> ");
		String name = scn.next();
		String datas = "";
		while(true) {
			String bf = buffer.readLine();
			if(bf==null) break;	
			String[] split = bf.split(",");
			if(name.equals(split[0])) {
				
			}else {
				datas +=bf+"\n";
			}
		}
		buffer.close();
		fr.close();
	}

	public static void inputBatch() throws Exception {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("파일명>>");
		
		
		String file2 = "c:/mytemp/";
		String filename = scn.next();
		String file = file2+filename;
		
		FileReader fr = new FileReader(file);
		BufferedReader buffer = new BufferedReader(fr);
		
		while(true) {
			String bf = buffer.readLine();
			if(bf==null) break;
			System.out.println(bf);	
		}
		buffer.close();
		fr.close();
		
	}
		
	
	
	
	
	

	
	
	
	



}
