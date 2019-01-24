package ex1213;

/* ��¥ : 2018.12.13
 * ���� : Ŭ������ ��ü ���� - �޼ҵ�
 * ��Ÿ : �����ε�(Method Overloading), ���ε�(Binding)
 *      �Ű������� ������ �ٸ��ų� �Ű������� Ÿ���� �ٸ� ��� ����
 * */

// Ŭ����
class Task9 {
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
	
	public void sub2(int i) { // Integer (int�� �����Ǵ� Class)
		System.out.println("int");
	}
	
	public void sub2(Short i) { // short, Short(short�� �����Ǵ� Class)
		System.out.println("short");
	}
	
	public void sub2(Long i) { // long, Long(long�� �����Ǵ� Class)
		System.out.println("long");
	}
}

// Ŭ����
public class Task_Ex9 {
	
	public static void main(String[] args) {
		Task9 ob = new Task9();
		byte b = 10;
		
		// �޼ҵ� �̸��� ���� ��� �Ű������� Ÿ���� ���� ����� Ÿ�Կ� ���� �ȴ�.
		ob.sub(b);
		
		byte c = 10; // ���� ���ε�
		long f = 10; // ���� ���ε�

		ob.sub2(c); // [���] int / �ڷ����� ũ�ų� ���� �⺻ �ڷ����� ���� ����� �ڷ��� ȣ�� (���� ���ε�)
		ob.sub2(f); // [���] long / ũ�ų� ���� �⺻ �ڷ����� ���� ��� �⺻ �ڷ����� �����Ǵ� Ŭ���� (���� ���ε�)
	}
	
}