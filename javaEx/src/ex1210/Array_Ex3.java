package ex1210;

/* ��¥ : 2018.12.10
 * ���� : Array(�迭) �׽�Ʈ
 * ��Ÿ : 
 * */
public class Array_Ex3 {

	public static void main(String[] args) {
		int []a = new int[5]; // ������ �迭 ����� �޸� �Ҵ��� ���ÿ�
		
		for (int i = 0; i < a.length; i++) {
			a[i] = (i+1) * 2;
		}
		
		// 1)
		/*for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}*/
		
		// 2) n������ for���� �ȿ����� ��밡��
		for (int n : a) { // ���� for�� (JDK5.0)
			System.out.println(n);
		}
		
	}

}
