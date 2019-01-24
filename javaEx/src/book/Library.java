package book;

public class Library {
	private Book book=new BookImpl();
	private Rental rent=new RentalImpl(book);
	private Member member=new MemberImpl(rent);	
	private MemberVO loginVO = null;
	
	public MemberVO getLoginVO() {
		return loginVO;
	}

	// �α���
	public void login() {
		loginVO=member.login();
	}

	// �α׾ƿ�
	public void logout() {
		loginVO=null;
	}
	
	// ȸ�� ����
	public void insertMember() {
		member.insertMember();
	}

	// ȸ����������
	public void updateMember() {
		if(loginVO==null) {
			System.out.println("�α����� �ʿ� �մϴ�.\n");
			return;
		}
		
		member.updateMember(loginVO.getId());
	}

	// ȸ��Ż��
	public void deleteMember() {
		if(loginVO==null) {
			System.out.println("�α����� �ʿ� �մϴ�.\n");
			return;
		}
		
		if(member.removeMember(loginVO.getId())==true)
			loginVO=null;
		
	}
	
	// ������ ���� ���� �޴�
	public void bookManage() {
		char ch;
		
		if(loginVO==null || ! loginVO.getId().equals("admin")) {
			System.out.println("�α����� �ʿ� �մϴ�.\n");
			return;
		}
		
		while(true) {
			System.out.println("\n[���� ����]");
			try {
				do {
					System.out.println("1.������� 2.�������� 3.�����ڵ�˻� 4.������˻� 5.��������Ʈ");
					System.out.println("6.��ü�뿩����Ʈ 7.�뿩���ε�������Ʈ 8.�����ڵ庰�뿩�˻� 9.����");
					System.out.print("����(1~9) => ");
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

	// ������ ȸ�� ���� �޴�
	public void memberManage() {
		char ch;
		
		if(loginVO==null || ! loginVO.getId().equals("admin")) {
			System.out.println("�α����� �ʿ� �մϴ�.\n");
			return;
		}
		
		while(true) {
			System.out.println("\n[ȸ�� ����]");
			try {
				do {
					System.out.println("1.ȸ������Ʈ 2.���̵�˻� 3. ���� => ");
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
	
	// ����� �޴�
	public void rentalManage() {
		char ch;
		
		if(loginVO==null) {
			System.out.println("�α����� �ʿ� �մϴ�.\n");
			return;
		}
		
		while(true) {
			System.out.println("\n[���� �뿩]");
			try {
				do {
					System.out.print("1.�뿩 2.�ݳ� 3.��ü�뿩����Ʈ 4.�뿩���ε�������Ʈ 5.����  => ");
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

	// ����� �޴�
	public void searchBook() {
		char ch;
		while(true) {
			System.out.println("\n[���� �˻�]");
			try {
				do {
					System.out.print("1.������ �˻� 2.���� �ڵ� �˻� 3.�����ڵ�� �뿩���� �˻� 4.���� => ");
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
