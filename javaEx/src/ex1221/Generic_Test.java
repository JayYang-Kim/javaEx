package ex1221;

/* ��¥ : 2018.12.21
 * ���� : ���׸� (Generics)
 * ��Ÿ : 
 * */

class Test1 {
	private Object obj;
	
	public void set(Object obj) {
		this.obj = obj;
	}
	
	public Object get() {
		return obj;
	}
}

public class Generic_Test {

	public static void main(String[] args) {
		Test1 oo = new Test1();
		
		oo.set("korea"); // [��ĳ����]
		
		String s = (String)(oo.get()); // [�ٿ�ĳ����]
		System.out.println(s.length());
		
		/*oo.set(100); // [��ĳ����]
		
		s = (String)(oo.get()); // [�ٿ�ĳ����] 
		System.out.println(s.length()); // [��Ÿ�� ����] java.lang.ClassCastException*/
		
		/*Object[] o = {"korea","seoul", new Integer(30)};
		Arrays.sort(o); // [��Ÿ�� ����]*/	
	}

}
