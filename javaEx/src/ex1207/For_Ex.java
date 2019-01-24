package ex1207;

/* 날짜 : 2018.12.07
 * 내용 : For문 테스트
 * 기타 : 
 * */
public class For_Ex {

	public static void main(String[] args) {
		// 1) 1 ~ 10까지 정수를 출력하는 프로그램
		/*
		 * int a;
		 * 
		 * for (a=1;a <= 10;a++) { System.out.println(a + " "); }
		 */

		/*
		 * for (int a=1; a <= 10; a++) { System.out.println(a + " "); }
		 */

		// System.out.println(a + " "); // for에 선언한 변수는 밖에서 사용 불가능

		// 2) F ~ A까지 문자를 출력하는 프로그램
		/*
		 * for (char a = 'F'; a >= 'A'; a--) { System.out.println(a); }
		 */

		// 3) 1 ~ 10까지 수중 홀수를 출력하는 프로그램
		/*
		 * for (int a = 1; a <= 10; a += 2) { System.out.println(a + " "); }
		 */

		// 4) 1 ~ 10까지 수중 홀수를 출력하는 프로그램
		/*
		 * for (int a = 2; a <= 10; a += 2) { System.out.println(a + " "); }
		 */

		// 5) 1 ~ 10까지의 합
		/*
		 * int s = 0; for (int a = 1; a <= 10; a++) { s += a; }
		 * 
		 * System.out.println(s + " ");
		 */

		// 5) 1 ~ 10까지의 합 홀수의 합
		/*int s = 0;
		for (int a = 1; a <= 10; a += 2) {
			s += a;
		}

		System.out.println(s + " ");*/

		// 5) 1 ~ 10까지의 합 짝수의 합
		/*int s = 0;
		for (int a = 2; a <= 10; a += 2) {
			s += a;
		}

		System.out.println(s + " ");*/
		
		// 6) 1 ~ 100까지 수중 3의 배수를 한 줄에 10개씩 출력하고 마지막에 3의 배수 합 및 평균 출력
		/*int s = 0;
		int c = 0;
		for(int n = 3; n <= 100; n+=3) {
			s += n;
			c++;
			System.out.printf("%5d", n);
			
			if(c % 10 == 0) {
				System.out.println();
			}
		}
		
		System.out.println("\n합 : " + s);
		System.out.println("평균 : " + s / c);*/
		
		// 7) 1 ~ 10까지의 정수의 합을 출력
		/*int s = 0;
		int n = 0;
		for(;;) {
			n++;
			s+=n;
			if(n >= 10) {
				break;
			}
		}
		
		System.out.println("합 : " + s);*/
		
		// 8) 
		/*int s = 2000000000;
		int c= 0;
		
		// float는 사용못하는건 아니지만 정수를 소수로 변환하면서 잘리는 현상이 발생하기 때문에 값이 틀려질 수 있다.
		for (float a = s; a < s + 50; a++) {
			c++;
		}
		
		System.out.println(c);*/
	}

}
