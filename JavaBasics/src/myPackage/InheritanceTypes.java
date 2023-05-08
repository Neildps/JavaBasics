package myPackage;
//class father contains the first name and last name of father.
class father{						
	public String firstname () 		//this method returns first name of father.
	{
		return "Ramesh";			
	}
	public String surname () 		//this method returns the FAMILY SURNAME.
	{
		return "Gupta";
	}
}

//class mom returns mother's full name form by fetching family surname from father class.
class mom 
{
	father fname = new father(); 	//create object of father class.
	String S = fname.surname();		//fetch and store Family Surname to string S.
	public String momname () 		//this method returns moms full name 
	{
		return "Renuka " + S;		//return mother first name with family surname.
	}
}

//class son contains only the first name of the Son and inherits the fathers surname from the father class.
class son extends father
{
	public String sonname () 		//this method returns Son's first name.
	{
		return "Rahul";
	}
}

//class dtr contains only the first name of the Daughter and inherits the fathers surname from the father class.
class dtr extends father
{
	public String dtrname () 		//this method returns Dauther's first name.
	{
		return "Rohini";
	}
}

//main class
public class InheritanceTypes
{
public static void main(String[]args) 
{
	System.out.println("Family Details :");
	
	//here we fetch details directly from father class by (Single Inheritance) 
	father fname = new father(); 	//create object of father class.
	String F = fname.firstname();	//fetch and store father first name to string F.
	String S = fname.surname();		//fetch and store Family Surname to string F.
	System.out.println("Father's name is : "+ F + " " + S);
	
	//here mothers full name is inheriting form mom class (Single Inheritance)
	//but mothers surname is inheriting from father class (Multilevel Inheritance) 
	mom mname = new mom(); 			//create object of father class.
	String M = mname.momname();		//fetch and store father first name to string F.
	System.out.println("Mother's name is : "+ M );
	
	//here Son and Daughter first names are inheriting form individual classes (Single Inheritance)
	//but both are inheriting Family surname indirectly from father class. (Hierarchical Inheritance) 
	son sname = new son();			//create object of son class.
	String s= sname.sonname();		//fetch the dauther's first name from dtr class and store in string s.
	String x= sname.surname();		//fetch the family surname from father class and store in string x.
	System.out.println("Son's name is : "+ s + " " + x);
	
	dtr dname = new dtr();			//create object of dtr class.
	String d= dname.dtrname();		//fetch the dauther's first name from dtr class and store in string d.
	String y= dname.surname();		//fetch the family surname from father class and store in string y.
	System.out.println("Daughter's name is : " + d + " " + y);
}
}
