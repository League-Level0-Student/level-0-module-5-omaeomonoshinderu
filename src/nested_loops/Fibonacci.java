package nested_loops;

public class Fibonacci {
	static int a = 0;
	static int b = 1;
	
public static void main(String[] args) {
	System.out.println(a);
	System.out.println(b);
	for (int i = 0; i < 12; i++) {
		int c = a + b;
		a = b;
		b = c;
		System.out.println(b);
	}
}
}
