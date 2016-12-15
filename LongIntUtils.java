public class LongIntUtils {
 
	 public static int overflow(int t) {
		 if(digits(t) > 8)
			 return t / (int)(Math.pow(10, digits(t)-1));
		 return 0;
	 }
	 
	 public static int underflow(int t) {
		 return t % 100000000;
	 }
	 
	 public static int upperHalf(int t) {
		 return t / 10000;
	 }
	 
	 public static int lowerHalf(int t) {
		 return t - (upperHalf(t) * 10000);
	 }
	 
	 public static int digits(int t) {
		 if (t == 0)
			 return 0;
		 return (int)(Math.log10(t) + 1);
	 }
}
