package study12;

public class Mycar {
	Mycar(){}
	
	int maxSpeed;
	String carName;
	String carColor;
	
	public Mycar(String acarName, int maxSpeed){
		this.carName=acarName;
		this.maxSpeed=maxSpeed;
	}
	Mycar(String carName, int maxSpeed, String carColor){
		this.carName=carName;
		this.maxSpeed=maxSpeed;
		this.carColor=carColor;
	}
	public void maxSpeedUpdate(int speed) {
		this.maxSpeed+=speed;
	}

	public static void main(String[] args) {
		
		Mycar mycar = new Mycar();
		mycar.carName = "벤츠";
		mycar.maxSpeed = 350;
		mycar.carColor= "red";

		Mycar car1 = new Mycar("소나타",230);
		Mycar car2 = new Mycar("그랜저",300,"white");
		
		System.out.println(car1.carName+":"+car1.maxSpeed);
		System.out.println(car2.carName+":"+car2.maxSpeed+","+car2.carColor);
		
		car1.maxSpeedUpdate(-20);
		System.out.println(car1.carName+":"+car1.maxSpeed);
		
	}

}
