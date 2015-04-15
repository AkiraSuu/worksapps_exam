package input;

/**
 * 	ScannnerInput class
 * 	base of input scanner class
 */
import java.util.Scanner;

public class ScannerInput {

	private String str;

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public String scanInput() {
		// scanner input
		Scanner input = new Scanner(System.in);

		str = input.nextLine();

		input.close();

		return str;
	}

}
