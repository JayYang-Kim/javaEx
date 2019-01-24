package yangStudy.study190103;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class BankService implements Bank {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	private Map<String, BankVO> map = new HashMap<>();
	private BankVO loginCheck; // �α��ε� ���� ����� ����
	private String loginKey; // �α��ε� ������ Key�� ����� ����
	
	// �����ڸ� ���� ������ �߰�
	public BankService() {
		BankVO vo = new BankVO();
		
		String account = "00000000000000";
		vo.setBank("admin");
		vo.setPassWord("0000");
		vo.setName("������");
		vo.setBalance(100000000);
		
		map.put(account, vo);
	}
	
	@Override
	public void newAccount() { // ���� ����
		try {
			BankVO vo = new BankVO();
			
			String account;
			
			System.out.println("���¹�ȣ�� �Է����ּ���.");
			account = br.readLine().replaceAll("\\-|\\.|/", ""); // Ư������ ����
			
			//System.out.println(account);
			
			// 14�ڸ� üũ
			if (account.length() != 14) {

				do {
					System.out.println("====================================================================================================");
					System.out.println("[ERROR] ���¹�ȣ ���Ŀ� ������ �ֽ��ϴ�.");
					System.out.println("====================================================================================================");

					System.out.println("���¹�ȣ�� �Է����ּ���.");
					account = br.readLine();

					account.replaceAll("\\-|\\.|/", ""); // Ư������ ����
				} while (account.length() != 14);

			}
			
			if (map.containsKey(account)) {
				System.out.println("====================================================================================================");
				System.out.println("[ERROR] �ߺ��� ���¹�ȣ �Դϴ�.");
				System.out.println("====================================================================================================");
				return;
			}
			
			System.out.println("����縦 �Է����ּ���.");
			System.out.println("[1.��������] [2.�������] [3.��������] [4.����]");
			int bank = Integer.parseInt(br.readLine());
			
			switch (bank) {
			case 1 : vo.setBank("��������"); break;
			case 2 : vo.setBank("�������"); break;
			case 3 : vo.setBank("��������"); break;
			case 4 : vo.setBank("����"); break;
			}
			
			// ���� �ܾ� �����
			vo.setBank(vo.getBank().replaceAll("����", ""));
			
			System.out.println("��й�ȣ�� �Է����ּ���.");
			vo.setPassWord(br.readLine());

			System.out.println("�̸��� �Է����ּ���.");
			vo.setName(br.readLine());

			System.out.println("��������� �Է����ּ���.");
			// ������� üũ
			// -, .(���Խ� Ư������ : �ѹ��ڸ� ��Ÿ��)�� �Է¹����� ""(����)���� ��ȯ
			// ����.�� ��Ÿ�������� \\(�ι� �Է��ؾ���)
			vo.setBirthDay(br.readLine().replaceAll("\\-|\\.|/", "")); // Ư������ ����

			// ��������� 8�ڸ��� �ƴ� ��� üũ
			if (vo.getBirthDay().length() != 8) {

				do {
					System.out.println("====================================================================================================");
					System.out.println("[ERROR] ��¥ ���Ŀ� ������ �ֽ��ϴ�.");
					System.out.println("====================================================================================================");

					// ���Է� ó��
					System.out.println("��������� �Է����ּ���.");
					vo.setBirthDay(br.readLine().replaceAll("\\-|\\.|/", "")); // Ư������ ����
				} while (vo.getBirthDay().length() != 8);

			}

			try {
				System.out.println("�ʱ� �Ա� �ݾ��� �Է����ּ���.");
				vo.setBalance(Integer.parseInt(br.readLine()));
				
				// �������� ū �ݾ� üũ
				if (vo.getBalance() > 10000) {
					do {
						System.out.println("10,000�� ���� ū �ݾ��� �Ա��� �� �� �����ϴ�.");

						System.out.println("�ʱ� �Ա� �ݾ��� �Է����ּ���.");
						vo.setBalance(Integer.parseInt(br.readLine()));
					} while (vo.getBalance() > 10000);
				} else if (vo.getBalance() < 0) { // 0������ ���� �ݾ� üũ
					do {
						System.out.println("0�� �̸����δ� �Ա��� �� �� �����ϴ�.");

						System.out.println("�ʱ� �Ա� �ݾ��� �Է����ּ���.");
						vo.setBalance(Integer.parseInt(br.readLine()));
					} while (vo.getBalance() < 0);
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
			System.out.printf("���¹�ȣ : %s\n", account);
			System.out.printf("����� : %s\n", vo.getBank());
			System.out.printf("�ܾ� : %,d(��)\n", vo.getBalance());
			System.out.printf("�̸� : %s\n", vo.getName());
			System.out.printf("������� : %s\n", vo.getBirthDay());
			System.out.printf("������ : %s\n", vo.getCreateDay());
			System.out.printf("====================================================================================================\n");
			
			// �߰�
			map.put(account, vo);
			
			System.out.println("���� ���°� �����Ǿ����ϴ�.");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@Override
	public void deposit() { // �Ա�
		System.out.printf("====================================================================================================\n");
		System.out.printf("���� ���� �ܾ� : %,d(��)\n", loginCheck.getBalance());
		System.out.printf("====================================================================================================\n");
		
		if (loginKey.equals("00000000000000")) {
			System.out.println("====================================================================================================");
			System.out.println("[���] ������ ���´� �Ա��� �Ұ����մϴ�.");
			System.out.println("====================================================================================================");
			
			return;
		}
		
		try {
			System.out.println("====================================================================================================");
			System.out.println("�Ա��Ͻ� �ݾ��� �Է����ּ���.");
			System.out.println("====================================================================================================");
			
			int money = Integer.parseInt(br.readLine());
			
			System.out.printf("====================================================================================================\n");
			System.out.printf("%,d(��)�� �Ա��Ͻðڽ��ϱ�? [Y/N]\n", money);
			System.out.printf("====================================================================================================\n");
			
			char select = br.readLine().charAt(0);
			
			if (select != 'y' && select != 'Y') {
				System.out.println("====================================================================================================");
				System.out.println("�Ա� ���񽺸� ����ϼ̽��ϴ�.");
				System.out.println("====================================================================================================");
				
				return;
			}
			
			if (money < 0) {
				System.out.println("====================================================================================================");
				System.out.println("[ERROR] �Ա� �Ұ� (���� : 0������ ���� �ݾ�)");
				System.out.println("====================================================================================================");
				
				return;
			}
			
			loginCheck.setBalance(loginCheck.getBalance() + money);
			
			System.out.printf("====================================================================================================\n");
			System.out.printf("�ܾ� : %,d(��)\n", loginCheck.getBalance());
			System.out.printf("====================================================================================================\n");
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void withdraw() { // ���
		System.out.printf("====================================================================================================\n");
		System.out.printf("���� ���� �ܾ� : %,d(��)\n", loginCheck.getBalance());
		System.out.printf("====================================================================================================\n");
		
		if (loginKey.equals("00000000000000")) {
			System.out.println("====================================================================================================");
			System.out.println("[���] ������ ���´� ����� �Ұ����մϴ�.");
			System.out.println("====================================================================================================");
			
			return;
		}
		
		try {
			System.out.println("====================================================================================================");
			System.out.println("����Ͻ� �ݾ��� �Է����ּ���.");
			System.out.println("====================================================================================================");
			
			int money = Integer.parseInt(br.readLine());
			
			System.out.printf("====================================================================================================\n");
			System.out.printf("%,d(��)�� ����Ͻðڽ��ϱ�? [Y/N]\n", money);
			System.out.printf("====================================================================================================\n");
			char select = br.readLine().charAt(0);
			
			if (select != 'y' && select != 'Y') {
				System.out.println("====================================================================================================");
				System.out.println("��� ���񽺸� ����ϼ̽��ϴ�.");
				System.out.println("====================================================================================================");
				
				return;
			}
			
			if (money > loginCheck.getBalance()) {
				System.out.println("====================================================================================================");
				System.out.println("[ERROR] ��� �Ұ� (���� : �ܾ� ����)");
				System.out.println("====================================================================================================");
				
				return;
			} else if (money < 0) {
				System.out.println("====================================================================================================");
				System.out.println("[ERROR] ��� �Ұ� (���� : 0������ ���� �ݾ�)");
				System.out.println("====================================================================================================");
				
				return;
			} 
			
			loginCheck.setBalance(loginCheck.getBalance() - money);
			
			System.out.printf("====================================================================================================\n");
			System.out.printf("�ܾ� : %,d(��)\n", loginCheck.getBalance());
			System.out.printf("====================================================================================================\n");
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void remit() { // �۱�
		if (loginKey.equals("00000000000000")) {
			System.out.println("====================================================================================================");
			System.out.println("[���] ������ ���´� �۱��� �Ұ����մϴ�.");
			System.out.println("====================================================================================================");
			
			return;
		}
		
		try {
			System.out.println("====================================================================================================");
			System.out.println("�۱��� ���¹�ȣ�� �Է����ּ���.");
			System.out.println("====================================================================================================");
			String account = br.readLine();
			
			// �۱��� ���¹�ȣ�� �ִ��� üũ
			if (!map.containsKey(account)) {
				System.out.println("====================================================================================================");
				System.out.println("[ERROR] �۱� �Ұ� (���� : ��ȸ���� �ʴ� ���¹�ȣ �Դϴ�.)");
				System.out.println("====================================================================================================");
				
				return;
			}

			System.out.println("====================================================================================================");
			System.out.println("��й�ȣ�� �Է����ּ���.");
			System.out.println("====================================================================================================");
			String passWord = br.readLine();
			
			// �н����尡 ��ġ���� ���� ���
			if (!loginCheck.getPassWord().equals(passWord)) {
				System.out.println("====================================================================================================");
				System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
				System.out.println("====================================================================================================");
				
				return;
			}
			
			System.out.println("====================================================================================================");
			System.out.println("�۱��� �ݾ��� �Է����ּ���.");
			System.out.println("====================================================================================================");
			int money = Integer.parseInt(br.readLine());
			
			// ����� ��
			if (loginCheck.getBank().equals(map.get(account).getBank())) {
				System.out.println("====================================================================================================");
				System.out.println("����簡 �����մϴ�. (������ ����)");
				System.out.println("====================================================================================================");
				
				System.out.printf("====================================================================================================\n");
				System.out.printf("%s ���¿� %,d(��)�� �Ա��Ͻðڽ��ϱ�? [Y/N]", account, money);
				System.out.printf("====================================================================================================\n");
				
				char select = br.readLine().charAt(0);
				
				if (select != 'y' && select != 'Y') {
					System.out.println("====================================================================================================");
					System.out.println("�۱� ���񽺰� ��ҵǾ����ϴ�.");
					System.out.println("====================================================================================================");
				}
				
				if (loginCheck.getBalance() < money) {
					System.out.println("====================================================================================================");
					System.out.println("[ERROR] �۱� �Ұ� (���� : �ܾ� ����)");
					System.out.println("====================================================================================================");
					
					return;
				}

				map.get(account).setBalance(map.get(account).getBalance() + money); // �Ա� ó��				
				loginCheck.setBalance(loginCheck.getBalance() - money); // �ڽ��� ���忡�� �ݾ� ����
				
				System.out.println("====================================================================================================");
				System.out.println(account + "���¿� " + money + "(��)�� �۱� �Ϸ��߽��ϴ�.");
				System.out.println("====================================================================================================");
				System.out.println();
			} else {
				System.out.println("====================================================================================================");
				System.out.println("����簡 �޶� �����ᰡ �߻��մϴ�. (������ 1,000��)");
				System.out.println("====================================================================================================");
				
				System.out.println("====================================================================================================");
				System.out.printf("%s ���¿� %,d(��)�� �Ա��Ͻðڽ��ϱ�? [Y/N]", account, money);
				System.out.println("====================================================================================================");
				
				char select = br.readLine().charAt(0);
				
				int commission = 1000;
				
				if (select != 'y' && select != 'Y') {
					System.out.println("====================================================================================================");
					System.out.println("�۱� ���񽺰� ��ҵǾ����ϴ�.");
					System.out.println("====================================================================================================");
				}
				
				if (loginCheck.getBalance() < (money + commission)) {
					System.out.println("====================================================================================================");
					System.out.println("[ERROR] �۱� �Ұ� (���� : �ܾ� ����)");
					System.out.println("====================================================================================================");
					
					return;
				}

				map.get(account).setBalance(map.get(account).getBalance() + money); // �Ա� ó��				
				loginCheck.setBalance(loginCheck.getBalance() - (money + commission)); // �ڽ��� ���忡�� �ݾ� ����
				
				System.out.println("====================================================================================================");
				System.out.println(account + "���¿� " + money + "(��)�� �۱� �Ϸ��߽��ϴ�.");
				System.out.println("====================================================================================================");
				System.out.println();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void selectAccount() { // ���� ��ȸ
		// �����ڴ� ��ü ���� ��ȸ ����
		if (loginKey.equals("00000000000000")) {
			Iterator<String> it = map.keySet().iterator();
			
			while (it.hasNext()) {
				loginKey = it.next();
				BankVO value = map.get(loginKey);
				
				System.out.printf("���¹�ȣ\t\t�����\t�̸�\t�������\t\t�ܾ�\t\t������\n");
				System.out.printf("%s\t%s\t%s\t%s\t%,d\t\t%s", loginKey, loginCheck.getBank(), loginCheck.getName(), loginCheck.getBirthDay(), loginCheck.getBalance(), loginCheck.getCreateDay());
			}
			
			return;
		}
		
		System.out.printf("���¹�ȣ\t\t�����\t�̸�\t�������\t\t�ܾ�\t\t������\n");
		System.out.printf("%s\t%s\t%s\t%s\t%,d\t\t%s", loginKey, loginCheck.getBank(), loginCheck.getName(), loginCheck.getBirthDay(), loginCheck.getBalance(), loginCheck.getCreateDay());
	}
	
	@Override
	public void delete() {
		if (loginKey.equals("00000000000000")) {
			System.out.println("====================================================================================================");
			System.out.println("[���] �����ڴ� Ż�� �Ұ����մϴ�.");
			System.out.println("====================================================================================================");
			
			return;
		}
		
		try {
			System.out.println("====================================================================================================");
			System.out.println("��й�ȣ�� �Է����ּ���.");
			System.out.println("====================================================================================================");
			String passWord = br.readLine();
			
			if (!loginCheck.getPassWord().equals(passWord)) {
				System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
				return;
			}
			
			// ���� �� ������ Ȯ��
			System.out.printf("====================================================================================================\n");
			System.out.printf("���¹�ȣ : %s\n", loginKey);
			System.out.printf("����� : %s\n", loginCheck.getBank());
			System.out.printf("�ܾ� : %,d(��)\n", loginCheck.getBalance());
			System.out.printf("�̸� : %s\n", loginCheck.getName());
			System.out.printf("������� : %s\n", loginCheck.getBirthDay());
			System.out.printf("������ : %s\n", loginCheck.getCreateDay());
			System.out.printf("====================================================================================================\n");
			
			System.out.println("====================================================================================================");
			System.out.println("������ �����Ͻðڽ��ϱ�? [Y/N]");
			System.out.println("====================================================================================================");
			char c = br.readLine().charAt(0);
			
			if (c != 'y' && c != 'Y') {
				System.out.println("====================================================================================================");
				System.out.println("�������� ������ ��ҵǾ����ϴ�.");
				System.out.println("====================================================================================================");
				return;
			}
			
			map.remove(loginKey);
			
			loginCheck = null;
			loginKey = null;
			
			System.out.println("====================================================================================================");
			System.out.println("���������� �����߽��ϴ�.");
			System.out.println("====================================================================================================");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void login() {
		try {
			String account, passWord;
			
			System.out.println("====================================================================================================");
			System.out.println("���¹�ȣ�� �Է����ּ���.");
			System.out.println("====================================================================================================");
			
			account = br.readLine().replaceAll("\\-|\\.|/", ""); // Ư������ ����

			// 14�ڸ� üũ
			if (account.length() != 14) {

				do {
					System.out.println("====================================================================================================");
					System.out.println("[ERROR] ���¹�ȣ ���Ŀ� ������ �ֽ��ϴ�.");
					System.out.println("====================================================================================================");
					
					System.out.println("====================================================================================================");
					System.out.println("���¹�ȣ�� �Է����ּ���.");
					System.out.println("====================================================================================================");
					account = br.readLine().replaceAll("\\-|\\.|/", ""); // Ư������ ����
				} while (account.length() != 14);

			}
			
			if (!map.containsKey(account)) {
				System.out.println("====================================================================================================");
				System.out.println("�Է��Ͻ� ���������� ã�� �� �����ϴ�.");
				System.out.println("====================================================================================================");
				
				return;
			}
			
			System.out.println("====================================================================================================");
			System.out.println("��й�ȣ�� �Է����ּ���.");
			System.out.println("====================================================================================================");
			
			passWord = br.readLine();
			
			BankVO vo = map.get(account);
			
			if (vo.getPassWord().equals(passWord)) {
				loginCheck = map.get(account);
				loginKey = account;
				
				return;
			}
			
			System.out.println("====================================================================================================");
			System.out.println("[ERROR] ���¹�ȣ �Ǵ� ��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
			System.out.println("====================================================================================================");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void logout() {
		loginCheck = null;
		loginKey = null;
		
		System.out.println("====================================================================================================");
		System.out.println("�α׾ƿ� ó���Ǿ����ϴ�.");
		System.out.println("====================================================================================================");
	}

	@Override
	public BankVO loginCheck() { 
		return loginCheck;
	}
	
}
