package ex1221;

/* ��¥ : 2018.12.21
 * ���� : ���׸� (Generics)
 * ��Ÿ : 
 * */

class Test4<T, U> {
	private T t;
	private U u;
	
	public void set(T t, U u) {
		this.t = t;
		this.u = u;
	}
	
	public void print() {
		System.out.println(t.getClass().getName()); // ���׸� �ڷ��� Ȯ��
		System.out.println(u.getClass().getName()); // ���׸� �ڷ��� Ȯ��
	}
}

public class Generic_Test4 {

	public static void main(String[] args) {
		Test4<String, Integer> t1 = new Test4<>();
		
		t1.set("korea", 1000);
		t1.print();
	}

}
