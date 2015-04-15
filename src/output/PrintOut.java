package output;

/**
 * PrintOut class to printout iNt[] type result or printout char[] type result
 */
public class PrintOut {
	// printout int[]
	public void printO_ins(int maxBegin, int length, int[] ints) {
		try {
			for (int i = maxBegin; i < maxBegin + length; i++) {
				System.out.print(ints[i]);
			}
		} catch (Exception e) {
			System.out.println("int[] printout is wrong");
		}
	}

	// printout char[]
	public void printO_char(int maxBegin, int length, char[] chr) {
		try {
			for (int i = maxBegin; i < maxBegin + length; i++) {
				System.out.print(chr[i]);
			}
		} catch (Exception e) {
			System.out.println("char[] printout is wrong");
		}
	}
}