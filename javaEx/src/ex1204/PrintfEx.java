package ex1204;

/* 날짜 : 2018.12.04
 * 내용 : Printf 테스트 (자료의 출력)
 * 기타 : printf (서식을 지정하여 출력)
 *         method (printf = format)
 *         %d는 정수형 타입만 출력가능
 *         %c는 문자를 출력가능
 *         %h,x는 16진수 변환
 *         %o는 8진수 변환
 *         %s는 문자열
 * */
public class PrintfEx {

	public static void main(String[] args) {
		// 서식에 의한 출력
		float a = 3.141592f;
		
		System.out.println(a); // 값 : 3.141592

		System.out.printf("%.2f\n", a); // 값 : 3.14, \n (라인 넘기기) = %n (동일)
		System.out.println("seoul");
		
		//System.out.printf("%d\n", 'A'); // [런타임 오류]
		
		System.out.printf("%d %c %d\n", 65, 66, 67); // 값 : 65 B 67
		
		System.out.printf("%d %d\n", 65, 66); // 값 : 65 66
		
		//System.out.printf("%d %d %d\n", 65, 66); // [런타임 오류] 
		
		System.out.printf("%c %c %1$c", 'A', 'B');
	}

}
