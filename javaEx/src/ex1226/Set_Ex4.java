package ex1226;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/* ��¥ : 2018.12.26
 * ���� : set interface
 * ��Ÿ : 
 * */

public class Set_Ex4 {

	public static void main(String[] args) {
		// Set => List
		Set<String> set = new HashSet<>();
		
		set.add("�ڹ�");
		set.add("�ȵ���̵�");
		set.add("������");
		set.add("�����α׷���");
		set.add("����");
		
		System.out.println(set);
		
		// Set => List
		List<String> list = new LinkedList<>(set);
		System.out.println(list);
	}

}
