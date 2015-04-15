package main;

import compare.CaseOfBaseTen;
import compare.CaseOfBaseTwo;

/**
 *	 Question 2
 * 	 Main method
 */

public class Ques_2_Main {

	public static void main(String[] args) {

		question_2();

	}

	private static void question_2() {

		CaseOfBaseTen cobt = new CaseOfBaseTwo();
		cobt.sayHello();
		cobt.arrayInit();
		cobt.compareArray();
		cobt.length_value();
		cobt.printOut();

	}

}
