package javaprep.sort.demo;

public class SelectionSort {

public static void main(String args[]) {
		
	SelectionSort ss = new SelectionSort();
		Integer[] array = {8,2,5,1,3,7,9,6,4};
		ss.selectionSort(array);
		for(int i:array) {
			System.out.print(i+" ");
		}
	}

	// Select the smallest from 1 to n replace with 1
	// select the smallest from 2 to n replace with 2
	void selectionSort(Integer[] array) {
		
		for(int i=0; i<array.length-1;i++) {
			int small = array[i];
			for(int j=i+1; j<array.length; j++) {
				if(array[j]<small) {
					swap(array, j, i);
					
				}
			}
		}
		
	}
	
	
	void swap(Integer[] array, int index1, int index2) {
		int temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
	}

}
