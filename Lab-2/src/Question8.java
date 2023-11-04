public class Question8 {
	public static void findMissing(int arr[], int idx, boolean[] found) {
		if(idx>=arr.length) {
			for(int i=1; i<found.length; i++) {
				if(!found[i]) {
					System.out.println(i);
					return;
				}
			}
		}
		if(arr[idx]>0) {
			found[arr[idx]] = true;
		}
		findMissing(arr, idx+1, found);
	}

	public static void main(String[] args) {
		int[] arr = {-1, 0, -2, 3, 4, 5, 1};
	
		int max = arr[0];

		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		boolean[] found = new boolean[max+1];
		findMissing(arr, 0, found);
	}

}
