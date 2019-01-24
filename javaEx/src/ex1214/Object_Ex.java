package ex1214;

/* ��¥ : 2018.12.14
 * ���� : �ڹ��� �⺻ API Ŭ���� - ��ü(Object)
 * ��Ÿ : 
 * */

class Ex2 {
	// object Ŭ������ ��� ����
	// object : �ڹ��� �ֻ��� Ŭ����
	private int a = 10;
	private int b = 20;
	
	public void sub() {
		System.out.println(a + " : " + b);
	}
}

public class Object_Ex {
	// object Ŭ������ ��� ����
	public static void main(String[] args) {
		Ex2 t1 = new Ex2();
		Ex2 t2 = new Ex2();
		
		// toString()
		// Ŭ�����̸�@�ؽ��ڵ尪
		// �������� �ڽ��� ������ ������ �� �ִ�.
		System.out.println(t1.toString()); // [���] Ŭ�����̸�@�ؽ��ڵ尪
		System.out.println(t2); // [���] Ŭ�����̸�@�ؽ��ڵ尪
		
		// equals()
		// �ּҺ�
		System.out.println(t1.equals(t2)); // [���] false
		System.out.println(t1 == t2); // [���] false
		
		// hashCode()
		// JVM���� ��ü�� ������ �˻��ϱ� ���Ͽ� ���
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
	}

}
