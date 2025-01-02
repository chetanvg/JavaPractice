package practice1;

import java.util.Scanner;

public class TestLogic {

	
//code to check max of 2 num
 String max_of_3() {
		
		int a,b,c;
		@SuppressWarnings("resource")
		Scanner in =new Scanner(System.in);
		System.out.println("Enter value of a:");
		a=in.nextInt();
		
		System.out.println("Enter value of b:");
		b=in.nextInt();
		
		System.out.println("Enter value of c:");
		c=in.nextInt();
		
		
		if (a>b && a>c) {
			//System.out.println("a is the largest number having value: "+ a);
			return ("a is the largest number having value: "+ a);
			}
		
		else if (b>c) {
			//System.out.println("b is the largest number having value: "+ b);
			return ("b is the largest number having value: "+ b);
			}
		
		else {
			//System.out.println("c is the largest number having value: "+ c);
			return ("c is the largest number having value: "+ c);
			 }			
		}
 //code to reverse 2 num with input parameters
 	String swap_2_num(int a, int b) {
 		
 		 a=a+b; b=a-b; a=a-b;

 		return ("New value of a is: "+ a + "\nNew value of b is: "+ b );
 		
 	}
 	
 //code to reverse 2 num	
 	String swap_2_num() {
 		
 		int a,b;
 		@SuppressWarnings("resource")
		Scanner in= new Scanner (System.in);
 		
 		System.out.println("Enter value of a: ");
 		a=in.nextInt();
 		
 		System.out.println("Enter value of b: ");
 		b=in.nextInt();
 		
 		a=a+b;
 		b=a-b;
 		a=a-b;

 		return ("New value of a is: "+ a + "\nNew value of b is: "+ b );	
 	} 	
 	
 	
 
}
