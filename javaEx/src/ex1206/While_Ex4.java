package ex1206;

/* 날짜 : 2018.12.06
 * 내용 : while 테스트
 * 기타 : 
 * */
public class While_Ex4 {

	public static void main(String[] args) {
		// 예제12)
		/*int n, s;
		
		n = 0;
		s = 0;
		while (n < 100) {
			n++;
			s += n;
			if(n % 10 == 0) {
				System.out.println("1 ~ "+ n + "까지 합 : " + s);
			}
		}*/
		
		// 예제13)
		/*int n, s, sum;
		
		n = 0;
		s = 0;
		sum = 0;
		while (n < 10) {
			n++;
			s += n;
			sum += s;
		}
		
		System.out.println(sum);*/
		
		// 예제14)
		/*int n;
		double s;
		
		n = 0;
		s = 0;
		
		while (n < 9) {
			n++;
			s += (double)n/(n+1);
		}
		System.out.println(s);*/
		
		// 예제16)
		int a, b;
		
		a = 0;
		b = 0;
		while (a <  100) {
			a++;
			if (a % 3 != 0 && a % 5 != 0) {
				System.out.print(a + "\t");
				b++;
				if(b%5 == 0) {
					System.out.println();
				}
				if(b == 5) {
					b = 0;
					System.out.println();
				}
			}
		}
	}

}
