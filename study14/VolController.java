package study14;

public class VolController {

	public static void main(String[] args) {

		VolMake tv = new VolMake();
		
		VolMake radio = new VolMake();
		
		System.out.println(tv.getVolLever());
		
		tv.volUp(10);
		System.out.println(tv.getVolLever());
		
		radio.volUp(30);
		System.out.println(radio.getVolLever());
		
		tv.volDown(5);
		
		radio.volDown(20);
		
		System.out.println("tv 현재볼륨:"+tv.getVolLever());
		System.out.println("radio 현재볼륨:"+radio.getVolLever());
	}

}
