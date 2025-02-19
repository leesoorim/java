package study14;

abstract class GoodsInfo{
	
	public int quantity;	// 상품수량; default로 0임;
	abstract public void quantityUp(int n);
	abstract public void quantityDown(int n);
	public void quantityZero() {
		quantity=0;
	}
}

public class Goods extends GoodsInfo{
	
	public void quantityUp(int n) {
		quantity+=n;
	}
	
	public void quantityDown(int n) {
		if(quantity < n) {
			quantityZero();
			// quantity=0; 변수에 직접적으로 세팅하는 것은 좋은 방법은 아님
		}else {
			quantity-=n;
		}
	}
	

	public static void main(String[] args) {

		Goods goods = new Goods();
		System.out.println(goods.quantity);	// 0
		
		goods.quantityUp(100);
		System.out.println(goods.quantity);	// 100
		
		goods.quantityDown(50);
		System.out.println(goods.quantity);	// 50
		
		goods.quantityZero();
		System.out.println(goods.quantity);	// 0
		
		goods.quantityDown(5);
		System.out.println(goods.quantity);	// -5
		
		
		
		
		
		
		
		
		
	}

}
