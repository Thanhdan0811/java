package sorts;

public class InsertionSort {
	// at begin : assume that the first element is ordered
	// the second element will be the key, compare key with previous element 
	// if key greater then dont change 
	// if key smaller then swap to it,
	// Like card game 
	// 4,2,3,1 => 4 is assumed that ordered, now key is 2
	// => cause key < 4 => 2,4,3,1 => now key = 3
	// => cause key < 4 => 2,3,4,1 => now key = 1
	// => cause key < 4 => 2,3,4,4 => continue key < 3 => 2,3,3,4
	// continue key < 2 => 2,2,3,4 => now at the first element we assign it by 1.
	// => 1,2,3,4 => sorted.
	
	public int[] insertionSortRegular(int arr[]) {
		int size = arr.length;
		
		for(int step = 1; step < size; step++) {
			int key = arr[step];
			int j = step - 1;
			
			while(j >= 0 && arr[j] > key) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
		
		return arr;
	}
	

}
	