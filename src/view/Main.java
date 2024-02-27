package view;

import controller.EvenNumbersController;

public class Main {

	public static void main(String[] args) {
		
		EvenNumbersController enc = new EvenNumbersController();
		
		int[] array = {10, 4, 2, 7, 8, 1, 81};
		
		int size = array.length - 1;
		
		System.out.println(enc.validate(array, size) ? enc.evenNumbers(array, size) : "Invalid data");
	}
}
