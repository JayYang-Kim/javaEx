package ex1221;

import java.io.IOException;

/* 날짜 : 2018.12.21
 * 내용 : 예외 (Exception) 처리
 * 기타 : throw 비정상적인 처리
 * */

class Ex7 {
	private int value;
	
	public void set(int value) throws Exception { // throws Exception : 예외를 명시
		if (value < 0) {
			throw new Exception("0보다 크거나 같아야합니다.");
		}
		
		this.value = value;
	}
	
	public int get() {
		return value;
	}
}

public class Exception_Ex7 {

	public static void main(String[] args) throws IOException {
		Ex7 e = new Ex7();
		
		try {
			e.set(-10);
			System.out.println(e.get());
		} catch (Exception e1) {
			//System.out.println(e1.toString());
			//System.out.println(e1.getMessage());
			e1.printStackTrace();
		}
	}

}
