package ex1220;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* ��¥ : 2018.12.20
 * ���� : ����(Exception) ó��
 * ��Ÿ : 
 * */

public class Exception_Ex6 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // (System.in) Ű���带 ���� 1����Ʈ�� �Է��� ����
		int a, b, c;
		
		try {
			String s;

			System.out.println("ù��° ���� �Է����ּ���.");

			s = br.readLine();
			a = Integer.parseInt(s);

			System.out.println("�ι�° ���� �Է����ּ���.");
			b = Integer.parseInt(br.readLine());

			c = a + b;

			System.out.println("��� : " + c);
		} catch (Exception e) { // ��� ���ܸ� catch�� �� �ִ�.
			System.out.println(e.toString());
		}		
		
		System.out.println("����");
	}

}
