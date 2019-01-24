package ex1220;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 날짜 : 2018.12.20
 * 내용 : 예외(Exception) 처리
 * 기타 : 
 * */

public class Exception_Ex5 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // (System.in) 키보드를 통해 1바이트씩 입력을 받음
		int a, b, c;
		
		try {
			String s;
			
			System.out.println("첫번째 수를 입력해주세요.");
			
			s = br.readLine(); 
			a = Integer.parseInt(s);
			
			System.out.println("두번째 수를 입력해주세요.");
			b = Integer.parseInt(br.readLine());
			
			c = a + b;
			
			System.out.println("결과 : " + c);
		} catch(IOException e) { // checked 예외 (반드시 예외처리를 해야함)
			e.printStackTrace();
		} catch (NumberFormatException e) { // unckecked 예외 (반드시 예외처리를 하지 않아도됨)
			System.out.println(e.getMessage());
		} catch (Exception e) { // Exception : 모든 예외를 catch할 수 있다.
			                    // 모든 예외의 최상위이므로 여러 예외를 catch할 경우 가장 아래에 위치
			System.out.println(e.toString());
		}
		
		
		System.out.println("종료");
	}

}
