package book1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/*
 * �ۼ��� : ������
 */

public class BookImpl implements BookService {
	private List<BookVO> bl;

	private Scanner sc = new Scanner(System.in);
	private Calendar toDay = Calendar.getInstance(); // ���� ��¥�� �ð� ������ ������

	private String fixDate; // �ݳ��� (����)
	private String endDate; // �ݳ��� ��¥

	private UserVO bookDelete;

	// ������
	public BookImpl(ListVO list) {
		bl = list.getBookList();
	}

	// �뿩 ����
	@Override
	public void bookRent(UserVO loginMember) {
		// �α��� ���� üũ
		if (loginMember == null) {
			System.out.println("�α����� �ʿ��� �����Դϴ�.");
			return;
		}
		
		if (bl.size() == 0) {
			System.out.println("�뿩�� å�� �����ϴ�.");
			return;
		}
		
		for (BookVO book2 : bl) {
			if (book2.getBookExist() == true) {
				System.out.println("å ����\tå��ȣ");
				System.out.println(book2.getBookName() + "\t" + book2.getBookNum());
			}
		}

		// å �뿩�� �� ������ üũ
		System.out.println("�뿩�� å �̸��� �Է����ּ���.");
		String book = sc.next(); // �뿩�� å �Է� �ޱ�

		for (BookVO book2 : bl) {
			// å �̸��� �ִ��� ���� Ȯ��
			if (book2.getBookName().equals(book)) {
				// å �̸��� ������ �ش� å�� �뿩 �������� üũ
				if (book2.getBookExist() == true) {
					book2.setBookExist(false); // �ش� å �뿩 ���� ���� (true)

					SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd"); // ��¥ ���� ����
					Date date = new Date();

					String strDate = dateFormat.format(toDay.getTime());

					toDay.setTime(date);
					toDay.add(toDay.DATE, 7); // 7�� ����

					// cal => String���� ��ȯ
					String endDate = dateFormat.format(toDay.getTime());

					this.fixDate = endDate;

					loginMember.getBookList().add(book2);

					System.out.println(loginMember.getName() + "(��) " + book2.getBookName() + "�� �뿩�ϼ̽��ϴ�.");
					System.out.println("�뿩�� : " + strDate);
					System.out.println("�ݳ��� : " + fixDate);
				}
			} else {
				System.out.println("�뿩�� å�� �����ϴ�.");
				return;
			}
		}
	}

	// �ݳ� ����
	@Override
	public void bookRetrun(UserVO loginMember) {
		// �α��� ���� üũ
		if (loginMember == null) {
			System.out.println("�α����� �ʿ��� �����Դϴ�.");
			return;
		}
		
		if (loginMember.getBookList().size() == 0) {
			System.out.println("�ݳ��� å�� �����ϴ�.");
			return;
		}
		
		// �ݳ��� å ����
		for (BookVO v2 : loginMember.getBookList()) {
			System.out.println("å ����\tå��ȣ");
			System.out.println(v2.getBookName() + "\t" + v2.getBookNum());
		}
		
		// å �ݳ��� ������ üũ
		System.out.print("�ݳ��� å ������ �Է����ּ���.");
		String book = sc.next(); // �ݳ��� å ���� �Է�
		
		BookVO v = null;
		
		for (BookVO v2 : loginMember.getBookList()) {
			if (v2.getBookName().equals(book)) {
				System.out.println(v2.getBookName() + "�� �ݳ��Ͻðڽ��ϱ�? [Y/N]");
				
				char select = sc.next().charAt(0);
				
				if (select == 'N' || select != 'Y') {
					System.out.println("�ݳ��� ����߽��ϴ�.");
					return;
				}
				
				v2.setBookExist(true); // �ݳ��� å �뿩���θ� true�� ����
				
				SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd"); // ��¥ ���� ����
				Date date = new Date();
				
				String endDate = dateFormat.format(toDay.getTime());
				
				this.endDate = endDate;
				v = v2;
				
				bookDelete = loginMember;
				
				System.out.println(loginMember.getName() + " ��" + v2.getBookName() + "�ݳ��ϼ̽��ϴ�.");
				System.out.println("�ݳ��� : " + endDate);	
				
				break;
			}
		}
		
		if(v==null)
			System.out.println("å�� ã�� �� �����ϴ�.");
		else				
			loginMember.getBookList().remove(v);
		
		return;
	}

	@Override
	public void bookList(UserVO loginMember) {
		// �α��� ���� üũ
		if (loginMember == null) {
			System.out.println("�α����� �ʿ��� �����Դϴ�.");
			return;
		}
		
		if (loginMember.getBookList().size() == 0) {
			System.out.println("�뿩�� å�� �����ϴ�.");
			return;
		}
		
		for (BookVO v2 : loginMember.getBookList()) {
			printBook(v2);
			return;
		}
	}
	
	private void printBook(BookVO vo) {
		System.out.println("å ����\tå��ȣ\t\t�뿩����");
		System.out.print(vo.getBookName() + "\t");
		System.out.print(vo.getBookNum() + "\t");
		if (vo.getBookExist())
			System.out.print("�뿩����\n");
		else
			System.out.print("�뿩 ��\n");
	}

}