

/*
 * 2. A generic sort method for implementing selection sort algorithm is given below. 
  	In main(), create array of Double and sort it by calling selectionSort().
	static <T> void selectionSort(T[] arr, Comparator<T> c) {
	for(int i=0; i<arr.length-1; i++) {
		for(int j=i+1; j<arr.length; j++) {
			if(c.compare(arr[i], arr[j]) > 0) {
				T temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				}
			}
		}
	}
 * 
*/
