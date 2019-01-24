package yangStudy;

import java.util.Scanner;

/* ��¥ : 2018.12.19
 * ���� : �Է�, ���, �����˻�, ����, ���� ��� ����
 * ��Ÿ : super class : Score / sub class : ScoreService
 * ���� class : ScoreApp, Score, ScoreVO   
 * */

public class ScoreService extends Score {
	private Scanner sc = new Scanner(System.in);
	private int count; // �ο� �� üũ
	// ����Ʈ �����ڰ� �����Ǿ� super class�� �����ڸ� ȣ��
	
	public void input() {
		// list �迭�� ���̸� �Ѱų� �������, �迭ũ�� ����
		if (count >= getSize()) {
			allocation(getSize() + 5);
		}
		
		ScoreVO sv = new ScoreVO(); // ��ü ����
		
		System.out.println("�й��� �Է����ּ���.");
		sv.setHakbun(sc.next());
		
		System.out.println("�̸��� �Է����ּ���.");
		sv.setName(sc.next());
		
		System.out.println("���� ������ �Է����ּ���.");
		sv.setKor(sc.nextInt());
		
		System.out.println("���� ������ �Է����ּ���.");
		sv.setEng(sc.nextInt());
		
		System.out.println("���� ������ �Է����ּ���.");
		sv.setMat(sc.nextInt());
		
		// Score list���� �ּҰ��� ȣ���Ͽ� ����
		ScoreVO[] list = getList();
		list[count++] = sv; // list[count++]�� �Է��� ������ ����, �Է� �� count + 1 ����
	}
	
	public void	print() {
		ScoreVO[] list = getList();
		
		System.out.println("��ü �ο� �� : " + count);
		
		System.out.println("�й�\t�̸�\t��������\t��������\t��������\t����\t���");
		// ��ü �ο� �� ��ŭ �ݺ�
		for (int i = 0; i < count; i++) {
			System.out.println(list[i].toString());
		}
	}
	
	public void searchHakbun() {
		String hakbun;

		System.out.println("�й��� �Է����ּ���.");
		hakbun = sc.next();
		
		ScoreVO vo = readHakbun(hakbun);
		
		if (vo == null) {
			System.out.println("�������� �ʴ� �й��Դϴ�.");
			return;
		}
		
		System.out.println("�й�\t�̸�\t��������\t��������\t��������\t����\t���");
		System.out.println(vo.toString());
	}
	
	public void update() {
		String hakbun;
		
		System.out.println("�й��� �Է����ּ���.");
		hakbun = sc.next();
		
		// �Է��� �й��� �ִ��� Ȯ�� �� �ִ� ��� vo�� �ּҰ� ����
		ScoreVO vo = readHakbun(hakbun);
		
		if (vo == null) {
			System.out.println("�������� �ʴ� �й��Դϴ�.");
			return;
		}
		
		// �й��� �ִ� ��� ����
		System.out.println("�̸��� �Է����ּ���.");
		vo.setName(sc.next());
		
		System.out.println("���� ������ �Է����ּ���.");
		vo.setKor(sc.nextInt());
		
		System.out.println("���� ������ �Է����ּ���.");
		vo.setEng(sc.nextInt());
		
		System.out.println("���� ������ �Է����ּ���.");
		vo.setMat(sc.nextInt());
		
		System.out.println("������ �����߽��ϴ�.");
	}
	
	public void delete() {
		System.out.println("����");
		
		String hakbun;
		char choice;

		System.out.println("�й��� �Է����ּ���.");
		hakbun = sc.next();

		// �Է��� �й��� �ִ��� Ȯ�� �� �ִ� ��� vo�� �ּҰ� ����
		ScoreVO vo = readHakbun(hakbun);

		if (vo == null) {
			System.out.println("�������� �ʴ� �й��Դϴ�.");
			return;
		}
		
		System.out.println("�й�\t�̸�\t��������\t��������\t��������\t����\t���");
		System.out.println(vo.toString());
		
		System.out.println("�����Ͻðڽ��ϱ�? [Y/N]");
		choice = sc.next().charAt(0);
		
		// �Է°��� Y�� �ƴϰ� N�̸� ����
		if (choice != 'Y' && choice == 'N') {
			return;
		}
		
		// ������ ��ġ ã��
		int index = index(hakbun);
		
		// �й��� ���� ���
		if (index == -1) {
			System.out.println("�������� �ʴ� �й��Դϴ�.");
			return;
		}
		
		ScoreVO[] list = getList();
		for (int i = index; i < count - 1; i++) {
			list[i] = list[i + 1];
		}
		
		count--;
		list[count] = null;
		
		
		System.out.println("�����͸� �����߽��ϴ�.");
	}
	
	private ScoreVO readHakbun(String hakbun) {
		ScoreVO vo = null;
		
		ScoreVO[] list = getList();
		// �� �ο� �� ��ŭ �ݺ�
		for (int i = 0; i < count; i++) {
			if (list[i].getHakbun().equals(hakbun)) {
				vo = list[i];
				break;
			}
		}
		
		return vo;
	}
	
	private int index(String hakbun) {
		int index = -1; // �й��� ���� ��� ���� �ʱⰪ
		
		ScoreVO[] list = getList();
		for (int i = 0; i < count; i++) {
			if (list[i].getHakbun().equals(hakbun)) {
				index = i;
				break;
			}
		}
		
		return index;
	}
	
}
