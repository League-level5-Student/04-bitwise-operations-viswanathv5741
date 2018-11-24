package _02_AND_OR_and_XOR;

import _00_Binary_Conversion.BinaryToDecimal;
import _00_Binary_Conversion.Decimal_To_Binary;

public class AndOrXor {
	public static void main(String[] args) {
		// The single & is used to create a new binary value from 2 other binary values.
		// This value is created by "anding" the bits together.
		
		// EXAMPLE:
		// What is the value of 5 & 9?
		int num = 5 & 9;
		System.out.println(num); // This prints 1
		System.out.println(and(5,9));
		
		// 5     = 0 1 0 1
		// 9     = 1 0 0 1
		// 5 & 9 = 0 0 0 1  <--since the one column is the only column that both have a 1, the result is just 1.
		
		// Example:
		// What is the value of 2 & 6?
		// 2     = 0 1 0
		// 6     = 1 1 0
		// 6 & 2 = 0 1 0 = 2
		
		//The single | operator is used to "or" the bits together.
		// EXAMPLE:
		// What is the value of 5 | 9?
		num = 5 | 9;
		System.out.println(num); // This prints 13
		System.out.println(or(5,9));
		
		// 5     = 0 1 0 1
		// 9     = 1 0 0 1
		// 5 | 9 = 1 1 0 1  <--If there is a 1 in the 5 or 9 column, it produces a 1 in the same column in the result.
		
		// Example:
		// What is the value of 2 | 6?
		// 2     = 0 1 0
		// 6     = 1 1 0
		// 6 | 2 = 1 1 0 = 6
		
		//The single ^ operator is used to "exclusively or" the bits together.
		// EXAMPLE:
		// What is the value of 3 ^ 7?
		num = 3 ^ 7;
		System.out.println(num); // This prints 4
		System.out.println(xor(3,7));
		
		// 3     = 0 1 1
		// 7     = 1 1 1
		// 3 ^ 7 = 1 0 0  <--When the two bits being compared are different, the resulting bit is 1. Otherwise, 0.
		
		// Example:
		// What is the value of 9 | 11?
		// 9      = 1 0 0 1
		// 11     = 1 0 1 1
		// 9 ^ 11 = 0 0 1 0 = 2
	}
	
	public static int and(int x, int y) {
		Decimal_To_Binary converter = new Decimal_To_Binary();
		String binx = converter.decToBin(x);
		String biny = converter.decToBin(y);
		String and = "";
		if (binx.length() > biny.length()) {
			while (biny.length() < binx.length()) {
				biny = "0" + biny;
			}
		} else if (biny.length() > binx.length()) {
			while (binx.length() < biny.length()) {
				binx = "0" + binx;
			}
		}
		for (int i=0; i<binx.length(); i++) {
			if (binx.charAt(i) == '1' && biny.charAt(i) == '1') {
				and += "1";
			}
			else {
				and += "0";
			}
		}
		BinaryToDecimal converter2 = new BinaryToDecimal();
		int answer = converter2.binToDec(and);
		return answer;
	}
	
	public static int or(int x, int y) {
		Decimal_To_Binary converter = new Decimal_To_Binary();
		String binx = converter.decToBin(x);
		String biny = converter.decToBin(y);
		String or = "";
		if (binx.length() > biny.length()) {
			while (biny.length() < binx.length()) {
				biny = "0" + biny;
			}
		} else if (biny.length() > binx.length()) {
			while (binx.length() < biny.length()) {
				binx = "0" + binx;
			}
		}
		for (int i=0; i<binx.length(); i++) {
			if (binx.charAt(i) == '1' || biny.charAt(i) == '1') {
				or += "1";
			}
			else {
				or += "0";
			}
		}
		BinaryToDecimal converter2 = new BinaryToDecimal();
		int answer = converter2.binToDec(or);
		return answer;
	}
	
	public static int xor(int x, int y) {
		Decimal_To_Binary converter = new Decimal_To_Binary();
		String binx = converter.decToBin(x);
		String biny = converter.decToBin(y);
		String xor = "";
		if (binx.length() > biny.length()) {
			while (biny.length() < binx.length()) {
				biny = "0" + biny;
			}
		} else if (biny.length() > binx.length()) {
			while (binx.length() < biny.length()) {
				binx = "0" + binx;
			}
		}
		for (int i=0; i<binx.length(); i++) {
			if (binx.charAt(i) != biny.charAt(i)) {
				xor += "1";
			}
			else {
				xor += "0";
			}
		}
		BinaryToDecimal converter2 = new BinaryToDecimal();
		int answer = converter2.binToDec(xor);
		return answer;
		
	}
}
