package ex1206;

import java.util.Scanner;

/* ��¥ : 2018.12.06
 * ���� : while �׽�Ʈ
 * ��Ÿ : �� ������ �Է� �޾� �Է� ���� ���� ���� ������ ū �������� ���� ���ϴ� ���α׷�
 * */
public class While_Test4 {

	public static void main(String[] args) {
		int a, b, n ,s;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �Է����ּ���.");
		a = sc.nextInt();
		System.out.println("������ �Է����ּ���.");
		b = sc.nextInt();
		
		// �ִ밪 ���ϱ�
		if(a > b) {
			n = a; a = b; b = n;
		}
		
		// while�ʱⰪ���� �ּҰ� ����
		n = a;
		s = 0;
		
		while (n <= b) {
			s += n;
			n++;
		}
		
		System.out.println(a + " ~" + b + "������ �� = " + s);
		
		sc.close();
	}

}
