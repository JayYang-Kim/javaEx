package ex1210;

import java.util.Scanner;

/* ��¥ : 2018.12.10
 * ���� : Break�� ����
 * ��Ÿ : �Ǽ��� �Է� �޾� �Է� ���� ���� ���� ����ϴ� ���α׷�
 * */
public class Break_Ex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a, s;
		s = 0;
		
		System.out.println("�Ǽ� �Է� [���� : 0]");
		while(true) {
			a = sc.nextDouble();
			
			if(a <= 0) {
				break;
			}
			
			s += a;
		}
		System.out.println("�� : " + s);
		
		sc.close();
	}

}
