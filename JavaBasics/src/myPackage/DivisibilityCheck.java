package myPackage;

public class DivisibilityCheck {

	public static void main(String[] args) {
		int num[] = {35, 13, 8, -70, 26, -33, -99, 0, 70};
		 
		 
		for(int i=0; i<num.length; i++)
			
		{
			if (num[i]%5==0) 				
			{
				if (num[i]%7==0) 				
				{
					System.out.println(num[i] + " is divisible by both 5 and 7");
					
				}
				else 
				{
					System.out.println(num[i] + " is not divisible by both 5 and 7");
				}
				
			}
			else 
			{
				System.out.println(num[i] + " is not divisible by both 5 and 7");
			}

	}

}
}
