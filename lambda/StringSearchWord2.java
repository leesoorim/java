package lambda;

interface SearcgWordInterface2{
	public int method(String a,String b);
}

public class StringSearchWord2 {

	public static void main(String[] args) {

		SearcgWordInterface2 si = (String str, String word)->{

		String[] array =str.split(word);
		int cnt = array.length-1;	// 배열개수-1 == 찾는 단어개수
		// 찾는 단어가 맨 뒤에 있는 경우 (-1)처리 하면 안됨.
		
		return cnt;
		};
		//String str = "함수123함수123함수123함수123함수12212";
		String str = "람다식이란 함수를 하나의 식으로 표현한 것이다.\n"
				+ "람다식은 익명함수 형식으로 제작이 된다.\n"
				+ "익명함수란 함수의 이름이 없는 함수로 변수처럼 사용 가능하고 매개변수 전달도 가능하다.";
		String word = "함수";
		int cnt = si.method(str, word);
		System.out.println("찾으려는 단어는 "+cnt+"개 있습니다.");

	}

}
