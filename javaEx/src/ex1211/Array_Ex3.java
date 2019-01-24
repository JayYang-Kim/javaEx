package ex1211;

/* 날짜 : 2018.12.11
 * 내용 : 가변 배열(2차원 배열) 예제
 * 기타 : 가변 배열 예제
 * */
public class Array_Ex3 {

	public static void main(String[] args) {
		int[][] arr = new int[5][4];
		int n = 0;

		System.out.println("행수 : " + arr.length);
		System.out.println("1행의 열수 : " + arr[1].length);

		for (int i = 0; i < arr[0].length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				n++;
				arr[j][i] = n;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%4d", arr[i][j]);
			}

			System.out.println();
		}
	}

}
