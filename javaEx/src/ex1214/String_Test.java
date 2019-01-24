package ex1214;

import java.util.Scanner;

/* ��¥ : 2018.12.14
 * ���� : �ڹ��� �⺻ API Ŭ���� - (string)
 * ��Ÿ : 
 * */

public class String_Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		
		// ������ �Է� �޾� ���� ����� ��� �ϴ� ���α׷�
		System.out.println("����[10+7] ? ");
		str = sc.nextLine(); // ��ȣ�� ���� ��쿡�� �Ұ�
		
		// ���� ����
		str = str.replaceAll("\\s", "");
		
		for (String op : new String[] {"+","-","*","/"}) {
			// �������� ��ġ (���ʿ��� ã��)
			int pos = str.indexOf(op);
			
			if (pos > 0) {
				/*System.out.println(pos); // ������ ����
				System.out.println(str.charAt(pos)); // ���� ã��
				System.out.println(str.substring(0, pos)); // [���] 10 
				System.out.println(str.substring(pos + 1)); // [���] 7*/
				
				int num1 = Integer.parseInt(str.substring(0, pos));
				int num2 = Integer.parseInt(str.substring(pos + 1));
				
				int result = 0;
				
				switch(op) {
				case "+" : result = num1 + num2;break;
				case "-" : result = num1 - num2;break;
				case "*" : result = num1 * num2;break;
				case "/" : result = num1 / num2;break;
				}
			}
		}
		
		sc.close();
	}

}
