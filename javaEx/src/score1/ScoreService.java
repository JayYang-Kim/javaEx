package score1;

import java.util.Scanner;

/* ��¥ : 2018.12.18
 * ���� : 
 * ��Ÿ :  
 * */

public class ScoreService extends Score {
	private Scanner sc = new Scanner(System.in);
	private int count;
	
	public void input() {
		System.out.println("������ �Է�");
		
		if (count >= getSize()) { // �迭�� ũ�Ⱑ ���� ��� ����� 10���� �ø���.
			allocation(getSize() + 10);
		}
		
		ScoreVO vo = new ScoreVO();
		
		// ������ �Է�
		System.out.println("�й��� �Է����ּ���.");
		vo.setHak(sc.next());
		
		System.out.println("�̸��� �Է����ּ���.");
		vo.setName(sc.next());
		
		System.out.println("���� ������ �Է����ּ���.");
		vo.setKor(sc.nextInt());
		
		System.out.println("���� ������ �Է����ּ���.");
		vo.setEng(sc.nextInt());
		
		System.out.println("���� ������ �Է����ּ���.");
		vo.setMat(sc.nextInt());
		
		ScoreVO[] list = getList(); // Score��ü�� ������ list������ �ּҸ� ����
		list[count++] = vo;
		
		System.out.println("�����͸� �߰��߽��ϴ�.");
	}
	
	public void print() {
		System.out.println("������ ���");
		
		ScoreVO[] list = getList();
		System.out.println("��ü �ο��� : " + count);
		
		// �ο� �� ��ŭ �ݺ� ó��
		for (int i = 0; i < count; i++) {
			System.out.println(list[i]);
		}
		
		System.out.println();
	}
	
	public void searchHak() {
		System.out.println("\n�й� �˻�");
		
		String hak;
		System.out.println("�˻��� �й��� �Է����ּ���.");
		hak = sc.next();
		
		ScoreVO vo = readScore(hak);
		
		if (vo == null) {
			System.out.println("��ϵ� �ڷᰡ �����ϴ�.\n");
			return;
		}
		
		System.out.println(vo + "\n");
	}
	
	public void searchName() {
		System.out.println("�̸� �˻�");
		
		String name;
		
		System.out.println("�˻��� �̸��� �Է����ּ���.");
		
		name = sc.next();
		
		ScoreVO[] list = getList();
		
		for (int i = 0; i < count; i++) {
			/*if(list[i].getName().indexOf(name) >= 0) {
				
			}*/
			if (list[i].getName().startsWith(name)) { // (String) startsWith : ���ڸ��� ������ ã��
				System.out.println(list[i]);
			}
		}
		
		System.out.println();
	}
	
	public void update() {
		System.out.println("������ ����");
		
		String hak;
		System.out.println("������ �й��� �Է����ּ���.");
		hak = sc.next();
		
		ScoreVO vo = readScore(hak); // ��ġ�� �й��� �ּҰ��� vo�� ����
		
		if (vo == null) {
			System.out.println("��ϵ� �ڷᰡ �ƴմϴ�.\n");
			return;
		}

		// �ּҰ��� vo�� �����Ͽ� �޾Ƽ� �ش� �Ǵ� �ּ��� ���� ���Է�
		System.out.println("�̸��� �Է����ּ���.");
		vo.setName(sc.next());

		System.out.println("���� ������ �Է����ּ���.");
		vo.setKor(sc.nextInt());

		System.out.println("���� ������ �Է����ּ���.");
		vo.setEng(sc.nextInt());

		System.out.println("���� ������ �Է����ּ���.");
		vo.setMat(sc.nextInt());
		
		System.out.println("�����͸� �����߽��ϴ�.");
	}
	
	public void delete() {
		System.out.println("������ ����");
		
		String hak;
		char ch;
		
		System.out.println("������ �й��� �Է����ּ���.");
		hak = sc.next();
		
		ScoreVO vo = readScore(hak);
		if (vo == null) {
			System.out.println("��ϵ� �ڷᰡ �ƴմϴ�.\n");
			return;
		}
		
		// ������ ������ ���
		System.out.println(vo);
		
		System.out.println("�����Ͻðڽ��ϱ�? [Y/N]");
		ch = sc.next().charAt(0);
		
		if (ch != 'Y' && ch != 'N') {
			return;
		}
		
		int idx = index(hak);
		if (idx == -1) {
			return;
		}
		
		ScoreVO[] list = getList();
		for (int i = idx; i < count-1; i++) {
			list[i] = list[i+1];
		}
		
		count--;
		list[count] = null;
		
		System.out.println("�����͸� �����߽��ϴ�.");
	}
	
	// ������ �й��� �ּҰ� ã��
	private ScoreVO readScore(String hak) {
		ScoreVO vo = null;
		
		ScoreVO[] list = getList();
		for (int i = 0; i < count; i++) {
			if (list[i].getHak().equals(hak)) { // String�̱� ������ equals�� ���ϸ� �� ��
				vo = list[i];
				break;
			}
		}
		
		return vo;
	}
	
	// ������ �й��� ��ġ ã��
	private int index(String hak) {
		int idx = -1; // ������ ������ ���� ���
		
		ScoreVO[] list = getList();
		for (int i = 0; i < count; i++) {
			if (list[i].getHak().equals(hak)) {
				idx = i;
				break;
			}
		}
		
		return idx;
	}

}