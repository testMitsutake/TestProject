package myPackage.main;

import myPackage.calc.Square;

public class Program {

	public static void main(String[] args) {
		
		
		Square square = new Square();
		
		square.setValue(Integer.parseInt(args[0]));
		
		square.calulate();

	}

}
