package ex1213;

/* 날짜 : 2018.12.13
 * 내용 : 클래스와 객체 정리 - 개요 및 필드
 * 기타 : 1) 클래스는 속성(Attribute)와 행위(Behavior)를 정의한 것
 *      2) 객체는 클래스로부터 생성된다. (즉, 클래스는 객체를 생성하는 틀이다.)
 *      
 *      [클래스 작성 순서] 
 *      - 객체 모델링(추상화) > 클래스 설계 > 객체 생성 > 생성된 객체 이용
 *      
 *      [객체]
 *      1) 관련있는 데이터와 코드를 하나로 묶는 구성 단위
 *      2) 효율적 정보 관리하기 위함이고 사람들이 의미를 부여하고 분류하는 논리적인 단위
 * */

// 클래스 생성
//public class Test { // [컴파일 오류] 클래스에서 public은 한 영역에서 한 번만 사용 가능
class Task { // 클래스 이름은 식별자로 사용자에 의해 생성되며, 일반적으로 대문자로 시작
	// 필드(Field) : 클래스의 변수로 클래스에서 사용한 변수 (모든 자료형 사용될 수 있으며, 필드에 대한 접근 제한 가능)
	private String name; // 인스턴스 변수 : 객체가 메모리를 할당 받을 때 마다 새로운 저장 공간을 할당 받는다. (객체마다 메모리 할당)
	private int age; // 인스턴스 변수 : 힙(heap) 영역에 메모리를 할당 받는다. 
	                 // (객체가 null이 되거나 객체를 더 이상 참조하지 않게 되었을때 가비지 컬렉터에 의해 메모리가 해제) 
	private static char eng = 'a'; // 클래스 변수 (static추가) : 클래스가 로딩될때 단 한번 메모리가 할당 되며, 객체 생성과 무관하게 사용가능
	                               // 외부에서 접근 가능, 메소드영역에 메모리를 할당 받으며, 클래스 변수는 프로그램이 종료 될 때 소멸
								   // 클래스 변수는 클래스 이름을 통하여 접근
	
	// 생성자(Constructor) : 생성자는 클래스와 동일한 이름을 가지며 객체 생성 및 초기화를 위해 호출됨
	// 생성자를 만들지 않을 경우, 컴파일 할때 디폴트 생성자가 생성됨
	public Task() {
		
	}
	
	// 메소드(Method) : 생성된 객체가 수행할 수 있는 행동 구현
	public String setName() { // 인스턴스 메소드
		int a; // 지역변수 : 메소드나 생성자 내부에서 쓰이며 초기화 블록 내부에 선언된 변수
		       // 메소드를 호출할때 Stack영역에 메모리를 할당 받고 메소드가 종료되면 소멸
		a = 10;
		
		return name;
	}
	
	public int setAge(int a) { // 인스턴스 메소드 / (int a) : 매개변수 (Parameters)
		                       // 매개변수(Parameters) : 메소드를 호출하는 곳에서 메소드에 값을 전달하기 위해 사용되는 지역변수
		return age;
	}
	
	public static char setEng() { // 클래스 메소드 (static추가)
		//System.out.println(name + " , " + a + " , " + eng);
		
		System.out.println(eng);
		
		return eng;
	}
}

// [클래스 접근 권한] 
// 1) 생략(디폴트) : 동일한 패키지 내에 있는 클래스에서 객체 생성 가능
// 2) public : 제약없이 어디에서나 객체 생성 가능 (public은 한 영역에서 한 번만 사용 가능)
// 3) private, protected : 독립 클래스에서 사용 불가, 중첩 클래스에서 사용 가능
public class Task_Ex { // public[접근권환] class[클래스키워드] Task_Ex[클래스 이름]
	
	// main에서 static을 지우게 된다면 클래스 메소드가있는 main을 찾는다.
	public static void main(String[] args) {
		
	}

}