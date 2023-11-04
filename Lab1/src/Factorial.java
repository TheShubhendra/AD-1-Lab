
public class Factorial {

	public static void main(String[] args) {
		int n=4;
		int res=1;
		for(int i=1; i<=n; i++) {
			res*=i;
		}
		System.out.print("Factorial of "+ n + " is: "+ res);

	}

}
