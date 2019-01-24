package ex1221;

/* ��¥ : 2018.12.21
 * ���� : ���׸� (Generics)
 * ��Ÿ : ���׸� �޼ҵ�
 * */

class Test6<T> {
	private T t;
	
	public void set(T t) {
		this.t = t;
	}
	
	public T get() {
		System.out.println(t.getClass());
		
		return t;
	}
}

public class Generic_Test6 {

	public static void main(String[] args) {
		Test6<Number> t1 = new Test6<>();
		t1.set(new Integer(10));
		
		Number nn = new Integer(10); // [��ĳ����]
		System.out.println(nn);
		
		Test6<Number> n1;
		Test6<Integer> n2 = new Test6<>();
		
		//n1 = n2; // [������ ����]
	}

}
