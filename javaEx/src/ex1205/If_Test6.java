package ex1205;

import java.util.Scanner;

/* ��¥ : 2018.12.05
 * ���� : ���ǹ� ���� (if)
 * ��Ÿ : �̸��� ������ ������ �Է� �޾� �հ� ���θ� �Ǵ��ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * */
public class If_Test6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String a;
		int b, c, d, e;
		
		System.out.println("�̸��� �Է����ּ���.");
		a = sc.next();
		System.out.println("ù��° ������ �Է����ּ���.");
		b = sc.nextInt();
		System.out.println("�ι�° ������ �Է����ּ���.");
		c = sc.nextInt();
		System.out.println("����° ������ �Է����ּ���.");
		d = sc.nextInt();
		
		// ��� ���ϱ�
		e = (b + c+ d) / 3;
		
		System.out.println("��� : " + e);
		
		/*if ((b >= 40 && c >= 40 && d >= 40) && (e >= 60)) {
			System.out.println(a + "����" + " �հ� �Դϴ�.");
		} else if ((e >=60) || (b < 40 && c < 40 && d < 40)) {
			System.out.println(a + "����" + " ���� �Դϴ�.");
		} else {
			System.out.println(a + "����" + " ���հ� �Դϴ�.");
		}*/
		
		if ((b >= 40 && c >= 40 && d >= 40) && (e >= 60)) {
			System.out.println(a + "����" + " �հ� �Դϴ�.");
		} else if (e < 60) {
			System.out.println(a + "����" + " ���հ� �Դϴ�.");
		} else {
			System.out.println(a + "����" + " ���� �Դϴ�.");
		}
		
		sc.close();
	}

}
