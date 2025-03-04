package arrayMap;

import java.util.ArrayList;
import java.util.List;

class MyBoard{
	
	String subject;	// 맴버변수, 인스턴스(객체)변수
	String content;
	String writer;
	
	// 생성자 /오버로딩(같은 이름의 매소드나(생성자)를 매개변수를 달리해서 만드는 기법)
	public MyBoard(){};
	public MyBoard(String subject,String content,String writer){
	// this : 현재 실행중인 객체
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}
	
}

public class ArrayListTest3 {
	public static void main(String[] args) {

		List<MyBoard> list = new ArrayList<MyBoard>();

		list.add(new MyBoard("제목1","내용1","홍길동"));
		list.add(new MyBoard("제목2","내용2","강호동"));
		list.add(new MyBoard("제목3","내용3","손흥민"));
		
		for(int i=0; i<list.size(); i++) {
			MyBoard board = list.get(i);
		System.out.println(board.subject+","+board.writer);
		
		}
	}

}
