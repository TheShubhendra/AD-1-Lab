
public class Gcd {

	public static int gcd(int a, int b) {
		if(a%b==0) {
			return b;
		}
		if(b>a) {
			return gcd(a, b-a);
		}else {
			return gcd(a-b, b);
		}

	}
	public static void main(String[] args) {
		int a = 51;
		int b = 170;
		System.out.println("GCD of "+ a + " & " + b + " is: " + gcd(a,b));
	}

}
