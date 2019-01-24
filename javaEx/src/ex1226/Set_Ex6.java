package ex1226;

import java.util.Set;
import java.util.TreeSet;

/* ��¥ : 2018.12.26
 * ���� : set interface
 * ��Ÿ : Comparable
 * */

class User6 implements Comparable<User6> {
	private String name;
	private int age;
	
	// ������
	public User6() {
		
	}
	
	// ������ (����)
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
		//return name.compareTo(o.getName()); // �̸������� ���
		return -name.compareTo(o.getName()); // �̸������� ���
		//return age - o.getAge(); // ���̼����� ��� (��������)
		//return -(age - o.getAge()); // ���̼����� ��� (��������)
	}
}

public class Set_Ex6 {

	public static void main(String[] args) {
		Set<User6> set = new TreeSet<>(); // [��Ÿ�� ����] java.lang.Comparable : �������̽��� ������ Ŭ������ TreeSet ��� ����
		
		set.add(new User6("�ڹ�", 10));
		set.add(new User6("������", 7));
		set.add(new User6("��", 8));
		
		for (User6 u : set) {
			System.out.println(u.getName() + " : " + u.getAge());
		}
		
		System.out.println();
	}

}
