package sorts;

public class BubbleSort {
	// Algorithm of bubbleSort 
	// we can start at the first index or the last index.
	// we compare two element first and second, if first element is greater than second element.
	// then we swap 2 element then we continue with the second and the third element.
	// after one iteration we continue with the remaining. 
	// after each iteration, the largest element among the unsorted element will be placed at the end.
	
	// bubble sort regular start at the first
	public int[] bubbleSortRegular(int arr[]) {
		int size = arr.length;
		for(int i = 0; i < size; i++) {
			System.out.println("iteration " + i);
			for(int j = 0; j < size - i - 1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
	}
	// bubble sort regular start at the first and optimize
	public int[] bubbleSortOpt(int arr[]) {
		int size = arr.length;
		
		for(int i = 0; i < size; i++) {
			boolean noSwape = true;
			System.out.println("iteration " + i);
			for(int j = 0; j < size - i - 1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					noSwape = false;
				}
			}
			if(noSwape) return arr;
		}
		return arr;
	}
}
