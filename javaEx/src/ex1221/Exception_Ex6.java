package ex1221;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 날짜 : 2018.12.21
 * 내용 : 예외 (Exception) 처리
 * 기타 : 메소도의 throws에 예외 명시
 *      throws로 예외처리 후 프로그램이 잘못되면 종료된다.
 * */

class Ex6 {
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public String inputString(String title) throws IOException { // inputString 메소드를 호출한곳에서 예외처리를 떠넘긴다.
		String s = null;
		
		System.out.println(title + " ?");
		s = br.readLine(); // readLine()은 checked 예외를 가지고 있다.
		
		return s;
	}
	
	public int inputNum(String title) throws IOException { // inputNum 메소드를 호출한곳에서 예외처리를 떠넘긴다.
		int n = 0;
		
		System.out.println(title + " ?");
		n = Integer.parseInt(br.readLine()); // readLine()은 checked 예외를 가지고 있다.		
		
		return n;
	}
}

public class Exception_Ex6 {

	public static void main(String[] args) throws IOException {
		Ex6 e = new Ex6();
		
		String s;
		
		s = e.inputString("이름");
		
		System.out.println(s);
	}

}
