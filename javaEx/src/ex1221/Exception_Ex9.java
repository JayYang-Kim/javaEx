package ex1221;

/* 날짜 : 2018.12.21
 * 내용 : 예외 (Exception) 처리
 * 기타 : throw 비정상적인 처리
 *      checked 예외
 * */

class Ex9 {
	private int num;
	
	public void setNum(int num) throws Exception { // checked 예외
		// 음수 체크
		if (num < 0) {
			throw new Exception("0보다 크거나 같아야 합니다."); // 음수인 경우 예외를 던짐 (예외 던지면 다음 줄 실행 안함)
		}
		this.num = num; // 실행 안됨
	}
	
	public int getNum() {
		return num;
	}
	
	public void set(int n) throws Exception {
		try {
			setNum(n);
		} catch (Exception e) {
			//e.printStackTrace();
			//System.out.println(e.getMessage());
			
			throw e; // 예외를 다시 던진다.
		}
	}
}

public class Exception_Ex9 {

	public static void main(String[] args) {
		Ex9 e = new Ex9();
		
		try {
			e.set(-10);
			System.out.println(e.getNum());
		} catch (Exception e1) {
			//e1.printStackTrace();
			System.out.println(e1.toString());
		}
	}

}
