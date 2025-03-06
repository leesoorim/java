package lambda;

import java.util.function.Function;

public class FunctionTest {

	public static void main(String[] args) {

		// String -> Integer
		Function<String,Integer> fn1 = (s)-> {
			return Integer.parseInt(s);
		};
		System.out.println(fn1.apply("1004")+1004);
		
		
		// Integer -> String
		Function<Integer,String> fn2 = (s)-> {
			return Integer.toString(s);
		};
		System.out.println(fn2.apply(1004)+1004);
	
		
		
		
		
		
	}

}
