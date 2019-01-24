package ex1227;

/* ��¥ : 2018.12.27
 * ���� : enum
 * ��Ÿ : 
 * */

enum City {
	// ����� ���� �Ҵ� => �����ڸ� ������ �Ѵ�.
	SEOUL("����", 1000), BUSAN("�λ�", 300), INCHEON("��õ", 300);
	
	private String name;
	private int num;
	
	// �����ڴ� �ݵ�� private�� �����ϸ� private
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
		System.out.println(City.SEOUL); // toString()�� ������ ���� ���� ���, "SEOUL" ���
		System.out.println(City.SEOUL.getNum());
		
		for (City c : City.values()) {
			//System.out.println(c);
			System.out.println(c.getName() + " : " + c.getNum());
		}
	}

}
