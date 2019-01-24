package ex1212;

/* 날짜 : 2018.12.12
 * 내용 : 메소드 (Method)
 * 기타 : 
 * */

class Ex1 {
	// 1 ~ n까지 합
	public int sum(int n) { // n : 매개변수, 지역변수
		int s = 0; // 지역변수
		for (int i = 1; i <= n; i++) {
			s += i;
		}
		
		return s; // 반환값
	}
	
	// n이 짝수이면 true, 홀수이면  false
	public boolean isEven(int n) {
		return n%2 == 0;
	}
	
	public void trangle(int n) {
		for (int i = 1; i <= n; i++) {
			// 공백처리
			for (int j = 1; j <= n - i; j ++) {
				System.out.print("  ");
			}
			
			// 별 찍기
			for (int j = 1; j <= i * 2 - 1; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		return; // return을 만나면 호출한곳으로 돌아가며, 리턴 타입이 void인 경우에만 return을 생략할 수 있다.
	}
	
	// 문자가 소문자인 경우 대문자로 변환하는 메소드
	public char upper(char c) {
		return c >= 'a' && c <= 'z' ? (char)(c-32) : c;
	}
	
	// 평점 : 95 ~ 100 4.5 , 90 ~ 94 4.0, 0 ~ 59 : 0
	public double grade(int s) {
		double a;
		if(s >= 95 && s <= 100) {
			a = 4.5;
		} else if (s >= 90 && s <= 94) {
			a = 4.0;
		} else if (s >= 85 && s <= 89) {
			a = 3.5;
		} else if (s >= 80 && s <= 84) {
			a = 3.0;
		} else if (s >= 75 && s <= 79) {
			a = 2.5;
		} else if (s >= 70 && s <= 74) {
			a = 2.0;
		} else if (s >= 65 && s <= 69) {
			a = 1.5;
		} else if (s >= 60 && s <= 64) {
			a = 1.0;
		} else {
			a = 0.0;
		}
		
		return a;
	}
	
	// 점수에 따른 판정 구하기, 90 ~ 100 : 수 / 80 ~ 89 : 우 ... 0 ~ 59 : 가
	public String hakjeom(int s) {
		String result;
		
		switch(s / 10) {
		case 10 :
		case 9 : result = "수"; break;
		case 8 : result = "우"; break;
		case 7 : result = "미"; break;
		case 6 : result = "양"; break;
		// s 상수에 음수나 case문에 없는 경우가 올 수 있기 때문에 default처리
		default : result = "가"; break; 
		}
		
		return result;
		
		/*switch(s / 10) {
		case 9 : return "수";
		case 8 : return "우";
		case 7 : return "미";
		case 6 : return "양";
		// s 상수에 음수나 case문에 없는 경우가 올 수 있기 때문에 default처리
		default : return "가"; 
		}*/
	}
	
	// 해당 단의 구구단 출력 (단, 단이 1 ~ 9 사이가 수가 아니면 아무것도 출력하지 않는다.)
	public void gugudan(int dan) {
		
		/*if (dan < 1 || dan > 9) {
			System.out.println("");
		} else {
			System.out.print(dan + "단 : \n");
			for(int i = 1; i <= 9; i++) {
				System.out.print(dan + " * " + i + " : " + dan * i);
				System.out.println();
			}
		}*/
		
		// 2)
		if (dan < 1 || dan > 9) {
			return;
		}
		
		System.out.print(dan + "단 : \n");
		for(int i = 1; i <= 9; i++) {
			System.out.print(dan + " * " + i + " : " + dan * i + "\n");
		}
		
		// return; // 리턴 타입이 void일 경우 생략 가능
	}
}

public class Method_Ex {

	public static void main(String[] args) {
		Ex1 ee = new Ex1(); // 객체 생성
		
		int s;
		
		s = ee.sum(100);
		System.out.println(s); // 정수
		
		s = ee.sum(20);
		System.out.println(s); // 정수
		
		ee.sum(20); // 호출은 가능하지만 결과값을 받을 수 없다. 오류는 아님
		
		System.out.println("10이 짝수입니까 ? : " + ee.isEven(10)); // boolean
		
		ee.trangle(5); // void 메소드 호출
		
		// 소문자 -> 대문자로 변환 
		// 출력 1)
		/*char a;
		
		a = ee.upper('c');
		System.out.println("대문자는 : " + ee.upper(a));*/

		// 출력 2)
		System.out.println("대문자는 : " + ee.upper('c'));
		
		// 평점 출력
		int b = 59;
		double c;
		c = ee.grade(b);
		System.out.println("평점 : " + c);
		
		// 판정 출력
		b = 70;
		String result;
		result = ee.hakjeom(b);
		System.out.println("판정 : " + result);
		
		// 구구단
		/*int d = 3;
		ee.gugudan(d);*/
		
		ee.gugudan(3);
	}
}
