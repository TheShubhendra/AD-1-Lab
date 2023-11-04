
public class Question2 {
	public static void swap(int arr[], int i, int j) {
		arr[i] = arr[i] + arr[j];
		arr[j] = arr[i] - arr[j];
		arr[i] = arr[i] - arr[j];
		
	}
	public static void main(String[] args) {
		int [] arr = { 10, 3, -3, 23, 42, 2, 4,23};
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length - i- 1; j++) {
				if(arr[j]>arr[j+1]) {
					swap(arr, j, j+1);
				}
			}
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		

	}

}
