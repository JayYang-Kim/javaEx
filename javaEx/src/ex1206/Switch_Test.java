package ex1206;

import java.util.Scanner;

/* ��¥ : 2018.12.06
 * ���� : switch ~ case�� ����
 * ��Ÿ : ������ �Է� �޾� �Է� ���� ������ ���� ������ ���ϴ� ���α׷��� �ۼ� �Ͻÿ�.
 * */
public class Switch_Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int score;
		char a; // ����
		
		System.out.println("������ �Է����ּ���");
		score = sc.nextInt();
		
		switch (score / 10) {
		case 10 : case 9 : a = '��'; break;
		case 8 : a = '��'; break;
		case 7 : a = '��'; break;
		case 6 : a = '��'; break;
		case 5 : case 4 : case 3 : case 2 : case 1 : case 0 : a = '��'; break;
		default : a = '��';
		}
		
		System.out.println("���� : " + score + " , " + "���� : " + a);
		
		sc.close();

	}

}
