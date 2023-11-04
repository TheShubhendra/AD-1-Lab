
public class MaxMin {
	
	public static int[] maxMin(int[] arr, int max, int min, int idx) {
		int[] res = new int[2];
		res[0] = max;
		res[1] = min;
		if(idx>=arr.length) {
			return res;
		}
		if(arr[idx]>max) {
			res[0] = arr[idx];
		}
		if(arr[idx]<min) {
			res[1] = arr[idx];
		}
		return maxMin(arr, res[0], res[1], idx+1);
	}

	public static void main(String[] args) {
		int arr[] = {4, 2, 5, 5, 2,23, 53, 23, -3};
		int res[] = maxMin(arr, arr[0], arr[0], 1);
		System.out.println("Max: "+ res[0]);
		System.out.println("Min: "+ res[1]);
	}

}
