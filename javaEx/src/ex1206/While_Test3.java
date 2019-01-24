package ex1206;

/* 날짜 : 2018.12.06
 * 내용 : while 테스트
 * 기타 : 1+2+n 까지의 합이 100을 넘는 최소의 n과 그떄의 합은 얼마인지 출력하는 프로그램
 * */
public class While_Test3 {

	public static void main(String[] args) {
		int a, b;
		
		/*a=b=0;
		
		while (b <= 100) {
			a++;
			b += a;
		}
		
		System.out.println(a + " , " + b);*/
		
		a=b=0;
		
		/*while (true) {
			a++;
			b += a;
		}
		
		System.out.println(a + " , " + b);*/ // while에서 무한루프가 걸려 해당 라인을 실행할 수 없어서 오류가 발생
		
		while (true) {
			a++;
			b += a;
			if(b > 100) {
				break;
			}
		}
		
		System.out.println(a + " , " + b);
	}

}
