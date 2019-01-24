package ex1217;

/* 날짜 : 2018.12.17
 * 내용 : Math Class
 * 기타 : 수학과 관련된 메소드를 제공
 * */

public class Math_Ex {

	public static void main(String[] args) {
		double d;
		
		d = Math.PI;
		System.out.println(d);
		
		System.out.println(Math.sqrt(2)); // 2의 제곱근
		System.out.println(Math.pow(2, 10)); // 2의 10승
		
		d = Math.sin(30.0 * Math.PI / 180); // 라디안
		System.out.println(d);
		
		d = Math.floor(12.77); // 절삭
		System.out.println(d);
	}

}
