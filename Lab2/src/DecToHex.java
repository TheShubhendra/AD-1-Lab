
public class DecToHex {
	public static char[] arr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

	public static void printHex(int n) {
		if(n<16) {
			System.out.print(arr[n%16]);
			return;
		}
		
		printHex(n/16);
		System.out.print(arr[n%16]);
		
	}
	
	public static void main(String[] args) {
		int n = 2760;
		printHex(n);
		
	}

}
