
public class RotateArray {

	public static void main(String[] args) {
		int [] arr = {4, 3, 2, 1, 6};
		int [] res = new int[arr.length];
		int k = 3;
		k = k%res.length;
		for(int i=0; i<arr.length; i++) {
			if(i+k<arr.length) {
				res[i] = arr[i+k];
			}else {
				res[i] = arr[(i+k) - arr.length];
			}
		}
		
		for(int i=0; i<res.length; i++) {
			System.out.print(res[i] + " ");
		}
	}

}
