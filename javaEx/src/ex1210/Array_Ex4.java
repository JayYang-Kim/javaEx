package ex1210;

/* ��¥ : 2018.12.10
 * ���� : Array(�迭) �׽�Ʈ
 * ��Ÿ : 
 * */
public class Array_Ex4 {

	public static void main(String[] args) {
		int []a = new int[3]; // ������ �迭 ����� �޸� �Ҵ��� ���ÿ�
		
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		
		for(int n = 0; n < a.length; n++) {
			System.out.printf("a[%d] = %d\n", n, a[n]);
		}
		
		System.out.println("====================");
		
		a = new int[5]; // �迭�� ũ�⸦ �����ϸ� ���� �迭�� ������ �÷��� (garbage collector)�� ����� �ȴ�.
						// garbage collector�� �����ϴ� �޸� ó���� �����ϴ����� �˼�����.
		for(int n = 0; n < a.length; n++) {
			System.out.printf("a[%d] = %d\n", n, a[0]);
		}
		
		System.out.println();
	}

}
