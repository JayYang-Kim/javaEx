package ex1203;

/* 날짜 : 2018.12.03
 * 내용 : print 테스트
 * 기타 : 이름변경 (class파일 > 우클릭 > Refactor > Rename)
 * */
public class PrintEx {
	
	public static void main(String[] args) {
		System.out.print("Java");
		System.out.print("Web");
		System.out.print("Html5\n");
		System.out.print("CSS3");
		System.out.print("Spring");
		
		//System.out.print(); // [컴파일 오류] print() 메소드는 반드시 하나의 인수를 가져야한다.
		
		System.out.println(); // 라인 넘김, System.out.print("\n"); (동일)
		System.out.println("자바");
		System.out.println("웹");
		System.out.println("스프링");
		
		System.out.println("A\tB\tC\t\\"); // \t 탭과 같은 기능 ex) A	B	C \
		
		System.out.println("자바" + 8); // 문자열과 다른 인자가 합쳐지면 문자열로 인식
	}
	
}