package score3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ScoreImpl implements Score {
	private Map<String, ScoreVO> map = new HashMap<>();
	// private Scanner sc=new Scanner(System.in);
	private BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

	@Override
	public void input() {
		System.out.println("\n������ �Է�...");
		
		try {
			String hak;
			
			System.out.println("�й��� �Է����ּ���.");
			hak = br.readLine();
			
			if (map.containsKey(hak)) { // �й� ���� �����Ͱ� �����ϸ� true
				System.out.println("�̹� ������ �й��Դϴ�.");
				return;
			}
			
			ScoreVO vo = new ScoreVO();
			
			System.out.print("�̸��� �Է����ּ���.");
			vo.setName(br.readLine());
			
			System.out.print("���� ? ");
			vo.setKor(Integer.parseInt(br.readLine()));
			System.out.print("���� ? ");
			vo.setEng(Integer.parseInt(br.readLine()));
			System.out.print("���� ? ");
			vo.setMat(Integer.parseInt(br.readLine()));
			
			map.put(hak, vo);
			
			System.out.println("ȸ������ �Ϸ�");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		System.out.println();
	}

	@Override
	public void print() {
		System.out.println("\n��ü ����Ʈ...");
		System.out.println("��ü�ο��� : " + map.size());
		
		Iterator<String> it = map.keySet().iterator();
		
		while (it.hasNext()) {
			String hak = it.next();
			ScoreVO vo = map.get(hak);
			
			System.out.println(hak);
			System.out.println(vo.getName());
			System.out.println(vo.getKor());
			System.out.println(vo.getEng());
			System.out.println(vo.getMat());
			System.out.println(vo.getTot());
		}
		
		System.out.println();
	}

	@Override
	public void searchName() {
		System.out.println("\n�̸� �˻�...");
		
		try {
			String name;
			
			System.out.println("�̸��� �Է����ּ���.");
			name = br.readLine();
			
			Iterator<String> it = map.keySet().iterator();
			
			while (it.hasNext()) {
				String hak = it.next();
				ScoreVO vo = map.get(hak);
				
				if (vo.getName().startsWith(name)) {
					System.out.println(hak);
					System.out.println(vo.getName());
					System.out.println(vo.getKor());
					System.out.println(vo.getEng());
					System.out.println(vo.getMat());
					System.out.println(vo.getTot());
				}
				
				System.out.println();
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	@Override
	public void searchHak() {
		System.out.println("\n�й� �˻�...");
		
		try {
			String hak;
			
			System.out.println("�й��� �Է����ּ���.");
			hak = br.readLine();
			
			if (!map.containsKey(hak)) { // �й� ���� �����Ͱ� �����ϸ� true
				System.out.println("�������� �ʴ� �й��Դϴ�.");
				return;
			}
			
			ScoreVO vo = map.get(hak); // null�� �����ϸ� �������� �ʴ´�.
			
			System.out.println(hak);
			System.out.println(vo.getName());
			System.out.println(vo.getKor());
			System.out.println(vo.getEng());
			System.out.println(vo.getMat());
			System.out.println(vo.getTot());
		} catch (IOException e) {
			System.out.println(e.toString());
		}
	}

	@Override
	public void update() {
		System.out.println("\n������ ����...");
		
		try {
			String hak;
			
			System.out.println("�й��� �Է����ּ���.");
			hak = br.readLine();
			
			ScoreVO vo = map.get(hak); // null�� �����ϸ� �������� �ʴ´�.
			
			if (vo == null) {
				System.out.println("�������� �ʴ� �й��Դϴ�.");
				return;
			}
			
			System.out.print("�̸��� �Է����ּ���.");
			vo.setName(br.readLine());
			
			System.out.print("���� ? ");
			vo.setKor(Integer.parseInt(br.readLine()));
			System.out.print("���� ? ");
			vo.setEng(Integer.parseInt(br.readLine()));
			System.out.print("���� ? ");
			vo.setMat(Integer.parseInt(br.readLine()));
			
			System.out.println("������ �����Ϸ�");
		} catch (IOException e) {
			System.out.println(e.toString());
		}
	}

	@Override
	public void delete() {
		System.out.println("\n������ ����...");
		
		try {
			String hak;
			
			System.out.println("�й��� �Է����ּ���.");
			hak = br.readLine();
			
			if (!map.containsKey(hak)) {
				System.out.println("�������� �ʴ� �й��Դϴ�.");
				return;
			}
			
			map.remove(hak);
			
			System.out.println("������ �����Ϸ�");
		} catch (IOException e) {
			System.out.println(e.toString());
		}
	}
}
