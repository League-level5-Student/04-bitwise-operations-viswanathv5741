package _01_Bit_Shifting;

import _00_Binary_Conversion.Decimal_To_Binary;

public class BitShifter {
	public static void main(String[] args) {
		// 1. Jot down the value of num in binary.
		int num = 4;
		int numShifted = num << 2;
		
		// 2. Print the value of numShifted, and convert that value to binary.
		System.out.println(numShifted);
		Decimal_To_Binary numBi = new Decimal_To_Binary();
		String Bin = numBi.decToBin(numShifted);
		
		// 3. Compare the two binary values. Can you figure out what the << operator is for?
		System.out.println("Num's binary: " + numBi.decToBin(num));
		System.out.println("NumShifted's binary: " + Bin);
		
		// 4. Try shifting num 3 places.
		int numShifted1 = num << 3;
		
		// FYI: Binary values can be shifted to the right as well using the >> operator.	
	}
}
