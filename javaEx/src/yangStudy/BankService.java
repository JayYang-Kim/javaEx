package yangStudy;

import java.util.Calendar;
import java.util.Scanner;

public class BankService extends Bank {
	// �ʵ�
	private Scanner sc = new Scanner(System.in);
	private BankVO loginCheck;
	private int count;
	
	// ������
	public BankService() {
		BankVO[] list = getList();
		BankVO vo = new BankVO();
		
		vo.setAccount("00000000000000");
		vo.setPassWord("0000");
		vo.setName("������");
		vo.setBalance(100000000);
		
		list[this.count++] = vo;
	}
	
	// ���� ���� �޼ҵ�
	public void newAccount() {
		// ��ü ����
		BankVO vo = new BankVO();
		BankVO[] list = getList();
		
		// �迭�� ũ�Ⱑ ���� ��� ������ ���� ó��
		if (count >= getSize()) { // �迭�� ũ��� ���ų� ū��� 
			allocation(getSize() + 10); // �迭 ����
		}
		
		System.out.println("���¹�ȣ�� �Է����ּ���.");
		vo.setAccount(sc.next());
		
		// ���¹�ȣ üũ
		String account = vo.getAccount().replaceAll("\\-|\\.|/", ""); // Ư������ ����
		vo.setAccount(account);
		
		// 14�ڸ� üũ
		if (vo.getAccount().length() != 14) {
			
			do {
				System.out.println("====================================================================================================");
				System.out.println("[ERROR] ���¹�ȣ ���Ŀ� ������ �ֽ��ϴ�.");
				System.out.println("====================================================================================================");
				
				System.out.println("���¹�ȣ�� �Է����ּ���.");
				vo.setAccount(sc.next());
				
				String account2 = vo.getAccount().replaceAll("\\-|\\.|/", ""); // Ư������ ����
				vo.setAccount(account2);
			} while(vo.getAccount().length() != 14);
			
		}
		
		// �ߺ� üũ
		if (this.count >= 1) { // ���°� 1�� �̻��� ��� üũ
			for (int i = 0; i < this.count; i++) {
				if (vo.getAccount().equals(list[i].getAccount())) {
					System.out.println("====================================================================================================");
					System.out.println("[���¹�ȣ �ߺ�] " + vo.getAccount() + "�� �ߺ��� ���¹�ȣ �Դϴ�.");
					System.out.println("====================================================================================================");
					newAccount();
				}
			}
		}
		
		System.out.println("��й�ȣ�� �Է����ּ���.");
		vo.setPassWord(sc.next());
		
		System.out.println("�̸��� �Է����ּ���.");
		vo.setName(sc.next());
		
		System.out.println("��������� �Է����ּ���.");
		vo.setBirthDay(sc.next());
		
		// ������� üũ
		// -, .(���Խ� Ư������ : �ѹ��ڸ� ��Ÿ��)�� �Է¹����� ""(����)���� ��ȯ
		// ����.�� ��Ÿ�������� \\(�ι� �Է��ؾ���)
		String birth = vo.getBirthDay().replaceAll("\\-|\\.|/", ""); // Ư������ ����
		vo.setBirthDay(birth);
		
		// ��������� 8�ڸ��� �ƴ� ��� üũ
		if (vo.getBirthDay().length() != 8) {
			
			do {
				System.out.println("====================================================================================================");
				System.out.println("[ERROR] ��¥ ���Ŀ� ������ �ֽ��ϴ�.");
				System.out.println("====================================================================================================");
				
				// ���Է� ó��
				System.out.println("��������� �Է����ּ���.");
				vo.setBirthDay(sc.next());
				
				// ������� Ư������ ����
				String birth2 = vo.getBirthDay().replaceAll("\\-|\\.|/|", ""); // Ư������ ����
				vo.setBirthDay(birth2);
			} while(vo.getBirthDay().length() != 8);

		}
		
		try {
			System.out.println("�ʱ� �Ա� �ݾ��� �Է����ּ���.");
			vo.setBalance(sc.nextInt());
			
			if (vo.getBalance() < 5000) {
				do {
					System.out.println("5,000�� �̸����δ� �Ա��� �� �� �����ϴ�.");
					
					System.out.println("�ʱ� �Ա� �ݾ��� �Է����ּ���.");
					vo.setBalance(sc.nextInt());
				} while (vo.getBalance() < 5000);
				
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// ������ �߰�
		Calendar now = Calendar.getInstance(); // ���� ��¥�� �ð� ������ ���� Calendar ��ü�� ���� 
		vo.setCreateDay(String.format("%1$tF %1$tA", now));
		
		// ���� �Ϸ�
		System.out.printf("====================================================================================================\n");
		System.out.printf("���¹�ȣ : %s\n", vo.getAccount());
		System.out.printf("�ܾ� : %,d(��)\n", vo.getBalance());
		System.out.printf("�̸� : %s\n", vo.getName());
		System.out.printf("������� : %s\n", vo.getBirthDay());
		System.out.printf("������ : %s\n", vo.getCreateDay());
		System.out.printf("====================================================================================================\n");
		
		// �迭�� �� �߰�
		list[this.count++] = vo;
		
		System.out.println("���� ���°� �����Ǿ����ϴ�.");
	}
	
	// �Ա� ó�� �޼ҵ�
	public void deposit() { // �Ա�	
		if (loginCheck == null) {
			System.out.println("�α����� �ʿ��� �����Դϴ�.");
			return;
		}
		
		// �α��ε� ���������� �� ���� üũ
		BankVO vo = readAccount(loginCheck.getAccount());
		
		if (vo.getAccount().equals("00000000000000")) {
			System.out.println("====================================================================================================");
			System.out.println("[���] ������ ���´� �Ա��� �Ұ����մϴ�.");
			System.out.println("====================================================================================================");
		}
		
		/*String account; // ���¹�ȣ Ȯ�ο� ����
		
		System.out.println("�Ա��Ͻ� ���¹�ȣ�� �Է����ּ���.");
		account = sc.next();
		
		BankVO vo = readAccount(account);
		
		if (vo == null) {
			System.out.println("��ϵ� ���¹�ȣ�� �����ϴ�.");
			return;
		}*/
		
		try {
			System.out.println("====================================================================================================");
			System.out.println("�Ա��Ͻ� �ݾ��� �Է����ּ���.");
			System.out.println("====================================================================================================");
			
			vo.setBalance(vo.getBalance() + sc.nextInt());
			
			System.out.println("====================================================================================================");
			System.out.printf("�ܾ� : %,d(��)\n", vo.getBalance());
			System.out.println("====================================================================================================");
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// ��� ó�� �޼ҵ�
	public void withdraw() { // ���
		if (loginCheck == null) {
			System.out.println("�α����� �ʿ��� �����Դϴ�.");
			return;
		}
		
		// �α��ε� ���������� �� ���� üũ
		BankVO vo = readAccount(loginCheck.getAccount());
		
		if (vo.getAccount().equals("00000000000000")) {
			System.out.println("====================================================================================================");
			System.out.println("[���] ������ ���´� ����� �Ұ����մϴ�.");
			System.out.println("====================================================================================================");
		}
		/*String account; // ���¹�ȣ Ȯ�ο� ����
		int balance = 0; // ��� �ݾ� ����
		
		System.out.println("����Ͻ� ���¹�ȣ�� �Է����ּ���.");
		
		account = sc.next();
		
		BankVO vo = readAccount(account);
		
		if (vo == null) {
			System.out.println("====================================================================================================");
			System.out.println("��ϵ� ���¹�ȣ�� �����ϴ�.");
			System.out.println("====================================================================================================");
			return;
		}*/
		
		try {
			System.out.println("====================================================================================================");
			System.out.println("����Ͻ� �ݾ��� �Է����ּ���.");
			System.out.println("====================================================================================================");
			
			int balance = sc.nextInt();
			
			if (vo.getBalance() < balance) {
				System.out.println("====================================================================================================");
				System.out.println("[ERROR] �ܾ׺��� ū �ݾ��� ����� �� �����ϴ�.");
				System.out.println("====================================================================================================");
				
				System.out.println("====================================================================================================");
				System.out.println("����Ͻ� �ݾ��� �Է����ּ���.");
				System.out.println("====================================================================================================");
				balance = sc.nextInt();
			}
			
			vo.setBalance(vo.getBalance() - balance);
			
			System.out.printf("====================================================================================================\n");
			System.out.printf("�ܾ� : %,d(��)\n", vo.getBalance());
			System.out.printf("====================================================================================================\n");
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// �۱� ó�� �޼ҵ�
	public void remit() {
		if (loginCheck == null) {
			System.out.println("�α����� �ʿ��� �����Դϴ�.");
			return;
		}
		
		// �α��ε� ���������� �� ���� üũ
		BankVO vo = readAccount(loginCheck.getAccount());
		
		if (vo.getAccount().equals("00000000000000")) {
			System.out.println("====================================================================================================");
			System.out.println("�����ڴ� �۱��� �Ұ����մϴ�.");
			System.out.println("====================================================================================================");
			
			return;
		}
		
		System.out.println("�۱��� ���¹�ȣ�� �Է����ּ���.");
		String account = sc.next(); // �۱��� ���¹�ȣ ����
		
		// �۱��� ���¹�ȣ�� �ִ��� üũ
		BankVO vo2 = readAccount(account);
		
		if (vo2 == null) {
			System.out.println("�۱��� ���¹�ȣ�� ������ �����ϴ�.");
			return;
		}
		
		System.out.printf("====================================================================================================\n");
		System.out.printf("���¹�ȣ : %s\n", vo2.getAccount());
		System.out.printf("�̸� : %s\n", vo2.getName());
		System.out.printf("====================================================================================================\n");
		
		System.out.println("�۱��� �ݾ��� �Է����ּ���.");
		int money = sc.nextInt();
		
		System.out.printf("====================================================================================================\n");
		System.out.printf("%s(��)�� %,d(��)�� �۱��Ͻðڽ��ϱ�? [Y/N]\n", vo2.getName(), money);
		System.out.printf("====================================================================================================\n");
		
		char c = sc.next().charAt(0);
		
		if (c == 'N' || c != 'Y') {
			System.out.println("�۱� ���񽺰� ��ҵǾ����ϴ�.");
			return;
		}
		
		vo2.setBalance(vo2.getBalance() + money); // �۱��� ���忡 �� �Ա� ó��
		
		// �۱� �ݾ��� �� ������ �ܰ��� Ŭ ��� �۱� ���� ���ó��
		if (money > vo.getBalance()) {
			System.out.println("====================================================================================================");
			System.out.println("[ERROR]�ܰ��� ���� �ݾ��� �۱��� �� �����ϴ�.");
			System.out.println("====================================================================================================");
			
			return;
		}
		
		vo.setBalance(vo.getBalance() - money); // �۱��� �ݾ׸�ŭ �� ���忡�� ����
		
		System.out.println("====================================================================================================");
		System.out.println(vo2.getName() + "�Բ� " + money + "(��) �۱� ó�� �Ϸ�");
		System.out.println("====================================================================================================");
	}
	
	// ���� Ȯ�� �޼ҵ�
	public void checkBalance() {
		if (loginCheck == null) {
			System.out.println("�α����� �ʿ��� �����Դϴ�.");
			return;
		}
		
		// �α��ε� ���������� �� ���� üũ
		BankVO vo = readAccount(loginCheck.getAccount());
		
		if (vo.getAccount().equals("00000000000000")) { // �����ڷ� ���� �� ��ü ���� ���� Ȯ��
			BankVO[] list = getList();
			
			System.out.println("������ ���� �� : " + this.count);
			
			for (int i = 0; i < this.count; i++) {
				System.out.printf("====================================================================================================\n");
				System.out.printf("���¹�ȣ : %s\n", list[i].getAccount());
				System.out.printf("�ܾ� : %,d(��)\n", list[i].getBalance());
				System.out.printf("�̸� : %s\n", list[i].getName());
				System.out.printf("������� : %s\n", list[i].getBirthDay());
				System.out.printf("������ : %s\n", list[i].getCreateDay());
				System.out.printf("====================================================================================================\n");
			}
		} else { // �Ϲ������� ���� �� �ڽ��� ���¸� Ȯ��
			System.out.printf("====================================================================================================\n");
			System.out.printf("�ܾ� : %,d(��)\n", vo.getBalance());
			System.out.printf("�̸� : %s\n", vo.getName());
			System.out.printf("������� : %s\n", vo.getBirthDay());
			System.out.printf("������ : %s\n", vo.getCreateDay());
			System.out.printf("====================================================================================================\n");
		}
	}
	
	// ���� ���� �޼ҵ�
	public void delete() {
		if (loginCheck == null) {
			System.out.println("�α����� �ʿ��� �����Դϴ�.");
			return;
		}
		
		// �α��� ���������� admin�� ��� ���� ó�� ����
		if (loginCheck.getAccount().equals("00000000000000" )) {
			System.out.println("====================================================================================================");
			System.out.println("[���] ������ ���´� ������ �Ұ����մϴ�.");
			System.out.println("====================================================================================================");
			
			return;
		}
		
		/*String account;
		
		System.out.println("������ ���������� �Է����ּ���.");
		account = sc.next();
		
		BankVO vo = readAccount(account);
		
		if (vo == null) {
			System.out.println("====================================================================================================");
			System.out.println("��ϵ� ���¹�ȣ�� �����ϴ�.");
			System.out.println("====================================================================================================");
			return;
		}*/
		
		// �α��ε� ���������� �� ���� üũ
		BankVO vo = readAccount(loginCheck.getAccount());
		
		System.out.println("��й�ȣ�� �Է����ּ���.");
		String passWord = sc.next();
		
		if (!vo.getPassWord().equals(passWord)) {
			System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
			return;
		}
		
		// ���� �� ������ Ȯ��
		System.out.printf("====================================================================================================\n");
		System.out.printf("���¹�ȣ : %s\n", vo.getAccount());
		System.out.printf("�ܾ� : %,d(��)\n", vo.getBalance());
		System.out.printf("�̸� : %s\n", vo.getName());
		System.out.printf("������� : %s\n", vo.getBirthDay());
		System.out.printf("������ : %s\n", vo.getCreateDay());
		System.out.printf("====================================================================================================\n");
		
		System.out.println("====================================================================================================");
		System.out.println("������ �����Ͻðڽ��ϱ�? [Y/N]");
		System.out.println("====================================================================================================");
		char c = sc.next().charAt(0);
		
		if (c == 'N' || c != 'Y') {
			System.out.println("�������� ������ ��ҵǾ����ϴ�.");
			return;
		}
		
		// ������ index��ġ ã��
		int idx = -1;
		
		BankVO[] list = getList();
		for (int i = 0; i < this.count; i++) {
			if (list[i].getAccount().equals(vo.getAccount())) {
				idx = i;
				break;
			}
		}
		
		if (idx == -1) {
			System.out.println("====================================================================================================");
			System.out.println("��ϵ� ���¹�ȣ�� �����ϴ�.");
			System.out.println("====================================================================================================");
			return;
		}
		
		for (int i = idx; i < count - 1; i++) {
			list[i] = list[i + 1];
		}
		
		count--;
		list[count] = null;
		
		loginCheck = null; // Ż��Ǹ鼭 �α׾ƿ� ó��
		
		System.out.println("====================================================================================================");
		System.out.println("���������� �����߽��ϴ�.");
		System.out.println("====================================================================================================");
	}
	
	// �α��� ó�� �޼ҵ�
	public void login() {
		String account, passWord; // ���¹�ȣ, ��й�ȣ�� ��� ���� ����
		
		System.out.println("���¹�ȣ�� �Է����ּ���.");
		account = sc.next();
		
		// ���¹�ȣ üũ
		account = account.replaceAll("\\-|\\.|/", ""); // Ư������ ����

		// 14�ڸ� üũ
		if (account.length() != 14) {

			do {
				System.out.println("====================================================================================================");
				System.out.println("[ERROR] ���¹�ȣ ���Ŀ� ������ �ֽ��ϴ�.");
				System.out.println("====================================================================================================");

				System.out.println("���¹�ȣ�� �Է����ּ���.");
				account = sc.next();

				account = account.replaceAll("\\-|\\.|/", ""); // Ư������ ����
			} while (account.length() != 14);

		}
		
		System.out.println("��й�ȣ�� �Է����ּ���.");
		passWord = sc.next();
		
		// ���¹�ȣ�� �����Ǿ� �ִ��� üũ
		BankVO vo = readAccount(account);
		
		// ���¹�ȣ�� ������ ��й�ȣ üũ
		if (vo != null) {
			if (vo.getPassWord().equals(passWord)) {
				loginCheck = vo;
				return;
			}
		}
		
		System.out.println("���¹�ȣ �Ǵ� ��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
	}
	
	// �α׾ƿ� ó�� �޼ҵ�
	public void logout() {
		loginCheck = null;
		
		System.out.println("====================================================================================================");
		System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
		System.out.println("====================================================================================================");
	}
	
	// �α����� �Ǿ��ִ� �ּҰ� ��ȯ �޼ҵ�
	public BankVO loginCheck() {
		return loginCheck;
	}
	
	// ���������� �̿��� list �ּҰ� Ȯ�� �޼ҵ�
	private BankVO readAccount(String account) {
		BankVO vo = null;

		BankVO[] list = getList();

		for (int i = 0; i < this.count; i++) {
			if (list[i].getAccount().equals(account)) {
				vo = list[i];
				break;
			}
		}
		
		return vo;
	}
}
