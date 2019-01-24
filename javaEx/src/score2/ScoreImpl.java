package score2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* ��¥ : 2018.12.24
 * ���� : Score Interface ���� 
 * ��Ÿ : �������̽� ���� �� �޼ҵ� ������ �ʼ�
 * */

public class ScoreImpl implements Score {
	private List<ScoreVO> list = new ArrayList<>(); // ������ ����
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // �Է�

	@Override
	public void input() {
		try {
			ScoreVO vo = new ScoreVO();
			
			System.out.println("�й��� �Է����ּ���");
			vo.setHak(br.readLine());
			
			System.out.println("�̸��� �Է����ּ���");
			vo.setName(br.readLine());
			
			vo.setKor(inputScroe("����"));
			vo.setEng(inputScroe("����"));
			vo.setMat(inputScroe("����"));
			
			list.add(vo);
			
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
		// �̸��� ���� (��������)
		System.out.println("��ü �ο� �� : " + list.size());
		
		System.out.println("�й�\t�̸�\t����\t����\t����\t����\t���");
		
		Comparator<ScoreVO> c = new Comparator<ScoreVO>() {

			@Override
			public int compare(ScoreVO o1, ScoreVO o2) {
				return o1.getName().compareTo(o2.getName());
			}
			
		}; 
		
		Collections.sort(list, c);
		
		for (ScoreVO vo : list) {
			System.out.print(vo.getHak() + "\t");
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
		System.out.println("�̸� �˻�");
		
		String name;
		
		try {
			System.out.println("�˻��� �̸��� �Է����ּ���.");
			name = br.readLine();
			
			System.out.println("�й�\t�̸�\t����\t����\t����\t����\t���");
			
			for (ScoreVO vo : list) {
				if (vo.getName().startsWith(name)) {
					System.out.print(vo.getHak() + "\t");
					System.out.print(vo.getName() + "\t");
					System.out.print(vo.getKor() + "\t");
					System.out.print(vo.getEng() + "\t");
					System.out.print(vo.getMat() + "\t");
					System.out.print(vo.total() + "\t");
					System.out.print(vo.ave() + "\n");
				}
			}
			
			System.out.println();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	@Override
	public void searchHak() {
		String hak;
		
		try {
			System.out.println("�˻��� �й��� �Է����ּ���.");
			hak = br.readLine(); // readLine (checked exception)
			
			ScoreVO vo = readScore(hak);
			
			if (vo == null) {
				System.out.println("��ϵ� ������ �����ϴ�.");
				return;
			}
			
			System.out.println("�й�\t�̸�\t����\t����\t����\t����\t���");
			
			System.out.print(vo.getHak() + "\t");
			System.out.print(vo.getName() + "\t");
			System.out.print(vo.getKor() + "\t");
			System.out.print(vo.getEng() + "\t");
			System.out.print(vo.getMat() + "\t");
			System.out.print(vo.total() + "\t");
			System.out.print(vo.ave() + "\n");
		} catch (IOException e) {
			System.out.println(e.toString());
		}
		
		System.out.println();
	}

	@Override
	public void update() {
		System.out.println("����");
		
		String hak;
		
		try {
			System.out.println("������ �й��� �Է����ּ���.");
			hak = br.readLine(); // readLine (checked exception)
			
			ScoreVO vo = readScore(hak);
			
			if (vo == null) {
				System.out.println("��ϵ� ������ �����ϴ�.");
				return;
			}
			
			System.out.println("�̸��� �Է����ּ���.");
			vo.setName(br.readLine());
			
			vo.setKor(inputScroe("����"));
			vo.setEng(inputScroe("����"));
			vo.setMat(inputScroe("����"));
			
			System.out.println("�����͸� �����߽��ϴ�.");
		} catch (IOException e) {
			System.out.println(e.toString());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println();
	}

	@Override
	public void delete() {
		String hak;
		
		try {
			System.out.println("������ �й��� �Է����ּ���.");
			hak = br.readLine(); // readLine (checked exception)
			
			ScoreVO vo = readScore(hak);
			
			if (vo == null) {
				System.out.println("��ϵ� ������ �����ϴ�.");
				return;
			}
			
			System.out.println("�й�\t�̸�\t����\t����\t����\t����\t���");
			
			System.out.print(vo.getHak() + "\t");
			System.out.print(vo.getName() + "\t");
			System.out.print(vo.getKor() + "\t");
			System.out.print(vo.getEng() + "\t");
			System.out.print(vo.getMat() + "\t");
			System.out.print(vo.total() + "\t");
			System.out.print(vo.ave() + "\n");
			
			System.out.println("�����Ͻðڽ��ϱ�? [Y/N]");
			
			char c = br.readLine().charAt(0);
			
			if (c == 'N' || c != 'Y') {
				return;
			}
			
			list.remove(vo);
			
			System.out.println("�����͸� �����߽��ϴ�.");
			
		} catch (IOException e) {
			System.out.println(e.toString());
		}
		
		System.out.println();
	}
	
	// ���� Ȯ�ο� �޼ҵ�
	private int inputScroe(String title) throws Exception {
		int n = 0;
		
		try {
			System.out.print(title + " ������? ");
			n = Integer.parseInt(br.readLine()); // String => int������ ��ȯ
			
			// ������ 0 ~ 100���̰� �ƴ� ��� ���� �߻� ó��
			if (n < 0 || n > 100) {
				throw new Exception("������ 0 ~ 100���̸� �Է� �����մϴ�.");
			}
		} catch (NumberFormatException e) { // ������ ���ڰ� �ƴ� ��� ���� �߻�
			throw new Exception("������ ���ڸ� �����մϴ�.");
		} catch (Exception e) {
			throw e;
		}
		
		return n;
	}
	
	// �й� Ȯ�ο� �޼ҵ�
	private ScoreVO readScore(String hak) {
		ScoreVO vo = null;
				
		Iterator<ScoreVO> it = list.iterator();
		
		while (it.hasNext()) {
			ScoreVO data = it.next();
			
			if (data.getHak().equals(hak)) {
				vo = data;
				
				break;
			}
		}
		
		return vo;
	}

	@Override
	public void sortTot() {
		// ���� ���� (��������)
		System.out.println("��ü �ο� �� : " + list.size());

		System.out.println("�й�\t�̸�\t����\t����\t����\t����\t���");

		Comparator<ScoreVO> c = new Comparator<ScoreVO>() {

			@Override
			public int compare(ScoreVO o1, ScoreVO o2) {
				return -(o1.total() - o2.total());
			}

		};

		Collections.sort(list, c);

		for (ScoreVO vo : list) {
			System.out.print(vo.getHak() + "\t");
			System.out.print(vo.getName() + "\t");
			System.out.print(vo.getKor() + "\t");
			System.out.print(vo.getEng() + "\t");
			System.out.print(vo.getMat() + "\t");
			System.out.print(vo.total() + "\t");
			System.out.print(vo.ave() + "\n");
		}

		System.out.println();
	}
}
