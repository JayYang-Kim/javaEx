package ex1204;

/* 날짜 : 2018.12.04
 * 내용 : 증감 연산자
 * 기타 : 
 * */
public class OperatorEx6 {
	public static void main(String[] args) {
		int a;
		
		a = 10; 
		// a = a + 1;
		++a;
		System.out.println(a); // 값 : 11
		
		a = 10;
		a++;
		System.out.println(a); // 값 : 11
		
		a = 10;
		a--;
		System.out.println(a); // 값 : 9
		
		char c = 'A';
		
		// c = c + 1; // [컴파일 오류]
		//c = (char)(c+1);
		c++;
		System.out.println(c); // B
	}
}
