package ex1204;

/* ��¥ : 2018.12.04
 * ���� : �Ǽ� �ڷ��� �׽�Ʈ
 * ��Ÿ : ���� ����� ���� ASCll �ڵ� ��
 *		   'A' : 65, 'Z' : 90, 'a' : 97, 'z' : 122, '0' : 48, '9' : 57, [Enter] : 13 or 10 (2byte), [ESC] : 27, \n : 10
 * */
public class Test2 {

	public static void main(String[] args) {
		// �Ǽ� ���� ������ Ÿ��
		// float : ���������Ǽ�, double : ���������Ǽ�
		float f1 = 10; // ������ float ������ ����. �ڵ����� 10.0f�� ��ȯ�Ǿ� ����
		//float f2 = 0.5; // [������ ����] 0.5�� �������� �Ǽ��̹Ƿ� float�� ���� �Ұ���
		float f2 = 0.5f;
		float f3 = 1.2e04f;
		float f4, f5;
		f4 = 'A'; // 65
		
		double d1 = 0.5;
		double d2 = 3.14d;
		double d3 = 1.2e04;
		
		//f5 = d1; // [������ ����] ���� �ڷ����� ū �ڷ����� ���� �Ұ��� (float < double)
		f5 = (float)d1; // ������ �ڷ��� ��ȯ
		
		System.out.println("f1 : " + f1 + ", " + " f2 : " + f2 + ", " +  " f3 : " + f3 + ", " +  " f4 : " + f4 + ", " +  " f5 : " + f5);
		System.out.println("d1 : " + d1 + ", " +  " d2 : " + d2 + ", " +  " d3 : " + d3);
		
		f1 = 2000000000;
		f2 = 2000000050; // float�� ���е��� ���� 2000000000�� ����� 
		
		System.out.println("f1 : " + f1 + ", " +  " f2 : " + f2); // ��� : f1 : 2.0e9, f2 : 2.0e9
		
		d1 = 2000000000;
		d2 = 2000000050; 
		
		System.out.println("d1 : " + d1 + ", " +  " d2 : " + d2);
	}

}
