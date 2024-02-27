package controller;

public class EvenNumbersController {
	
	public EvenNumbersController() {
		super();
	}
	
	public int evenNumbers(int array[], int size) {
		if(size < 0)
			return 0; 
		else if(array[size] % 2 == 0) 
			return 1 + evenNumbers(array, size - 1);
		else 
			return evenNumbers(array, size - 1);		
	}
	
	public boolean validate(int array[], int size) {
		if(size < 0)
			return true;
		else if(array[size] <= 0) 
			return false;
		
		return validate(array, size - 1);
	}	
}
