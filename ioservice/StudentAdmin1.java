package ioservice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class StudentAdmin1 {
	
	// 맴버변수, 클래스(전역)변수
	public static String filePath = "C:\\mytemp\\student_info.txt";

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);

		System.out.println("[학생관리]");
		
		System.out.println("(메뉴1)학생목록(이름)");
		
		System.out.println("(메뉴2)학생목록(이름+점수)");		
		System.out.println("메뉴번호>> ");
		
		int menu = 0;
		try{
			menu = scn.nextInt();
		}catch(Exception e) {
			System.out.println("** 숫자를 입력하세요. **");
			return;
		}
		
		switch(menu) {
		case 1 : studentList1();
		break;
		case 2 : studentList2();
		break;
		default : System.out.println("** 없는 메뉴번호입니다. **");
		}

	}
	
	public static void studentList1() {
		
		try {
			FileReader file = new FileReader(filePath); // 경로인식
			BufferedReader buffer = new BufferedReader(file);	//  파일을 엶
			int rowNumber=0;
			while(true) {	// 무한루프 상태
				rowNumber++;
				String str = buffer.readLine();
				if(str==null) break;
				String[] array = str.split(":");
				System.out.println(rowNumber+"."+array[0]);
			}
		}catch(Exception e) {
			System.out.println("경로를 다시 확인해주세요.");
		}
		
	}
	
	public static void studentList2() {
		
		try {
			FileReader file = new FileReader(filePath); // 경로인식
			BufferedReader buffer = new BufferedReader(file);	//  파일을 엶
			int rowNumber=0;
			while(true) {
				rowNumber++;
				String str = buffer.readLine();
				if(str==null) break;
				String[] array = str.split(":");
				System.out.println(rowNumber+"."+array[0]+"("+array[1]+")");
			}
		}catch(Exception e) {
			System.out.println("경로를 다시 확인해주세요.");
		}
		
	}
	
	

}
