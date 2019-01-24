package ex1214;

/* 날짜 : 2018.12.14
 * 내용 : 자바의 기본 API 클래스 - (string)
 * 기타 : 
 * */

public class String_Runtime {
	
	public static void stringTime() {
		System.out.println("String");
		
		long start = System.currentTimeMillis();
		
		// String은 불변의 법칙
		String s = "a";
		
		for (int i = 1; i < 100000; i++) {
			s += "a";
		}
		
		System.out.println("문자열 길이 : " + s.length());
		
		long end = System.currentTimeMillis();
		
		System.out.println("실행시간 : " + (end - start) + "ms");
	}
	
	public static void stringBufferTime() {
		System.out.println("String Buffer");
		
		long start = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer("a");
		
		for (int i = 1; i < 100000; i++) {
			sb.append("a");
		}
		
		System.out.println("문자열 길이 : " + sb.length());
		
		long end = System.currentTimeMillis();
		
		System.out.println("실행시간 : " + (end - start) + "ms");
	}
	
	public static void main(String[] args) {
		stringTime();
		stringBufferTime();

	}

}
