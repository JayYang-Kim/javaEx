package ex1220;

/* ��¥ : 2018.12.20
 * ���� : Interface
 * ��Ÿ : 
 * */

// �������̽� ����
interface Fruit {
	public String getName();
	public int getPrice();
}

// �������̽� ����
class Apple implements Fruit {

	@Override
	public String getName() {
		return "���";
	}

	@Override
	public int getPrice() {
		return 1000;
	}
	
}

class Orange implements Fruit {

	@Override
	public String getName() {
		return "������";
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
