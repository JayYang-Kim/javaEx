package ex1214;

/* 날짜 : 2018.12.14
 * 내용 : 자바의 기본 API 클래스 - (string)
 * 기타 : 
 * */

public class String_Test2 {

	public static void main(String[] args) {
		// 369게임. 1 ~ 100까지 수를 한줄에 10개씩 출력 하되 369자리는 *로 출력
		// 예를 들어 13은 *, 33은 **
		String s;
		
		for (int i = 1; i <= 100; i++) {
			// 정수를 문자로 바꾼 후 3,6,9를 찾아서 별로 변환
			s = Integer.toString(i).replaceAll("3|6|9", "*"); // 31 => *1
			
			// *의 위치찾기 (앞쪽에서)
			if (s.indexOf("*") != -1) { // 없을 경우
				s = s.replaceAll("\\d", ""); // 문자를 공백으로 변환
			}
			
			System.out.print(s + "\t");
			
			// 10개씩 출력
			if (i % 10 == 0) {
				System.out.println();
			}
		}
	}

}
