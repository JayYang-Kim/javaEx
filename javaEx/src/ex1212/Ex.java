package ex1212;

/* 날짜 : 2018.12.12
 * 내용 : Class 접근 권한 테스트
 * 기타 : 
 * */

public class Ex {

	public static void main(String[] args) {
		Rect ob = new Rect();
		
		ob.width = 10;
		ob.height = 10;
		
		System.out.println(ob.len());
	}

}
