package input;

/**
 * StrToArray class 
 * This class can convert a string to a char[]/iNt[] array 
 * input String 
 * output char[]/iNt[] array
 */

public class StrToArray {
	private char[] str_char = new char[0];
	private char[] str_char_int = new char[0];
	private int[] str_int;

	public char[] getStr_char() {
		return str_char;
	}

	public void setStr_char(char[] str_char) {
		this.str_char = str_char;
	}

	public char[] getStr_char_int() {
		return str_char_int;
	}

	public void setStr_char_int(char[] str_char_int) {
		this.str_char_int = str_char_int;
	}

	public int[] getStr_int() {
		return str_int;
	}

	public void setStr_int(int[] str_int) {
		this.str_int = str_int;
	}

	// String to char[]
	public char[] sta_char(String s) {
		str_char = s.toCharArray();
		return str_char;
	}

	// String to iNt[]
	public int[] sta_int(String s) {
		str_char_int = sta_char(s);
		str_int = new int[str_char_int.length];
		try {
			for (int i = 0; i < str_char_int.length; i++) {
				str_int[i] = Integer.parseInt(String.valueOf(str_char_int[i]));
			}
		} catch (Exception e) {
			System.out.println("you can`t input numbers with letters (or symbols) ");
			System.exit(0);
		}
		return str_int;
	}

}