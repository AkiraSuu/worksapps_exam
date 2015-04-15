package test;

/**
 * test for StrToArray class
 * test ok
 * */

import input.StrToArray;

public class MainTestStrToA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StrToArray sta = new StrToArray();
		char[] char1 = sta.sta_char("aaa aaaavvvvvv vvbbBB");
		int[] int1 = sta.sta_int("123431123012031");
		for (int i = 0; i < char1.length; i++) {
			System.out.print(char1[i]);
		}
		System.out.println();
		for (int i = 0; i < int1.length; i++) {
			System.out.print(int1[i]);
		}
	}

}
