package practice1;

public class TestResult {
	
	public static void main (String args[]) {
		
		
		TestLogic lg= new TestLogic();
		System.out.println("Max of 3 numbers");
		System.out.println(lg.max_of_3());
		System.out.println("---------------------------------------------------\n");
		
		System.out.println("Reverse 2 numbers");
		System.out.println(lg.swap_2_num());
		System.out.println("---------------------------------------------------\n");
		
		System.out.println("Reverse 2 numbers");
		System.out.println(lg.swap_2_num(10,5));
		System.out.println("---------------------------------------------------\n");
	}

}
