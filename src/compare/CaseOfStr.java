package compare;
/**
 * Extend question 1 class
 * for Question_3
 * changed output massage & compareArray & result massage
 */
import input.SayHellow;
import output.PrintOut;

public class CaseOfStr extends CaseOfBaseTen {
	//change output massage
	@Override
	public void sayHello() {
		SayHellow sh = new SayHellow();
		sh.hello_3();
	}
	//change compareArray details 
	@Override
	public void compareArray() {
		if (input_type != 3) {
			System.out.println("not question_3 input format");
			if (input_type == 1) {
				System.out.println("this is question_1 input format");
			}
			if (input_type == 2) {
				System.out.println("this is question_2 input format");
			}
			System.exit(0);
		}
		for (int i = 1; i < chr.length; i++) {
			if (chr[i] == chr[i - 1]) {
				end++;
			} else {
				map.put(begin, end - begin + 1);
				begin = i;
				end = i;
			}
			map.put(begin, end - begin + 1);
		}
		length_value();
	}
	@Override
	//change result massage
	public void printOut() {
		PrintOut po = new PrintOut();
		po.printO_char(nextBegin, length, chr);
	}
}
