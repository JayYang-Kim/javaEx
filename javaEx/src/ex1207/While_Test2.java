package ex1207;

import java.util.Scanner;

/* ��¥ : 2018.12.07
 * ���� : while / do ~ while�� ����
 * ��Ÿ : 
 * */
public class While_Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num, len, temp;
		
		System.out.println("������ �Է����ּ���.");
		num = sc.nextInt();
		
		temp = num; // ���� �ӽ�����
		
		// ���밪 ���ϱ�
		if(temp < 0) {
			temp = -temp;
		}
		
		len = 1;
		while(temp >= 10) {
			len++;
			temp /= 10;
		}
		
		System.out.println(num + " , " + len);
		
		sc.close();
		
		
	}

}
