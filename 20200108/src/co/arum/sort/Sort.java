package co.arum.sort;

public class Sort {
	private int[] arr;

	public int[] selectionSort(int[] num, int n) {
		int min, temp;
		arr = num;
		for (int i = 0; i < arr.length - 1; i++) {
			min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (n == 0) {
					if (arr[i] > arr[j]) { // 오름차순
						min = j;
					}
				} else {
					if (arr[i] < arr[j]) { // 내림차순
						min = i;
					}
				}
			}
			if (min != i) {
				temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;
			}
		}
		return arr;
	}

	public int[] bubbleSort(int[] num, int n) {
		arr = num;

		for (int j = 1; j < arr.length-1; j++) {
			for (int i = 0; i < arr.length - j; i++) {
				if (n == 0) { // 오름차순 가장 큰 것을 뒤로
					if (arr[i] > arr[i + 1]) {
						int temp = arr[i];
						arr[i] = arr[i + 1];
						arr[i + 1] = temp;
					}
				} else { // 내림차순 가장 큰 것을 뒤로
					if (arr[i] < arr[i + 1]) {
						int temp = arr[i];
						arr[i] = arr[i + 1];
						arr[i + 1] = temp;
					}
				}
			}
		}

		return arr;
		/*
		 * 
		 * do { 
		 * 	count=0; 
		 * 	for(int i=0 ; i<arr.length-1 ; i++) { 
		 * 		if (n==0) { //오름차순 가장 큰 것을 뒤로 
		 * 			if(arr[i] > arr[i+1]) { 
		 * 				int temp = arr[i]; 
		 * 				arr[i] =arr[i+1]; 
		 * 				arr[i+1] = temp;
		 * 			} else { 
		 * 				count++; 
		 * 			} 
		 * 		} else { //내림차순 가장 큰 것을 뒤로 
		 * 			if(arr[i] < arr[i+1]) {
		 * 				int temp = arr[i];
		 * 				arr[i] =arr[i+1]; 
		 * 				arr[i+1] = temp;
		 *  		} else { 
		 * 	 		count++; 
		 * 	 		} 
		 * 		} 
		 * 	}
		 * }while(count < arr.length-1);
		 * 
		 */
	}

	public int[] quickSort(int[] num) {
		return arr;
	}
}
