package myPackage;

class husband
{
	public String hname()
	{
	return "Pradeep";
	}
	public String title()
	{
	return "Mehta";
	}
}
class wife extends husband
{
	public String wname()
	{
	return "Prabha";
	}
	public String title()		//here the title from husband class gets overridden by the wife class
	{
	return "Sharma";
	}
}

public class MethodOveririding {


	public static void main(String[] args) {
		
		wife w = new wife();
		husband h = new husband();
				
		System.out.println("Before marriage the name was :");
		System.out.println(w.wname()+ " " + w.title());
		System.out.println("After marriage the name was changed to :");
		System.out.println(w.wname()+ " " + h.title());
				
	}

}
