package ex1228;

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
	
	// ������
	public BookImpl(List<BookVO> vo) {
		bl = vo;
	}
	
	// �뿩 ����
	@Override
	public void bookRent(UserVO loginMember) { 
		// �α��� ���� üũ
		if (loginMember == null) {
			System.out.println("�α����� �ʿ��� �����Դϴ�.");
			return;
		}
		
		// å �뿩�� �� ������ üũ
		System.out.println("�뿩�� å �̸��� �Է����ּ���.");
		String book = sc.next(); // �뿩�� å �Է� �ޱ�
		
		for (BookVO book2 : bl) {
			// å �̸��� �ִ��� ���� Ȯ��
			if (book2.getBookName().equals(book)) {
				// å �̸��� ������ �ش� å�� �뿩 �������� üũ
				if (book2.isBookExist() == false) {
					book2.setBookExist(true); // �ش� å �뿩 ���� ���� (true)
					
					SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd"); // ��¥ ���� ����
					Date date = new Date();
					
					String strDate = dateFormat.format(toDay);
					
					toDay.setTime(date); 
					toDay.add(toDay.DATE, 7); // 7�� ����
					
					// cal => String���� ��ȯ
					String endDate = dateFormat.format(toDay); 
					
					this.fixDate = endDate;
					
					System.out.println(loginMember.getName() + "(��) " + book2.getBookName() + "�� �뿩�ϼ̽��ϴ�.");
					System.out.println("�뿩�� : " + strDate);
					System.out.println("�ݳ��� : " + endDate);
				}
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
		
		// �ݳ��� å ����
		for (BookVO v2 : loginMember.getBookList()) {
			System.out.println(v2.getBookName());
		}
		
		// å �ݳ��� ������ üũ
		System.out.print("�ݳ��� å ������ �Է����ּ���.");
		String book = sc.next(); // �ݳ��� å ���� �Է�
		
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
				
				String endDate = dateFormat.format(toDay);
				
				this.endDate = endDate;
				
				System.out.println(loginMember.getName() + "��" + v2.getBookName() + "�ݳ��ϼ̽��ϴ�.");
				System.out.println("�ݳ��� : " + endDate);	
			}
		}
		
		// ������Ʈ üũ
		boolean select = false;

		int eDate = Integer.parseInt(this.fixDate);
		int sDate = Integer.parseInt(this.endDate);

		if (eDate < sDate) {
			loginMember.setBlackList(true);
			
			System.out.println(loginMember.getName() + "�� �ݳ����� �ʾ����� ������Ʈ�� �Ǿ����ϴ�.");
			System.out.println("������Ʈ�� 7���Ŀ� ���͵˴ϴ�.");
		}
		
		System.out.println();
	}

}
