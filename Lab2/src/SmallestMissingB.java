import java.util.Arrays;

public class SmallestMissingB {
	public static int minMissing = 1;
	
	public static void findMissing(int arr[], int idx) {
		if(idx>=arr.length || arr[idx]>minMissing) {
			return;
		}
		if(arr[idx]==minMissing) {
			minMissing++;
		}
		findMissing(arr, idx+1);
	}

	public static void main(String[] args) {
		int[] arr = {-1, 0, -2, 3, 4, 5, 1};
		
//		int[] arr = {1,3,5,7,6,4};
		Arrays.sort(arr);
		findMissing(arr, 0);
		System.out.print(minMissing);
	}

}
