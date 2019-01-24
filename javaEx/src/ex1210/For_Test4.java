package ex1210;

/* 날짜 : 2018.12.10
 * 내용 : For문 테스트
 * 기타 : 1) 1~10까지 합, 11~20까지의 합 ~ 91~100까지 합을 구하는 프로그램
 *      2) 1~100까지 수중 4와 6의 공배수를 출력하는 프로그램
 * */
public class For_Test4 {

	public static void main(String[] args) {
		/*int a, b;
		int sum;
		sum = 0;

		for (a = 1; a <= 100; a++) {

			for (b = 1; b <= 10; b++) {
				sum += b; // 합
			}
			
			System.out.println(a + " ~ " + b +" 까지 합 : " + sum);
		}*/
		
		// 1)
		/*int s;
		for(int i = 1; i <= 10; i++) {
			s = 0;
			
			for(int j = (i - 1) * 10 + 1; j <= i + 10; j++) {
				s+=j;
			}
			
			System.out.printf("%d ~ %d 까지합 : %d\n", (i-1)*10+1, i+10, s);
		}*/
		
		// 2)
		for (int i = 1; i<= 100; i++) {
			if(i % 4 == 0 && i % 6 == 0) {
				System.out.println(i + "");
			}
		}
		System.out.println();
	}

}
