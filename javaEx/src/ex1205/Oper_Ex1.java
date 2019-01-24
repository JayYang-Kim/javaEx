package ex1205;

/* 날짜 : 2018.12.05
 * 내용 : 배정 연산자
 * 기타 : 자료형을 유지시키면서 연산을 수행하므로 속도가 빠름
 * */
public class Oper_Ex1 {

	public static void main(String[] args) {
		int a = 10;
		
		a += 5; // a = a+5;
		System.out.println(a);
		
		char c = 'A';
		
		//c = (char)(c+5);
		c += 5; // 형변환이 일어나지 않음
		System.out.println(c);
	}

}
