package javaprep.sort.demo;

public class InsertionSort {

	public static void main(String args[]) {
		
		InsertionSort is = new InsertionSort();
			Integer[] array = {8,2,5,1,3,7,9,6,4};
			is.insertionSort(array);
			for(int i:array) {
				System.out.print(i+" ");
			}
		}

		// Select the smallest from 1 to n replace with 1
		// select the smallest from 2 to n replace with 2
		void insertionSort(Integer[] array) {
			
			for(int hole=1;hole<array.length;hole++) {
				insertElementInProperPositionOfSubArray(array, hole);
			}
			
		}
		
		// This function will take the value of the hole index
		// And move all the values in it's left towards the hole till
		// the hole is placed in it's proper place in the subarray
		void insertElementInProperPositionOfSubArray(Integer array[], int holeIndex) {
			int holeValue = array[holeIndex];
			//Lower the holeIndex till you find the place where array
			while(holeIndex>0 && array[holeIndex-1]>holeValue){
				array[holeIndex]=array[holeIndex-1];
				holeIndex--;
			}
			array[holeIndex]=holeValue;
		}
	
	
}
