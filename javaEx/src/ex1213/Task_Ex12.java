package ex1213;

/* ��¥ : 2018.12.12
 * ���� : ������ (Constructor) 
 * ��Ÿ : �����ڰ� Ŭ������ ���� ��� �����Ϸ��� ���ڰ� ���� ����Ʈ �����ڸ� ����� �ش�.
 *      �����ڰ� ������ ����Ʈ �����ڸ� ������ �ʴ´�.
 * */

class Task12 {
	// �ʵ�
	private int n;
	
	// ������
	public Task12(int a) {
		System.out.println("���ڰ� �ִ� ������");
		n = a;
	}
	
	public void write() {
		System.out.println(n);
	}
}

public class Task_Ex12 {

	public static void main(String[] args) {
		//Task12 t = new Task12(); // [������ ����] ���ڰ� ���� �����ڰ� �����Ƿ� ����
		Task12 t = new Task12(10);
		
		t.write();
	}

}
