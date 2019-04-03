package JavaBasics;

import java.util.function.Consumer;
import java.util.function.Function;

 interface Adder
{
	String add(Function<String, String> f);
	//void add(Consumer<Integer> f);
}

public class AdderImpl implements Adder{

	@Override
	public String add(Function<String, String> f) {
	 return f.apply("Welcome ");  

	}
	
	
	public static void main (String[] args ) {
		 
		Adder adderImpl = (v) -> v + " tyrjewytrsw";
		String r = adderImpl.add(a -> a + " dhsrsrasj");
		System.out.println(r);
		
	}

}
