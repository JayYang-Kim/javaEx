package ex1220;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 날짜 : 2018.12.20
 * 내용 : 예외(Exception) 처리
 * 기타 : InputStream : System.in -> 1바이트씩 입력을 받음 (byte 스트림 / 입력의 기본)
 *      InputStreamReader : byte 스트림을 문자 스트림으로 변환
 *      BufferedReader : 필터 스트림 (문자열을 입력 받을 수 있는 클래스)
 * */

public class Exception_Ex4 {

	public static void main(String[] args) {
		// 바이트 > 문자 > 문자열로 변환
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // (System.in) 키보드를 통해 1바이트씩 입력을 받음
		int a, b, c;
		
		//String s = br.readLine(); // [컴파일 오류] readLine 오류를 포함하고 있다.
		                            // checked 예외가 발생하므로 반드시 예외처리를 해줘야함
		
		try {
			String s;
			
			System.out.println("첫번째 수를 입력해주세요.");
			
			s = br.readLine(); // checked 예외 (IOException 예외)
			                   // 반드시 예외처리 해줘야한다.
			a = Integer.parseInt(s);
			
			System.out.println("두번째 수를 입력해주세요.");
			b = Integer.parseInt(br.readLine());
			
			c = a + b;
			
			System.out.println("결과 : " + c);
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("종료");
	}

}
