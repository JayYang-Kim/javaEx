package book1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class AdminImpl implements AdminService {

	private List<UserVO> userList;
	private List<BookVO> bookList;
	public BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public AdminImpl(ListVO list) {
		bookList = list.getBookList();
		userList = list.getUserList();
	}

	@Override
	public void bookAdd() {

		System.out.println("å ���.......");
		BookVO vo = new BookVO();
		try {
			System.out.print("å  ����: ");
			vo.setBookName(br.readLine());
		} catch (IOException e) {
			System.out.println(e);
		}

		// �ߺ��� ��ȣ�� ���� ������ �õ��Ѵ�.
		while (true) {
			// �������� ��ȣ 8�ڸ��� �޴´�. 8�ڸ��� StringBuffer���� String���� �ص� ��� ����.
			StringBuffer bf = new StringBuffer();
			for (int i = 0; i < 8; i++) {
				int n = (int) (Math.random() * 10);
				bf.append(n);
			}
			String bookNum = bf.toString();

			try {
				// ��ȣ �ߺ�üũ
				for (int i = 0; i < bookList.size(); i++)
					if (bookNum.equals(bookList.get(i).getBookNum()))
						throw new Exception("�ߺ��� ��ȣ�� ����");

				vo.setBookNum(bookNum);
				break;
			} catch (Exception e) {
				System.out.println(e);
			}
		}

		vo.setBookExist(true); // �� ó���� ������ ���� ����.

		bookList.add(vo);

		System.out.println("å ����\tå ��ȣ\t\t���⿩��");
		printBook(vo);
		System.out.println("��� �Ϸ�");
	}

	@Override
	public void bookDelete() {
		System.out.println("å ����.......");
		try {
			BookVO vo = searchBook();
			// å�� �������� �ʰų�, �뿩���̸� ���� �Ұ�
			if (vo == null || !vo.getBookExist())
				return;

			System.out.println("å ����\tå ��ȣ\t\t���⿩��");
			printBook(vo);
			System.out.println();

			System.out.print("�ڷḦ �����Ͻðڽ��ϱ�?[Y/N] ");
			char a = br.readLine().charAt(0);
			if (a == 'y' || a == 'Y')
				bookList.remove(vo);
			else
				return;
			System.out.println("���� �Ϸ�");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void bookPrint() {
		System.out.println("å ��� ��ü ���.......");
		System.out.println("å ����\tå ��ȣ\t\t���⿩��");

		for (int i = 0; i < bookList.size(); i++)
			printBook(bookList.get(i));
	}

	// userPrint�� �̸��� �ٲٴ� �� ���� �� ����.
	@Override
	public void serachPrint() {
		System.out.println("���� ��ü ���......");
		System.out.println("�̸�\tȸ����ȣ\t�������\t��ȭ��ȣ\t���� å ���");

		for (int i = 0; i < userList.size(); i++) {
			UserVO uvo = userList.get(i);
			System.out.print(uvo.getName() + "\t");
			System.out.print(uvo.getId() + "\t");
			System.out.print(uvo.getBirth() + "\t");
			System.out.print(uvo.getPhoneNum() + "\t");

			List<BookVO> userBookList = uvo.getBookList();
			if (userBookList.size() == 0)
				for (int j = 0; j < userBookList.size(); j++)
					System.out.println(userBookList.get(j) + " ");

			System.out.println();
		}

	}

	public BookVO searchBook() throws IOException {

		System.out.print("å ����: ");
		// �������� ���� �޼ҵ尡 ������ IOException�� �ܺη� throw��.
		String bookName = br.readLine();

		BookVO vo = null;
		for (int i = 0; i < bookList.size(); i++) {
			if (bookName.equals(bookList.get(i).getBookName())) {
				System.out.println("å ����\tå ��ȣ\t\t���⿩��");
				printBook(bookList.get(i));
				return bookList.get(i);
			}
		}

		if (vo == null)
			System.out.println("ã�� å�� �������� �ʽ��ϴ�.");

		return vo;
	}

	private void printBook(BookVO vo) {
		System.out.print(vo.getBookName() + "\t");
		System.out.print(vo.getBookNum() + "\t");
		if (vo.getBookExist())
			System.out.print("�뿩����\n");
		else
			System.out.print("�뿩 ��\n");
	}

}
