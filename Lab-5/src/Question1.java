
public class Question1 {

	public static void main(String[] args) {
		int[] arr = {1, 3, 31, 43, 243, 432};
		int x = 43;
		int l=0, r= arr.length -1;
		int mid=0;
		while(l<=r) {
			mid = (l+r)/2;
			if(arr[mid]==x) {
				break;
			}else if(arr[mid]<x) {
				l=mid+1;
			}else {
				r=mid-1;
			}
		}
		
		if(arr[mid]==x) {
			System.out.print(mid);
		}else {
			System.out.println("Not Found");
		}
		
	}

}
