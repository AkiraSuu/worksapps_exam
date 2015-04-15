package input;

/**
 * 	class for first output question_1:(0~9)|question_2:(0~1)|question_3:(A~Z,a~z)
 *
 */
public class SayHellow {
	String str_qes_1 = "Please input (0~9) question_1 :";
	String str_qes_2 = "Please input (0~1) question_2 :";
	String str_qes_3 = "Please input (A~a,Z~z) question_3 :";

	public void hello_1() {
		System.out.println(str_qes_1);
	}

	public void hello_2() {
		System.out.println(str_qes_2);
	}

	public void hello_3() {
		System.out.println(str_qes_3);
	}
}
