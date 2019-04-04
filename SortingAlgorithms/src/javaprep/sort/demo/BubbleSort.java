package javaprep.sort.demo;

public class BubbleSort {
	
	public static void main(String args[]) {
		
		BubbleSort bs = new BubbleSort();
		Integer[] array = {8,2,5,1,3,7,9,6,4};
		bs.bubbleSort(array);
		for(int i:array) {
			System.out.print(i+" ");
		}
		
	}
	
	// Bubble sort checks the array element with its next element and swaps the elements till
	// all of them are sorted. This takes n number of passes
	void bubbleSort(Integer[] array) {
		for(int i = 0; i< array.length ; i++) {
			
			for(int j=0; j < array.length-1 ; j++) {
				if(array[j]>array[j+1]) {
					swap(array,j,j+1);
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
