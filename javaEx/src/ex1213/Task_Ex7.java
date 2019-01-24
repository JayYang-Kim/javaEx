package ex1213;

/* ��¥ : 2018.12.13
 * ���� : Ŭ������ ��ü ���� - �޼ҵ�
 * ��Ÿ : 
 * */

// Ŭ����
class Task7 {
	int a = 10;
	
	public void sub1(int x) { // x ���ĸŰ�����
		x = 10;
	}
	
	public void sub2(Task7 e) {
		System.out.println("sub2 : " + e.a); // [���] 5
		
		e.a = 100;
		System.out.println("sub2 : ==>" + e.a); // [���] 100
	}
	
	public void sub(int[] n) {
		n[1] = 70;
	}
}

// Ŭ����
public class Task_Ex7 {
	
	public static void main(String[] args) {
		Task7 oo = new Task7();
		
		int n = 5;
		
		oo.sub1(n); // n �ǸŰ����� (Call by value)
		System.out.println(n); // [���] 5
		
		System.out.println("main : " + oo.a); // [���] 10
		oo.a = 5;
		System.out.println("main : " + oo.a); // [���] 5
		oo.sub2(oo); // Call by reference
		System.out.println("main : " + oo.a); // [���] 100
		
		int []a = new int[] {10, 20, 30};
		System.out.println(a[1]); // [���] 20
		
		oo.sub(a);
		System.out.println(a[1]); // [���] 70
	}
	
}