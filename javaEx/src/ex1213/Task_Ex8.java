package ex1213;

/* ��¥ : 2018.12.13
 * ���� : Ŭ������ ��ü ���� - �޼ҵ�
 * ��Ÿ : ��� ȣ��(Recursive call)
 *      - �޼ҵ� ������ �޼ҵ� �ڱ� �ڽ��� ȣ���ϴ� ����� ��� ȣ���̶��ϰ� �̷��� Ư¡�� ���(�Ǻθ�)�� �Ѵ�.
 *      - ó���ӵ��� �ݺ��� ���� ������ ��ȿ�����̴�.
 *      - ��� ȣ���� ���� ������ �� �� ���� �ݺ��Ѵ�.
 *      - ���� �ݺ��Ǵ� ��� ȣ���� ������ StackOverflowError������ ����
 * */

// Ŭ����
class Task8 {
	public void print(int n) {
		if (n > 1) {
			print (n - 1); // �޼ҵ� ������ �޼ҵ� �ڱ� �ڽ��� ȣ���ϴ� ����� ��� ȣ��(Recursive call)�̶� �Ѵ�.
		}
		
		System.out.println(n);
	}
}

// Ŭ����
public class Task_Ex8 {
	
	public static void main(String[] args) {
		Ex2 oo = new Ex2();
		oo.print(5);
	}
	
}