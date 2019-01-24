package ex1219;

/* ��¥ : 2018.12.19
 * ���� : Singleton Pattern
 * ��Ÿ : �ش� Ŭ������ �ν��Ͻ��� �ϳ��� ���������, ��𼭵��� �� �ν��ͽ��� ������ �� �ֵ��� �� ����
 *      �ڹٿ����� �����ڸ� private�� �����ϰ�, �ش� Ŭ������ �ν��Ͻ��� �����ϱ� ���� public �޼ҵ带 �����ϴ� ������� �̱��� ������ ������ �� �ִ�.
 * */

// Singleton
class Ex2 {
	private static Ex2 ob;
	private int a = 10;
	
	private Ex2() {
		
	}
	
	public static synchronized Ex2 getInstance() { // synchronized : ����ȭ 
		if (ob == null) {
			ob = new Ex2();
		}
		
		return ob;
	}
	
	public void print() {
		System.out.println(a);
	}
}

public class SingletonPattern_Ex {

	public static void main(String[] args) {
		//Ex2 e = new Ex2(); // [������ ����] �����ڰ� private�� ��� �ܺο��� ��ü ���� �Ұ���
		
		Ex2 e = Ex2.getInstance();
		Ex2 e2 = Ex2.getInstance();
		
		if (e == e2) {
			System.out.println("���� ��ü �Դϴ�.");
		}
	}

}
