package ex1206;

/* 날짜 : 2018.12.06
 * 내용 : while 테스트
 * 기타 : 문제7)
 * */
public class While_Test5 {

	public static void main(String[] args) {
		int x, y, s;

		x = 100;
		y = 0;
		s = 0;
		
		while (x >= y) { 
			s++; // 초를 구함
			x+=2; 
			y+=5;
		}
		
		System.out.println("x :" + x + " , y : " + y);
		System.out.println("걸린시간 : " + s + "초");
	}

}
