package ex1221;

/* ��¥ : 2018.12.21
 * ���� : ���׸� (Generics)
 * ��Ÿ : 
 * */

class Test2<T> {
	private T t;
	
	public void set(T t) {
		this.t = t;
	}
	
	public T get() {
		System.out.println(t.getClass()); // ���׸� �ڷ��� Ȯ��
		return t;
	}
}

public class Generic_Test2 {

	public static void main(String[] args) {
		//Test2<String> t1 = new Test2<String>();
		Test2<String> t1 = new Test2<>();
		
		t1.set("korea");
		//t1.set(100); // [������ ����]
		
		String s = t1.get();
		System.out.println(s.length());
		
		Test2<Integer> t2 = new Test2<>();
		t2.set(100);
		int a = t2.get();
		System.out.println(a);
		
		/*Test2 t3 = new Test2(); // ���׸��� ������µ� ������� �ʾƼ� [���]
		t3.set("aaa");
		
		s = (String)(t3.get());
		System.out.println(s.length());*/
	}

}
