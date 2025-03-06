package lambda;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

interface Inter1 {
	public void abc(String t);
}

public class ConsumerTest {

	public static void main(String[] args) {

		Consumer<String> cons1=(t)->{
			System.out.println(t);
		};
		cons1.accept("java1");
	
		Inter1 it = (t)->{
			System.out.println(t);
		};
		it.abc("java2");
	
		Consumer<Integer> con2 =(t)->{
			System.out.println(t+100);
		};
		con2.accept(5);
		
		BiConsumer<Integer,Integer> cons3 = (t1,t2)->{
			System.out.println(t1+t2);
		};
		cons3.accept(100, 200);
		
		Consumer<String> strUp=(str)->{
			System.out.println(str.toUpperCase());
		};
		
		strUp.accept("java");
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}

}
