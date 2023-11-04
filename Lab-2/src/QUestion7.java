
public class QUestion7 {
	public static int power(int a, int n) {
		if(n==0) {
			return 1;
		}
		if(n==1) {
			return a;
	}
		return a*power(a,n-1);
	}
	public static void main(String[] args) {
		int a = 3;
		int n = 4;
		System.out.println("Result: " + power(a,n));
	
	}
}
