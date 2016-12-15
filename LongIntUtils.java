public class LongIntUtils {
 
	// This class handles the Utility Operations that used by the LongInt class

	// overflow (int t) Returns the overflow digit (9th most significant) of an integer
	 public static int overflow(int t) {
		if(digits(t) > 8)
			 return t / (int)(Math.pow(10, digits(t)-1));
		 return 0;
	 }
	 
	// underflow (int t) Returns the underflow digit (1st - 8th least significant) in an integer
	 public static int underflow(int t) {
		 return t % 100000000;
	 }
	 
	// upperHalf (int t) Returns the 4 most significant digits of an 8 digit integer
	 public static int upperHalf(int t) {
		 return t / 10000;
	 }
	 
	// lowerHalf (int t) Returns the 4 least significant digits of an 8 digit integer
	 public static int lowerHalf(int t) {
		 return t - (upperHalf(t) * 10000);
	 }
	 
	// digits (int t) Returns the number of decimal digits in a regular integer as an integer
	 public static int digits(int t) {
		 if (t == 0)
			 return 0;
		 return (int)(Math.log10(t) + 1);
	 }
}
