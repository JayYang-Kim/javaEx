package ex1205;

/* 날짜 : 2018.12.05
 * 내용 : 비트 단위 연산자
 * 기타 : 
 * */
public class Oper_Ex3 {

	public static void main(String[] args) {
		// 홀짝 구하기 
		/*int a = 15, b = 20;
		String c, d;
		
		c = a%2 == 1 ? "홀" : "짝";
		d = a&1 == 1 ? "홀" : "짝";
		
		System.out.println(c);
		System.out.println(d);*/
		
		// 두 변수 값 교환
		/*int c = 10, d = 5;
		
		System.out.println(c + " , " + d);
		
		c = c^d;
		d = d^c;
		c = c^d;
		
		System.out.println(c + " , " + d);*/
		
		// 암호화 예시
		int a = 37;
		
		System.out.println(a);
		
		// 암호화 처리
		a = a^25;
		System.out.println(a);
		
		// 복호화 처리
		a = a^25;
		System.out.println(a);
	}

}
