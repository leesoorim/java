package javaExamMe;

class FlowerInfo{
	private String flowerSized = "대";
	private	String flowerSizej = "중";
	private	String flowerSizejs = "소";
	private String flowerName;
	private String flowerColor;
	private int flowerPrice;
	
	
	
	public String getFlowerSized() {
		return flowerSized;
	}
	public String getFlowerSizej() {
		return flowerSizej;
	}
	public String getFlowerSizes() {
		return flowerSizejs;
	}



	public String getFlowerName() {
		return flowerName;
	}



	public void setFlowerName(String flowerName) {
		this.flowerName = flowerName;
	}



	public String getFlowerColor() {
		return flowerColor;
	}



	public void setFlowerColor(String flowerColor) {
		this.flowerColor = flowerColor;
	}



	public int getFlowerPrice() {
		return flowerPrice;
	}



	public void setFlowerPrice(int flowerPrice) {
		this.flowerPrice = flowerPrice;
	}



	public void discount() {
		flowerPrice = (int)(flowerPrice*0.5);
	}
	

}

public class FlowerMain45 {

	public static void main(String[] args) {

		FlowerInfo fi = new FlowerInfo();
		fi.setFlowerName("해바라기");
		fi.setFlowerColor("노란색");
		fi.setFlowerPrice(10000);
		
		System.out.println(fi.getFlowerName()+" "+fi.getFlowerColor()+" "+fi.getFlowerSized()+" "+fi.getFlowerPrice());
		
		fi.discount();
		System.out.println(fi.getFlowerName()+" "+fi.getFlowerColor()+" "+fi.getFlowerSizes()+" "+fi.getFlowerPrice());
		
	}

}
