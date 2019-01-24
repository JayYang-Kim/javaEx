package ex1213;

/* ��¥ : 2018.12.12
 * ���� : ������ (Constructor) 
 * ��Ÿ : �����ڴ� �ߺ� ���ǰ� �����ϴ�. 
 *      �̸��� �����ϸ� �Ű������� �ٸ� ��� ����
 * */

class Task13 {
	private int n;
	
	// �����ڴ� �ߺ� ���ǰ� �����ϴ�.
	public Task13() {
		System.out.println("���ڰ� ���� ������");
		n = 10;
	}
	
	public Task13(int a) {
		System.out.println("���ڰ� �ִ� ������");
		n = a;
	}
	
	public void write() {
		System.out.println(n);
	}
}

public class Task_Ex13 {

	public static void main(String[] args) {
		Task13 t1 = new Task13(); // ���ڰ� ���� ������ ȣ��
		Task13 t2 = new Task13(13); // ���ڰ� �ִ� ������ ȣ��
		
		t1.write(); // [���] 10
		t2.write(); // [���] 13
	}

}
