package test;

/**
 * test for RegularJudge class
 * test ok
 * */

import input.RegularJudge;

public class MainTestRegular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RegularJudge rj = new RegularJudge();
		String sr1 = rj.ret_str("ssdsad 10010011");
		int int1 = rj.reg_j();
		System.out.println(sr1);
		System.out.println(int1);
	}

}
