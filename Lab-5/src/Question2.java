public class Question2 {
	public static int binarySearch(int[] arr, int x, int l, int r) {
		int mid = (l+r)/2;
		if(arr[mid]==x) {
			return mid;
		}
		if(l>r) {
			return -1;
		}
		if(arr[mid]>x) {
			return binarySearch(arr, x, l, mid-1);
		}else {
			return binarySearch(arr, x, mid+1, r);
		}
	}
	public static void main(String[] args) {
		int[] arr = {1, 3, 31, 43, 243, 432};
		int x = 432;
		int idx = binarySearch(arr, x, 0, arr.length-1);
		if(idx==-1) {
			System.out.println("Not Found");
		}else {
			System.out.print("Found at: "+ idx);
		}
	}
}