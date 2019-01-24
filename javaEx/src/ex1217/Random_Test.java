package ex1217;

import java.util.Random;

/* ��¥ : 2018.12.17
 * ���� : Random Class
 * ��Ÿ : ���� ������ ������ ����
 * */

public class Random_Test {
	// 5�ڸ� ����
	public static String toNumber5() {
		StringBuffer sb = new StringBuffer();
		
		Random rd = new Random();
		
		for (int i = 0; i < 5; i++) {
			sb.append(Integer.toString(rd.nextInt(10))); // Integer.toString() : ���ڸ� ���ڿ��� ��ȯ 
												         // rd.nextInt(10) : 0 ~ 9������ ����
		}
		
		return sb.toString();
	}
	
	// ���� �ٸ� 3�ڸ� ����
	public static String toNumber3() {
		StringBuffer sb = new StringBuffer();
		
		Random rd = new Random();
		int n; // ����
		
		gogo:
		for (int i = 0; i < 3; i++) {
			n = rd.nextInt(10); // 0 ~ 9 ���� ����
			
			for (int j = 0; j < sb.length(); j++) {
				if (n == Integer.parseInt(sb.substring(j, j+1))) {
					i--;
					continue gogo;
				}
			}
			
			sb.append(Integer.toString(n));
		}
		
		return sb.toString();
	}
	
	// A~Z, a~z, 0~9�� �����Ͽ� 10�ڸ� ���ڿ� �����
	public static String toString10() {
		StringBuffer sb = new StringBuffer();
		
		Random rd = new Random();
		int n;
		String s = "ABCDEFGHIJKLMNOPQRSTYVWXYZ0123456789abcdefghijklmnopqrstuvwxyz";
		
		for (int i = 0; i < 10; i++) {
			n = rd.nextInt(s.length());
			sb.append(s.charAt(n)); // ���� �߰� (�ڿ�)
		}
		
		return sb.toString();
	}
	
	public static void main(String[] args) {
		String s;
		
		s = toNumber5();
		System.out.println("�ټ��ڸ� ���� : " + s);
		
		s = toNumber3();
		System.out.println("���� �ٸ� ���ڸ� ���� : " + s);
		
		s = toString10();
		System.out.println("A~Z, a~z, 0~9 : " + s);
	}

}
