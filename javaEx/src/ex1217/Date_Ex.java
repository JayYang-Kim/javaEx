package ex1217;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* ��¥ : 2018.12.17
 * ���� : java.util.Date
 * ��Ÿ : 
 * */

public class Date_Ex {

	public static void main(String[] args) {
		Date date = new Date();
		
		System.out.println(date);
		
		// ��, ��, �� (�����)
		int y = date.getYear() + 1900;
		int m = date.getMonth() + 1;
		int d = date.getDate();
		
		System.out.println(y + "-" + m + "-" + d);
		
		// 1970.1.1 0�� 0�� 0�ʸ� �������� �и��� ������ ȯ��
		long lo = date.getTime();
		
		System.out.println(lo);
		
		Date date2 = new Date(1545011113036L);
		System.out.println(date2);
		
		boolean b = date.after(date2); // date�� date2���� ������ ��¥���� ��
		System.out.println(b);
		
		// ���糯¥�� String���� ��ȯ (Date -> String)
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� hh:mm:ss"); // date ���� ����
		String s = sdf.format(date);
		
		System.out.println(s);
		
		// String -> Date (String���� Date�� ��ȯ ����ų ��Ȳ�� ���� �� �ִ�.)
		s = "2000-10-10";
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
		
		// ���α׷� ���� �� ���ܰ� �߻��� �� �ִ� �ҽ��� �ۼ�
		try {
			Date date3 = sdf2.parse(s);
			System.out.println(date3);
			
			// 2018-12-17 ~ 2019-05-16 (�� ��¥ ������ ����)
			Date begin = sdf2.parse("2018-12-17");
			Date end = sdf2.parse("2019-05-16");
			
			long dif = (end.getTime() - begin.getTime()) / (24*60*60*1000);
			
			System.out.println(dif + "��");
			
		} catch (ParseException e) { // ���α׷� ������ ���ܰ� �߻��Ҷ� ������ �ҽ�
			e.printStackTrace();
		} 
	}

}
