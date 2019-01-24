package ex1211;

/* 날짜 : 2018.12.11
 * 내용 : 가변 배열(2차원 배열) 예제
 * 기타 : 가변 배열 예제
 * */
public class Array_Ex4 {

	public static void main(String[] args) {
		int[][] a = new int[5][4];
		int[][] b = new int[4][5];

		// 5 * 4 행렬
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = (int)(Math.random()*100)+1;
			}

			System.out.println();
		}
		
		// 4 * 5 행렬
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				b[i][j] = a[j][i];
			}

			System.out.println();
		}

		System.out.println("5 * 4 행렬");
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf("%5d", a[i][j]);
			}

			System.out.println();
		}
		
		System.out.println("4 * 5 행렬");
		
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				System.out.printf("%5d", b[i][j]);
			}

			System.out.println();
		}
	}

}
