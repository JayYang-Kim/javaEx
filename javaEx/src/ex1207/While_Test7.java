package ex1207;

import java.util.Scanner;

/* ��¥ : 2018.12.07
 * ���� : while / do ~ while�� ����
 * ��Ÿ : 
 * */
public class While_Test7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int num, a, t;
		
		do {
			System.out.println("���� �Է����ּ���.");
			num = sc.nextInt();
		} while(num < 0);
		
		a = 0;
		t = num;
		while(t > 0) {
			a *= 10;
			a += t % 10;	
			t /= 10;      	
		}
		
		System.out.println("������ �� : " + num);
		System.out.println("������ �� : " + a);
		
		sc.close();
	}

}
