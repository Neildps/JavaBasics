package myPackage;

public class SumHundred {

	public static void main(String[] args) {
		int sum = 0;
		
		for(int i=100; i<=200; i++)
		{
			sum = sum + i;
		}
		System.out.println("The sum of the numbers from 100 to 200 are: " + sum);
		
		int odd = 0;
		
		for(int i=101; i<=200; i+=2)
		{
			odd = odd + i;
			
		}
		System.out.println("The sum of the odd numbers from 100 to 200 are: " + odd);
		
		int evn = 0;
		
		for(int i=100; i<=200; i+=2)
		{
			evn = evn + i;
			
		}
		System.out.println("The sum of the even numbers from 100 to 200 are: " + evn);

	}

}
