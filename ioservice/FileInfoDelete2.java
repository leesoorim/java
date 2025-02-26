package ioservice;

import java.io.File;
import java.util.Scanner;

/**
 * 파일 삭제 실습 2 (삭제여부를 물어봄)
 */

public class FileInfoDelete2 {

	public static void main(String[] args) {

		String dirpath = "c:/mytemp"; // \\or/
			
		Scanner scn = new Scanner(System.in);
		System.out.print("(삭제)파일명>> ");
		String filename = scn.next();
		String filepath = dirpath+"/"+filename;
		
		File file = new File(filepath);
		
		// 문자->숫자 :: 관련메소드
		int fileLen = (int)file.length();
		if(fileLen>0) {
			
			while(true) {
				System.out.print("## 빈 파일이 아닙니다. 삭제하시겠습니까? (예:Y, 아니오:N)>> ");
				String yn = scn.next();	// 소문자, 대문자 입력
				if(yn.toUpperCase().equals("Y")) {
					System.out.println("네, 삭제 진행하겠습니다.");
					break;
				}else if(yn.toUpperCase().equals("N")){
					System.out.println("== 삭제취소가 되었습니다. ==");
					return; // 메소드 종료
				}else {
					System.out.println("## Y 또는 N을 입력해주세요.");
				}
			}	
		}
		
		if(file.exists()) {
			file.delete();
			System.out.println("** 삭제완료 **");
		}else {
			System.out.println("** 존재하지 않는 파일명 입니다. **");
		}
		
		
		
	}

}
