package ex1206;

import java.util.Scanner;

/* ��¥ : 2018.12.06
 * ���� : Do ~ while �׽�Ʈ
 * ��Ÿ : �������� 2�ܿ��� 9�ܱ��� ���� ���ó�� ���η� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 		   do ~ while�� �ּ� �ѹ��� ����
 * */
public class While_Ex5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int dan, n;
		
		do {
			System.out.print("�� ? ");
			dan = sc.nextInt();
		} while (dan < 1 || dan > 9);
		
		n = 0;
		while (n < 9) {
			n++;
			System.out.printf("%d * %d = %2d\n", dan, n, dan * n);
		}
		
		sc.close();
	}

}
