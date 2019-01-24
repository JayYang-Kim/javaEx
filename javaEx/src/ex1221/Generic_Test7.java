package ex1221;

/* ��¥ : 2018.12.21
 * ���� : ���׸� (Generics)
 * ��Ÿ : ���ϵ� ī��
 * */

class Test7<T> {
	private T t;
	
	public void set(T t) {
		this.t = t;
	}
	
	public T get() {
		System.out.println(t.getClass());
		
		return t;
	}
	
	public void print() {
		System.out.println(t);
	}
}

public class Generic_Test7 {

	public static void main(String[] args) {
		Test7<Integer> t = new Test7<>();
		t.set(100);
		
		//Test7<Number> n = t; // [������ ����] ��� ���谡 �ƴ�
		Test7<?> t2 = t; // [���ϵ� ī��] <?> Ÿ���� �������� ���� ����
		                 // <?> : List�� Size(), clear()��� ��ü���� �ڷ����� �ʿ���� ��� ���ȴ�.
		
		//t2.set(10); // [������ ����] <?>�� Ÿ�� ������ �ȵ� ����
		//((Test7<Integer>)t2).set(20); // [���]
		
		t2.print(); // [����] T�� ���������� �����Ƿ� ��� ����
	}

}
