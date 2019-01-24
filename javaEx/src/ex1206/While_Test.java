package ex1206;

/* 날짜 : 2018.12.06
 * 내용 : while 테스트
 * 기타 :  
 * */
public class While_Test {

	public static void main(String[] args) {
		int a, b;
		a = 0;
		b = 0;
		
		while (a < 10) {
			a++;
			
			if(a % 2 == 0) { // 짝수 체크 
				b -= a; // 짝수일 경우, "-" 
			} else { // 홀수 체크 ((n&1)==1)
				b += a; // 짝수가 아닐 경우, "+" 
			}
		}
		
		/*while (a < 10) {
			a++;
			a += b; // 첫번째는 더한다
			
			a++;
			a -= b; // 두번째는 뺀다
		}*/
		
		System.out.println(b);
	}

}
