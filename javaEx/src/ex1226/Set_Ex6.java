package ex1226;

import java.util.Set;
import java.util.TreeSet;

/* 날짜 : 2018.12.26
 * 내용 : set interface
 * 기타 : Comparable
 * */

class User6 implements Comparable<User6> {
	private String name;
	private int age;
	
	// 생성자
	public User6() {
		
	}
	
	// 생성자 (인자)
	public User6(String name, int age) {
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
	public int compareTo(User6 o) {
		//return name.compareTo(o.getName()); // 이름순으로 출력
		return -name.compareTo(o.getName()); // 이름순으로 출력
		//return age - o.getAge(); // 나이순으로 출력 (오름차순)
		//return -(age - o.getAge()); // 나이순으로 출력 (내림차순)
	}
}

public class Set_Ex6 {

	public static void main(String[] args) {
		Set<User6> set = new TreeSet<>(); // [런타임 오류] java.lang.Comparable : 인터페이스를 구현한 클래스만 TreeSet 사용 가능
		
		set.add(new User6("자바", 10));
		set.add(new User6("스프링", 7));
		set.add(new User6("웹", 8));
		
		for (User6 u : set) {
			System.out.println(u.getName() + " : " + u.getAge());
		}
		
		System.out.println();
	}

}
