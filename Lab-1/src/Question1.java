            
public class Question1 {

	public static void main(String[] args) {
		int arr[] = {4,2,23,5,3};
		int k=5;
		int i;
		for(i=0; i<arr.length; i++) {
			if(arr[i]==k) {
				System.out.println("Element found at index: "+i);
				break;
			}
		}
		if(i>=arr.length) {
			System.out.println("Element not found");
		}
	}

}
