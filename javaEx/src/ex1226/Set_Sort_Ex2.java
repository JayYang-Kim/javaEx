package ex1226;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* ��¥ : 2018.12.26
 * ���� : set interface
 * ��Ÿ : Sort
 * */

class Ex8 {
	private String name;
	private int age;
	
	public Ex8() {
		
	}
	
	public Ex8(String name, int age) {
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

public class Set_Sort_Ex2 {

	public static void main(String[] args) {
		List<Ex8> list = new ArrayList<>();
		
		list.add(new Ex8("�ڹ�", 2));
		list.add(new Ex8("�ȵ���̵�", 50));
		list.add(new Ex8("��", 55));
		list.add(new Ex8("������", 70));
		list.add(new Ex8("������", 90));
		
		// �̸��� ����
		Comparator<Ex8> comp = new Comparator<Ex8>() {

			@Override
			public int compare(Ex8 o1, Ex8 o2) {
				return o1.getName().compareTo(o2.getName());
			}
			
		}; 
		
		Collections.sort(list, comp);
		
		for (Ex8 e : list) {
			System.out.println(e.getName() + " : " + e.getAge());
		}
		
		System.out.println();
	}

}
