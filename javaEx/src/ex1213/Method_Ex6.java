package ex1213;

/* 날짜 : 2018.12.12
 * 내용 : 비정형 인자 (Varargs, 가변인수)
 * 기타 : 
 * */

class Ex6 {
	// 비정형 인자
	// 비정형 인자는 내부적으로 배열로 처리 비정형인자는 우측에 한번만
	public int sum(int ...a) { // 내부적으로 배열로 처리
		int s = 0;
		for (int i = 0; i < a.length; i++) {
			s += a[i];
		}
		
		return s;
	}
}

public class Method_Ex6 {
	public static void main(String[] args) {
		Ex6 oo = new Ex6();
		int s;
		
		s = oo.sum(1,2,3,4,5);
		System.out.println(s);
		
		s = oo.sum(1,3,5);
		System.out.println(s);
	}

}
