package ex1227;

/* 날짜 : 2018.12.27
 * 내용 : enum
 * 기타 : 
 * */

enum City {
	// 상수에 값을 할당 => 생성자를 만들어야 한다.
	SEOUL("서울", 1000), BUSAN("부산", 300), INCHEON("인천", 300);
	
	private String name;
	private int num;
	
	// 생성자는 반드시 private로 생략하면 private
	private City(String name, int num) {
		this.name = name;
		this.num = num;
	}
	
	public String getName() {
		return name;
	}
	
	public int getNum() {
		return num;
	}
	
	@Override
	public String toString() {
		return this.name() + " -> " + this.num;
	}
}

public class Enum_Ex3 {

	public static void main(String[] args) {
		System.out.println(City.SEOUL); // toString()을 재정의 하지 않을 경우, "SEOUL" 출력
		System.out.println(City.SEOUL.getNum());
		
		for (City c : City.values()) {
			//System.out.println(c);
			System.out.println(c.getName() + " : " + c.getNum());
		}
	}

}
