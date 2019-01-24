package ex1221;

/* 날짜 : 2018.12.21
 * 내용 : 예외 (Exception) 처리
 * 기타 : unchecked 예외
 * */

class Ex10 {
	private int num;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		if (num < 0) {
			throw new RuntimeException("음수는 입력이 불가능합니다."); // unchecked 예외 발생
		}
		
		this.num = num;
	}
}

public class Exception_Ex10 {

	public static void main(String[] args) {
		Ex10 ee = new Ex10();
		
		try {
			ee.setNum(-5);
			System.out.println(ee.getNum());
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		System.out.println("종료");
	}

}
