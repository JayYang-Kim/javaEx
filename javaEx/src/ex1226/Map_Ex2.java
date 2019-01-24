package ex1226;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* ��¥ : 2018.12.26
 * ���� : Map interface 
 * ��Ÿ : 
 * */

public class Map_Ex2 {
	public static void main(String[] args) {
		Map<String, Integer> map = new Hashtable<>(); // ����ȭ ����
		
		map.put("�ڹ�", 90);
		map.put("������", 100);
		map.put("������", 60);
		map.put("����Ŭ", 80);
		map.put("��", 90);
		
		// map�� value�� List�� ��ȯ
		List<Integer> list = new LinkedList<>(map.values());
		
		System.out.println(list);
		
		// Map�� value�� Collection���� ��ȯ
		Collection<Integer> c = map.values();
		
		for (int n : c) {
			System.out.println(n);
		}
	}
}
