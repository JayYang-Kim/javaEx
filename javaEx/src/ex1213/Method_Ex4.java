package ex1213;

/* ��¥ : 2018.12.12
 * ���� : �޼ҵ� �����ε� (Method Overloading) / �ߺ�����
 * ��Ÿ : �Ű������� ������ �ٸ��ų� �Ű������� Ÿ���� �ٸ� ��� ����
 * */

class Ex4 {
	public void sub() {
		System.out.println("���� ���� �޼ҵ�");
	}
	
	/*public int sub() { // [������ ����] ����Ÿ���� �����ε��� ������ �ƴ�.
		return 1;
	}*/
	
	public void sub(int n) {
		System.out.println("int");
	}
	
	public void sub(int n, int s) {
		System.out.println("int, int");
	}
	
	public void sub(short n) {
		System.out.println("short");
	}
}

public class Method_Ex4 {
	public static void main(String[] args) {
		Ex4 ob = new Ex4();
		byte b = 10;
		
		// �޼ҵ� �̸��� ���� ��� �Ű������� Ÿ���� ���� ����� Ÿ�Կ� ���� �ȴ�.
		ob.sub(b);
	}

}
