import java.util.Arrays;
public class Question3 {
	public static void main(String[] args) {
		int[] arr = {4,3, 3, 4, 21, 3, 21, 1, 7};
		Arrays.sort(arr);
		boolean flag=false;
		int i;
		for(i=1; i<arr.length; i++) {
			if(arr[i]==arr[i-1]) {
				flag = true;
				continue;
			}
			if(flag) {
				System.out.print(arr[i-1] + " ");
				flag=false;
			}
		}
		if(flag) {
			System.out.print(arr[i-1]);
		}
	}
}
