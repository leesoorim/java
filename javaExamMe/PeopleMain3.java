package javaExamMe;

class PeopleInfo{
	String name;
	int age;
	String gender;
	String loc;
	PeopleInfo(String name){
		this.name=name;
		System.out.println(name+"입니다.");
	}
	PeopleInfo(String name,int age){
		this.name=name;
		this.age=age;
		System.out.println(name+"의 나이는 "+age+"세입니다.");
	}
	PeopleInfo(int age,String gender,String loc){
		this.gender=gender;
		this.age=age;
		this.loc=loc;
		gender = gender.equals("F")?"여성":gender.equals("M")?"남성":"잘못된값";
		System.out.println(age+"세의 "+gender+"은 "+loc+"에 거주하고 있습니다.");
	}
}

public class PeopleMain3 {

	public static void main(String[] args) {

		// PeopleInfo s3 = 는 따로 호출할 일 없이 바로 출력하면 생략가능
		new PeopleInfo("홍길동");
		new PeopleInfo("토마스",25);
		new PeopleInfo(31,"M","서울");
		
	}

}
