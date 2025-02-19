package study14;

public class CarVolController {

	public static void main(String[] args) {

		CarVolMake car = new CarVolMake(); // 인스턴스(객체)
		
		System.out.println(car.getVolumn());
		
		car.volUp(10);
		car.volUp(10);
		System.out.println(car.getVolumn());
		
		car.volDown(50);
		System.out.println(car.getVolumn());
		
		car.volPause();
		System.out.println(car.getVolumn());
		
		car.volResume();
		System.out.println(car.getVolumn());
		
		car.volOff();
		System.out.println(car.getVolumn());
	}

}
