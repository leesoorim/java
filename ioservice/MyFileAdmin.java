package ioservice;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MyFileAdmin {
	
	public static String dirPath = "C:/eclipse";

	public static void main(String[] args) {
		
		 
		
			Scanner scn = new Scanner(System.in);
			
			File file = new File(dirPath);
	
			System.out.println("[ 파일 관리 ]\n");
			System.out.println("(1)목록출력 (2)파일생성 (3)파일삭제\n");
			System.out.print("*메뉴번호>> ");
		try {
			byte menu = scn.nextByte();
			
			switch(menu) {
			case 1 : MyFileAdmin.dirList();
			break;
			case 2 : MyFileAdmin.createFile();
			break;
			case 3 : MyFileAdmin.deleteFile();
			break;
			default : System.out.println("## 없는 메뉴번호 입니다.");
			break;
			}
		}catch(Exception e) {
			System.out.println("1 2 3 입력하세요.");
		}
		
	}
	
	public static void dirList() {
	
		File file = new File(dirPath);
		File[] names = file.listFiles();
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
		
	}
	
	public static void createFile() {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("(new)파일명>> ");
		String filename = scn.next();
		String filepath = dirPath+"/"+filename;
		
		File file = new File(filepath);
		
		if(file.exists()) {
			System.out.println("** 이미 존재함 **");
		}else {
			try {
				file.createNewFile();
				System.out.println("** 생성완료 **");
			}catch(Exception e) {
				// 부정확한 경로(특히 폴더명) 설정 시 발생
				System.out.println("** 생성실패 **");	
			}	
		}
	}
	
	public static void deleteFile() {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("삭제할 파일명>> ");
		
		String nullfile=scn.next();
		
		String fullfile = dirPath+"/"+nullfile;
		
		File file = new File(fullfile);
		
		if(file.length()<0) {
			file.delete();
		}else {
			
		}
		
		
	}

}
