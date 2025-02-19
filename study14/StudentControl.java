package study14;

abstract class StudentService{
	
	abstract public int sum();
	
}

class StudentImpl extends StudentService{
	
	private String name;
	private int eng;
	private int kor;
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getEng() {
		return eng;
	}



	public void setEng(int eng) {
		this.eng = eng;
	}



	public int getKor() {
		return kor;
	}



	public void setKor(int kor) {
		this.kor = kor;
	}



	public int sum() {
		
		return kor+eng;
	}
	
}

public class StudentControl extends StudentImpl{
	
	public void input(String name,int eng,int kor) {
		setName(name);
		setEng(eng);
		setKor(kor);
	}
	
	public void output() {
		System.out.println("이름:"+getName());
		System.out.println("영어:"+getEng());
		System.out.println("국어:"+getKor());
		System.out.println("합계:"+sum());
	}

	public static void main(String[] args) {

		StudentControl s1=new StudentControl();
		StudentControl s2=new StudentControl();
		
		s1.input("손흥민",100,90);
		s2.input("차범근",90,80);
		
		s1.output();
		System.out.println("----------");
		s2.output();
		
	}

}
