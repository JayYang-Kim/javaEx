package score2.map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* ��¥ : 2018.12.26
 * ���� : Score Interface ���� 
 * ��Ÿ : �������̽� ���� �� �޼ҵ� ������ �ʼ�
 * */

public class ScoreImpl implements Score {
	private Map<String, ScoreVO> map = new HashMap<>(); // ������ ����
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // �Է�

	@Override
	public void input() {
		try {
			ScoreVO vo = new ScoreVO();
			
			System.out.println("�й��� �Է����ּ���");
			String hak = br.readLine();
			
			// �й� �ߺ� üũ
			if (map.containsKey(hak)) {
				System.out.println("�̹� ������ �й��Դϴ�.");
				return;
			}
			
			System.out.println("�̸��� �Է����ּ���");
			vo.setName(br.readLine());
			
			System.out.print("���� ����? ");
			vo.setKor(Integer.parseInt(br.readLine()));
			System.out.print("���� ����? ");
			vo.setEng(Integer.parseInt(br.readLine()));
			System.out.print("���� ����? ");
			vo.setMat(Integer.parseInt(br.readLine()));
			
			map.put(hak, vo);
			
			System.out.println("�����͸� �����߽��ϴ�.");
		} catch (IOException e) {
			System.out.println(e.toString());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println();
	}

	@Override
	public void print() {
		System.out.println("��ü �ο� �� : " + map.size());
		
		System.out.println("�й�\t�̸�\t����\t����\t����\t����\t���");
		
		for (String s : map.keySet()) {
			ScoreVO vo = map.get(s);
			
			System.out.print(s + "\t");
			System.out.print(vo.getName() + "\t");
			System.out.print(vo.getKor() + "\t");
			System.out.print(vo.getEng() + "\t");
			System.out.print(vo.getMat() + "\t");
			System.out.print(vo.total() + "\t");
			System.out.print(vo.ave() + "\n");
		}
		
		System.out.println();
	}

	@Override
	public void searchName() {
		try {
			System.out.println("ã���� �̸��� �Է����ּ���.");
			String name = br.readLine();
			
			for (String s : map.keySet()) {
				ScoreVO vo = map.get(s);
				
				if (vo.getName().startsWith(name)) {
					System.out.print(s + "\t");
					System.out.print(vo.getName() + "\t");
					System.out.print(vo.getKor() + "\t");
					System.out.print(vo.getEng() + "\t");
					System.out.print(vo.getMat() + "\t");
					System.out.print(vo.total() + "\t");
					System.out.print(vo.ave() + "\n");
				} else {
					System.out.println("ã���ô� �̸��� �����ϴ�.");
				}
				
				System.out.println();
			}
		} catch (IOException e) {
			System.out.println(e.toString());
		}
	}

	@Override
	public void searchHak() {
		try {
			System.out.println("ã���� �й��� �Է����ּ���.");
			String hak = br.readLine();
			
			if (!map.containsKey(hak)) {
				System.out.println("�й��� ã�� �� �����ϴ�.");
				return;
			}
			
			ScoreVO vo = map.get(hak);
			
			System.out.print(hak + "\t");
			System.out.print(vo.getName() + "\t");
			System.out.print(vo.getKor() + "\t");
			System.out.print(vo.getEng() + "\t");
			System.out.print(vo.getMat() + "\t");
			System.out.print(vo.total() + "\t");
			System.out.print(vo.ave() + "\n");

		} catch (IOException e) {
			System.out.println(e.toString());
		}
	}

	@Override
	public void update() {
		try {
			System.out.println("������ �й��� �Է����ּ���.");
			String hak = br.readLine();
			
			ScoreVO vo = map.get(hak);
			
			if (vo == null) {
				System.out.println("�������� ���� �й��Դϴ�.");
			}
			
			System.out.print("�̸��� �Է����ּ���.");
			vo.setName(br.readLine());
			
			System.out.print("���� ������ �Է����ּ���.");
			vo.setKor(Integer.parseInt(br.readLine()));
			System.out.print("���� ������ �Է����ּ���.");
			vo.setEng(Integer.parseInt(br.readLine()));
			System.out.print("���� ������ �Է����ּ���.");
			vo.setMat(Integer.parseInt(br.readLine()));
			
			System.out.println("������ �����Ϸ�");
		} catch (IOException e) {
			System.out.println(e.toString());
		}
	}

	@Override
	public void delete() {
		try {
			System.out.println("������ �й��� �Է��� �ּ���.");
			
			String hak = br.readLine();
			
			if (!map.containsKey(hak)) {
				System.out.println("�й��� �����ϴ�.");
				return;
			}
			
			map.remove(hak);
			
			System.out.println("�����͸� �����߽��ϴ�.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
