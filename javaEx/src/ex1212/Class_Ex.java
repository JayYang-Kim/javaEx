package ex1212;

/* 날짜 : 2018.12.12
 * 내용 : Class 테스트
 * 기타 : 추상화) 데이터 :가로, 세로
 *            기능 : 넓이, 둘레
 * */

public class Class_Ex {

	public static void main(String[] args) {
		// 객체 생성
		//Rect a; // a란 변수만 생성
		Rect a = new Rect(); // 객체 생성
		
		a.width = 10;
		a.height = 10;
		
		System.out.println(a.area());
		
		a.width = 20;
		a.height = 20;
		
		System.out.println(a.area());
	}

}
