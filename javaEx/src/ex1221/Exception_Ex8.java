package ex1221;

import java.util.InputMismatchException;
import java.util.Scanner;

/* ��¥ : 2018.12.21
 * ���� : ���� (Exception) ó��
 * ��Ÿ : throw ���������� ó��
 *      �����ڰ� +, -, *, / �ƴϸ� ���̻� �ƹ��͵� ���� �ʴ� ���α׷�
 *      checked ����
 * */

public class Exception_Ex8 {

	private Scanner sc = new Scanner(System.in);
	
	public char inputOper() throws Exception {
		System.out.println("�����ڸ� �Է����ּ���.");
		char c = sc.next().charAt(0);
		
		// throw ���� ������ (���ܸ� ������ �߻�)
		if (c != '+' && c != '-' && c != '*' && c != '/') {
			throw new Exception("������ �Է� �����Դϴ�. �����ڸ� ��Ȯ�� �Է����ּ���.");
		}
		
		return c;
	}
	
	public int inputNum() throws Exception {
		System.out.println("������ �Է����ּ���. (0�Ǵ� ���)");
		int n = 0;
		
		try {
			n = sc.nextInt();
			
			if (n < 0) {
				throw new Exception("������ �Է��� �� �� �����ϴ�.");
			}
		} catch (InputMismatchException e) {
			//throw e; // ���ܸ� �ٽ� ����
			throw new Exception("���ڸ� �Է��� �ּ���.");
		}
		
		return n;
	}
	
	public String calculate() { 
		String s = null;
		
		int a, b;
		char c;
		
		try {
			a = inputNum();
			b = inputNum();
			c = inputOper();
			
			if (c == '+') {
				s = String.format("%d + %d = %d", a, b, a + b);
			} else if (c == '-') {
				s = String.format("%d - %d = %d", a, b, a - b);
			} else if (c == '*') {
				s = String.format("%d * %d = %d", a, b, a * b);
			} else if (c == '/') {
				s = String.format("%d / %d = %d", a, b, a / b);
			}
			
			System.out.println(s);
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		return s;
	}
	
	public static void main(String[] args) {
		Exception_Ex8 ob = new Exception_Ex8();
		ob.calculate();
		
		/*String s = ob.calculate();
		
		System.out.println(s);*/
	}

}
