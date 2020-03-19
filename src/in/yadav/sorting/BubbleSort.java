package in.yadav.sorting;

public class BubbleSort {

	public int bubbleSort(int array[]) {
		int number = array.length;

		int i, j;
		for (i = 0; i < number - 1; i++) {
			for (j = 0; j < number - 1 - i; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}

		return 1;
	}

	public void display(int array[]) {
		int number = array.length;
		int i;
		for (i = 0; i < number; i++) {
			System.out.println("Sorted Elements Are " + array[i]);
		}
	}

	public static void main(String[] rrgs) {
		BubbleSort object = new BubbleSort();
		int array[] = { 15, 16, 6, 8, 5 };
		// int array[];
		// Scanner scanner = new Scanner(System.in);
		//
		// int number = scanner.nextInt();
		//
		// for(int i =0;i<number;i++) {
		// array[i]=scanner.nextInt();
		// }

		object.bubbleSort(array);
		object.display(array);
	}
}
