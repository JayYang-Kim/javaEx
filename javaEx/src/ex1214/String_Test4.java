package ex1214;

import java.util.Scanner;

/* ��¥ : 2018.12.14
 * ���� : �ڹ��� �⺻ API Ŭ���� - (string)
 * ��Ÿ : 
 * */

public class String_Test4 {

	public static void main(String[] args) {
		// �̸��� �Է� �޾� �达�� ������� ���
		// ��, �Է� ���� �̸��� end�� ����
		Scanner sc = new Scanner(System.in);
		String str;
		int count = 0;
		
		while(true) {
			System.out.println("�̸��� �Է����ּ���.");
			str = sc.next();
			
			//if (str.startsWith("��"));
			//if (str.charAt(0) == '��');
			if (str.indexOf("��") == 0) { // ���� ù��° �ڸ� ������
				count++;
			} else if(str.equals("end")) {
				break;
			}
			
		}
		
		System.out.println("�达�� : " + count + "(��)");
		
		sc.close();
	}

}
