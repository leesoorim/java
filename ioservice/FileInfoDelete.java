package ioservice;

import java.io.File;
import java.util.Scanner;

public class FileInfoDelete {

	public static void main(String[] args) {
		String filef = "C:/mytemp";
		Scanner scn = new Scanner(System.in);
		
		System.out.print("파일명 입력>> ");
		String fileb = scn.next();
		String filefull = filef+"/"+fileb;
		
		File file = new File(filefull);
		
		if(file.exists()) {
			if(file.length()==0) {
				file.delete();
				System.out.println("삭제완료");
			}else {
				System.out.println("0이 아니라 삭제할 수 없음");
			}
		}else {
			System.out.println("** 없는 파일입니다. **");
		}
		
	}

}
