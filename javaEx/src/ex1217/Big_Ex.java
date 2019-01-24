package ex1217;

import java.math.BigDecimal;
import java.math.BigInteger;

/* 날짜 : 2018.12.17
 * 내용 : Big Integer(정수), BigDecimal(소수)
 * 기타 : 엄청 큰 숫자를 다룰때 사용
 * */

public class Big_Ex {

	public static void main(String[] args) {
		// BigInteger
		BigInteger b1 = new BigInteger("123456789123456789");
		BigInteger b2 = new BigInteger("123456789123456789");
		
		
		BigInteger b3 = b1.add(b2); // b1에 b2값 더하기
		
		System.out.println(b3);
		
		BigInteger b4 = b1.multiply(b2); // b1에 b2값 곱하기
		
		System.out.println(b4);
		
		BigInteger b5 = b1.pow(5); // b1값의 5승
		System.out.println(b5);
		
		// BigDecimal
		BigDecimal d1 = new BigDecimal("123456789.123456789");
		
		BigDecimal d2 = d1.movePointLeft(3); // 소수점을 왼쪽으로 3칸 이동
		System.out.println(d2);
		
		BigDecimal d3 = d1.divide(d2, BigDecimal.ROUND_DOWN); // 반올림 안함
		System.out.println(d3);
		
		// 유효자리수 5자리
		BigDecimal d4 = d1.divide(d2, 5, BigDecimal.ROUND_DOWN); // 반올림 안함
		System.out.println(d4);
	}

}