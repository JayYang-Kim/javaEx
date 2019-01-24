package ex1213;

/* 날짜 : 2018.12.12
 * 내용 : Class > 필드 (Field)
 * 기타 : 
 * */

class Ex1 {
	public void sub1 (int[] n) { // Call By Reference, 파라미터가 배열
		// main메소드에서 ob.sub1(num) 실행 시 int []n = new int[] {1,2,3,4,5}
		n[1] = 10; // 
		
		for (int a : n) {
			System.out.println(a + " ");
		}
		
		System.out.println();
	}
	
	public int[] random(int cnt) {
		int []n = new int[cnt];
		for (int i = 0; i < n.length; i++) {
			n[i] = (int)(Math.random() * 100) + 1;
		}
		
		return n;
	}
}

public class Method_Ex {

	public static void main(String[] args) {
		int []num = {1,2,3,4,5};
		int []n = new int[] {1,2,3,4,5};
		
		System.out.println(n[0]);
		
		Ex1 ob = new Ex1(); // Ex1 클래스의 객체 생성 (메모리 생성)
		ob.sub1(num); // sub1 매개변수에 []num의 주소값을 던져준다.
		
		System.out.println("main : " + num[1]); // [결과] 10
		
		// Method radom호출
		/*int []aa = new int[5];
		aa = ob.random(5);*/
		
		int []aa = ob.random(5);
		
		System.out.print("random : ");
		for (int a : aa) {
			System.out.print(a + " ");
		}
		
		System.out.println();
	}

}
