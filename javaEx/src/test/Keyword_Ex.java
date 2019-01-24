package test;

/* 날짜 : 2018.12.06
 * 내용 : 키워드 및 식별자 테스트
 * 기타 : 1) 식별자는 사용자에 의해 정의되고, 사용되어지는 것으로 변수명, 메소드명, 클래스명, 인터페이스 또는 패키지 등을 들 수 있다.
 *         2) 같은 영역에서 동일한 식별자 사용은 불가능
 *         3) 식별자는 유니코드 자바 레터와 유니코드 숫자로 구성되며 반드시 유니코드 자바 레터로 시작해야 한다.
 *         * 대소문자를 구분하며 길이에는 제한이 없다.
 * */
public class Keyword_Ex {

	public static void main(String[] args) {
		/*
		 식별자의 사용 예)
		 1) abc 2) _123 3) b_123 4) kor 5) a123
		 
		 식별자의 불가능한 예)
		 1) int(예약어라 사용이 불가능) 2) #abc(특수기호 사용불가) 3) a-123 ("-" 사용불가) 4) (abc) (괄호 사용불가) 5) 123 (첫번째자리는 유니코드 자바 레터로 시작해야함)
		 */
		
		String name = "홍길동";
		//String #name = "자바" // [컴파일 오류]
		//String name2 = '홍길동''; // [컴파일 오류] String은 문자열로 입력해야한다.
		String _tel = "010-1234-1234";
		String 주소 = "서울";
		//String int; // [컴파일 오류] int는 예약어로 식별자 사용이 불가능 
		
		int $age = 23;
		//int ~age = 23; [컴파일 오류] 식별자는 처음으로 유니코드 자바 레터를 써줘야한다.
		//int age-1 = 23; [컴파일 오류] 식별자에 '-' 입력 불가
		int a = 10;
		//int a = 20; [컴파일 오류] 동일한 영역에서 같은 식별자 사용이 불가능
		
		System.out.println("name : " + name); // name : 홍길동
		System.out.println("_tel : " + _tel); // _tel : 010-1234-1234
		System.out.println("주소 : " + 주소); // 주소 : 서울
		System.out.println("$age : " + $age); // $age : 23
		System.out.println("a : " + a); // a : 10
		
		byte b1;
		int i1 = 385;
		long l1 = 100;
		long l2 = 22000000000l;
		double d1 = 372.5555;
		
		//b1 = i1; // [컴파일 오류] 큰 자료형을 작은 자료형에 대입 불가능
		b1 = (byte)i1; // int i1을 byte로 강제 형 변환
		
		System.out.println("byte : " + b1);
		System.out.println("double : " + d1);
	}

}
