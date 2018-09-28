import java.util.Scanner;

public class Arrays {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// * Ex. 9-10-12
		Scanner in = new Scanner(System.in);
		String name = in.nextLine();
		char arr[] = new char[name.length()];
		for (int i = 0; i < name.length(); i++) {
			arr[i] = name.charAt(i);
		}
		for (char c : arr) {
			System.out.println(c);
		}
		// * ex 13 BubleSort
		for (int i = arr.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (arr[j] > arr[j + 1]) {
					char tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
				}
			}
		}
		for (char c : arr) {
			System.out.print(c);
		}
		// * ex 13 SelectionSort
		for (int i = 0; i < arr.length - 1; i++) {
			int min = arr[i];
			int min_i = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < min) {
					min = arr[j];
					min_i = j;
				}
			}
			if (i != min_i) {
				char tmp = arr[i];
				arr[i] = arr[min_i];
				arr[min_i] = tmp;
			}
		}
		for (char c : arr) {
			System.out.print(c);
		}
		// * ex 13 InsertionSort
		char temp;
		int j;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				temp = arr[i + 1];
				arr[i + 1] = arr[i];
				j = i;
				while (j > 0 && temp < arr[j - 1]) {
					arr[j] = arr[j - 1];
					j--;
				}
				arr[j] = temp;
			}
		}
		for (char c : arr) {
			System.out.print(c);
		}
		System.out.println();
		//* ex 14
		int myArr[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		for (int i : myArr) {
			if(i>5 && i<10) {
				System.out.println(i);
			}
		}
	}

}
