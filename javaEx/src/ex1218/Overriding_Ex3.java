package ex1218;

/* ��¥ : 2018.12.18
 * ���� : �޼ҵ� �������̵�(Method Overriding)
 * ��Ÿ :  
 * */

class Test8 {
	String name;
	int score;
	
	public Test8() {
		
	}
	
	public Test8(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	public void print() {
		System.out.println(name + " : " + score);
	}
}

public class Overriding_Ex3 {

	public static void main(String[] args) {
		Test8 t1 = new Test8("java", 80);
		Test8 t2 = new Test8("java", 80);
		
		System.out.println(t1 == t2); // [���] false (�ּ� ��)
		System.out.println(t1.equals(t2)); // [���] false (�ּ� ��)
		
		System.out.println(t1); // [���] Ŭ������@�ؽ��ڵ�
		System.out.println(t1.toString()); // [���] Ŭ������@�ؽ��ڵ�
	}
}
