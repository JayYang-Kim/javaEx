package ex1210;

/* ��¥ : 2018.12.10
 * ���� : Array(�迭) �׽�Ʈ
 * ��Ÿ : 
 * */
public class Array_Ex5 {

	public static void main(String[] args) {
		int []a = new int[3]; // ������ �迭 ����� �޸� �Ҵ��� ���ÿ�
		
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		
		int []b = a; // a�� b ���������� �ϳ��� �迭�� ����
		
		for(int n = 0; n < a.length; n++) {
			System.out.printf("a[%d] = %d\n", n, a[n]);
		}
		System.out.println("--------------------------------------------------");
		
		for(int n = 0; n < a.length; n++) {
			System.out.printf("b[%d] = %d\n", n, b[n]);
		}
		System.out.println("--------------------------------------------------");
		
		b[1] = 50;

		for(int n = 0; n < a.length; n++) {
			System.out.printf("a[%d] = %d\n", n, a[n]);
		}
		System.out.println("--------------------------------------------------");
		
		for(int n = 0; n < a.length; n++) {
			System.out.printf("b[%d] = %d\n", n, b[n]);
		}
		System.out.println("--------------------------------------------------");	
	}

}
