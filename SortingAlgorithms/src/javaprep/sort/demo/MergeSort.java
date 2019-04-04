package javaprep.sort.demo;

public class MergeSort {

	public static void main(String[] args) {
		
		MergeSort mergeSort = new MergeSort();
		Integer[] array = {8,2,5,1,3,7,9,6,4};
		mergeSort.mergeSort(array);
		for(int i:array) {
			System.out.print(i+" ");
		}
	}
	// The steps to mergesort are:
	// 1. Break the Array into subarrays
	// 2. While Merging two arrays into one array and make sure it's sorted
	
	// First we start from the second point we write the merging logic first
	// Mind you: lArray and rArray are already sorted arrays
	// As merge is called recursively last, hence both left and right array start with one elements,
	// and get sorted on their way up, making sure all the times the lArrays and the rArray are sorted
	void merge(Integer[] lArray, Integer[] rArray, Integer[] array){
		
		// First the strategy will be to compare each element of the right array
		// with each element of the right array, as each array is sorted within itself.
		int rLength = rArray.length;
		int lLength = lArray.length;
		int mainPointer = 0;
		int rPointer = 0;
		int lPointer = 0;
		// While loop to compare the two arrays
		while(rPointer < rLength && lPointer < lLength) {
			if(lArray[lPointer]<rArray[rPointer]) {
				array[mainPointer] = lArray[lPointer];
				lPointer++;
			}else if(rArray[rPointer]<lArray[lPointer]) {
				array[mainPointer] = rArray[rPointer];
				rPointer++;
			}
			mainPointer++;
			
		}// While loop to check if elements are left in lArray
		while(lPointer<lLength) {
			array[mainPointer]=lArray[lPointer];
			lPointer++;
			mainPointer++;
		}// While loop to check if elements are left in rArray
		while(rPointer<rLength) {
			array[mainPointer]=rArray[rPointer];
			rPointer++;
			mainPointer++;
		}		
	}
	
	void mergeSort(Integer[] array) {
		
		int length = array.length;
		if(length<2) {
			return;
		}
		int mid = length/2;
		Integer[] left = new Integer[mid];
		Integer[] right = new Integer[length - mid];
		for(int i=0;i<mid;i++) {
			left[i] = array[i];
		}
		for(int j=mid,i=0;j<length;j++,i++){
			right[i] = array[j];
		}
		mergeSort(left);
		mergeSort(right);
		merge(left, right, array);
	}
	
	

}
