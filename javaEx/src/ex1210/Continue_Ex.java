package ex1210;

import java.util.Scanner;

/* ��¥ : 2018.12.10
 * ���� : Continue ����
 * ��Ÿ : 
 * */
public class Continue_Ex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double s, a;
		s = 0;
		
		System.out.println("5���� �Ǽ��� �Է����ּ���.");
		
		for(int i = 0; i <= 5; i++) {
			a = sc.nextDouble();
			
			if(a >= 0) {
				s += a;
			} else {
				continue;
			}
		}
		
		System.out.println("�� : " + s);
		
		sc.close();
	}

}
