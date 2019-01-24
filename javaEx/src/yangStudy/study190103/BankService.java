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
	private BankVO loginCheck; // 로그인된 정보 저장용 변수
	private String loginKey; // 로그인된 정보의 Key값 저장용 변수
	
	// 생성자를 통해 관리자 추가
	public BankService() {
		BankVO vo = new BankVO();
		
		String account = "00000000000000";
		vo.setBank("admin");
		vo.setPassWord("0000");
		vo.setName("관리자");
		vo.setBalance(100000000);
		
		map.put(account, vo);
	}
	
	@Override
	public void newAccount() { // 계좌 생성
		try {
			BankVO vo = new BankVO();
			
			String account;
			
			System.out.println("계좌번호를 입력해주세요.");
			account = br.readLine().replaceAll("\\-|\\.|/", ""); // 특수문자 제거
			
			//System.out.println(account);
			
			// 14자리 체크
			if (account.length() != 14) {

				do {
					System.out.println("====================================================================================================");
					System.out.println("[ERROR] 계좌번호 형식에 오류가 있습니다.");
					System.out.println("====================================================================================================");

					System.out.println("계좌번호를 입력해주세요.");
					account = br.readLine();

					account.replaceAll("\\-|\\.|/", ""); // 특수문자 제거
				} while (account.length() != 14);

			}
			
			if (map.containsKey(account)) {
				System.out.println("====================================================================================================");
				System.out.println("[ERROR] 중복된 계좌번호 입니다.");
				System.out.println("====================================================================================================");
				return;
			}
			
			System.out.println("은행사를 입력해주세요.");
			System.out.println("[1.국민은행] [2.기업은행] [3.신한은행] [4.농협]");
			int bank = Integer.parseInt(br.readLine());
			
			switch (bank) {
			case 1 : vo.setBank("국민은행"); break;
			case 2 : vo.setBank("기업은행"); break;
			case 3 : vo.setBank("신한은행"); break;
			case 4 : vo.setBank("농협"); break;
			}
			
			// 은행 단어 지우기
			vo.setBank(vo.getBank().replaceAll("은행", ""));
			
			System.out.println("비밀번호를 입력해주세요.");
			vo.setPassWord(br.readLine());

			System.out.println("이름을 입력해주세요.");
			vo.setName(br.readLine());

			System.out.println("생년월일을 입력해주세요.");
			// 생년월일 체크
			// -, .(정규식 특수문자 : 한문자를 나타냄)을 입력받으면 ""(공백)으로 변환
			// 실제.을 나타내기위해 \\(두번 입력해야함)
			vo.setBirthDay(br.readLine().replaceAll("\\-|\\.|/", "")); // 특수문자 제거

			// 생년월일이 8자리가 아닌 경우 체크
			if (vo.getBirthDay().length() != 8) {

				do {
					System.out.println("====================================================================================================");
					System.out.println("[ERROR] 날짜 형식에 오류가 있습니다.");
					System.out.println("====================================================================================================");

					// 재입력 처리
					System.out.println("생년월일을 입력해주세요.");
					vo.setBirthDay(br.readLine().replaceAll("\\-|\\.|/", "")); // 특수문자 제거
				} while (vo.getBirthDay().length() != 8);

			}

			try {
				System.out.println("초기 입금 금액을 입력해주세요.");
				vo.setBalance(Integer.parseInt(br.readLine()));
				
				// 만원보다 큰 금액 체크
				if (vo.getBalance() > 10000) {
					do {
						System.out.println("10,000원 보다 큰 금액은 입금을 할 수 없습니다.");

						System.out.println("초기 입금 금액을 입력해주세요.");
						vo.setBalance(Integer.parseInt(br.readLine()));
					} while (vo.getBalance() > 10000);
				} else if (vo.getBalance() < 0) { // 0원보다 작은 금액 체크
					do {
						System.out.println("0원 미만으로는 입금을 할 수 없습니다.");

						System.out.println("초기 입금 금액을 입력해주세요.");
						vo.setBalance(Integer.parseInt(br.readLine()));
					} while (vo.getBalance() < 0);
				} 
			} catch (NumberFormatException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}

			// 생성일 추가
			Calendar now = Calendar.getInstance(); // 현재 날짜와 시간 정보를 가진 Calendar 객체를 생성
			vo.setCreateDay(String.format("%1$tF %1$tA", now));

			// 생성 완료
			System.out.printf("====================================================================================================\n");
			System.out.printf("계좌번호 : %s\n", account);
			System.out.printf("은행사 : %s\n", vo.getBank());
			System.out.printf("잔액 : %,d(원)\n", vo.getBalance());
			System.out.printf("이름 : %s\n", vo.getName());
			System.out.printf("생년월일 : %s\n", vo.getBirthDay());
			System.out.printf("생성일 : %s\n", vo.getCreateDay());
			System.out.printf("====================================================================================================\n");
			
			// 추가
			map.put(account, vo);
			
			System.out.println("고객님 계좌가 생성되었습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@Override
	public void deposit() { // 입금
		System.out.printf("====================================================================================================\n");
		System.out.printf("현재 통장 잔액 : %,d(원)\n", loginCheck.getBalance());
		System.out.printf("====================================================================================================\n");
		
		if (loginKey.equals("00000000000000")) {
			System.out.println("====================================================================================================");
			System.out.println("[경고] 관리자 계좌는 입금이 불가능합니다.");
			System.out.println("====================================================================================================");
			
			return;
		}
		
		try {
			System.out.println("====================================================================================================");
			System.out.println("입금하실 금액을 입력해주세요.");
			System.out.println("====================================================================================================");
			
			int money = Integer.parseInt(br.readLine());
			
			System.out.printf("====================================================================================================\n");
			System.out.printf("%,d(원)을 입금하시겠습니까? [Y/N]\n", money);
			System.out.printf("====================================================================================================\n");
			
			char select = br.readLine().charAt(0);
			
			if (select != 'y' && select != 'Y') {
				System.out.println("====================================================================================================");
				System.out.println("입금 서비스를 취소하셨습니다.");
				System.out.println("====================================================================================================");
				
				return;
			}
			
			if (money < 0) {
				System.out.println("====================================================================================================");
				System.out.println("[ERROR] 입금 불가 (사유 : 0원보다 작은 금액)");
				System.out.println("====================================================================================================");
				
				return;
			}
			
			loginCheck.setBalance(loginCheck.getBalance() + money);
			
			System.out.printf("====================================================================================================\n");
			System.out.printf("잔액 : %,d(원)\n", loginCheck.getBalance());
			System.out.printf("====================================================================================================\n");
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void withdraw() { // 출금
		System.out.printf("====================================================================================================\n");
		System.out.printf("현재 통장 잔액 : %,d(원)\n", loginCheck.getBalance());
		System.out.printf("====================================================================================================\n");
		
		if (loginKey.equals("00000000000000")) {
			System.out.println("====================================================================================================");
			System.out.println("[경고] 관리자 계좌는 출금이 불가능합니다.");
			System.out.println("====================================================================================================");
			
			return;
		}
		
		try {
			System.out.println("====================================================================================================");
			System.out.println("출금하실 금액을 입력해주세요.");
			System.out.println("====================================================================================================");
			
			int money = Integer.parseInt(br.readLine());
			
			System.out.printf("====================================================================================================\n");
			System.out.printf("%,d(원)을 출금하시겠습니까? [Y/N]\n", money);
			System.out.printf("====================================================================================================\n");
			char select = br.readLine().charAt(0);
			
			if (select != 'y' && select != 'Y') {
				System.out.println("====================================================================================================");
				System.out.println("출금 서비스를 취소하셨습니다.");
				System.out.println("====================================================================================================");
				
				return;
			}
			
			if (money > loginCheck.getBalance()) {
				System.out.println("====================================================================================================");
				System.out.println("[ERROR] 출금 불가 (사유 : 잔액 부족)");
				System.out.println("====================================================================================================");
				
				return;
			} else if (money < 0) {
				System.out.println("====================================================================================================");
				System.out.println("[ERROR] 출금 불가 (사유 : 0원보다 작은 금액)");
				System.out.println("====================================================================================================");
				
				return;
			} 
			
			loginCheck.setBalance(loginCheck.getBalance() - money);
			
			System.out.printf("====================================================================================================\n");
			System.out.printf("잔액 : %,d(원)\n", loginCheck.getBalance());
			System.out.printf("====================================================================================================\n");
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void remit() { // 송금
		if (loginKey.equals("00000000000000")) {
			System.out.println("====================================================================================================");
			System.out.println("[경고] 관리자 계좌는 송금이 불가능합니다.");
			System.out.println("====================================================================================================");
			
			return;
		}
		
		try {
			System.out.println("====================================================================================================");
			System.out.println("송금할 계좌번호를 입력해주세요.");
			System.out.println("====================================================================================================");
			String account = br.readLine();
			
			// 송금할 계좌번호가 있는지 체크
			if (!map.containsKey(account)) {
				System.out.println("====================================================================================================");
				System.out.println("[ERROR] 송금 불가 (사유 : 조회되지 않는 계좌번호 입니다.)");
				System.out.println("====================================================================================================");
				
				return;
			}

			System.out.println("====================================================================================================");
			System.out.println("비밀번호를 입력해주세요.");
			System.out.println("====================================================================================================");
			String passWord = br.readLine();
			
			// 패스워드가 일치하지 않을 경우
			if (!loginCheck.getPassWord().equals(passWord)) {
				System.out.println("====================================================================================================");
				System.out.println("비밀번호가 일치하지 않습니다.");
				System.out.println("====================================================================================================");
				
				return;
			}
			
			System.out.println("====================================================================================================");
			System.out.println("송금할 금액을 입력해주세요.");
			System.out.println("====================================================================================================");
			int money = Integer.parseInt(br.readLine());
			
			// 은행사 비교
			if (loginCheck.getBank().equals(map.get(account).getBank())) {
				System.out.println("====================================================================================================");
				System.out.println("은행사가 동일합니다. (수수료 면제)");
				System.out.println("====================================================================================================");
				
				System.out.printf("====================================================================================================\n");
				System.out.printf("%s 계좌에 %,d(원)을 입금하시겠습니까? [Y/N]", account, money);
				System.out.printf("====================================================================================================\n");
				
				char select = br.readLine().charAt(0);
				
				if (select != 'y' && select != 'Y') {
					System.out.println("====================================================================================================");
					System.out.println("송금 서비스가 취소되었습니다.");
					System.out.println("====================================================================================================");
				}
				
				if (loginCheck.getBalance() < money) {
					System.out.println("====================================================================================================");
					System.out.println("[ERROR] 송금 불가 (사유 : 잔액 부족)");
					System.out.println("====================================================================================================");
					
					return;
				}

				map.get(account).setBalance(map.get(account).getBalance() + money); // 입금 처리				
				loginCheck.setBalance(loginCheck.getBalance() - money); // 자신의 통장에서 금액 빼기
				
				System.out.println("====================================================================================================");
				System.out.println(account + "계좌에 " + money + "(원)을 송금 완료했습니다.");
				System.out.println("====================================================================================================");
				System.out.println();
			} else {
				System.out.println("====================================================================================================");
				System.out.println("은행사가 달라서 수수료가 발생합니다. (수수료 1,000원)");
				System.out.println("====================================================================================================");
				
				System.out.println("====================================================================================================");
				System.out.printf("%s 계좌에 %,d(원)을 입금하시겠습니까? [Y/N]", account, money);
				System.out.println("====================================================================================================");
				
				char select = br.readLine().charAt(0);
				
				int commission = 1000;
				
				if (select != 'y' && select != 'Y') {
					System.out.println("====================================================================================================");
					System.out.println("송금 서비스가 취소되었습니다.");
					System.out.println("====================================================================================================");
				}
				
				if (loginCheck.getBalance() < (money + commission)) {
					System.out.println("====================================================================================================");
					System.out.println("[ERROR] 송금 불가 (사유 : 잔액 부족)");
					System.out.println("====================================================================================================");
					
					return;
				}

				map.get(account).setBalance(map.get(account).getBalance() + money); // 입금 처리				
				loginCheck.setBalance(loginCheck.getBalance() - (money + commission)); // 자신의 통장에서 금액 빼기
				
				System.out.println("====================================================================================================");
				System.out.println(account + "계좌에 " + money + "(원)을 송금 완료했습니다.");
				System.out.println("====================================================================================================");
				System.out.println();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void selectAccount() { // 계좌 조회
		// 관리자는 전체 계좌 조회 가능
		if (loginKey.equals("00000000000000")) {
			Iterator<String> it = map.keySet().iterator();
			
			while (it.hasNext()) {
				loginKey = it.next();
				BankVO value = map.get(loginKey);
				
				System.out.printf("계좌번호\t\t은행사\t이름\t생년월일\t\t잔액\t\t생성일\n");
				System.out.printf("%s\t%s\t%s\t%s\t%,d\t\t%s", loginKey, loginCheck.getBank(), loginCheck.getName(), loginCheck.getBirthDay(), loginCheck.getBalance(), loginCheck.getCreateDay());
			}
			
			return;
		}
		
		System.out.printf("계좌번호\t\t은행사\t이름\t생년월일\t\t잔액\t\t생성일\n");
		System.out.printf("%s\t%s\t%s\t%s\t%,d\t\t%s", loginKey, loginCheck.getBank(), loginCheck.getName(), loginCheck.getBirthDay(), loginCheck.getBalance(), loginCheck.getCreateDay());
	}
	
	@Override
	public void delete() {
		if (loginKey.equals("00000000000000")) {
			System.out.println("====================================================================================================");
			System.out.println("[경고] 관리자는 탈퇴가 불가능합니다.");
			System.out.println("====================================================================================================");
			
			return;
		}
		
		try {
			System.out.println("====================================================================================================");
			System.out.println("비밀번호를 입력해주세요.");
			System.out.println("====================================================================================================");
			String passWord = br.readLine();
			
			if (!loginCheck.getPassWord().equals(passWord)) {
				System.out.println("비밀번호가 일치하지 않습니다.");
				return;
			}
			
			// 삭제 전 데이터 확인
			System.out.printf("====================================================================================================\n");
			System.out.printf("계좌번호 : %s\n", loginKey);
			System.out.printf("은행사 : %s\n", loginCheck.getBank());
			System.out.printf("잔액 : %,d(원)\n", loginCheck.getBalance());
			System.out.printf("이름 : %s\n", loginCheck.getName());
			System.out.printf("생년월일 : %s\n", loginCheck.getBirthDay());
			System.out.printf("생성일 : %s\n", loginCheck.getCreateDay());
			System.out.printf("====================================================================================================\n");
			
			System.out.println("====================================================================================================");
			System.out.println("정말로 삭제하시겠습니까? [Y/N]");
			System.out.println("====================================================================================================");
			char c = br.readLine().charAt(0);
			
			if (c != 'y' && c != 'Y') {
				System.out.println("====================================================================================================");
				System.out.println("계좌정보 삭제가 취소되었습니다.");
				System.out.println("====================================================================================================");
				return;
			}
			
			map.remove(loginKey);
			
			loginCheck = null;
			loginKey = null;
			
			System.out.println("====================================================================================================");
			System.out.println("계좌정보를 삭제했습니다.");
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
			System.out.println("계좌번호를 입력해주세요.");
			System.out.println("====================================================================================================");
			
			account = br.readLine().replaceAll("\\-|\\.|/", ""); // 특수문자 제거

			// 14자리 체크
			if (account.length() != 14) {

				do {
					System.out.println("====================================================================================================");
					System.out.println("[ERROR] 계좌번호 형식에 오류가 있습니다.");
					System.out.println("====================================================================================================");
					
					System.out.println("====================================================================================================");
					System.out.println("계좌번호를 입력해주세요.");
					System.out.println("====================================================================================================");
					account = br.readLine().replaceAll("\\-|\\.|/", ""); // 특수문자 제거
				} while (account.length() != 14);

			}
			
			if (!map.containsKey(account)) {
				System.out.println("====================================================================================================");
				System.out.println("입력하신 계좌정보를 찾을 수 없습니다.");
				System.out.println("====================================================================================================");
				
				return;
			}
			
			System.out.println("====================================================================================================");
			System.out.println("비밀번호를 입력해주세요.");
			System.out.println("====================================================================================================");
			
			passWord = br.readLine();
			
			BankVO vo = map.get(account);
			
			if (vo.getPassWord().equals(passWord)) {
				loginCheck = map.get(account);
				loginKey = account;
				
				return;
			}
			
			System.out.println("====================================================================================================");
			System.out.println("[ERROR] 계좌번호 또는 비밀번호가 일치하지 않습니다.");
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
		System.out.println("로그아웃 처리되었습니다.");
		System.out.println("====================================================================================================");
	}

	@Override
	public BankVO loginCheck() { 
		return loginCheck;
	}
	
}
