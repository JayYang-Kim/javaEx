package ex1207;

import java.util.Scanner;

/* ��¥ : 2018.12.07
 * ���� : while / do ~ while�� ����
 * ��Ÿ : 
 * */
public class While_Test4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, n, cnt;
		
		System.out.println("������ �Է����ּ���.");
		cnt = sc.nextInt();
		
		n = 0;
		a = 0;
		b = 1;
		while(n < cnt) {
			n++;
			
			System.out.println(a + " ");
			
			c = a + b;
			a = b;
			b = c;
		}
		
		System.out.println("");

		sc.close();
	}

}
