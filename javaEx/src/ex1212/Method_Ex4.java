package ex1212;

/* ��¥ : 2018.12.12
 * ���� : �޼ҵ� (Method)
 * ��Ÿ : 
 * */

class Ex4 {
	int a = 10;
	public void sub1(int x) { // x ���ĸŰ�����
		x = 10;
	}
	
	public void sub2(Ex4 e) {
		System.out.println("sub2 : " + e.a); // [���] 5
		
		e.a = 100;
		System.out.println("sub2 : ==>" + e.a); // [���] 100
	}
}

public class Method_Ex4 {
	public static void main(String[] args) {
		Ex4 oo = new Ex4();
		
		int n = 5;
		
		oo.sub1(n); // n �ǸŰ����� (Call by value)
		System.out.println(n); // [���] 5
		
		System.out.println("main : " + oo.a); // [���] 10
		oo.a = 5;
		System.out.println("main : " + oo.a); // [���] 5
		oo.sub2(oo); // Call by reference
		System.out.println("main : " + oo.a); // [���] 100
	}
}
