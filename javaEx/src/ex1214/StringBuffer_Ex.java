package ex1214;

/* 날짜 : 2018.12.14
 * 내용 : StringBuffer / StringBuilder
 * 기타 : 가변적인 문자열을 처리할때 String보다 유리
 *      [StringBuilder]
 *      - 동기화 지원하지 않음
 *      [StringBuffer]
 *      - StringBuilder보다 빠름
 *      - 동기화 지원
 * */

public class StringBuffer_Ex {

	public static void main(String[] args) {
		
		StringBuffer sb1 = new StringBuffer();
		StringBuffer sb2 = new StringBuffer("korea");
		
		// 용량 알아보기
		System.out.println("기본 버퍼 크기 : " + sb1.capacity()); // [결과] 16
		
		sb1.append("korea"); // 문자열 추가
		
		System.out.println(sb1);
		System.out.println(sb2);

		System.out.println(sb1 == sb2); // [결과] false / 주소 비교
		System.out.println(sb1.equals(sb2)); // [결과] false / 주소 비교
		
		// String으로 변환
		String s = sb1.toString();
		System.out.println(s);
		
		// equals 값 비교는 String만 가능
		// toString() 문자열로 변환
		System.out.println(sb1.toString().equals(sb2.toString())); // [결과] true / 값 비교
		
		// 문자열 추가
		sb1.append("한글");
		sb1.append("이름");
		sb1.append("여기");
		sb1.append("저기");
		sb1.append("abc");
		sb1.append("ABC");
		sb1.append("!@#");
		sb1.append("789456");
		sb1.append("<>?:");
		
		// 용량 알아보기
		System.out.println("버퍼 크기 : " + sb1.capacity());
		
		// 문자열 길이
		System.out.println("문자열 길이 : " + sb1.length());
		
		System.out.println(sb1);
		
		// 문자열 삽입
		sb1.insert(0, "이곳이"); // 맨 첫글자 앞에 추가
		System.out.println(sb1);
		
		sb1.insert(sb1.indexOf("한글") + "한글".length(), "web"); // 한글 찾아서 한글 다음에 web문자열 추가
		System.out.println(sb1);
		
		// 문자열 삭제
		sb1.delete(sb1.indexOf("이름"), sb1.indexOf("이름") + "이름".length()); // 이름 문자열 찾아서 문자 지우기
		System.out.println(sb1);
		
		sb1.delete(0, sb1.length());
		System.out.println("결과 : " + sb1);
		
		sb1.append("seoul");
		System.out.println(sb1.capacity()); // sb1의 용량 알아보기
		
		// 문자열 길이로 버퍼의 크기를 변경
		sb1.trimToSize(); 
		System.out.println(sb1.capacity());
	}

}
