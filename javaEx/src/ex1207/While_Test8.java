package ex1207;

import java.util.Scanner;

/* ��¥ : 2018.12.07
 * ���� : while / do ~ while�� ����
 * ��Ÿ : 
 * */
public class While_Test8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.println("������ �Է����ּ���.");
		n = sc.nextInt();
		
		int m = 2;
		boolean b = true;
		while (m < n) {
			if (n%m == 0) {
				b = false;
				break;
			}
			m++;
		}
		
		if(b && n!=1) {
			System.out.println(n + ": �Ҽ�");
		} else {
			System.out.println(n + ": �Ҽ��� �ƴ�");
		}
		
		sc.close();
	}

}
