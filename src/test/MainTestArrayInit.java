package test;
/**
 * 	test for BaseQuestion`s arrayInit() method
 * 	try to change String type data to char[] or iNt[]
 * 	test OK
 */
import compare.CaseOfBaseTen;

public class MainTestArrayInit {

	public static void main(String[] args) {

		CaseOfBaseTen cobt = new CaseOfBaseTen();
		System.out.println("test_input :");
		
		cobt.arrayInit();
		
		for (int i = 0; i < cobt.getChr().length; i++) {
			System.out.print(cobt.getChr()[i]);
		}
		
		for (int i = 0; i < cobt.getIns().length; i++) {
			System.out.print(cobt.getIns()[i]);
		}
	}

}
