package ex1210;

/* ��¥ : 2018.12.10
 * ���� : Array(�迭) �׽�Ʈ
 * ��Ÿ : 
 * */
public class Array_Ex2 {

	public static void main(String[] args) {
		int []a = new int[5]; // ������ �迭 ����� �޸� �Ҵ��� ���ÿ�
		
		// �迭�� �� ��� �����Ͽ� ��� ����
		a[0] = 2;
		a[1] = 4;
		a[3] = 6;
		
		//a[5] = 10; // [��Ÿ�� ����] �迭�� ÷�� ��ġ�� ��� (ArrayIndexOutOfBoundsException)
		
		for(int i = 0; i < a.length; i++) {
			System.out.printf("a[%d] = %d\n", i, a[i]);
		}
		
		System.out.println();
	}

}
