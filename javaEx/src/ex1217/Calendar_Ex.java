package ex1217;

import java.util.Calendar;

/* ��¥ : 2018.12.17
 * ���� : java.util.Calendar
 * ��Ÿ : 
 * */

public class Calendar_Ex {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		Calendar cal2 = cal; // �ּҰ� ����
		
		// clone Ŭ������ object Ŭ�������� �۾Ƽ� �ٿ�ĳ������ ������� "(Calendar)cal"
		Calendar cal3 = (Calendar)cal.clone(); // ��ü ���� (�ּҰ��� �ٸ����� ���� ������ ����)
		
		System.out.println(cal == cal2); // [���] true
		System.out.println(cal == cal3); // [���] false
		
		System.out.printf("%tF %tT\n", cal, cal);
		System.out.printf("%tF %tT\n", cal3, cal3);
	}

}
