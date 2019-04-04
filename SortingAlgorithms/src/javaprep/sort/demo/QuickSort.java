package javaprep.sort.demo;

public class QuickSort {

	public static void main(String[] args) {
		
		QuickSort quickSort = new QuickSort();
		Integer[] array = {8,2,5,1,3,7,9,6,4};
		quickSort.quickSort(array, 0, array.length-1);
		for(int i:array) {
			System.out.print(i+" ");
		}

	}
	
	// Quick sort is following the below steps:
	// 1. Find the pivot node(assume it to be the last element of any array)
	// 2. Arrange all the elements smaller than it in it's left and all greater in it's right
	// 3. Keep breaking the array into i=0->pivot and pivot+1->n
	// 4. Mind you this is a in-place algorithm, hence we do not create any subarrays, so we do not need to
	// merge this thing back to get results
	
	// The recursive method will thus have a start and end of the array to understand which part of it is
	// getting worked on
	void quickSort(Integer[] array, int start, int end) {
		
		if(start>=end)
			return;
		int pivotIndex = partition(array, start, end);
		quickSort(array, start,pivotIndex-1);
		quickSort(array,pivotIndex+1, end);
	}
	
	// This will have to partition the array.
	// Find the pivot node and then put all smaller in left and all larger in right
	// return pivot node
	int partition(Integer[] array, int start, int end) {
		int pivotValue = array[end];
		int pivotIndex = start; // this is initialized to start as when the next condition gets fullfilled there
		// is only one item in the sub array and start has to act as the pivot then
		for(int i=start;i<end;i++) {
			if(array[i]<=pivotValue) {
				// swap i and pivot index
				swap(array,i,pivotIndex);
				pivotIndex++;
				// increment Pivot index with every match found for lessor than pivot
				
			}
		}
		// Swap pivotIndex and end index
		swap(array,pivotIndex,end);
		
		return pivotIndex;
		
	}
	
	
	void swap(Integer[] array, int index1, int index2) {
		int temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
	}
	

}
