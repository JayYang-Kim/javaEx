package ex1217;

import java.util.Calendar;
import java.util.Scanner;

/* ��¥ : 2018.12.17
 * ���� : java.util.Calendar
 * ��Ÿ : ��������� �Է��ؼ� �� ���̸� ����ϴ� ���α׷�
 * */

public class Calendar_Ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str;
		
		System.out.println("��������� �Է����ּ���.");
		System.out.println("(YYYYMMDD �Ǵ� YYYY-MM-DD)");
		str = sc.next();
		
		// -, .(���Խ� Ư������ : �ѹ��ڸ� ��Ÿ��)�� �Է¹����� ""(����)���� ��ȯ
		// ����.�� ��Ÿ�������� \\(�ι� �Է��ؾ���)
		str = str.replaceAll("\\-|\\.|/", "");
		
		// �Է��� ��¥ ���̰� 8�ڸ��� �ƴ� ��� ���α׷� ���� ó��
		if (str.length() != 8) {
			System.out.println("��¥ ���� ����");
			System.exit(0); // ���α׷� ����
		}
		
		// ��, ��, �� ���ϱ�
		int y = Integer.parseInt(str.substring(0, 4));
		int m = Integer.parseInt(str.substring(4, 6));
		int d = Integer.parseInt(str.substring(6));
		
		Calendar cal = Calendar.getInstance(); // �ý��� ���� ��¥ ���ϱ�
		
		// ���� ���ϱ�
		int age = cal.get(Calendar.YEAR) - y;
		
		// �����ϱ� (���� �����ų� ���� ���� ��� ���� ��)
		if ((m > cal.get(Calendar.MONTH) + 1) ||  
			(m == cal.get(Calendar.MONTH) + 1 && d > cal.get(Calendar.DAY_OF_MONTH))) {
				age--;
		}
		/*if (cal.get(Calendar.MONTH) >= m && cal.get(Calendar.DATE) >= d) {
			age--;
		}*/
		
		System.out.println("���� : " + age);
		//System.out.printf("�� ���� ��¥ : %tF %tA\n", cal2, cal2);
		//System.out.printf("�� ���� ��¥ : %tF %tA\n", cal3, cal3);
		
		sc.close();
	}

}
