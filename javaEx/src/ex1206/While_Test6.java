package ex1206;

/* 날짜 : 2018.12.06
 * 내용 : while 테스트
 * 기타 : 피보나치수열 1+1+2+3+5+8+13+21 합을 구하는 프로그램을 작성하시오.
 * */
public class While_Test6 {

	public static void main(String[] args) {
		int a = 1, b = 1, c;
		int s=2;
		
		int n = 2;
		while(n < 8) {
			c = a + b; // 2 = 1 + 1
			s = s + c; // 4 = 2 + 2
			a = b; // 1 = 1
			b = c; // 2 = 2
			n++; // 3
		}
		
		System.out.println(s);
	}

}
