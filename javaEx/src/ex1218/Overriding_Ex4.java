package ex1218;

/* ��¥ : 2018.12.18
 * ���� : �޼ҵ� �������̵�(Method Overriding)
 * ��Ÿ :  
 * */

class Test9 {
	String name;
	int score;
	
	public Test9() {
		
	}
	
	public Test9(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	public void print() {
		System.out.println(name + " : " + score);
	}

	@Override
	public boolean equals(Object obj) { // (Object obj) Up casting
		//System.out.println(//obj.name); // [������ ����]
		//String s = (Test9)obj.name; // [������ ����] obj.name�� Test9���� �ٿ� ĳ���� �Ѵ�.
		                              // ������ �켱������ ()���� .�� �� ����.
		
		String s = ((Test9)obj).name;
		//System.out.println(s);
		
		
		Test9 t = (Test9)obj; // Down casting (Up casting�� �͸� ����)
		// name => this.name // t1�� name
		//System.out.println(t.name);
		
		return this.name.equals(t.name) && this.score == t.score;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + " : " + score;
	}
}

public class Overriding_Ex4 {

	public static void main(String[] args) {
		Test9 t1 = new Test9("java", 80);
		Test9 t2 = new Test9("java", 80);
		
		System.out.println(t1 == t2); // [���] false
		System.out.println("equals = " + t1.equals(t2)); // [���] false
		
		System.out.println(t1); // [���] Ŭ������@�ؽ��ڵ�
		System.out.println("toString = " + t1.toString()); // [���] Ŭ������@�ؽ��ڵ�
	}
}