import sorts.BubbleSort;
import sorts.InsertionSort;
import sorts.MergeSort;
import sorts.SelectionSort;

public class Main {
	public static void main(String args[] ) {
//		int arr[] = {4,6,7,2,12,5,15,8,9,2,1,3,23};
		int arr[] = {1,2,4,3};
//		int arr[] = {};
//		int arr[] = {5,7,4,1,2};
//		BubbleSort sort = new BubbleSort();
//		SelectionSort sort = new SelectionSort();
//		InsertionSort sort = new InsertionSort();
		MergeSort sort = new MergeSort();
		int rel[] = sort.mergeSort(arr);
		System.out.println("*********************");
		System.out.println("test case 1 : ");			
		for(int i = 0; i < rel.length; i++) {
			System.out.print(rel[i] + " ");
		}
	}
}
