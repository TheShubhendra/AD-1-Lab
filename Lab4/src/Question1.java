public class Question1 {
	

	public static void main(String[] args) {
		int[] a = {1,5,9,10,15,20};
		int[] b = {2,3,8,13};
		for(int i=0; i<a.length; i++) {
			if(a[i]>b[0]) {
				a[i] = a[i] + b[0];
				b[0] = a[i] - b[0];
				a[i] = a[i] - b[0];
				for(int k =0; k<b.length-1; k++) {
					if(b[k]>b[k+1]) {
						b[k] = b[k] + b[k+1];
						b[k+1] = b[k] - b[k+1];
						b[k] = b[k] - b[k+1];
					}
				}
			}
		
		}
		for(int k=0; k<a.length; k++) {
			System.out.print(a[k] + " ");
		}
		System.out.print("\n");
		for(int k=0; k<b.length; k++) {
			System.out.print(b[k] + " ");
		}

	}

}
