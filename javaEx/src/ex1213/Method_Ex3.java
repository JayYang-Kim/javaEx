package ex1213;

/* 날짜 : 2018.12.12
 * 내용 : 재귀 호출 (Recursive call)
 * 기타 : 
 * */

public class Method_Ex3 {
	// 재귀호출로 합 구하는 방식
	public static int sum(int n) {
		return n > 1 ? n + sum(n - 1) : n;
	}
	
	// for 합 구하는 방식 (속도는 for가 빠름)
	/*public static int sum(int n) {
		int s = 0;
		for (int i = 1; i <= n; i++) {
			s += i;
		}
		
		return s;
	}*/
	
	// x의 y승 계산 (단, y는 0이상이라는 가정하에
	public static int pow(int x, int y) {
		return y >= 1 ? x * pow(x, y - 1) : 1;
	}
	
	// 두 수의 최대공약수
	public static int gcd(int a, int b) {
		return b == 0 ? a : gcd(b, a % b);
	}
	
	public static void main(String[] args) {
		// 합 구하는 방식
		int s;
		s = sum(10);
		
		System.out.println("합 : " + s);
		
		// x의 y승 계산
		s = pow(2, 10);
		System.out.println("x의 y승 : " + s);
		
		// 두 수의 최대공약수
		s = gcd(12, 16);
		System.out.println("두 수의 최대공약수 : " + s);
	}

}
