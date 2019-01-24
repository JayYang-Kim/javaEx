package ex1210;

/* 날짜 : 2018.12.10
 * 내용 : Break문 예제
 * 기타 : 
 * */
public class Break_Ex3 {

	public static void main(String[] args) {
		gogo:
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				if (i + j == 4) {
					break gogo;
				}
				
				System.out.println("i : " + i + ", j : " + j);
			}
			
			System.out.println(i);
		}

	}

}
