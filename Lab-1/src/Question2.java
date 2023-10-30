
public class Question2 {

	public static void main(String[] args) {
		int a = 5;
		int b = 6;
		System.out.println("Before swap: " + a + " "+ b);
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("After swap: " + a + " "+ b);
	}

}
