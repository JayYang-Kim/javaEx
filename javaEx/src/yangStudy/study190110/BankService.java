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
 * [추가] update()
 * */

public class BankService implements Bank {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	protected Map<String, BankVO> map = new HashMap<>();
	private BankVO loginCheck; // 로그인된 정보 저장용 변수
	private String loginKey; // 로그인된 may<Key>값 저장용 변수
	private int count = 0; // 패스워드 틀린 수 카운트용 변수
	private boolean check = false; // 패스워드 3회 제한 체크용 변수
	
	// 생성자
	// 생성자 호출 시 관리자 계정 생성
	public BankService() {
		BankVO vo = new BankVO();
		
		String account = "00000000";
		vo.setId("admin");
		vo.setBank("국민");
		vo.setPassWord("0000");
		vo.setName("관리자");
		vo.setBalance(100000000);
		
		map.put(account, vo);
	}
	
	@Override
	public void newAccount() { // 계좌생성
		try {
			BankVO vo = new BankVO();
			
			// 1) 은행사 선택
			System.out.println("은행사를 입력해주세요.");
			System.out.println("[1.국민은행] [2.기업은행] [3.신한은행] [4.농협은행]");
			int bank = Integer.parseInt(br.readLine());
			
			switch (bank) {
			case 1 : vo.setBank("국민은행"); break;
			case 2 : vo.setBank("기업은행"); break;
			case 3 : vo.setBank("신한은행"); break;
			case 4 : vo.setBank("농협은행"); break;
			}
			
			// 은행 단어 지우기
			vo.setBank(vo.getBank().replaceAll("은행", ""));
			
			// 2) 계좌번호 입력
			String account = null;
			
			// 은행사 선택에 따라 계좌번호 앞자리 3개 선택
			switch (vo.getBank()) {
			case "국민" : account = "123"; break;
			case "기업" : account = "456"; break;
			case "신한" : account = "789"; break;
			case "농협" : account = "147"; break;
			}
			
			// 랜덤 계좌번호 생성 (5자리)
			Random rnd = new Random();
			
			// 첫번째 방법
			/*int num = rnd.nextInt(99999) + 10000; // 10000 ~ 99999까지 난수 생성
			
			account += String.valueOf(num);
			
			System.out.println(account);*/
			
			// 두번째 방법
			/*StringBuffer sb = new StringBuffer(); // append를 사용하기 위해 StringBuffer사용
			
			for (int i = 0; i < 5; i++) {
				// random을 사용하여 0 ~ 9까지의 난수를 생성한 뒤 숫자를 문자열로 변환
				sb.append(Integer.toString(rnd.nextInt(10))); 
			}
			
			// 사용자 계좌번호와 난수 합치기
			account += sb;*/
			
			// 세번째 방법 (중복제거)
			/*StringBuffer sb = new StringBuffer();
			
			gogo:
			for (int i = 0; i < 5; i++) {
				int n = rnd.nextInt(10); // 0 ~ 9 난수 대입
				
				for (int j = 0; j < sb.length(); j++) {
					if (n == Integer.parseInt(sb.substring(j, j+1))) {
						i--;
						continue gogo;
					}
				}
				
				sb.append(Integer.toString(n));
			}

			// 사용자 계좌번호와 난수 합치기
			account += sb;*/
			
			// 동일한 은행사이며, 동일한 계좌번호 중복제거
			do {
				StringBuffer sb = new StringBuffer(); // append를 사용하기 위해 StringBuffer사용
				
				for (int i = 0; i < 5; i++) {
					// random을 사용하여 0 ~ 9까지의 난수를 생성한 뒤 숫자를 문자열로 변환
					sb.append(Integer.toString(rnd.nextInt(10))); 
				}
				
				// 사용자 계좌번호와 난수 합치기
				account += sb;
			} while(map.containsKey(account));
			
			// 3) 아이디 입력
			System.out.println("아이디를 입력해주세요.");
			vo.setId(br.readLine());
			
			// 동일한 은행사이며, 동일한 아이디 중복제거
			// foreach를 이용한 map에 있는 전체 데이터 가져오기
			
			/*while (true) {
				for (String s : map.keySet()) {
					BankVO i = map.get(s);
					
					do {
						// 동일한 은행사 인지 체크
						if (s.substring(0, 3).equals(account.substring(0, 3))) {
							// 아이디가 같은지 체크
							if (i.getId().equals(vo.getId())) {
								System.out.println("====================================================================================================");
								System.out.println("[ERROR] 아이디 생성 불가 (사유 : 동일한 은행사 - 아이디 중복)");
								System.out.println("====================================================================================================");
								
								System.out.println("아이디를 입력해주세요.");
								vo.setId(br.readLine());
							}
						}
					} while(i.getId().equals(vo.getId()));
				}
				
				break;
			}*/
			
			/*while (true) {
				System.out.println("아이디를 입력해주세요.");
				vo.setId(br.readLine());
				
				for (String s : map.keySet()) {
					BankVO i = map.get(s);
					
					// 동일한 은행사 인지 체크
					if (s.substring(0, 3).equals(account.substring(0, 3))) {
						// 아이디가 같은지 체크
						if (i.getId().equals(vo.getId())) {
							System.out.println("====================================================================================================");
							System.out.println("[ERROR] 아이디 생성 불가 (사유 : 동일한 은행사 - 아이디 중복)");
							System.out.println("====================================================================================================");
							
							break;
						}
						
						break;
					}

				}
			}
			*/
			
			// 4) 비밀번호 입력
			System.out.println("비밀번호를 입력해주세요.");
			vo.setPassWord(br.readLine());
			
			// 5) 이름 입력
			System.out.println("이름을 입력해주세요.");
			vo.setName(br.readLine());
			
			// 6) 생년월입 입력
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
			
			// 7) 초기 입금 금액 입력
			try {
				char select;
				
				// 초기 입급 금액을 입력할것인지 체크
				System.out.println("초기 입금을 하시겠습니까? [Y/N]");
				select = br.readLine().charAt(0);
				
				if (select != 'y' && select != 'Y') {
					System.out.println("초기 입금을 진행하지 않습니다.");
					
					vo.setBalance(0);
				} else {
					System.out.println("초기 입금 금액을 입력해주세요.");
					vo.setBalance(Integer.parseInt(br.readLine()));
					
					if (vo.getBalance() > 10000) { // 10,000보다 큰 금액은 입력불가
						do {
							System.out.println("10,000원 보다 큰 금액은 입금을 할 수 없습니다.");

							System.out.println("초기 입금 금액을 입력해주세요.");
							vo.setBalance(Integer.parseInt(br.readLine()));
						} while (vo.getBalance() > 10000);
					} else if (vo.getBalance() < 0) { // 0보다 작은 금액은 입력불가
						do {
							System.out.println("0원 미만으로는 입금을 할 수 없습니다.");

							System.out.println("초기 입금 금액을 입력해주세요.");
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
			
			// 8) 계좌 생성일 추가 (자동)
			Calendar now = Calendar.getInstance(); // 현재 날짜와 시간 정보를 가진 Calendar 객체를 생성
			vo.setCreateDay(String.format("%1$tF %1$tA", now));

			// 생성 완료
			System.out.printf("====================================================================================================\n");
			System.out.printf("은행사 : %s\n", vo.getBank());
			System.out.printf("계좌번호 : %s\n", account);
			System.out.printf("아이디 : %s\n", vo.getId());
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
		System.out.printf("현재 통장 잔액 : %,d(원)\n", map.get(loginKey).getBalance());
		System.out.printf("====================================================================================================\n");
		
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
			
			map.get(loginKey).setBalance(map.get(loginKey).getBalance() + money);
			
			System.out.printf("====================================================================================================\n");
			System.out.printf("잔액 : %,d(원)\n", map.get(loginKey).getBalance());
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
		System.out.printf("현재 통장 잔액 : %,d(원)\n", map.get(loginKey).getBalance());
		System.out.printf("====================================================================================================\n");
		
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
			
			if (money > map.get(loginKey).getBalance()) {
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
			
			map.get(loginKey).setBalance(map.get(loginKey).getBalance() - money);
			
			System.out.printf("====================================================================================================\n");
			System.out.printf("잔액 : %,d(원)\n", map.get(loginKey).getBalance());
			System.out.printf("====================================================================================================\n");
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void remit() { // 송금
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
			
			// 송금할 계좌가 로그인한 계좌와 동일한 경우 체크
			if (loginKey.substring(0, 3).equals(account.substring(0, 3))) { // 은행사가 동일한지 체크
				if (loginKey.substring(3, 8).equals(account.substring(3, 8))) // 뒷자리 계좌번호 체크
				System.out.println("====================================================================================================");
				System.out.println("[ERROR] 송금 불가 (사유 : 자신의 계좌에 송금 불가)");
				System.out.println("====================================================================================================");
				
				return;
			}
			
			check = passWordCount();
			
			if (check == true) {
				System.out.println("====================================================================================================");
				System.out.println("송금할 금액을 입력해주세요.");
				System.out.println("====================================================================================================");
				int money = Integer.parseInt(br.readLine());
				
				// 은행사 비교
				if (map.get(loginKey).getBank().equals(map.get(account).getBank())) {
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
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void selectAccount() { // 계좌조회
		if (map.get(loginKey).getId().equals("admin")) {
			Iterator<String> it = map.keySet().iterator();
			
			while (it.hasNext()) {
				loginKey = it.next();
				BankVO value = map.get(loginKey);
				
				System.out.printf("계좌번호\t\t은행사\t아이디\t\t이름\t생년월일\t\t잔액\t\t생성일\n");
				System.out.printf("%s\t%s\t%s\t%s\t%,d\t\t%s", loginKey, map.get(loginKey).getBank(), map.get(loginKey).getId(), map.get(loginKey).getName(), map.get(loginKey).getBirthDay(), map.get(loginKey).getBalance(), map.get(loginKey).getCreateDay());
			}
			
			return;
		}
		
		System.out.printf("계좌번호\t\t은행사\t이름\t생년월일\t\t잔액\t\t생성일\n");
		System.out.printf("%s\t%s\t%s\t%s\t%,d\t\t%s", loginKey, map.get(loginKey).getBank(), map.get(loginKey).getId(), map.get(loginKey).getName(), map.get(loginKey).getBirthDay(), map.get(loginKey).getBalance(), map.get(loginKey).getCreateDay());
	}
	
	@Override
	public void update() { // 정보수정
		try {
			check = passWordCount();
			
			if (check == true) {
				System.out.println("이름을 입력해주세요.");
				map.get(loginKey).setName(br.readLine());
				
				System.out.println("생년월일을 입력해주세요.");
				// 생년월일 체크
				// -, .(정규식 특수문자 : 한문자를 나타냄)을 입력받으면 ""(공백)으로 변환
				// 실제.을 나타내기위해 \\(두번 입력해야함)
				map.get(loginKey).setBirthDay(br.readLine().replaceAll("\\-|\\.|/", "")); // 특수문자 제거

				// 생년월일이 8자리가 아닌 경우 체크
				if (map.get(loginKey).getBirthDay().length() != 8) {

					do {
						System.out.println("====================================================================================================");
						System.out.println("[ERROR] 날짜 형식에 오류가 있습니다.");
						System.out.println("====================================================================================================");

						// 재입력 처리
						System.out.println("생년월일을 입력해주세요.");
						map.get(loginKey).setBirthDay(br.readLine().replaceAll("\\-|\\.|/", "")); // 특수문자 제거
					} while (map.get(loginKey).getBirthDay().length() != 8);

				}
				
				// 생성 완료
				System.out.printf("====================================================================================================\n");
				System.out.printf("은행사 : %s\n", map.get(loginKey).getBank());
				System.out.printf("계좌번호 : %s\n", loginKey);
				System.out.printf("아이디 : %s\n", map.get(loginKey).getId());
				System.out.printf("이름 : %s\n", map.get(loginKey).getName());
				System.out.printf("생년월일 : %s\n", map.get(loginKey).getBirthDay());
				System.out.printf("생성일 : %s\n", map.get(loginKey).getCreateDay());
				System.out.printf("====================================================================================================\n");
				
				return;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	@Override
	public void delete() { // 계좌삭제
		try {
			check = passWordCount();
			
			if (check == true) {
				// 삭제 전 데이터 확인
				System.out.printf("====================================================================================================\n");
				System.out.printf("계좌번호 : %s\n", loginKey);
				System.out.printf("은행사 : %s\n", map.get(loginKey).getBank());
				System.out.printf("잔액 : %,d(원)\n", map.get(loginKey).getBalance());
				System.out.printf("이름 : %s\n", map.get(loginKey).getName());
				System.out.printf("생년월일 : %s\n", map.get(loginKey).getBirthDay());
				System.out.printf("생성일 : %s\n", map.get(loginKey).getCreateDay());
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
				
				check = false;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void login() { // 로그인
		try {
			String account, id, passWord;
			
			System.out.println("====================================================================================================");
			System.out.println("계좌번호를 입력해주세요.");
			System.out.println("====================================================================================================");
			
			account = br.readLine().replaceAll("\\-|\\.|/", ""); // 특수문자 제거

			// 8자리 체크
			if (account.length() != 8) {

				do {
					System.out.println("====================================================================================================");
					System.out.println("[ERROR] 계좌번호 형식에 오류가 있습니다.");
					System.out.println("====================================================================================================");
					
					System.out.println("====================================================================================================");
					System.out.println("계좌번호를 입력해주세요.");
					System.out.println("====================================================================================================");
					account = br.readLine().replaceAll("\\-|\\.|/", ""); // 특수문자 제거
				} while (account.length() != 8);

			}
			
			if (!map.containsKey(account)) {
				System.out.println("====================================================================================================");
				System.out.println("입력하신 계좌정보를 찾을 수 없습니다.");
				System.out.println("====================================================================================================");
				
				return;
			}
			
			System.out.println("====================================================================================================");
			System.out.println("아이디를 입력해주세요.");
			System.out.println("====================================================================================================");
			
			id = br.readLine();
			
			if (!map.get(account).getId().equals(id)) {
				System.out.println("====================================================================================================");
				System.out.println("[ERROR] 존재하지 않은 아이디 입니다.");
				System.out.println("====================================================================================================");
				
				return;
			}
			
			while (true) {
				if(count >= 3) {
					System.out.println("====================================================================================================");
					System.out.println("비밀번호 3회 오류로 인해 재로그인이 필요합니다.");
					System.out.println("====================================================================================================");
					
					count = 0;
					
					break;
				}
				
				System.out.println("====================================================================================================");
				System.out.println("비밀번호를 입력해주세요.");
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
				System.out.println("[ERROR] 비밀번호가 일치하지 않습니다.");
				System.out.println("====================================================================================================");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void logout() { // 로그아웃
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
	
	public String loginKey() {
		return loginKey;
	}
	
	public boolean passWordCount() {
		try {
			while (true) {
				String passWord;
				
				if(count >= 3) {
					System.out.println("====================================================================================================");
					System.out.println("비밀번호 3회 오류로 인해 서비스가 취소되었습니다.");
					System.out.println("====================================================================================================");
					
					count = 0;
					
					break;
				}
				
				System.out.println("====================================================================================================");
				System.out.println("비밀번호를 입력해주세요.");
				System.out.println("====================================================================================================");
				passWord = br.readLine();
				
				if (map.get(loginKey).getPassWord().equals(passWord)) {
					count = 0;
					
					return true;
				}
				
				count++;
				
				System.out.println("====================================================================================================");
				System.out.println("[ERROR] 비밀번호가 일치하지 않습니다.");
				System.out.println("====================================================================================================");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return false;
	}
	
}
