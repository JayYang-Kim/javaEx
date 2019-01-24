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

		System.out.println("책 등록.......");
		BookVO vo = new BookVO();
		try {
			System.out.print("책  제목: ");
			vo.setBookName(br.readLine());
		} catch (IOException e) {
			System.out.println(e);
		}

		// 중복된 번호가 없을 때까지 시도한다.
		while (true) {
			// 랜덤으로 번호 8자리를 받는다. 8자리라 StringBuffer말고 String으로 해도 상관 없음.
			StringBuffer bf = new StringBuffer();
			for (int i = 0; i < 8; i++) {
				int n = (int) (Math.random() * 10);
				bf.append(n);
			}
			String bookNum = bf.toString();

			try {
				// 번호 중복체크
				for (int i = 0; i < bookList.size(); i++)
					if (bookNum.equals(bookList.get(i).getBookNum()))
						throw new Exception("중복된 번호가 존재");

				vo.setBookNum(bookNum);
				break;
			} catch (Exception e) {
				System.out.println(e);
			}
		}

		vo.setBookExist(true); // 맨 처음엔 빌리지 않은 상태.

		bookList.add(vo);

		System.out.println("책 제목\t책 번호\t\t대출여부");
		printBook(vo);
		System.out.println("등록 완료");
	}

	@Override
	public void bookDelete() {
		System.out.println("책 삭제.......");
		try {
			BookVO vo = searchBook();
			// 책이 존재하지 않거나, 대여중이면 삭제 불가
			if (vo == null || !vo.getBookExist())
				return;

			System.out.println("책 제목\t책 번호\t\t대출여부");
			printBook(vo);
			System.out.println();

			System.out.print("자료를 삭제하시겠습니까?[Y/N] ");
			char a = br.readLine().charAt(0);
			if (a == 'y' || a == 'Y')
				bookList.remove(vo);
			else
				return;
			System.out.println("삭제 완료");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void bookPrint() {
		System.out.println("책 목록 전체 출력.......");
		System.out.println("책 제목\t책 번호\t\t대출여부");

		for (int i = 0; i < bookList.size(); i++)
			printBook(bookList.get(i));
	}

	// userPrint로 이름을 바꾸는 게 좋을 거 같다.
	@Override
	public void serachPrint() {
		System.out.println("유저 전체 출력......");
		System.out.println("이름\t회원번호\t생년월일\t전화번호\t빌린 책 목록");

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

		System.out.print("책 제목: ");
		// 오류나면 현재 메소드가 끝나게 IOException을 외부로 throw함.
		String bookName = br.readLine();

		BookVO vo = null;
		for (int i = 0; i < bookList.size(); i++) {
			if (bookName.equals(bookList.get(i).getBookName())) {
				System.out.println("책 제목\t책 번호\t\t대출여부");
				printBook(bookList.get(i));
				return bookList.get(i);
			}
		}

		if (vo == null)
			System.out.println("찾는 책이 존재하지 않습니다.");

		return vo;
	}

	private void printBook(BookVO vo) {
		System.out.print(vo.getBookName() + "\t");
		System.out.print(vo.getBookNum() + "\t");
		if (vo.getBookExist())
			System.out.print("대여가능\n");
		else
			System.out.print("대여 중\n");
	}

}
