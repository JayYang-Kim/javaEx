package ex1204;

/* 날짜 : 2018.12.04
 * 내용 : 문자 자료형 테스트 (문자열)
 * 기타 : 
 * */
public class Test4 {

	public static void main(String[] args) {
		String s1;
		String s2 = "seoul";
		
		s1 = "korea";
		System.out.println(s1 + " , " + s2);
		
		s1 = s1 + 9; // 문자열 결합
		System.out.println(s1);
		
		s2 = s2 + 'A'; // 문자열 결합
		System.out.println(s2);
		
		s1 = "java" + 'A'; 
		System.out.println(s1);
		
		s2 = 'A' + "java"; 
		System.out.println(s2);
		
		s2 = 10 + 'A' + "java"; 
		System.out.println(s2);
		
		//s2 = 10; // [컴파일 오류] 정수는 String에 저장불가
		
		s2 = "" + 10;
		System.out.println(s2);
	}

}
