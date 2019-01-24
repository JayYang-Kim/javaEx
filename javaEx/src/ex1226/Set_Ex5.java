package ex1226;

import java.util.Set;
import java.util.TreeSet;

/* ��¥ : 2018.12.26
 * ���� : set interface
 * ��Ÿ : 
 * */

class User5 {
	private String name;
	private int age;
	
	// ������
	public User5() {
		
	}
	
	// ������ (����)
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
		Set<User5> set = new TreeSet<>(); // [��Ÿ�� ����] java.lang.Comparable : �������̽��� ������ Ŭ������ TreeSet ��� ����
		
		set.add(new User5("�ڹ�", 10));
		set.add(new User5("������", 7));
		set.add(new User5("��", 8));
		
		for (User5 u : set) {
			System.out.println(u.getName() + " : " + u.getAge());
		}
		
		System.out.println();
	}

}
