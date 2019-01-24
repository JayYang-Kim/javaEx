package ex1217;

import java.math.BigDecimal;
import java.math.BigInteger;

/* ��¥ : 2018.12.17
 * ���� : Big Integer(����), BigDecimal(�Ҽ�)
 * ��Ÿ : ��û ū ���ڸ� �ٷ궧 ���
 * */

public class Big_Ex {

	public static void main(String[] args) {
		// BigInteger
		BigInteger b1 = new BigInteger("123456789123456789");
		BigInteger b2 = new BigInteger("123456789123456789");
		
		
		BigInteger b3 = b1.add(b2); // b1�� b2�� ���ϱ�
		
		System.out.println(b3);
		
		BigInteger b4 = b1.multiply(b2); // b1�� b2�� ���ϱ�
		
		System.out.println(b4);
		
		BigInteger b5 = b1.pow(5); // b1���� 5��
		System.out.println(b5);
		
		// BigDecimal
		BigDecimal d1 = new BigDecimal("123456789.123456789");
		
		BigDecimal d2 = d1.movePointLeft(3); // �Ҽ����� �������� 3ĭ �̵�
		System.out.println(d2);
		
		BigDecimal d3 = d1.divide(d2, BigDecimal.ROUND_DOWN); // �ݿø� ����
		System.out.println(d3);
		
		// ��ȿ�ڸ��� 5�ڸ�
		BigDecimal d4 = d1.divide(d2, 5, BigDecimal.ROUND_DOWN); // �ݿø� ����
		System.out.println(d4);
	}

}