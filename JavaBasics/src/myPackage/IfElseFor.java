package myPackage;

public class IfElseFor {

	public static void main(String[] args) {
		
		int age[] = {45, 5, 19, -13, 60, 77, 10, 38, 0};
		
		for(int i=0; i<age.length; i++)		//taking each item from the array until the array length
		{
			if (age[i] <=0) 				//check the given age is valid or not.
			{
				System.out.println(age[i] + ", is not a valid age.");
			}
			else if (age[i] >=60) 			//check if the age is above 60
			{
				System.out.println("Your age is " + age[i] + ", you should not drink and drive.");
			}
			else if (age[i] >=24) 			//check if the age is above 24
			{
				System.out.println("Your age is " + age[i] + ", you are Aligible to Dring Alchohol.");
			}
			else if (age[i] >=18) 			//check if the age is above 18
			{
				System.out.println("Your age is " + age[i] + ", you are eligible to Drive.");
			}
			else 							//if all the above conditions are false that mean the age is below 18
			{
				System.out.println("Your age is " + age[i] + ", you are a minor.");
			}
		}
		
	}

}
