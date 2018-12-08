package _03_Printing_Binary;

public class BinaryPrinter {
	//Complete the methods below so they print the passed in parameter in binary.
	//Don't be afraid to use the methods that are already complete to finish the others.
	//Create a main method to test your methods.
	
	public static void main(String[] args) {
		byte num = 5;
		printByteBinary(num);
		short x = (short) 13100;
		printShortBinary(x);
		int y = 140000;
		printLongBinary(y);
		long z = (long) 1343583857;
		printLongBinary(z);
	}
	
	public static void printByteBinary(byte b) {
		String bin = "";
		double testVal = 0;
		int power = 1;
		while (b-testVal >= 0) {
			power += 1;
			testVal = Math.pow(2, power);
		}
		power -= 1;
		testVal = Math.pow(2, power);
		for (int i=power; i>=0; i--) {
			if (b-Math.pow(2, i) >= 0) {
				b -= Math.pow(2, i);
				bin += "1";
			}
			else {
				bin += "0";
			}
		}
		while (bin.length() < 8) {
			bin = "0" + bin;
		}
		System.out.println(bin);
	}
	
	public static void printShortBinary(short s) {
		String bin = "";
		double testVal = 0;
		int power = 1;
		while (s-testVal >= 0) {
			power += 1;
			testVal = Math.pow(2, power);
		}
		power -= 1;
		testVal = Math.pow(2, power);
		for (int i=power; i>=0; i--) {
			if (s-Math.pow(2, i) >= 0) {
				s -= Math.pow(2, i);
				bin += "1";
			}
			else {
				bin += "0";
			}
		}
		while (bin.length() < 16) {
			bin = "0" + bin;
		}
		System.out.println(bin);
	}
	
	public static void printIntBinary(int i) {
		String bin = "";
		double testVal = 0;
		int power = 1;
		while (i-testVal >= 0) {
			power += 1;
			testVal = Math.pow(2, power);
		}
		power -= 1;
		testVal = Math.pow(2, power);
		for (int j=power; j>=0; j--) {
			if (i-Math.pow(2, i) >= 0) {
				i -= Math.pow(2, i);
				bin += "1";
			}
			else {
				bin += "0";
			}
		}
		while (bin.length() < 32) {
			bin = "0" + bin;
		}
		System.out.println(bin);
	}
	
	public static void printLongBinary(long l) {
		String bin = "";
		double testVal = 0;
		int power = 1;
		while (l-testVal >= 0) {
			power += 1;
			testVal = Math.pow(2, power);
		}
		power -= 1;
		testVal = Math.pow(2, power);
		for (int i=power; i>=0; i--) {
			if (l-Math.pow(2, i) >= 0) {
				l -= Math.pow(2, i);
				bin += "1";
			}
			else {
				bin += "0";
			}
		}
		while (bin.length() < 64) {
			bin = "0" + bin;
		}
		System.out.println(bin);
	}
}
