package ex1210;

import java.util.Scanner;

/* ��¥ : 2018.12.10
 * ���� : Array(�迭) �׽�Ʈ
 * ��Ÿ : 1~10���� ������ 100���� �߻��Ͽ� �� �ٿ� 10���� ����ϰ� �������� �� ������ �߻� Ƚ���� ����ϴ� ���α׷� 
 * */
public class Array_Ex8 {

	public static void main(String[] args) {
		int []cnt = new int[10];
		int n;
		
		for(int i = 1; i <= 100; i++) {
			n = (int)(Math.random() * 10) + 1;
			
			System.out.printf("%5d", n);
			
			if(i % 10 == 0) {
				System.out.println();
			}
			
			cnt[n-1]++;
		}
		
		System.out.println();
		
		for(int i = 0; i < cnt.length; i++) {
			System.out.println((i + 1) + " : " + cnt[i]);
		}
	}

}