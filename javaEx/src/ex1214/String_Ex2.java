package ex1214;

/* 날짜 : 2018.12.14
 * 내용 : 자바의 기본 API 클래스 - (string)
 * 기타 : 
 * */

public class String_Ex2 {

	public static void main(String[] args) {
		String s = "seoul korea";
		String s2;
		int n;
		char c;
		
		System.out.println("s : " + s); // [결과] s : seoul korea
		
		// 문자열의 길이 구하기
		n = s.length(); 
		System.out.println("길이 : " + n); // [결과] 11
		
		//n = s2.length(); // [컴파일 오류] 초기화시키지 않되어 있는 상태
		
		//s2 = null;
		//n = s2.length(); // [런타임 오류]
		
		// 문자 한글자만 추출
		c = s.charAt(6); // index는 0부터
		System.out.println(c);
		
		// 문자열 추출 
		// begin index에서  (end - begin)개 추출
		s2 = s.substring(6, 9); // index는 0부터
		System.out.println(s2);
		
		// begin부터 문자열 끝까지 추출
		s2 = s.substring(6);
		System.out.println(s2);
		
		// 값 비교
		System.out.println(s.equals("seoul korea")); // [결과] true
		System.out.println(s.equals("Seoul Korea")); // [결과] flase / 대소문자 비교
		
		System.out.println(s.equalsIgnoreCase("Seoul Korea")); // [결과] true / 대소문자 비교 안함
		
		// 앞부분만 비교 (시작)
		System.out.println(s.startsWith("seoul")); // [결과]
		
		// 뒷부분만 비교 (끝)
		System.out.println(s.endsWith("korea")); // [결과]
		
		// "seoul korea" : "seoul corea" 문자열 비교. 다른면 ascii 코드값 출력
		n = s.compareTo("seoul corea");
		System.out.println(n); // [결과] 8
		
		// kor의 위치 (앞쪽에서 찾기)
		System.out.println(s.indexOf("kor")); // [결과] 6 (index)
		System.out.println(s.indexOf("cor")); // [결과] -1 (데이터가 없으면 -1)
		
		System.out.println(s.indexOf("o")); // [결과] 2 (index)
		System.out.println(s.lastIndexOf("o")); // [결과] 7 (index)
		
		s2 = "test.12.png";
		
		System.out.println(s2.substring(s2.lastIndexOf(".") + 1)); // [결과] png
		
		// 특정 문자열 변경
		s = "우리나라 대한민국 대한독립만세";
		//s2 = s.replace("대한", "大韓"); // 정규식 사용불가
		s2 = s.replaceAll("대한", "大韓"); // 정규식 사용가능
		
		System.out.println(s2);
		
		// 일부분 문자열 제거
		// 정규식
		s = "우리1나라 대222한 민21214국";
		s2 = s.replaceAll("\\d", ""); // \\d : 숫자를 나타내는 정규식
		System.out.println(s2);
		
		s2 = s.replaceAll("\\d|\\s", ""); // \\s : 공백을 나타내는 정규식
		System.out.println(s2);
		
		s = " 사  람  ";
		System.out.println(":" + s + ":");
		System.out.println(":" + s.trim() + ":"); // 앞, 뒤 공백 제거
		System.out.println(":" + s.replaceAll("\\s", "")); // 전체 공백 제거
		
		// s = 300; // [컴파일 에러] String s 
		n = 300;
		
		// 정수 => 문자열로 변환
		s = "" + n;
		System.out.println(s);
		
		s = Integer.toString(n);
		System.out.println(s);
		
		// 문자열 => 정수로 변환
		s = "123";
		n = Integer.parseInt(s);
		System.out.println(n);
		
		// 형식에 맞게 문자열로 변환
		n = 1234567;
		s = String.format("%,d", n); // 3자리마다 ,찍기
		System.out.println(s);
		
		// 문자열을 컴마로 구분
		s = "자바, 안드로이드, 웹";
		String []ss = s.split(","); // split 정규식 사용 가능
		// String []ss = "자바, 안드로이드, 웹".split(",");
		
		for (String a : ss) {
			System.out.println(a);
		}
		
		s = "KOREA";
		//byte []bb = s.getBytes();
		byte []bb = "대한민국".getBytes(); 
		for (byte b : bb) {
			System.out.println(b);
		}
		
		s = "ABCBD";
		//System.out.println(s.indexOf(66)); // [결과] 1
		System.out.println(s.indexOf('B')); // [결과] 1
		System.out.println(s.indexOf('B', 2)); // [결과] 3
		
		// 소문자 변경
		//s.toLowerCase(); 변경안됨
		s = s.toLowerCase();
		System.out.println(s);
	}

}
