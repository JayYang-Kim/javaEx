package ex1226;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* ��¥ : 2018.12.26
 * ���� : Map interface 
 * ��Ÿ : map������ �߰��Ҷ� put�޼ҵ带 ����Ѵ�.
 *      list, set������ �߰��Ҷ� add�޼ҵ带 ���
 *      map�� �ݺ��ڰ� ����
 * */

public class Map_Ex {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		// map.put (�Է�)
		// list.add, set.add (�Է�)
		map.put("seoul", 1000);
		map.put("incheon", 270);
		map.put("busan", 250);
		map.put("seoul", 990); // key���� �����ϰ� value�� ������ ��� value�� ������
		
		System.out.println(map);
		
		// key�� �����Ͽ� value���
		int n = map.get("busan");
		System.out.println(n);
		
		// map�� key�� set�̹Ƿ� key�� �̿��Ͽ� �ݺ��ڷ� ��ȯ�Ͽ� ��ü�� ������ �� �ִ�.
		// ��ü ������ ��� - 1
		System.out.println("��ü ������ ��� - 1");
		
		Iterator<String> it = map.keySet().iterator();
		
		while (it.hasNext()) {
			String key = it.next();
			Integer value = map.get(key);
			
			System.out.println(key + " : " + value);
		}
		
		System.out.println();
		
		// ��ü ������ ��� - 2
		// foreach
		System.out.println("��ü ������ ��� - 2");
		
		for (String s : map.keySet()) {
			Integer i = map.get(s);
			
			System.out.println(s + " : " + i); // s : key, i : value
		}
		
		System.out.println();
		
		// ��ü ������ ��� - 3
		System.out.println("��ü ������ ��� - 3");
		
		Set<Map.Entry<String, Integer>> set = map.entrySet();
		
		Iterator<Map.Entry<String, Integer>> it2 = set.iterator();
		
		while (it2.hasNext()) {
			Map.Entry<String, Integer> e = it2.next();
			System.out.println(e.getKey() + " : " + e.getValue());
		}
		
		System.out.println();
		
		// ��ü ������ ��� - 4
		System.out.println("��ü ������ ��� - 4");
		for (Map.Entry<String, Integer> m : map.entrySet()) {
			System.out.println(m.getKey() + " : " + m.getValue());
		}
		
		System.out.println();
	}
}
