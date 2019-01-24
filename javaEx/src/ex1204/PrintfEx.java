package ex1204;

/* ��¥ : 2018.12.04
 * ���� : Printf �׽�Ʈ (�ڷ��� ���)
 * ��Ÿ : printf (������ �����Ͽ� ���)
 *         method (printf = format)
 *         %d�� ������ Ÿ�Ը� ��°���
 *         %c�� ���ڸ� ��°���
 *         %h,x�� 16���� ��ȯ
 *         %o�� 8���� ��ȯ
 *         %s�� ���ڿ�
 * */
public class PrintfEx {

	public static void main(String[] args) {
		// ���Ŀ� ���� ���
		float a = 3.141592f;
		
		System.out.println(a); // �� : 3.141592

		System.out.printf("%.2f\n", a); // �� : 3.14, \n (���� �ѱ��) = %n (����)
		System.out.println("seoul");
		
		//System.out.printf("%d\n", 'A'); // [��Ÿ�� ����]
		
		System.out.printf("%d %c %d\n", 65, 66, 67); // �� : 65 B 67
		
		System.out.printf("%d %d\n", 65, 66); // �� : 65 66
		
		//System.out.printf("%d %d %d\n", 65, 66); // [��Ÿ�� ����] 
		
		System.out.printf("%c %c %1$c", 'A', 'B');
	}

}
