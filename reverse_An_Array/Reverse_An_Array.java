package reverse_An_Array;

public class Reverse_An_Array {

	public static void main(String[] args) {

		int arr[] = {5,8,12,4,7,33,56,41};
		int last = arr.length-1;
		for (int i = 0; i < arr.length/2; i++) {
			int temp = arr[i];
			arr[i] = arr[last];
			arr[last] = temp;
			last--;
		}	
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
