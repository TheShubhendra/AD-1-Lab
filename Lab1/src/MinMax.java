
public class MinMax {

	public static void main(String[] args) {
	int[] arr = {4,3 ,34,5,345,34};
	int min = arr[0];
	int max = arr[0];
	for(int i=0; i<arr.length; i++) {
		if(arr[i]<min) {
			min = arr[i];
		}
		if(arr[i]>max) {
			max = arr[i];
		}
	}

	System.out.println("Minimun: "+ min);
	System.out.println("Maximun: "+ max);
	}

}
