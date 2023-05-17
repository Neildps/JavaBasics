package myPackage;

public class DivisibilityThousand {

	public static void main(String[] args) {
			int sum = 0;
			for(int i=1; i<=1000; i++)
				
			{
			if ((i%5==0) && (i%7==0)) 				
			{
				
				sum = sum + i;
			}
			
			}
			System.out.println("The sum of the numbers divisible by both 5 and 7 is + " + sum);
	}

}
