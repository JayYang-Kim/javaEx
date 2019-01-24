package ex1213;

/* 날짜 : 2018.12.13
 * 내용 : 클래스와 객체 정리 - 메소드
 * 기타 : 재귀 호출(Recursive call)
 *      - 메소드 내에서 메소드 자기 자신을 호출하는 방식을 재귀 호출이라하고 이러한 특징을 재귀(되부름)라 한다.
 *      - 처리속도가 반복문 보다 느려서 비효율적이다.
 *      - 재귀 호출은 종료 조건이 될 때 까지 반복한다.
 *      - 무한 반복되는 재귀 호출은 에러를 StackOverflowError에러를 유발
 * */

// 클래스
class Task8 {
	public void print(int n) {
		if (n > 1) {
			print (n - 1); // 메소드 내에서 메소드 자기 자신을 호출하는 방식을 재귀 호출(Recursive call)이라 한다.
		}
		
		System.out.println(n);
	}
}

// 클래스
public class Task_Ex8 {
	
	public static void main(String[] args) {
		Ex2 oo = new Ex2();
		oo.print(5);
	}
	
}