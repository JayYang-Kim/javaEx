package ex1221;

/* 날짜 : 2018.12.21
 * 내용 : 제네릭 (Generics)
 * 기타 : 
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
		
		oo.set("korea"); // [업캐스팅]
		
		String s = (String)(oo.get()); // [다운캐스팅]
		System.out.println(s.length());
		
		/*oo.set(100); // [업캐스팅]
		
		s = (String)(oo.get()); // [다운캐스팅] 
		System.out.println(s.length()); // [런타임 오류] java.lang.ClassCastException*/
		
		/*Object[] o = {"korea","seoul", new Integer(30)};
		Arrays.sort(o); // [런타임 오류]*/	
	}

}
