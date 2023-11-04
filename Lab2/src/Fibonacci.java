
public class Fibonacci {
	
	public static int fib(int n) {
		if(n<3) {
			return 1;
		}
		return fib(n-1) + fib(n-2);
	}

	public static void main(String[] args) {
		int n = 6;
		System.out.println(n + "th term of fibonnacii is: " + fib(n));
	}

}
