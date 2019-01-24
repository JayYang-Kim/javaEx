package ex1213;

/* ��¥ : 2018.12.13
 * ���� : ������ ���� (Varargs, �����μ�)
 * ��Ÿ : 
 * */

// Ŭ����
class Task10 {
	// ������ ����
	// ������ ���ڴ� ���������� �迭�� ó�� ���������ڴ� ������ �ѹ���
	public int sum(int... a) { // ���������� �迭�� ó��
		int s = 0;
		for (int i = 0; i < a.length; i++) {
			s += a[i];
		}

		return s;
	}
}

// Ŭ����
public class Task_Ex10 {

	public static void main(String[] args) {
		Task10 oo = new Task10();
		int s;
		
		s = oo.sum(1,2,3,4,5);
		System.out.println(s);
		
		s = oo.sum(1,3,5);
		System.out.println(s);
	}

}