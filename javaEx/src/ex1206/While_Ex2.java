package ex1206;

/* 날짜 : 2018.12.06
 * 내용 : while 테스트
 * 기타 : 
 * */
public class While_Ex2 {

	public static void main(String[] args) {
		/*int a = 0;
		
		// 1 ~ 100까지 10개씩 출력
		while (++a <= 100) {
			System.out.print(a + "\t");
			if(a % 10 == 0) {
				System.out.println();
			}
		}*/
		
		// A ~ Z까지 10개씩 출력
		/*char b = 'A';
		while(b <= 'Z' ) {
			System.out.println(b + "\t");
			b++;
			if((b-65) % 10 == 0) {
				System.out.println();
			}
		}*/

		// A ~ Z까지 10개씩 출력
		char c = 'A';
		int n = 0;
		
		while (n < 26) {
			System.out.print(c + "\t");
			n++;
			c++;
			if(n % 10 == 0) {
				System.out.println();
			}
		}
		
	}

}