package compare;

/**
 * CaseOfBaseTen class
 * This is the core class of  program
 * Implementing the BaseQuestion`s interface
 * Implementation all methods
 * And it`s base class to extend
 * for Question_1
 */

import input.RegularJudge;
import input.SayHellow;
import input.ScannerInput;
import input.StrToArray;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import factory.BaseQuestion;
import output.PrintOut;

public class CaseOfBaseTen implements BaseQuestion {

	protected String str = null;
	protected String new_str = null;
	protected int input_type = 0;

	protected char[] chr = new char[0];
	protected int[] ins = new int[0];

	//protected boolean init_worked = false;

	protected int begin = 0;// now_start->index
	protected int end = 0;// now->length
	protected int length = 0;// longest->length
	protected int nextBegin = 0;// longest_begin->index
	
	public int getBegin() {
		return begin;
	}

	public void setBegin(int begin) {
		this.begin = begin;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}



	public int getNextBegin() {
		return nextBegin;
	}

	public void setNextBegin(int nextBegin) {
		this.nextBegin = nextBegin;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public String getNew_str() {
		return new_str;
	}

	public void setNew_str(String new_str) {
		this.new_str = new_str;
	}

	public int getInput_type() {
		return input_type;
	}

	public void setInput_type(int input_type) {
		this.input_type = input_type;
	}

	public char[] getChr() {
		return chr;
	}

	public void setChr(char[] chr) {
		this.chr = chr;
	}

	public int[] getIns() {
		return ins;
	}

	public void setIns(int[] ins) {
		this.ins = ins;
	}

	public Map<Integer, Integer> getMap() {
		return map;
	}

	public void setMap(Map<Integer, Integer> map) {
		this.map = map;
	}

	@Override
	public void sayHello() {
		SayHellow sh = new SayHellow();
		sh.hello_1();
	}

	@Override
	public void arrayInit() {
		//scanner input
		ScannerInput si = new ScannerInput();
		str = si.scanInput();
		//find out the  input_type & delete space and save into new string array 
		RegularJudge rj = new RegularJudge();
		new_str = rj.ret_str(str);
		input_type = rj.reg_j();
		//convert a new string array to a char[]/iNt[] array 
		StrToArray sta = new StrToArray();
		// if input is not string do char[] to int[] and save
		if (input_type == 3) {
			chr = sta.sta_char(new_str);
		} else {
			ins = sta.sta_int(new_str);
		};
	}

	// create map to save data
	Map<Integer, Integer> map = new HashMap<Integer, Integer>();

	@Override
	public void compareArray() {
		if (input_type != 1) {
			System.out.println("not question_1 input format");
			if (input_type == 2) {
				System.out.println("this is question_2 input format");
			}
			if (input_type == 3) {
				System.out.println("this is question_3 input format");
			}
			System.exit(0);
		}
		for (int i = 1; i < ins.length; i++) {
			//loop to save longest index & length 
			if (ins[i] > ins[i - 1]) {
				end++;
			} else {
				map.put(begin, end - begin + 1);
				begin = i;
				end = i;
			}
			map.put(begin, end - begin + 1);
		}
	}

	@Override
	public void length_value() {

		Set<Entry<Integer, Integer>> set = map.entrySet();
		Iterator<Entry<Integer, Integer>> it = set.iterator();

		// Iterator map to find longest
		while (it.hasNext()) {

			Map.Entry<Integer, Integer> entry = (Entry<Integer, Integer>) it
					.next();
			if ((Integer.valueOf(entry.getValue())) > length) {

				nextBegin = Integer.valueOf(entry.getKey());
				length = Integer.valueOf(entry.getValue());
			}
		}
	}

	@Override
	public void printOut() {
		PrintOut po = new PrintOut();
		po.printO_ins(nextBegin, length, ins);
	}

}
