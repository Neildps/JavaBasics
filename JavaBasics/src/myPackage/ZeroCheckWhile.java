package myPackage;

public class ZeroCheckWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = {10, 13, 8, -47, 26, -33, -99, 0, 70};
		 
		 
		//for(int i=0; i<num.length; i++)
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
