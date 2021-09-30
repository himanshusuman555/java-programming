				/* local , Static , instance variable in java */

public class Test 
{
	int a =10;  // instance variable
	static int b = 20;// static variable
	
	static int e =10;
	
	void fun()
	{
		int f = 10;
		System.out.println(e+ " " +f);
		++e ;   ++f;
	}
	
	public static void main(String [] args)
	{
		int c =30;   // local variable
		final int D =40;   // final variable
		
		Test ref = new Test();
		
		System.out.println(ref.a);
		System.out.println(Test.b);
		
		System.out.println(c);
		System.out.println(D);
		
		ref.fun();
		ref.fun();
	}

}

