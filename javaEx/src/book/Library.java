package book;

public class Library {
	private Book book=new BookImpl();
	private Rental rent=new RentalImpl(book);
	private Member member=new MemberImpl(rent);	
	private MemberVO loginVO = null;
	
	public MemberVO getLoginVO() {
		return loginVO;
	}

	// 로그인
	public void login() {
		loginVO=member.login();
	}

	// 로그아웃
	public void logout() {
		loginVO=null;
	}
	
	// 회원 가입
	public void insertMember() {
		member.insertMember();
	}

	// 회원정보수정
	public void updateMember() {
		if(loginVO==null) {
			System.out.println("로그인이 필요 합니다.\n");
			return;
		}
		
		member.updateMember(loginVO.getId());
	}

	// 회원탈퇴
	public void deleteMember() {
		if(loginVO==null) {
			System.out.println("로그인이 필요 합니다.\n");
			return;
		}
		
		if(member.removeMember(loginVO.getId())==true)
			loginVO=null;
		
	}
	
	// 관리자 도서 관리 메뉴
	public void bookManage() {
		char ch;
		
		if(loginVO==null || ! loginVO.getId().equals("admin")) {
			System.out.println("로그인이 필요 합니다.\n");
			return;
		}
		
		while(true) {
			System.out.println("\n[도서 관리]");
			try {
				do {
					System.out.println("1.도서등록 2.도서수정 3.도서코드검색 4.도서명검색 5.도서리스트");
					System.out.println("6.전체대여리스트 7.대여중인도서리스트 8.도서코드별대여검색 9.복귀");
					System.out.print("선택(1~9) => ");
					ch=(char)System.in.read();
					System.in.skip(2);
				} while(ch<'1'||ch>'9');
				switch(ch) {
				case '1':book.insertBook();break;
				case '2':book.updateBook();break;
				case '3':book.searchCodeBook();break;
				case '4':book.searchTitleBook();break;
				case '5':book.writeBookList();break;
				
				case '6':rent.writeRentalAllList();break;
				case '7':rent.writeRentalList();break;
				case '8':rent.searchCodeRental();break;
				case '9':return;
				}
			} catch (Exception e) {
			}
		}
	}

	// 관리자 회원 관리 메뉴
	public void memberManage() {
		char ch;
		
		if(loginVO==null || ! loginVO.getId().equals("admin")) {
			System.out.println("로그인이 필요 합니다.\n");
			return;
		}
		
		while(true) {
			System.out.println("\n[회원 관리]");
			try {
				do {
					System.out.println("1.회원리스트 2.아이디검색 3. 복귀 => ");
					ch=(char)System.in.read();
					System.in.skip(2);
				} while(ch<'1'||ch>'3');
				switch(ch) {
				case '1':member.listMember();break;
				case '2':member.searchIdMember();break;
				case '3':return;
				}
			} catch (Exception e) {
			}
		}
	}
	
	// 사용자 메뉴
	public void rentalManage() {
		char ch;
		
		if(loginVO==null) {
			System.out.println("로그인이 필요 합니다.\n");
			return;
		}
		
		while(true) {
			System.out.println("\n[도서 대여]");
			try {
				do {
					System.out.print("1.대여 2.반납 3.전체대여리스트 4.대여중인도서리스트 5.복귀  => ");
					ch=(char)System.in.read();
					System.in.skip(2);
				} while(ch<'1'||ch>'5');
				switch(ch) {
				case '1':rent.bookRental(loginVO.getId());break;
				case '2':rent.bookReturn(loginVO.getId());break;
				case '3':rent.writeRentalListAllId(loginVO.getId());break;
				case '4':rent.writeRentalListId(loginVO.getId());break;
				case '5':return;
				}
			} catch (Exception e) {
			}
		}
	}

	// 사용자 메뉴
	public void searchBook() {
		char ch;
		while(true) {
			System.out.println("\n[도서 검색]");
			try {
				do {
					System.out.print("1.도서명 검색 2.도서 코드 검색 3.도서코드로 대여여부 검색 4.복귀 => ");
					ch=(char)System.in.read();
					System.in.skip(2);
				} while(ch<'1'||ch>'4');
				switch(ch) {
				case '1':book.searchTitleBook();break;
				case '2':book.searchCodeBook();break;
				case '3':rent.searchCodeRental();break;
				case '4':return;
				}
			} catch (Exception e) {
			}
		}
	}
	
}
