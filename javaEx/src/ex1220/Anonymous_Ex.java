package ex1220;

/* ��¥ : 2018.12.20
 * ���� : Inner class (���� Ŭ����)
 * ��Ÿ : �͸� Ŭ���� (Anonymous class) 
 * */

interface Test11 {
	public void print();
}

class Ex11 {
	public Object getAnonymous() {
		return new Object() {

			@Override
			public String toString() {
				return "test";
			}
			
		};
	}
	
	public void method() {
		System.out.println(getAnonymous());
	}
	
	public void sub() {
		//Test11 t = new Test11(); // [������ ����] interface�� ��ü ���� �Ұ�
		
		Test11 t = new Test11() {

			@Override
			public void print() {
				System.out.println("aaa");
			}
			
		};
		
		t.print();
	}
}

public class Anonymous_Ex {

	public static void main(String[] args) {
		Ex11 ob = new Ex11();
		ob.method();
	}

}
