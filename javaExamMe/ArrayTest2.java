package javaExamMe;

public class ArrayTest2 {

	public static void main(String[] args) {

		String[] subject = {"영어","수학","과학","체육","국어"};
		String[] jumsu = {"90","88","75","55","95"};
		
		
		
		for(int i=0; i<subject.length; i++) {
			int jumsui = Integer.parseInt(jumsu[i]);
			String result ="";
				if(jumsui>=90) {
					result = "A";
				}else if(jumsui>=80) {
					result = "B";
				}
				else if(jumsui>=70) {
					result = "C";
				}
				else if(jumsui>=60) {
					result = "D";
				}else {
					result = "F";
				}
			System.out.print("["+subject[i]+":"+result+"]");
		}
		
	}

}
