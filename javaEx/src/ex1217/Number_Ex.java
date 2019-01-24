package ex1217;

import java.text.NumberFormat;

/* ��¥ : 2018.12.17
 * ���� : NumberFormat
 * ��Ÿ : 
 * */

public class Number_Ex {

	public static void main(String[] args) {
		double d = 3.141592;
		String a, b;
		
		NumberFormat nf = NumberFormat.getInstance();
		a = nf.format(d);
		System.out.println(a); // [���] 3.142
		
		nf.setMaximumFractionDigits(4); // �Ҽ��� ������ �ڸ��� �ִ� 4�ڸ�
		nf.setMinimumFractionDigits(2); // �Ҽ��� ������ �ڸ��� �ּ� 2�ڸ�
		
		a = nf.format(d);
		b = nf.format(123);
		
		System.out.println(a); // [���] 3.1416
		System.out.println(b); // [���] 123.00
		
		NumberFormat nf2 = NumberFormat.getInstance();
		a = nf2.format(123456789.8956);
		
		System.out.println(a); // [���] 123,456,789.896 ���ڸ��� ���� ,����
	}

}
