package ex1213;

/* 날짜 : 2018.12.12
 * 내용 : 생성자 (Constructor) 
 * 기타 : 생성자는 중복 정의가 가능하다. 
 *      이름은 동일하며 매개변수가 다를 경우 가능
 * */

class Task13 {
	private int n;
	
	// 생성자는 중복 정의가 가능하다.
	public Task13() {
		System.out.println("인자가 없는 생성자");
		n = 10;
	}
	
	public Task13(int a) {
		System.out.println("인자가 있는 생성자");
		n = a;
	}
	
	public void write() {
		System.out.println(n);
	}
}

public class Task_Ex13 {

	public static void main(String[] args) {
		Task13 t1 = new Task13(); // 인자가 없는 생성자 호출
		Task13 t2 = new Task13(13); // 인자가 있는 생성자 호출
		
		t1.write(); // [결과] 10
		t2.write(); // [결과] 13
	}

}
