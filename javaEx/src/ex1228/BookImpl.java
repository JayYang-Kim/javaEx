package ex1228;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/*
 * 작성자 : 김진양
 */

public class BookImpl implements BookService {
	private List<BookVO> bl;
	
	private Scanner sc = new Scanner(System.in);
	private Calendar toDay = Calendar.getInstance(); // 현재 날짜와 시간 정보를 가져옴
	
	private String fixDate; // 반납일 (고정)
	private String endDate; // 반납할 날짜
	
	// 생성자
	public BookImpl(List<BookVO> vo) {
		bl = vo;
	}
	
	// 대여 서비스
	@Override
	public void bookRent(UserVO loginMember) { 
		// 로그인 여부 체크
		if (loginMember == null) {
			System.out.println("로그인이 필요한 서비스입니다.");
			return;
		}
		
		// 책 대여를 할 것인지 체크
		System.out.println("대여할 책 이름을 입력해주세요.");
		String book = sc.next(); // 대여할 책 입력 받기
		
		for (BookVO book2 : bl) {
			// 책 이름이 있는지 먼저 확인
			if (book2.getBookName().equals(book)) {
				// 책 이름이 있으면 해당 책이 대여 가능한지 체크
				if (book2.isBookExist() == false) {
					book2.setBookExist(true); // 해당 책 대여 여부 변경 (true)
					
					SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd"); // 날짜 형식 포맷
					Date date = new Date();
					
					String strDate = dateFormat.format(toDay);
					
					toDay.setTime(date); 
					toDay.add(toDay.DATE, 7); // 7일 증가
					
					// cal => String으로 변환
					String endDate = dateFormat.format(toDay); 
					
					this.fixDate = endDate;
					
					System.out.println(loginMember.getName() + "(님) " + book2.getBookName() + "을 대여하셨습니다.");
					System.out.println("대여일 : " + strDate);
					System.out.println("반납일 : " + endDate);
				}
			}
		}
	}
	
	// 반납 서비스
	@Override
	public void bookRetrun(UserVO loginMember) {
		// 로그인 여부 체크
		if (loginMember == null) {
			System.out.println("로그인이 필요한 서비스입니다.");
			return;
		}
		
		// 반납할 책 선택
		for (BookVO v2 : loginMember.getBookList()) {
			System.out.println(v2.getBookName());
		}
		
		// 책 반납할 것인지 체크
		System.out.print("반납할 책 제목을 입력해주세요.");
		String book = sc.next(); // 반납할 책 제목 입력
		
		for (BookVO v2 : loginMember.getBookList()) {
			if (v2.getBookName().equals(book)) {
				System.out.println(v2.getBookName() + "를 반납하시겠습니까? [Y/N]");
				
				char select = sc.next().charAt(0);
				
				if (select == 'N' || select != 'Y') {
					System.out.println("반납을 취소했습니다.");
					return;
				}
				
				v2.setBookExist(true); // 반납할 책 대여여부를 true로 변경
				
				SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd"); // 날짜 형식 포맷
				Date date = new Date();
				
				String endDate = dateFormat.format(toDay);
				
				this.endDate = endDate;
				
				System.out.println(loginMember.getName() + "님" + v2.getBookName() + "반납하셨습니다.");
				System.out.println("반납일 : " + endDate);	
			}
		}
		
		// 블랙리스트 체크
		boolean select = false;

		int eDate = Integer.parseInt(this.fixDate);
		int sDate = Integer.parseInt(this.endDate);

		if (eDate < sDate) {
			loginMember.setBlackList(true);
			
			System.out.println(loginMember.getName() + "님 반납일이 늦어져서 블랙리스트가 되었습니다.");
			System.out.println("블랙리스트는 7일후에 복귀됩니다.");
		}
		
		System.out.println();
	}

}
