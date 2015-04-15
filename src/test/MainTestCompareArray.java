package test;



import compare.CaseOfBaseTen;
import compare.CaseOfBaseTwo;
import compare.CaseOfStr;

/**
 * 	test for BaseQuestion`s compareArray() method 
 * 	The most important test All of
 * 	questions type has been tested 
 *	 test OK
 */
public class MainTestCompareArray {

	public static void main(String[] args) {
		try {
			// test compareArray_1 -> question_1
			compareArray_1();
			System.out.println();
			// test compareArray_2 -> question_2
			compareArray_2();
			System.out.println();
			// test compareArray_3 -> question_3
			compareArray_3();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void compareArray_1(){
		int[] ins = {'9','8','1','2','3','4','5'};
		
		CaseOfBaseTen cobt = new CaseOfBaseTen();
		cobt.setInput_type(1);
		cobt.setIns(ins);
		cobt.compareArray();
		cobt.length_value();
		
	System.out.println( "from a["+cobt.getNextBegin()+"] length = "+cobt.getLength());
	}
	private static void compareArray_2(){
		int[] ins = { '0', '0', '1', '1', '1', '1', '1', '1', '1','0', '1' };
		
		CaseOfBaseTen cobt = new CaseOfBaseTwo();
		cobt.setInput_type(2);
		cobt.setIns(ins);
		cobt.compareArray();
		cobt.length_value();
		
	System.out.println( "from a["+cobt.getNextBegin()+"] length = "+cobt.getLength());
	}
	private static void compareArray_3(){
		char[] chr = { 'A', 'A', 'a', 'a', 'a', 'a', 'b', 'b', 'C' };
		
		CaseOfBaseTen cobt = new CaseOfStr();
		cobt.setInput_type(3);
		cobt.setChr(chr);
		cobt.compareArray();
		cobt.length_value();
		
	System.out.println( "from a["+cobt.getNextBegin()+"] length = "+cobt.getLength());
	}

}