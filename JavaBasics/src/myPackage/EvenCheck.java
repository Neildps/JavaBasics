package myPackage;

public class EvenCheck {

	public static void main(String[] args) {
		 	
		
		//Declare an array of numbers
		int num[] = {10, 13, 8, 47, 26, 33, 99, 27, 70};
		 
		 
			for(int i=0; i<num.length; i++)		//taking each item from the array until the array length
			{
				if ((num[i]%2)==0) 				//check the given number is completely divisible by 2
				{
					System.out.println(num[i] + " is an even Number.");
				}
				if ((num[i]%2)!=0)			
				{
					System.out.println(num[i] + " is an Odd Number.");
				}
			}
	}

}


