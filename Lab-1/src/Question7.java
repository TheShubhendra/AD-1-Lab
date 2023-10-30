
public class Question7 {

	public static void main(String[] args) {
		int arr[] = {1, -2, 3, -4 ,5, 5, -7, 45};
		int sum = arr[0];
		int maxSum = 0;
		for(int i=0; i<arr.length; i++) {
			sum+=arr[i];
			if(sum>maxSum) {
				maxSum = sum;
			}
			if(sum<0) {
				sum=0;
			}
		}
		System.out.println(maxSum);
	}
}
