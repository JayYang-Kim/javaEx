package yangStudy.study190110;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

/*
 * 2019.01.10
 * [�߰�] update()
 * */

public class BankService implements Bank {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	protected Map<String, BankVO> map = new HashMap<>();
	private BankVO loginCheck; // �α��ε� ���� ����� ����
	private String loginKey; // �α��ε� may<Key>�� ����� ����
	private int count = 0; // �н����� Ʋ�� �� ī��Ʈ�� ����
	private boolean check = false; // �н����� 3ȸ ���� üũ�� ����
	
	// ������
	// ������ ȣ�� �� ������ ���� ����
	public BankService() {
		BankVO vo = new BankVO();
		
		String account = "00000000";
		vo.setId("admin");
		vo.setBank("����");
		vo.setPassWord("0000");
		vo.setName("������");
		vo.setBalance(100000000);
		
		map.put(account, vo);
	}
	
	@Override
	public void newAccount() { // ���»���
		try {
			BankVO vo = new BankVO();
			
			// 1) ����� ����
			System.out.println("����縦 �Է����ּ���.");
			System.out.println("[1.��������] [2.�������] [3.��������] [4.��������]");
			int bank = Integer.parseInt(br.readLine());
			
			switch (bank) {
			case 1 : vo.setBank("��������"); break;
			case 2 : vo.setBank("�������"); break;
			case 3 : vo.setBank("��������"); break;
			case 4 : vo.setBank("��������"); break;
			}
			
			// ���� �ܾ� �����
			vo.setBank(vo.getBank().replaceAll("����", ""));
			
			// 2) ���¹�ȣ �Է�
			String account = null;
			
			// ����� ���ÿ� ���� ���¹�ȣ ���ڸ� 3�� ����
			switch (vo.getBank()) {
			case "����" : account = "123"; break;
			case "���" : account = "456"; break;
			case "����" : account = "789"; break;
			case "����" : account = "147"; break;
			}
			
			// ���� ���¹�ȣ ���� (5�ڸ�)
			Random rnd = new Random();
			
			// ù��° ���
			/*int num = rnd.nextInt(99999) + 10000; // 10000 ~ 99999���� ���� ����
			
			account += String.valueOf(num);
			
			System.out.println(account);*/
			
			// �ι�° ���
			/*StringBuffer sb = new StringBuffer(); // append�� ����ϱ� ���� StringBuffer���
			
			for (int i = 0; i < 5; i++) {
				// random�� ����Ͽ� 0 ~ 9������ ������ ������ �� ���ڸ� ���ڿ��� ��ȯ
				sb.append(Integer.toString(rnd.nextInt(10))); 
			}
			
			// ����� ���¹�ȣ�� ���� ��ġ��
			account += sb;*/
			
			// ����° ��� (�ߺ�����)
			/*StringBuffer sb = new StringBuffer();
			
			gogo:
			for (int i = 0; i < 5; i++) {
				int n = rnd.nextInt(10); // 0 ~ 9 ���� ����
				
				for (int j = 0; j < sb.length(); j++) {
					if (n == Integer.parseInt(sb.substring(j, j+1))) {
						i--;
						continue gogo;
					}
				}
				
				sb.append(Integer.toString(n));
			}

			// ����� ���¹�ȣ�� ���� ��ġ��
			account += sb;*/
			
			// ������ ������̸�, ������ ���¹�ȣ �ߺ�����
			do {
				StringBuffer sb = new StringBuffer(); // append�� ����ϱ� ���� StringBuffer���
				
				for (int i = 0; i < 5; i++) {
					// random�� ����Ͽ� 0 ~ 9������ ������ ������ �� ���ڸ� ���ڿ��� ��ȯ
					sb.append(Integer.toString(rnd.nextInt(10))); 
				}
				
				// ����� ���¹�ȣ�� ���� ��ġ��
				account += sb;
			} while(map.containsKey(account));
			
			// 3) ���̵� �Է�
			System.out.println("���̵� �Է����ּ���.");
			vo.setId(br.readLine());
			
			// ������ ������̸�, ������ ���̵� �ߺ�����
			// foreach�� �̿��� map�� �ִ� ��ü ������ ��������
			
			/*while (true) {
				for (String s : map.keySet()) {
					BankVO i = map.get(s);
					
					do {
						// ������ ����� ���� üũ
						if (s.substring(0, 3).equals(account.substring(0, 3))) {
							// ���̵� ������ üũ
							if (i.getId().equals(vo.getId())) {
								System.out.println("====================================================================================================");
								System.out.println("[ERROR] ���̵� ���� �Ұ� (���� : ������ ����� - ���̵� �ߺ�)");
								System.out.println("====================================================================================================");
								
								System.out.println("���̵� �Է����ּ���.");
								vo.setId(br.readLine());
							}
						}
					} while(i.getId().equals(vo.getId()));
				}
				
				break;
			}*/
			
			/*while (true) {
				System.out.println("���̵� �Է����ּ���.");
				vo.setId(br.readLine());
				
				for (String s : map.keySet()) {
					BankVO i = map.get(s);
					
					// ������ ����� ���� üũ
					if (s.substring(0, 3).equals(account.substring(0, 3))) {
						// ���̵� ������ üũ
						if (i.getId().equals(vo.getId())) {
							System.out.println("====================================================================================================");
							System.out.println("[ERROR] ���̵� ���� �Ұ� (���� : ������ ����� - ���̵� �ߺ�)");
							System.out.println("====================================================================================================");
							
							break;
						}
						
						break;
					}

				}
			}
			*/
			
			// 4) ��й�ȣ �Է�
			System.out.println("��й�ȣ�� �Է����ּ���.");
			vo.setPassWord(br.readLine());
			
			// 5) �̸� �Է�
			System.out.println("�̸��� �Է����ּ���.");
			vo.setName(br.readLine());
			
			// 6) ������� �Է�
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
			
			// 7) �ʱ� �Ա� �ݾ� �Է�
			try {
				char select;
				
				// �ʱ� �Ա� �ݾ��� �Է��Ұ����� üũ
				System.out.println("�ʱ� �Ա��� �Ͻðڽ��ϱ�? [Y/N]");
				select = br.readLine().charAt(0);
				
				if (select != 'y' && select != 'Y') {
					System.out.println("�ʱ� �Ա��� �������� �ʽ��ϴ�.");
					
					vo.setBalance(0);
				} else {
					System.out.println("�ʱ� �Ա� �ݾ��� �Է����ּ���.");
					vo.setBalance(Integer.parseInt(br.readLine()));
					
					if (vo.getBalance() > 10000) { // 10,000���� ū �ݾ��� �ԷºҰ�
						do {
							System.out.println("10,000�� ���� ū �ݾ��� �Ա��� �� �� �����ϴ�.");

							System.out.println("�ʱ� �Ա� �ݾ��� �Է����ּ���.");
							vo.setBalance(Integer.parseInt(br.readLine()));
						} while (vo.getBalance() > 10000);
					} else if (vo.getBalance() < 0) { // 0���� ���� �ݾ��� �ԷºҰ�
						do {
							System.out.println("0�� �̸����δ� �Ա��� �� �� �����ϴ�.");

							System.out.println("�ʱ� �Ա� �ݾ��� �Է����ּ���.");
							vo.setBalance(Integer.parseInt(br.readLine()));
						} while (vo.getBalance() < 0);
					}
				}
				
			} catch (NumberFormatException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			// 8) ���� ������ �߰� (�ڵ�)
			Calendar now = Calendar.getInstance(); // ���� ��¥�� �ð� ������ ���� Calendar ��ü�� ����
			vo.setCreateDay(String.format("%1$tF %1$tA", now));

			// ���� �Ϸ�
			System.out.printf("====================================================================================================\n");
			System.out.printf("����� : %s\n", vo.getBank());
			System.out.printf("���¹�ȣ : %s\n", account);
			System.out.printf("���̵� : %s\n", vo.getId());
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
		System.out.printf("���� ���� �ܾ� : %,d(��)\n", map.get(loginKey).getBalance());
		System.out.printf("====================================================================================================\n");
		
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
			
			map.get(loginKey).setBalance(map.get(loginKey).getBalance() + money);
			
			System.out.printf("====================================================================================================\n");
			System.out.printf("�ܾ� : %,d(��)\n", map.get(loginKey).getBalance());
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
		System.out.printf("���� ���� �ܾ� : %,d(��)\n", map.get(loginKey).getBalance());
		System.out.printf("====================================================================================================\n");
		
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
			
			if (money > map.get(loginKey).getBalance()) {
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
			
			map.get(loginKey).setBalance(map.get(loginKey).getBalance() - money);
			
			System.out.printf("====================================================================================================\n");
			System.out.printf("�ܾ� : %,d(��)\n", map.get(loginKey).getBalance());
			System.out.printf("====================================================================================================\n");
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void remit() { // �۱�
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
			
			// �۱��� ���°� �α����� ���¿� ������ ��� üũ
			if (loginKey.substring(0, 3).equals(account.substring(0, 3))) { // ����簡 �������� üũ
				if (loginKey.substring(3, 8).equals(account.substring(3, 8))) // ���ڸ� ���¹�ȣ üũ
				System.out.println("====================================================================================================");
				System.out.println("[ERROR] �۱� �Ұ� (���� : �ڽ��� ���¿� �۱� �Ұ�)");
				System.out.println("====================================================================================================");
				
				return;
			}
			
			check = passWordCount();
			
			if (check == true) {
				System.out.println("====================================================================================================");
				System.out.println("�۱��� �ݾ��� �Է����ּ���.");
				System.out.println("====================================================================================================");
				int money = Integer.parseInt(br.readLine());
				
				// ����� ��
				if (map.get(loginKey).getBank().equals(map.get(account).getBank())) {
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
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void selectAccount() { // ������ȸ
		if (map.get(loginKey).getId().equals("admin")) {
			Iterator<String> it = map.keySet().iterator();
			
			while (it.hasNext()) {
				loginKey = it.next();
				BankVO value = map.get(loginKey);
				
				System.out.printf("���¹�ȣ\t\t�����\t���̵�\t\t�̸�\t�������\t\t�ܾ�\t\t������\n");
				System.out.printf("%s\t%s\t%s\t%s\t%,d\t\t%s", loginKey, map.get(loginKey).getBank(), map.get(loginKey).getId(), map.get(loginKey).getName(), map.get(loginKey).getBirthDay(), map.get(loginKey).getBalance(), map.get(loginKey).getCreateDay());
			}
			
			return;
		}
		
		System.out.printf("���¹�ȣ\t\t�����\t�̸�\t�������\t\t�ܾ�\t\t������\n");
		System.out.printf("%s\t%s\t%s\t%s\t%,d\t\t%s", loginKey, map.get(loginKey).getBank(), map.get(loginKey).getId(), map.get(loginKey).getName(), map.get(loginKey).getBirthDay(), map.get(loginKey).getBalance(), map.get(loginKey).getCreateDay());
	}
	
	@Override
	public void update() { // ��������
		try {
			check = passWordCount();
			
			if (check == true) {
				System.out.println("�̸��� �Է����ּ���.");
				map.get(loginKey).setName(br.readLine());
				
				System.out.println("��������� �Է����ּ���.");
				// ������� üũ
				// -, .(���Խ� Ư������ : �ѹ��ڸ� ��Ÿ��)�� �Է¹����� ""(����)���� ��ȯ
				// ����.�� ��Ÿ�������� \\(�ι� �Է��ؾ���)
				map.get(loginKey).setBirthDay(br.readLine().replaceAll("\\-|\\.|/", "")); // Ư������ ����

				// ��������� 8�ڸ��� �ƴ� ��� üũ
				if (map.get(loginKey).getBirthDay().length() != 8) {

					do {
						System.out.println("====================================================================================================");
						System.out.println("[ERROR] ��¥ ���Ŀ� ������ �ֽ��ϴ�.");
						System.out.println("====================================================================================================");

						// ���Է� ó��
						System.out.println("��������� �Է����ּ���.");
						map.get(loginKey).setBirthDay(br.readLine().replaceAll("\\-|\\.|/", "")); // Ư������ ����
					} while (map.get(loginKey).getBirthDay().length() != 8);

				}
				
				// ���� �Ϸ�
				System.out.printf("====================================================================================================\n");
				System.out.printf("����� : %s\n", map.get(loginKey).getBank());
				System.out.printf("���¹�ȣ : %s\n", loginKey);
				System.out.printf("���̵� : %s\n", map.get(loginKey).getId());
				System.out.printf("�̸� : %s\n", map.get(loginKey).getName());
				System.out.printf("������� : %s\n", map.get(loginKey).getBirthDay());
				System.out.printf("������ : %s\n", map.get(loginKey).getCreateDay());
				System.out.printf("====================================================================================================\n");
				
				return;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	@Override
	public void delete() { // ���»���
		try {
			check = passWordCount();
			
			if (check == true) {
				// ���� �� ������ Ȯ��
				System.out.printf("====================================================================================================\n");
				System.out.printf("���¹�ȣ : %s\n", loginKey);
				System.out.printf("����� : %s\n", map.get(loginKey).getBank());
				System.out.printf("�ܾ� : %,d(��)\n", map.get(loginKey).getBalance());
				System.out.printf("�̸� : %s\n", map.get(loginKey).getName());
				System.out.printf("������� : %s\n", map.get(loginKey).getBirthDay());
				System.out.printf("������ : %s\n", map.get(loginKey).getCreateDay());
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
				
				check = false;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void login() { // �α���
		try {
			String account, id, passWord;
			
			System.out.println("====================================================================================================");
			System.out.println("���¹�ȣ�� �Է����ּ���.");
			System.out.println("====================================================================================================");
			
			account = br.readLine().replaceAll("\\-|\\.|/", ""); // Ư������ ����

			// 8�ڸ� üũ
			if (account.length() != 8) {

				do {
					System.out.println("====================================================================================================");
					System.out.println("[ERROR] ���¹�ȣ ���Ŀ� ������ �ֽ��ϴ�.");
					System.out.println("====================================================================================================");
					
					System.out.println("====================================================================================================");
					System.out.println("���¹�ȣ�� �Է����ּ���.");
					System.out.println("====================================================================================================");
					account = br.readLine().replaceAll("\\-|\\.|/", ""); // Ư������ ����
				} while (account.length() != 8);

			}
			
			if (!map.containsKey(account)) {
				System.out.println("====================================================================================================");
				System.out.println("�Է��Ͻ� ���������� ã�� �� �����ϴ�.");
				System.out.println("====================================================================================================");
				
				return;
			}
			
			System.out.println("====================================================================================================");
			System.out.println("���̵� �Է����ּ���.");
			System.out.println("====================================================================================================");
			
			id = br.readLine();
			
			if (!map.get(account).getId().equals(id)) {
				System.out.println("====================================================================================================");
				System.out.println("[ERROR] �������� ���� ���̵� �Դϴ�.");
				System.out.println("====================================================================================================");
				
				return;
			}
			
			while (true) {
				if(count >= 3) {
					System.out.println("====================================================================================================");
					System.out.println("��й�ȣ 3ȸ ������ ���� ��α����� �ʿ��մϴ�.");
					System.out.println("====================================================================================================");
					
					count = 0;
					
					break;
				}
				
				System.out.println("====================================================================================================");
				System.out.println("��й�ȣ�� �Է����ּ���.");
				System.out.println("====================================================================================================");
				
				passWord = br.readLine();
				
				BankVO vo = map.get(account);
				
				if (vo.getPassWord().equals(passWord)) {
					loginCheck = map.get(account);
					loginKey = account;
					
					count = 0;
					
					return;
				}
				
				count++;
				
				System.out.println("====================================================================================================");
				System.out.println("[ERROR] ��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
				System.out.println("====================================================================================================");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void logout() { // �α׾ƿ�
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
	
	public String loginKey() {
		return loginKey;
	}
	
	public boolean passWordCount() {
		try {
			while (true) {
				String passWord;
				
				if(count >= 3) {
					System.out.println("====================================================================================================");
					System.out.println("��й�ȣ 3ȸ ������ ���� ���񽺰� ��ҵǾ����ϴ�.");
					System.out.println("====================================================================================================");
					
					count = 0;
					
					break;
				}
				
				System.out.println("====================================================================================================");
				System.out.println("��й�ȣ�� �Է����ּ���.");
				System.out.println("====================================================================================================");
				passWord = br.readLine();
				
				if (map.get(loginKey).getPassWord().equals(passWord)) {
					count = 0;
					
					return true;
				}
				
				count++;
				
				System.out.println("====================================================================================================");
				System.out.println("[ERROR] ��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
				System.out.println("====================================================================================================");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return false;
	}
	
}
