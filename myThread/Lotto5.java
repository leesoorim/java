package myThread;

import java.util.ArrayList;
import java.util.List;

/**
 *  ArrayList 형식으로 저장하고 중복 방지
 */

public class Lotto5 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		
		int i=0;
		String str = "";
		while(true) {
			int chk = 0;
			int num = (int)(Math.random()*45)+1;
			for(int nm : list) {
				if(nm== num) {
					chk = 1;
					str += num+" ";
				}
			}
			if(chk == 0) {
				list.add(num);
				i++;
			}
			
			if(i == 6) break;
		}
		// 확장 for 문 : 배열형식의 데이터만 가능
		// for(출력데이터 타입 및 변수명 : 배열변수)
		for(int n : list) {
			System.out.print(n+" ");
		}
		System.out.println("\n"+str);
	}

}
