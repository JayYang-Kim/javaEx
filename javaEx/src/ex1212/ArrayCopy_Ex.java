package ex1212;

/* ��¥ : 2018.12.12
 * ���� : ����� �μ� (Command Line Argument)
 * ��Ÿ : ����� �μ� �ޱ� / ���콺 ��Ŭ�� > run as > run configurations (tab : Arguments)
 * */

// Java Arg_Ex A B C
public class ArrayCopy_Ex {

	public static void main(String[] args) {
		System.out.println("����� �μ� ���� : " + args.length);
		
		// ��� ���1)
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}

		// ��� ���2)
		for (String n : args) {
			System.out.println(n);
		}
	}

}
