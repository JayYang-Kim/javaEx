package ex1226;

import java.util.Set;
import java.util.TreeSet;

/* 날짜 : 2018.12.26
 * 내용 : set interface
 * 기타 : 
 * */

class User5 {
	private String name;
	private int age;
	
	// 생성자
	public User5() {
		
	}
	
	// 생성자 (인자)
	public User5(String name, int age) {
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
}

public class Set_Ex5 {

	public static void main(String[] args) {
		//Set<User5> set = new HashSet<>();
		Set<User5> set = new TreeSet<>(); // [런타임 오류] java.lang.Comparable : 인터페이스를 구현한 클래스만 TreeSet 사용 가능
		
		set.add(new User5("자바", 10));
		set.add(new User5("스프링", 7));
		set.add(new User5("웹", 8));
		
		for (User5 u : set) {
			System.out.println(u.getName() + " : " + u.getAge());
		}
		
		System.out.println();
	}

}
