package myPackage;

public class OperatorData {

	public static void main(String[] args) {
		//Java Basic Operators 
		//Declare Variables
		int a = 3, b = 4, c = 13, d = 4;
				
		//1. Arithmetic : +, -, *, /, %
		System.out.println((a+b) +", "+ (c-b) +", "+ (a*b) +", "+ (c/b) +", "+ (c%b));
		System.out.println();
		
		//2. Relational: <, >, <=, >=, ==, !=
		System.out.println((a>b) +", "+ (c<b) +", "+ (a<=b) +", "+ (c>=b) +", "+ (b==d) +", "+ (b!=d) );
		System.out.println();
		
		//3. Logical: &&, ||
		System.out.println("when both statement are true : " 	+ ((a<b) && (c>b)));	//true
		System.out.println("when one statement is false : " 	+ ((a>b) && (c>b)));	//false
		System.out.println("when any statement is true : " 		+ ((a>b) || (c>b)));	//true
		System.out.println("when both statement are false : " 	+ ((a>b) || (c<b)));	//false
		System.out.println();
		
		//4. Assignment: =, +=, -=, *=, /=, %=
		System.out.println((a+=10) +", "+ (c-=10) +", "+ (d*=4) +", " + (b/=2));
		System.out.println("New values are: a ="+ a +", b="+ b +", c="+ c +", d="+ d);
		System.out.println();
		
		//5. Unary: ++, --
		System.out.println(a++ +", "+ b--);

	}
	 	
}
