package ex1221;

/* ��¥ : 2018.12.21
 * ���� : ���׸� (Generics)
 * ��Ÿ : ���ѵ� Ÿ�� �Ķ����
 * */

class Test3<T extends Number> {
	private T t;
	
	public void set(T t) {
		this.t = t;
	}
	
	public T get() {
		System.out.println(t.getClass().getName()); // ���׸� �ڷ��� Ȯ��
		return t;
	}
}

public class Generic_Test3 {

	public static void main(String[] args) {
		Test3<Integer> t1 = new Test3<>();
		System.out.println(t1.get());
		
		//Test3<String> t2 = new Test3<>(); // [������ ����] Number�� ������ ����
	}

}
