package ex1218;

/* ��¥ : 2018.12.18
 * ���� : ���� Ŭ���� (Sub class) 
 * ��Ÿ :  
 * */

class A {
	private int x = 10;
	protected int y = 20;
	public int z = 30;
	
	public void disp() {
		System.out.println(x + " : " + y + " : " + z);
	}
}

class B extends A {
	int a = 100;
	public void write() {
		System.out.print("a : " + a + ", ");
		System.out.print("y : " + y + ", ");
		System.out.print("z : " + z); 
		System.out.println();
		//System.out.println("x : " + x); // [������ ����] class x ������ private��������� �Ǿ��־ �ٸ� Ŭ�������� ��� �Ұ�
	}
	
	public void sub() {
		disp();
	}
}

public class Test {

	public static void main(String[] args) {
		B ob = new B(); // ��ü ����
		ob.write(); // a : 100, y : 20, z : 30
		ob.disp(); // [���] 10 : 20 : 30
		System.out.println(ob.z); // [���] 30
	}

}
