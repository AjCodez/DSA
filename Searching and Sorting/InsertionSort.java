import java.util.Arrays;

public class InsertionSort {
	public static void insertionSort(int arr[]) {
		int s = arr.length;
		for (int i = 1; i < s; ++i) {
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;;
			}
			arr[j + 1] = key;
		}
	}

	public static void main(String args[]) {
		int[] arr = { -2, 45, 0, 11, -9 };
		insertionSort(arr);
		System.out.println("Sorted Array in Ascending Order:");
		System.out.println(Arrays.toString(arr));
	}
}