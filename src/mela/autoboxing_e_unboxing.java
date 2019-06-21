package mela;

@interface marius {
	String str();

	int val();
}

public class autoboxing_e_unboxing {
	public static void main(String args[]) {
		Integer iOb = 100;
		int i = iOb;
		System.out.println(i + " " + iOb);
		/*
		 * int x = 5, y = 5;
		 * 
		 * System.out.println(++x); // outputs 6 System.out.println(x); // outputs 6
		 * 
		 * System.out.println(y++); // outputs 5 System.out.println(y); // outputs 6
		 */
	}
}
