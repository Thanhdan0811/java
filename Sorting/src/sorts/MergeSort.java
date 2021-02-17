package sorts;

public class MergeSort {
	// merge two array that are sort to 1 array and sort it.	
	private static int[] mergeArr(int arr1[], int arr2[]) {
		int i = 0, j = 0, s = 0;
		int[] rel = new int[arr1.length + arr2.length];
		while(i < arr1.length && j < arr2.length) {
			if(arr1[i] < arr2[j]) {
				rel[s] = arr1[i];
				i++;
			} else if(arr1[i] > arr2[j]) {
				rel[s] = arr2[j];
				j++;
			} else {
				rel[s] = arr2[j];
				rel[++s] = arr1[i];
				i++;
				j++;
			}
			s++;
		}
		while(i < arr1.length) {
			rel[s] = arr1[i];
			i++;
			s++;
		}
		while(j < arr2.length) {
			rel[s] = arr2[j];
			j++;
			s++;
		}
		return rel;
	}
	// slice a array from start to end.
	private static int[] sliceArr(int arr[], int s, int e) {
		int rel[] = new int[e - s];
		for(int i = 0; i < rel.length; i++) {
			rel[i] = arr[s];
			s++;
		}
		return rel;
	}
	// merge sort method, get a array and sort it 
	// first divide it into two half 
	// then we call recursion to divide each half into two half again.
	// after divide is 1 element then we return it and call method mergeArr to merge and sort 2 array into 1
	public int[] mergeSort(int arr[]) {
		if(arr.length <= 1) return arr;
		int divideMid = arr.length / 2;
		int leftArr[] = mergeSort(sliceArr(arr, 0, divideMid));
		int rightArr[] = mergeSort(sliceArr(arr, divideMid, arr.length));
		return mergeArr(leftArr, rightArr);
	}
	
}
