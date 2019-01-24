package ex1213;

/* ��¥ : 2018.12.12
 * ���� : ������ ���� (Varargs, �����μ�)
 * ��Ÿ : 
 * */

class Ex6 {
	// ������ ����
	// ������ ���ڴ� ���������� �迭�� ó�� ���������ڴ� ������ �ѹ���
	public int sum(int ...a) { // ���������� �迭�� ó��
		int s = 0;
		for (int i = 0; i < a.length; i++) {
			s += a[i];
		}
		
		return s;
	}
}

public class Method_Ex6 {
	public static void main(String[] args) {
		Ex6 oo = new Ex6();
		int s;
		
		s = oo.sum(1,2,3,4,5);
		System.out.println(s);
		
		s = oo.sum(1,3,5);
		System.out.println(s);
	}

}
