package calculator;

public class Array {

	public static void main(String[] args) {

		int[] number = { 1, 45, 55, 77, 8, 99, 105 };
		int smallest = number[0];
		int largest = number[0];

		for (int i = 0; i < number.length; i++) {
			if (number[i] > largest) {
				largest = number[i];
			} else if (number[i] < smallest) {
				smallest = number[i];
			}

		}

		System.out.println(largest);
		System.out.println(smallest);
	}

}
