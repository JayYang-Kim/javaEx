package ex1220;

/* 날짜 : 2018.12.20
 * 내용 : Inner class (내부 클래스)
 * 기타 : 익명 클래스 (Anonymous class) 
 * */

class Button {
	// 중첩(내부) 인터페이스
	// Listener : 이벤트가 발생했을때 이벤트를 처리
	public interface OnclickListener {
		public void onClick();
	}
}

public class Anonymous_Ex2 {

	public static void main(String[] args) {
		Button.OnclickListener ob = new Button.OnclickListener() {
			
			@Override
			public void onClick() {
				System.out.println("뭐하려고 눌러");
			}
			
		};
		
		ob.onClick();
	}

}
