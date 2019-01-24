package ex1214;

import java.util.Calendar;

/* ��¥ : 2018.12.14
 * ���� : Calendar Class
 * ��Ÿ : 
 * */

public class Calendar_Ex {

	public static void main(String[] args) {
		//Calendar new = new Calendar(); // [������ ����] �߻� Ŭ������ ��ü ���� �Ұ�
		
		Calendar now = Calendar.getInstance();
		//String s = String.format("tF %tA %tT", now, now, now);
		String s = String.format("%1$tF", now); // ��-��-��
		String s2 = String.format("%1$tF %1$tA", now); // ��-��-��, ����
		String s3 = String.format("%1$tF %1$tA %1$tT", now); // ��-��-��, ����, �ð� (��:��:��)
		System.out.println(s);
		System.out.println(s2);
		System.out.println(s3);
		
		// ������ �������� (get)
		int y = now.get(Calendar.YEAR); // �⵵
		int m = now.get(Calendar.MONTH) + 1; // ��(0 ~ 11���� �����ϹǷ� +1�� �ؾ���)
		int d = now.get(Calendar.DATE); // ����
		//int d = now.get(Calendar.DAY_OF_MONTH); // ����
		int w = now.get(Calendar.DAY_OF_WEEK); // ���� (1 : �� ~ 7 : ��)
		int end = now.getActualMaximum(Calendar.DATE); // ���� ������ ����
		
		System.out.println(y + " : " + m + " : " + d + " : " + w + " : " + end);
	}

}
