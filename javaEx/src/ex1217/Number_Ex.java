package ex1217;

import java.text.NumberFormat;

/* 날짜 : 2018.12.17
 * 내용 : NumberFormat
 * 기타 : 
 * */

public class Number_Ex {

	public static void main(String[] args) {
		double d = 3.141592;
		String a, b;
		
		NumberFormat nf = NumberFormat.getInstance();
		a = nf.format(d);
		System.out.println(a); // [결과] 3.142
		
		nf.setMaximumFractionDigits(4); // 소수점 이하의 자리를 최대 4자리
		nf.setMinimumFractionDigits(2); // 소수점 이하의 자리를 최소 2자리
		
		a = nf.format(d);
		b = nf.format(123);
		
		System.out.println(a); // [결과] 3.1416
		System.out.println(b); // [결과] 123.00
		
		NumberFormat nf2 = NumberFormat.getInstance();
		a = nf2.format(123456789.8956);
		
		System.out.println(a); // [결과] 123,456,789.896 세자리수 마다 ,찍음
	}

}
