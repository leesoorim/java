package study13;

class Person2{
	
	 private String name;
	 private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}

public class Student2 extends Person2 {
	
	public void allSet() {
		
		//this.name = "손흥민";
		//age = 32;
		super.setName("손흥민");
		setAge(32);
		}

	public static void main(String[] args) {
		
		Student2 s2 = new Student2();
		s2.allSet();
		//s2.setName("홍길동");
		//s2.setAge(22);
		
		String name = s2.getName();
		int age = s2.getAge();		
		
		System.out.println("이름:"+ name);
		System.out.println("나이:"+ age);
		
		
	}

}
