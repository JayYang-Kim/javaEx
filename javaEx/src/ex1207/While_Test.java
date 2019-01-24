package ex1207;

/* 날짜 : 2018.12.07
 * 내용 : while / do ~ while문 문제
 * 기타 : 
 * */
public class While_Test {

	public static void main(String[] args) {
		int s, n;
		
		s = 0;
		n = 0;
		
		while (s < 100) { // 합이 100이상이기 때문에 합으로 비교
			n++;
			s = (n % 2 == 0) ? -n : +n;
			//s = (n % 2 == 1) ? +n : -n;
		}
		
		System.out.println(n + " , " + s);
	}

}
