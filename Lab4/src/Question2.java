
public class Question2 {

	public static void main(String[] args) {
		int [] arr = {5, 1, 1, 1, 2, 3, 5};
		int max=arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		boolean [] idxarr = new boolean[max+1];
		
		for(int i=0; i<arr.length; i++) {
			idxarr[arr[i]] = true;
		}
		int num_to_reduce = max;
		int reduced_so_far = 0;
		int counter = 0;
		for(int i=0; i<max+1; i++) {
			if(num_to_reduce<=0) {
				break;
			}
			if(idxarr[i]) {
				num_to_reduce = num_to_reduce - (i - reduced_so_far);
				reduced_so_far = i;
				counter++;
			}
			for(int j=0; j<arr.length; j++) {
				System.out.print((arr[j]- reduced_so_far>=0?arr[j]- reduced_so_far : 0) + " ");
			}
			System.out.print("\n");
			
		}
		System.out.println(counter);
		
	}

}
