package ex1213;

/* ��¥ : 2018.12.12
 * ���� : �޼ҵ� �����ε� (Method Overloading) / �ߺ�����
 * ��Ÿ : �Ű������� ������ �ٸ��ų� �Ű������� Ÿ���� �ٸ� ��� ����
 * */

class Ex5 {
	public void sub(int i) { // Integer (int�� �����Ǵ� Class)
		System.out.println("int");
	}
	
	public void sub(Short i) { // short, Short(short�� �����Ǵ� Class)
		System.out.println("short");
	}
	
	public void sub(Long i) { // long, Long(long�� �����Ǵ� Class)
		System.out.println("long");
	}
}

public class Method_Ex5 {
	public static void main(String[] args) {
		Ex5 oo = new Ex5();
		
		byte b = 10; // ���� ���ε�
		long c = 10; // ���� ���ε� 
		
		oo.sub(b); // [���] int / �ڷ����� ũ�ų� ���� �⺻ �ڷ����� ���� ����� �ڷ��� ȣ�� (���� ���ε�)
		oo.sub(c); // [���] long / ũ�ų� ���� �⺻ �ڷ����� ���� ��� �⺻ �ڷ����� �����Ǵ� Ŭ���� (���� ���ε�)
	}

}
