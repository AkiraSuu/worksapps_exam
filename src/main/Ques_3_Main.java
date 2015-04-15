package main;

import compare.CaseOfBaseTen;
import compare.CaseOfStr;

/**
 * 	Question 3
 *  Main method
 */

public class Ques_3_Main {

	public static void main(String[] args) {

		question_3();

	}

	private static void question_3() {
		
		CaseOfBaseTen cobt = new CaseOfStr();
		cobt.sayHello();
		cobt.arrayInit();
		cobt.compareArray();
		cobt.length_value();
		cobt.printOut();

	}

}
