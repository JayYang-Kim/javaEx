package ex1212;

/* 날짜 : 2018.12.12
 * 내용 : System.arraycopy 메소드
 * 기타 : 
 * */
public class Arg_Ex {

	public static void main(String[] args) {
		// test1)
		/*int []a = {10, 20, 30};
		int []b = a; // 하나의 방에 a, b 공유 (a나 b 둘중에 하나라도 값이 바뀌면 둘다 바뀜)
		
		System.out.println(a==b); // (ture) [주소비교] a와 b는 동일한 위치를 참조
		
		b[1] = 300; // a[1], b[1] = 300
		
		System.out.println(a[1] + " , " + b[1]);
		
		int []c = new int[a.length]; // new int[3] (동일)
		
		// a배열의 값을 c배열에 복사
		// method(원본배열, 원본의 복사할 위치, 복사할곳(배열), 복사할곳의 위치, 복사할 개수)
		System.arraycopy(a, 0, c, 0, a.length);
		
		System.out.println(a[0] + " , " + c[0]); // [결과] 10 : 10
		System.out.println(a==c); // false (a, c의 주소값이 다르기 때문에)
		
		c[1] = 20;
		
		System.out.println(a[1] + " , " + c[1]); // [결과] 300 : 20*/
		
		// test2)
		// 2차원 배열에서 arraycopy를 할 경우, 저장된 주소가 복사되어서 복사한 곳의 값과 복사된 곳의 값이 같이 바뀐다.
		/*int [][] a = new int[][] {{1, 2, 3},{4, 5, 6}};
		int [][] b = new int[a.length][a[0].length];
		
		System.arraycopy(a, 0, b, 0, b.length);
		
		System.out.println(a[1][1] + " : " + b[1][1]); // [결과] 5 : 5
		
		b[1][1] = 300;
		
		System.out.println(a[1][1] + " : " + b[1][1]); // [결과] 300 : 300*/	
		
		
		// test3)
		int [][] a = new int[][] {{1, 2, 3},{4, 5, 6}};
		int [][] b = new int[a.length][a[0].length];
		
		System.arraycopy(a, 0, b, 0, b.length); // 주소만 복사
		
		System.out.println(a[1][1] + " : " + b[1][1]); // [결과] 5 : 5
		
		b[1][1] = 300;
		
		System.out.println(a[1][1] + " : " + b[1][1]); // [결과] 300 : 300
		
		int [][] c = new int[a.length][a[0].length];
		
		for (int i = 0; i < a.length; i++) {
			System.arraycopy(a[i], 0, c[i], 0, c[i].length); // 값 복사
		}
		
		c[1][1] = 50;
		
		System.out.println(a[1][1] + " : " + c[1][1]); // [결과] 300 : 50
	}

}
