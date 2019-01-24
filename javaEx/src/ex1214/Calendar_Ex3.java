package ex1214;

import java.util.Calendar;
import java.util.Scanner;

/* ��¥ : 2018.12.14
 * ���� : Calendar Class
 * ��Ÿ : 
 * */

public class Calendar_Ex3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int y, m;
		
		// �⵵ �Է�
		System.out.println("�⵵�� �Է����ּ���.");
		y = sc.nextInt();
		
		// �� �Է�
		System.out.println("���� �Է����ּ���.");
		m = sc.nextInt();
		
		// �ý����� ���� ��¥
		Calendar cal = Calendar.getInstance();
		
		cal.set(y, m-1, 1);
		
		int w = cal.get(Calendar.DAY_OF_WEEK);
		int end = cal.getActualMaximum(Calendar.DATE);
		
		System.out.println("\t   " + y + "��" + m + "��");
		
		for (int i = 1; i < w; i++) {
			System.out.print("    ");
		}
		
		for(int i = 1; i <= end; i++) {
			System.out.printf("%4d", i);
			
			if (++w % 7 == 1) {
				System.out.println();
			}
		}
		
		System.out.println();
		
		sc.close();
		
	}

}
