package ex1213;

import java.util.Scanner;

/* ��¥ : 2018.12.12
 * ���� : this �׽�Ʈ
 * ��Ÿ : 
 * */

class Test7 {
	// �ν��Ͻ� ����
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	
	// set ���� �־��ִ� �뵵
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	// set ���� �־��ִ� �뵵
	public void setAge(int age) {
		this.age = age;
	}

	public void print() {
		System.out.println(name + " : " + age);
	}
}

public class This_Ex4 {

	public static void main(String[] args) {
		Test7 t = new Test7();
		
		t.setName("a");
		t.setAge(10);
		
		System.out.println(t.getName());
		
		t.print();
	}

}
