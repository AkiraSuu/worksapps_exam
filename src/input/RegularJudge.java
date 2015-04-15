package input;

/**
 * regular_judge class input judge
 * This class can tall us user`s input type
 * and delete same spaces
 * input String
 * output number & new string
 */
public class RegularJudge {

	private boolean isNum, isNum_a, not_num;
	private int num;
	private String str_new;

	public boolean isNum() {
		return isNum;
	}

	public void setNum(boolean isNum) {
		this.isNum = isNum;
	}

	public boolean isNum_a() {
		return isNum_a;
	}

	public void setNum_a(boolean isNum_a) {
		this.isNum_a = isNum_a;
	}

	public boolean isNot_num() {
		return not_num;
	}

	public void setNot_num(boolean not_num) {
		this.not_num = not_num;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getStr_new() {
		return str_new;
	}

	public void setStr_new(String str_new) {
		this.str_new = str_new;
	}

	// check¡¡input
	public int reg_j() {

		isNum = str_new.matches("[0-9]+");
		if (isNum) {
			// all number
			isNum_a = str_new.matches("[0-1]+");
			if (isNum_a) {
				// ("0-1")
				num = 2;
			} else {
				// ("0-9")
				num = 1;
			}

		} else {
			// all string
			not_num = str_new.matches("[a-zA-Z]+");
			if (not_num) {
				// ("a-zA-Z")
				num = 3;
			} else {
				// ("exception")
				num = 4;
			}
		}
		return num;
	}

	public String ret_str(String str) {
		// space clean
		str_new = str.replaceAll(" ", "");
		return str_new;
	}
}
