package ex1226;

import java.util.Map;
import java.util.TreeMap;

/* ��¥ : 2018.12.26
 * ���� : Map interface 
 * ��Ÿ : 
 * */

public class Map_Ex3 {
	public static void main(String[] args) {
		//Map<String, String> map = new HashMap<>(); // ������� �������� ����
		//Map<String, String> map = new LinkedHashMap<>(); // �Է¼��� ����
		Map<String, String> map = new TreeMap<>(); // Ű�� ���� (��, Ű�� comparable �������̽��� �����Ǿ� �־���Ѵ�.)
		
		map.put("ȫ�浿", "����");
		map.put("��浿", "���");
		map.put("���浿", "����");
		map.put("��浿", "��õ");
		map.put("���浿", "�λ�");
		map.put("��浿", "��õ");
		
		System.out.println(map);
		
		// contains(Key, Value) : �����ϴ��� Ȯ�� 
		// Ű�� �����ϴ��� üũ
		if (map.containsKey("��浿")) {
			System.out.println("��浿�� Ű�� ����");
		} else {
			System.out.println("��赿�� Ű�� �������� ����");
		}
		
		// ���� �����ϴ��� üũ
		if (map.containsValue("����")) {
			System.out.println("���� ���� ����");
		} else {
			System.out.println("���� ���� �������� ����");
		}
		
		// �� ����
		map.remove("ȫ�浿");
		System.out.println(map);
	}
}
