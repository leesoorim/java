package lambda;

import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class SupplierTest {

	public static void main(String[] args) {

		Supplier<String> s1 = ()->{
			return "하이미디어";
		};
		System.out.println( s1.get() );
		
		
		Supplier<Integer> s2 = ()->{
			int num = (int)(Math.random()*10)+1;
			return num;
		};
		System.out.println(s2.get());
		
		
		IntSupplier s3  = ()->{
			int num = (int)(Math.random()*10)+1;
			return num;
		};
		System.out.println(s3.getAsInt());

		
	}

}
