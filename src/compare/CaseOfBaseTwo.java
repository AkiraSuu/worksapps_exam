package compare;

/**
 * Extend Question 1 class
 * for Question_2
 * changed output massage & compareArray method
 */
import input.SayHellow;

public class CaseOfBaseTwo extends CaseOfBaseTen {
	// change output massage
	@Override
	public void sayHello() {
		SayHellow sh = new SayHellow();
		sh.hello_2();
	}

	@Override
	// change compareArray details
	public void compareArray() {
		if (input_type != 2) {
			System.out.println("not question_2 input format");
			if (input_type == 1) {
				System.out.println("this is question_1 input format");
			}
			if (input_type == 3) {
				System.out.println("this is question_3 input format");
			}
			System.exit(0);
		}
		for (int i = 1; i < ins.length; i++) {
			if (ins[i] == ins[i - 1]) {
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
}
