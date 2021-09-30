
public class swaptwonum {

	public static void main(String[] args) {
		
		int a = 10, b= 20 , c;
		c = a;
		a = b;
		b = c;
		System.out.println(a+  " " + b + " " );
		
		int d =2 , e =5;
		d = d +e; // 7 
		e = d - e; // 7 - 5  = 2
		d = d - e;
		System.out.println(d + " " + e + " ");
	}

}
