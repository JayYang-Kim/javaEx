package tbook;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

// 대여 관리 클래스
public class Rental {
	private BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	private List<RentalVO> listRental=new ArrayList<>();
	private Book book=null;
	
	public Rental(Book book) {
		this.book=book;
	}
	
	public void bookRental() {
		System.out.println("\n>> 도서 대여 <<");
		
		RentalVO vo=new RentalVO();
		try {
			System.out.print("도서코드?");
			vo.setCode(br.readLine());
			
			BookVO bookVO = book.readBook(vo.getCode());
			if(bookVO==null) {
				System.out.println("등록된 도서코드가 아닙니다.\n");
				return;
			}
			System.out.println("도서명 : " + bookVO.getTitle());
			
			System.out.print("대여하는 사람 아이디?");
			vo.setId(br.readLine());
			
			listRental.add(vo);
			
			System.out.println("도서 대여 성공...\n");
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	
}
