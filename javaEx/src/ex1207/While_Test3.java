package ex1207;

import java.util.Scanner;

/* ��¥ : 2018.12.07
 * ���� : while / do ~ while�� ����
 * ��Ÿ : 
 * */
public class While_Test3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int a, b, t1, t2, lcm;
		
		System.out.println("ù��° ������ �Է����ּ���.");
		a = sc.nextInt();
		System.out.println("�ι�° ������ �Է����ּ���.");
		b = sc.nextInt();
		
		// �ִ�����
		t1 = a;
		t2 = b;
		
		int mod = t1 % t2;
		
		// �ִ����� ���ϱ�
		while(mod > 0) {
			t1 = t2;
			t2 = mod;
			mod = t1 % t2;
		}
		
		System.out.println("�ִ����� : " + t2);
		
		lcm = (a * b) / t2;
		System.out.println("�ּҰ���� : " + lcm);
	}

}
