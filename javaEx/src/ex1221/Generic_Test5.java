package ex1221;

/* ��¥ : 2018.12.21
 * ���� : ���׸� (Generics)
 * ��Ÿ : ���׸� �޼ҵ�
 * */

class Test5 {
	public <U> void print(U u) {
		System.out.println(u.getClass()); // ���׸� �ڷ��� Ȯ��
	}
	
	public <U> U method(U u) {
		System.out.println(u.getClass());
		
		return u;
	}
}

public class Generic_Test5 {

	public static void main(String[] args) {
		Test5 oo = new Test5();
		
		oo.print("seoul");
		oo.print(50);
		
		String s = oo.method("korea");
		System.out.println(s.length());
	}

}
