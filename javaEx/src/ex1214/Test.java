package ex1214;

class Test1 {
	private int age = 12;
	private String name;
	public Test1() {
		
	}
	public Test1(String n) {
		name = n;
	}
	public void print() {
		System.out.println(name + " : " + age);
	}
}

public class Test {
	public static void main(String[] args) {
		String n = "½ºÇÁ¸µ";
		Test1 tt = new Test1();
		tt.print();
	}
}
