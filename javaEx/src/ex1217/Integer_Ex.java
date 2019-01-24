package ex1217;

/* 날짜 : 2018.12.17
 * 내용 : Wrapper Class
 * 기타 : 
 * */

class Ex1 {
	Integer a; // 객체 null로 초기화
	int b; // 기본 자료형 0로 초기화
	
	public int sub1() {
		return a + 10;
	}
	
	public int sub2() {
		return b + 10;
	}
}

public class Integer_Ex {

	public static void main(String[] args) {
		Ex1 ob = new Ex1();
		
		//System.out.println(ob.sub1()); // [런타임 오류]
		ob.a = 0;
		System.out.println(ob.sub1()); // [결과] 10
		System.out.println(ob.sub2()); // [결과] 10
		
		System.out.println(Integer.MAX_VALUE); // int 형으로 표현할 수 있는 최대 값
		System.out.println(Integer.MIN_VALUE); // int 형으로 표현할 수 있는 최소 값
		
		int n;
		String s;
		
		s = "123";
		n = Integer.parseInt(s); // 문자열을 int형으로 변환
		System.out.println(n);
		
		//s = "123.5";
		//n = Integer.parseInt(s); // [런타임 오류] NumberFormatException
		
		//n = Integer.parseInt("1, 123"); // [런타임 오류] NumberFormatException
		
		System.out.println(Integer.parseInt("101")); // 문자열을 숫자로 변경
		System.out.println(Integer.parseInt("101", 2)); // [결과] 5 (2진수)
		
		//System.out.println(Integer.parseInt("a01")); // [런타임 오류] NumberFormatException
		System.out.println(Integer.parseInt("a01", 16)); // [결과] 5 (16진수)
		
		n = 245;
		s = Integer.toString(n); // 숫자를 문자열로 변환
		
		s = Integer.toBinaryString(123);
		System.out.println(s);
		
		double d;
		d = Double.parseDouble("123.5"); // 문자열을 double형으로 변환
		System.out.println(d);
		
	}

}
