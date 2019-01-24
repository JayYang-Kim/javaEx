package ex1226;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* ��¥ : 2018.12.26
 * ���� : set interface
 * ��Ÿ : Sort
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
		// �̸����� ������ ��� �ٸ� �������� ������ �Ұ���
		return name.compareTo(o.getName()); // �̸� (��������)
	}
}

public class Set_Sort_Ex {

	public static void main(String[] args) {
		List<Ex7> list = new ArrayList<>();
		
		list.add(new Ex7("�ڹ�", 2));
		list.add(new Ex7("�ȵ���̵�", 50));
		list.add(new Ex7("��", 55));
		list.add(new Ex7("������", 70));
		list.add(new Ex7("������", 90));
		
		Collections.sort(list); // comparable ���� Ŭ������ ����
		
		for (Ex7 e : list) {
			System.out.println(e.getName() + " : " + e.getAge());
		}
		
		System.out.println();
	}

}
