package JavaBasics;

public class StatcExample {
	static int count =0 ; 
	int array = 0;
	
	
	
	

	public StatcExample() {
		count ++;
		array ++;
	}





	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		StatcExample s1 =new StatcExample();
		System.out.println("Print Count " +StatcExample.count);
		
		StatcExample s2 =new StatcExample();
		System.out.println("Print Count " +StatcExample.count);
		StatcExample s3 =new StatcExample();
		System.out.println("Print Count " +StatcExample.count);
	
	
	}

}
