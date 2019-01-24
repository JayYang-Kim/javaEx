package ex1211;

/* 날짜 : 2018.12.11
 * 내용 : 가변 배열(2차원 배열) 예제
 * 기타 : 행렬 a와 b의 합과 곱을 계산하는 프로그램
 * */
public class Array_Ex6 {

	public static void main(String[] args) {
		int [][]a = {{1,5,6},{2,4,7},{2,5,8}};
		int [][]b = {{7,1,6},{3,4,7},{4,6,3}};
		
		int [][] c = new int[3][3]; // 합
		int [][] d = new int[3][3]; // 곱
		
		// 행렬 합
		for(int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		
		System.out.println("합");
		
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				System.out.print(c[i][j] + "\t");
			}
			
			System.out.println();
		}
		
		// 행렬 곱
		for(int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 3; k++) {
					d[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		
		System.out.println("곱");
		
		for (int i = 0; i < d.length; i++) {
			for (int j = 0; j < d[i].length; j++) {
				System.out.print(d[i][j] + "\t");
			}
			
			System.out.println();
		}
	}

}
