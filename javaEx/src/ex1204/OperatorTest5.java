package ex1204;

import java.util.Scanner;

/* ��¥ : 2018.12.04
 * ���� : ���� 5) ü�߰� Ű�� �Է� �޾� BMI(ü��������)�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 		   
 * ��Ÿ : 
 * */
public class OperatorTest5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double a, b, c;
		
		System.out.println("ü���� �Է����ּ���.");
		a = sc.nextDouble(); // ü�� �Է�
		System.out.println("Ű�� �Է����ּ���.");
		b = sc.nextDouble(); // Ű �Է�
		
		c = b / 100; // Ű cm -> m ��ȯ
		
		System.out.printf("ü�� : %.2fkg\n", a);
		System.out.printf("Ű : %.2fm\n", c);
		System.out.printf("BMI : %.1f", a / (c * c)); // BMI = ü�� / (Űm * Űm)
		
		sc.close();
	}

}
