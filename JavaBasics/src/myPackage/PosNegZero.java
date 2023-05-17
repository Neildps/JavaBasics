package myPackage;

public class PosNegZero {

		public static void main(String[] args) {
			 	
			
			//Declare an array of numbers
			int num[] = {10, 13, 8, -47, 26, -33, -99, 0, 70};
			 
			 
				for(int i=0; i<num.length; i++)		
				{
					if (num[i]<0) 				
					{
						System.out.println(num[i] + " is a Negative Number.");
					}
					else if (num[i]>0)			
					{
						System.out.println(num[i] + " is a positive Number.");
					
					}
					else			
					{
						System.out.println(num[i] + " is neighter Negative nor Positive");
					
					}
				}
				
				//Same logic with While loop
				
				int i =0;
				while (i<num.length)
				{
					if (num[i]<0) 				
					{
						System.out.println(num[i] + " is a Negative Number.");
						i++;
					}
					else if (num[i]>0)			
					{
						System.out.println(num[i] + " is a positive Number.");
						i++;
					
					} 
					else			
					{
						System.out.println(num[i] + " is neighter Negative nor Positive");
						i++;
					
					}
				}
		}

	}
