package ex1206;

/* 날짜 : 2018.12.06
 * 내용 : while 테스트
 * 기타 : 1 ~ 100까지 수중 3 또는 5의 배수 합과 평균을 구하는 프로그램
 * */
public class While_Test2 {

	public static void main(String[] args) {
		int a, b, c;
		a=b=c=0;
		
		while (a < 100) {
			a++;
			if(a % 3 == 0 || a % 5 == 0) {
				b += a; // 3, 5의 배수 합
				c++; // 3, 5의 배수 카운트
			} else {
				
			}
			
		}
		
		System.out.println("합 : " + b);
		System.out.println("평균 : " + (b / c));
	}

}
