package ex1221;

/* 날짜 : 2018.12.21
 * 내용 : 예외 (Exception) 처리
 * 기타 : 예외 클래스 생성
 * */

// 사용자 예외 클래스 만들기
// Serial Version ID : 해당되는 객체를 찾기위한 번호
class MyException extends Exception { // Exception super class를 상속 받음

	private static final long serialVersionUID = 1L;
	
	public MyException(String msg) {
		super(msg); // super 클래스의 생성자를 호출
	}
}

class Ex11 {
	private int num;

	public int getNum() {
		return num;
	}

	public void setNum(int num) throws MyException {
		if (num < 0) {
			throw new MyException("0보다 크거나 같아야 합니다.");
		}
		this.num = num;
	}
}

public class Exception_Ex11 {

	public static void main(String[] args) {
		Ex11 ee = new Ex11();
		
		try {
			ee.setNum(-10);
			
			System.out.println(ee.getNum());
		} catch (MyException e) {
			//e.printStackTrace();
			System.out.println(e.toString());
		}
	}

}
