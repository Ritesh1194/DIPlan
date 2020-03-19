package in.yadav.sorting;

public class SelectionSort {
	public int selectionSort(int array[]) {
		int number = array.length;

		for (int i = 0; i < number - 1; i++) {
			int min = i;
			for (int j = i + 1; j < number; j++) {
				if (array[j] < array[min]) {
					min = j;

					int temp = array[min];
					array[min] = array[i];
					array[i] = temp;
				}
			}
		}
		return 1;
	}

	public void display(int array[]) {
		int number = array.length;

		for (int i = 0; i < number; i++) {
			System.out.println("Sorted Elements Are : " + array[i]);
		}
	}

	public static void main(String[] args) {
		int array[] = { 7, 4, 10, 8, 3, 1 };

		SelectionSort object = new SelectionSort();
		object.selectionSort(array);
		object.display(array);
	}
}