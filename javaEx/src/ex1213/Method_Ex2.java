package ex1213;

/* ��¥ : 2018.12.12
 * ���� : ��� ȣ�� (Recursive call)
 * ��Ÿ : 
 * */

class Ex2 {
	public void print(int n) {
		if (n > 1) {
			print (n - 1); // �޼ҵ� ������ �޼ҵ� �ڱ� �ڽ��� ȣ���ϴ� ����� ��� ȣ��(Recursive call)�̶� �Ѵ�.
		}
		
		System.out.println(n);
	}
}

public class Method_Ex2 {

	public static void main(String[] args) {
		Ex2 oo = new Ex2();
		oo.print(5);
	}

}
