package _00_Binary_Conversion;

public class Decimal_To_Binary {
	public static void main(String[] args) {
		//Converting a decimal number to binary is a little trickier.
		
		//EXAMPLE: Convert 43 to binary
		
		/*
		 * Step 1: Start with one and add a digit the left that is double the value of the previous number.
		 *         Stop when you've passed the target number        
		 *         eg. 43
		 *         	64	32	16	8	4	2	1
		 *        
		 *	Step 2: Remove the left most value (the one that is higher than the target). 
		 *			eg. 43
		 *         	32	16	8	4	2	1
		 *         
		 *  Step 3: Find the combination of values that add up to the target number.
		 *  		eg. 43
		 *         	32	16	8	4	2	1
		 *          43 = 32 + 8 + 2 + 1
		 *         
		 *  Step 4: Every matching number in the list is a 1, and non-matching is a 0.
		 *  		eg. 43
		 *         	32	16	8	4	2	1
		 *          43 = 32 + 8 + 2 + 1
		 *         
		 *          1    0   1   0   1   1
		 *          32	16	 8	 4	 2	 1
		 *         
		 *         43 in decimal is 101011 in binary!
		 */
		
		System.out.println(decToBin(43));
		
	}
	
	public static String decToBin(int x) {
		String bin = "";
		double testVal = 0;
		int power = 1;
		while (x-testVal >= 0) {
			power += 1;
			testVal = Math.pow(2, power);
		}
		power -= 1;
		testVal = Math.pow(2, power);
		for (int i=power; i>=0; i--) {
			if (x-Math.pow(2, i) >= 0) {
				x -= Math.pow(2, i);
				bin += "1";
			}
			else {
				bin += "0";
			}
		}
		return bin;
	}

}
