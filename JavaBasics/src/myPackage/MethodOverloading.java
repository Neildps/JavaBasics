package myPackage;

class employee
{
	void emp() {
		System.out.println("No details found");
	}
	void emp(String name) {
		System.out.println("The name of the employee is " + name +".");
	}
	void emp(byte age) {
		System.out.println("The age of the employee is " + age + " years.");
	}
	void emp(double  height) {
		System.out.println("The height of the employee is " + height + " feet.");
	}
	void emp(int salary) {
		System.out.println("The salary of the employee is " + salary + "/- Rs.");
	}
}
public class MethodOverloading {

	public static void main(String[] args) {
		employee intern = new employee();
		intern.emp("Suresh Prabhakar");
		intern.emp((byte)23);
		intern.emp(5.6);
		intern.emp(35000);
	}

}
