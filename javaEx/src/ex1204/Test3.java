package ex1204;

/* 날짜 : 2018.12.04
 * 내용 : 문자 자료형 테스트
 * 기타 : 
 * */
public class Test3 {

	public static void main(String[] args) {
		char c1;
		char c2 = 'A', c3 = '대';
		int a;
		
		c1 = '\u0041';
		System.out.println("c1 : " + c1 + " c2: " + c2 + " c3 : " + c3);
		
		c1 = '\101'; // 8진수로 표현하는 문자코드
		System.out.println(c1);
		
		a = '대';
		System.out.println(a); // 컴퓨터에 저장되는 데이터 값 (45824)
		
		//c1 = a; // [컴파일 오류]
		c1 = (char)a;
		System.out.println(c1);
		
		c1 = 45824;
		System.out.println(c1);
		
		//c1 = "A"; // [컴파일 오류] 문자열을 char에 저장 불가
	
		c1 = 0x41; // c1 = 65; c1 = '\u0041'; c1 = 'A';
		System.out.println(c1);
	}

}
