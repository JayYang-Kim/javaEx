package tbook;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

// 도서 관리 클래스
public class Book {
	private BufferedReader br=new BufferedReader(
			new InputStreamReader(System.in));
	private List<BookVO> listBook=new ArrayList<>();
	
	public Book() {
	}
	
	// 도서 등록
	public void insertBook() {
		BookVO vo=new BookVO();
		try {
			System.out.println("\n>> 도서 등록 <<");
			
			System.out.print("코드?");
			vo.setCode(br.readLine());
			
			if(readBook(vo.getCode())!=null) {
				System.out.println("등록된 코드입니다.\n");
				return;
			}
			
			System.out.print("도서명?");
			vo.setTitle(br.readLine());
			
			listBook.add(vo);
			
			System.out.println("도서등록 성공...\n");
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	
	public BookVO readBook(String code) {
		BookVO vo=null;
		for(BookVO v:listBook) {
			if(v.getCode().equals(code)) {
				vo=v;
				break;
			}
		}
		return vo;
	}
	
}
