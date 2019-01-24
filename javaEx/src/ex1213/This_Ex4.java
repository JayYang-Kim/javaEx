package ex1213;

import java.util.Scanner;

/* 날짜 : 2018.12.12
 * 내용 : this 테스트
 * 기타 : 
 * */

class Test7 {
	// 인스턴스 변수
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	
	// set 값을 넣어주는 용도
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	// set 값을 넣어주는 용도
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
