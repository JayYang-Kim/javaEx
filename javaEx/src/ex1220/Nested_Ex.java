package ex1220;

/* ��¥ : 2018.12.20
 * ���� : Nested Class (��ø Ŭ����)
 * ��Ÿ : static ��ø Ŭ���� 
 * */

// Ŭ���� ���ϸ� : Ex8$Test.class (�ܺ�Ŭ������$��øŬ������.class)
class Ex8 {
	static int a = 10;
	int b = 20;
	
	// static ��ø Ŭ���� (static nested class)
	// �ܺ� Ŭ���� ��ü�� �������� �ʰ� �ܺο��� ��ü�� �����Ͽ� ����� �� �ִ�. 
	public static class Test {
		int c = 30;
		
		// �޼ҵ�
		public void write() {
			//System.out.println(b); // [������ ����] �ܺ� Ŭ������ �ν��Ͻ� ������ �޼ҵ� ���� �Ұ�
			System.out.println(a); // Ŭ���� ������ ���� ����
			System.out.println(c);
			
			Ex8 ex = new Ex8();
			System.out.println(ex.b);
			
		}
	}
	
	public void print() {
		Test t = new Test();
		System.out.println(t.c);
		System.out.println(Ex8.a);
	}
}

public class Nested_Ex {

	public static void main(String[] args) {
		Ex8 ee = new Ex8();
		ee.print();
		
		//Test tt = new Test(); // [������ ����]
		
		// static ��ø Ŭ������ �ܺ� Ŭ������ ��ü ������ ������� �ܵ����� ��ü�� �����Ѵ�.
		Ex8.Test tt = new Ex8.Test();
		tt.write();
		
		//Ex8.Test tt2 = ee.new Test(); // [������ ����]
	}

}
