package myPackage;

public class DataTypes 
{

	public static void main(String[] args) 
	{
		//Integer Type
		//integer
		int a = 32; 			//range -2147483647 to 2147483647 | size 4 bytes
		System.out.println(a);
		
		//Short
		short s = 32767;		//range -32768 to 32767 | size 2 bytes
		System.out.println(s);
				
		//long
		long l = 9876543210L;	//range -9223372036854775808 to 9223372036854775807 | size 8 bytes
		System.out.println(l);
				
		//byte
		byte B = 123; 			//-128 to +127 | Size 1 byte
		System.out.println(B);
		
		//Float Type
		float f = 56415.78568f;	//size 4 bytes
		System.out.println(f);
		
		//double
		double d = 10.9;		//size 8 bytes
		System.out.println(d);
		
		//Character	Type			
		char c = 'x';			//size 2 bytes
		System.out.println(c);
		
		//Boolean Type			
		boolean b = true;		//range 0 (false) or 1 (true) | size 1 bytes but makes use of 1 bit
		System.out.println(b);
		
	}

}
