package ex1227;

/* 날짜 : 2018.12.27
 * 내용 : Lambda
 * 기타 : 익명 클래스
 * */

interface Demo9 {
	public void print();
}

public class Lambda_Ex { // Lambda_Ex$
	public static void main(String[] args) {
		Demo9 dd = new Demo9() {

			@Override
			public void print() {
				System.out.println("익명 클래스");
				
			}
			
		};
		
		dd.print();
	}
}
