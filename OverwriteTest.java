package study13;
/**
 *  다형성(오버로딩,오버라이딩)
 *  오버라이딩 : 상속과 관련
 */

class JavaProject{
	
	public void projectName() {
		System.out.println("자바프로젝트");
	}
	String projectLocSeoul() {
		return "강남구";
		}
}

class OracleProject extends JavaProject{
	
	// 오버라이딩 ( 상속과 관련; 상위 클래스의 매소드를 덮어써버림)
	public void projectName() {
		System.out.println("오라클프로젝트");
	}
	// 오버로딩(상속과무관)
	String projectLocBusan() {
		return "해운대구";
	}
	String projectLocBusan(String loc) {
		return "광안리";
	}
	
}

public class OverwriteTest {

	public static void main(String[] args) {
		
		OracleProject project=new OracleProject();

		project.projectName();
		
		System.out.println(project.projectLocSeoul());
		System.out.println(project.projectLocBusan());
		
	}

}
