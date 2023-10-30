
public class Question3 {

	public static boolean isReverse(int[] arr, int s, int e) {
		for(int i=s; i<e; i++) {
			if(arr[i]<arr[i+1]){
				return false;
			}
		}
		for(int i=s; i<=e; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.print("\n");
		return true;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,6,5,4, 7, 8, 11, 10,9, 15};
		boolean flag=false;
		int s=0;
		boolean res = true;
		for(int i=0; i<arr.length-1; i++) {
	
			if(arr[i+1]<arr[i]) {
				if(!flag) {
					s=i;
					flag=true;
				}

			}
			if(flag & arr[i+1]>arr[i]) {
				if(!isReverse(arr, s, i)) {
					res = false;
				}
				flag=false;
			}
		}
		
		System.out.print(res);
	}

}
