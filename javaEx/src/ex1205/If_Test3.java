package ex1205;

import java.util.Scanner;

/* ��¥ : 2018.12.05
 * ���� : ���ǹ� ���� (if)
 * ��Ÿ : ������ �Է� �޾� �Է� ���� ������ ���� ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * */
public class If_Test3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("������ �Է����ּ���.");
		a = sc.nextInt();
		
		if(a >= 95 && a <= 100) {
			System.out.println(a + "��, ���� : 4.5��");
		} else if (a >= 90 && a <= 94) {
			System.out.println(a + "��, ���� : 4.0��");
		} else if (a >= 85 && a <= 89) {
			System.out.println(a + "��, ���� : 3.5��");
		} else if (a >= 80 && a <= 84) {
			System.out.println(a + "��, ���� : 3.0��");
		} else if (a >= 75 && a <= 79) {
			System.out.println(a + "��, ���� : 2.5��");
		} else if (a >= 70 && a <= 74) {
			System.out.println(a + "��, ���� : 2.0��");
		} else if (a >= 65 && a <= 69) {
			System.out.println(a + "��, ���� : 1.5��");
		} else if (a >= 60 && a <= 64) {
			System.out.println(a + "��, ���� : 1.0��");
		} else if (a >= 0 && a <= 59) {
			System.out.println(a + "��, ���� : 0.0��");
		} else { 
			System.out.println("�Է¿���");
		}
		
		sc.close();
	}

}
