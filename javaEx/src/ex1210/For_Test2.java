package ex1210;

import java.util.Scanner;

/* ��¥ : 2018.12.10
 * ���� : For�� �׽�Ʈ
 * ��Ÿ : �� ���� ������ �Է¹޾� �Է� ���� ���� ���������� ū �� ���̿� 3�� ����̰ų� 5�� ����μ����� �հ� ���� ����ϴ� ���α׷�
 * */
public class For_Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1, n2, temp;
		int s, c;
		
		System.out.println("ù��° ������ �Է����ּ���.");
		n1 = sc.nextInt();
		System.out.println("�ι�° ������ �Է����ּ���.");
		n2 = sc.nextInt();
		
		// �������� ū�� ��
		// n1 : �ּҰ�, n2 : �ִ밪
		if(n1 > n2) {
			temp = n1; n1 = n2; n2 = temp;
		}
		
		s=c=0;
		
		for (int i = n1; i <= n2; i++) {
			if(i % 3 == 0 || i % 5 == 0) {
				c++; // 3, 5�� ��� ī��Ʈ
				s += i;
			}
		}
		
		System.out.println("�� : " + s);
		System.out.println("��� : " + (s / c));
		
		sc.close();
	}

}
