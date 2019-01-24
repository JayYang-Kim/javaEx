package ex1213;

/* 날짜 : 2018.12.12
 * 내용 : 재귀 호출 (Recursive call)
 * 기타 : 
 * */

class Ex2 {
	public void print(int n) {
		if (n > 1) {
			print (n - 1); // 메소드 내에서 메소드 자기 자신을 호출하는 방식을 재귀 호출(Recursive call)이라 한다.
		}
		
		System.out.println(n);
	}
}

public class Method_Ex2 {

	public static void main(String[] args) {
		Ex2 oo = new Ex2();
		oo.print(5);
	}

}
