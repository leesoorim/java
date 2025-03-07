package javaExamMe;

public class MyPatternCheck7 {

	public static void main(String[] args) {
		// 1
		String text = "030227-1234567";
		String pattern = "[0-9]{6}-[1-4]{1}[0-9]{6}";
		System.out.println(text.matches(pattern));
		
		System.out.println("----------------------------");
		
		// 2
		
		
		System.out.println(check("c:/mytemp/1929.gif"));
		
	}
	

	public static boolean check(String file) {
		
		String[] array = file.split("\\.");
		
		String text = array[array.length-1];
		String pattern = "^(jpg|png|jpge|gif|JPG|PNG|JPGE|GIF)";
		boolean result = text.matches(pattern);
			
		return result;
		}
		
}
