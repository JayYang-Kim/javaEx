package ex1220;

/* 날짜 : 2018.12.20
 * 내용 : Interface
 * 기타 : 
 * */

// 인터페이스 설계
interface Fruit {
	public String getName();
	public int getPrice();
}

// 인터페이스 구현
class Apple implements Fruit {

	@Override
	public String getName() {
		return "사과";
	}

	@Override
	public int getPrice() {
		return 1000;
	}
	
}

class Orange implements Fruit {

	@Override
	public String getName() {
		return "오렌지";
	}

	@Override
	public int getPrice() {
		return 2000;
	}
	
}

public class Interface_Ex4 {
	public static void packing(Fruit f) {
		System.out.println(f.getName() + " : " + f.getPrice());
	}
	
	public static void main(String[] args) {
		Apple a = new Apple();
		
		packing(a);
		
		Orange o = new Orange();
		
		packing(o);
	}

}
