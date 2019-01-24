package ex1217;

import java.util.Calendar;
import java.util.Scanner;

/* ��¥ : 2018.12.17
 * ���� : java.util.Calendar
 * ��Ÿ : ��¥�� �Է��Ͽ� �ش� ���� �����ϰ� ������ ���� ���ϴ� ���α׷�
 * */

public class Calendar_Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str;
		
		System.out.println("��¥�� �Է����ּ���.");
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
		cal.set(y, m-1, d);
		
		int n;
		
		// ���� ����
		Calendar cal2 = (Calendar)cal.clone();
		n = cal2.get(Calendar.DAY_OF_WEEK) - 1;
		cal2.add(Calendar.DAY_OF_MONTH, -n);
		
		// ���� ��
		Calendar cal3 = (Calendar)cal.clone();
		//n = cal3.get(Calendar.DAY_OF_WEEK); 
		n = 7 - cal3.get(Calendar.DAY_OF_WEEK);
		cal3.add(Calendar.DAY_OF_MONTH, + n);
		
		System.out.printf("��¥ : %tF %tA\n", cal, cal);
		System.out.printf("�� ���� ��¥ : %tF %tA\n", cal2, cal2);
		System.out.printf("�� ���� ��¥ : %tF %tA\n", cal3, cal3);
		
		// ���� �������� ���� ���۰� �� ���ϱ�
		for (int i = 0; i < 7; i++) {
			if(i != 0) {
				cal2.add(Calendar.DAY_OF_MONTH, 1); // i�� �� ��� 0, 1, 2, 3, 4, 5, 6 ����
			}
			
			System.out.printf("%tF\n", cal2);
		}
		
		System.out.println();
		
		sc.close();
	}

}
