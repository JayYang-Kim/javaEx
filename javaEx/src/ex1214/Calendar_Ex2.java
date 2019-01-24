package ex1214;

import java.util.Calendar;

/* ��¥ : 2018.12.14
 * ���� : Calendar Class
 * ��Ÿ : 
 * */

public class Calendar_Ex2 {

	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance(); // �ý����� ���� ��¥
		
		// ��¥�� 10�Ϸ� ����
		cal.set(Calendar.DATE, 10);
		System.out.printf("%tF %tA\n", cal, cal);
		
		// 1994-11-04�� ����
		// ��(0 ~ 11���� �����ϹǷ� +1�� �ؾ���)
		cal.set(1994, 11 - 1, 4);

		System.out.printf("%tF %tA\n", cal, cal);

		// ȫ�浿�� 2018�� 10�� 10�Ͽ� ��;���. 100����?
		cal.set(2018, 10 - 1, 10);
		cal.add(Calendar.DATE, 100); // (��, 100)

		System.out.printf("%tF %tA\n", cal, cal);
		
		// 2000�� 10�� 35�Ϸ� ����
		cal.set(2000, 10 - 1, 35);

		System.out.printf("%tF %tA\n", cal, cal);
		
	}

}
