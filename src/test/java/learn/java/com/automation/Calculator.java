package learn.java.com.automation;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);  
		System.out.println("Please provide input: ");
		int a = sc.nextInt();
	System.out.println("Please provide second input: ");
		int b = sc.nextInt();

System.out.println("Provide operator: ");
		
		String x = sc.next();
		
		switch(x){
		case "+" : System.out.println("Additon of " + a + " & " + b + " is " + (a+b)); break; 
		case "-" : System.out.println("Subtraction of " + a + " & " + b + " is " + (a-b)); break;
		case "*" : System.out.println("Multiplication of " + a + " & " + b + " is " + (a*b)); break; 
		case "/" : System.out.println("division of " + a + " & " + b + " is " + ((float)a/(float)b)); break;
		default : System.out.println("Invalid input");
		}
		
		
		/*if (x.equals("+")){
			System.out.println("Additon of " + a + " & " + b + " is " + (a+b));
		}
		else if(x.equals("-")){
			System.out.println("Subtraction of " + a + " & " + b + " is " + (a-b));
		}
		
		else if(x.equals("*")){
			System.out.println("Multiplication of " + a + " & " + b + " is " + (a*b));
		}
		
		else if(x.equals("/")){
			System.out.println("Division of " + a + " & " + b + " is " + ((float)a/(float)b));
		}
		
		else{
			System.out.println("Invalid input");
		}*/
	}

}
