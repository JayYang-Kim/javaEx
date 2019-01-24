package ex1226;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 날짜 : 2018.12.26
 * 내용 : set interface
 * 기타 : Sort
 * */

class Ex7 implements Comparable<Ex7> {
	private String name;
	private int age;
	
	public Ex7() {
		
	}
	
	public Ex7(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(Ex7 o) {
		// 이름으로 정렬할 경우 다른 기준으로 정렬이 불가능
		return name.compareTo(o.getName()); // 이름 (오름차순)
	}
}

public class Set_Sort_Ex {

	public static void main(String[] args) {
		List<Ex7> list = new ArrayList<>();
		
		list.add(new Ex7("자바", 2));
		list.add(new Ex7("안드로이드", 50));
		list.add(new Ex7("웹", 55));
		list.add(new Ex7("스프링", 70));
		list.add(new Ex7("빅데이터", 90));
		
		Collections.sort(list); // comparable 구현 클래스만 가능
		
		for (Ex7 e : list) {
			System.out.println(e.getName() + " : " + e.getAge());
		}
		
		System.out.println();
	}

}
