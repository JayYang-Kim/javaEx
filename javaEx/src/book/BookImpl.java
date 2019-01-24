package book;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

// 도서 관리 클래스
public class BookImpl implements Book{
	private Scanner sc=new Scanner(System.in);
	private Map<String, BookVO> listBook=new TreeMap<>();
	
	public BookImpl() {
	}
	
	// 도서 등록
	@Override
	public void insertBook() {
		System.out.println("\n>> 도서 등록 <<");
		
		try {
			String code;
			BookVO vo=new BookVO();
			
			System.out.print("도서 코드?");
			code=sc.nextLine();
			
			if(listBook.containsKey(code)) {
				System.out.println("등록된 도서 코드입니다.\n");
				return;
			}

			System.out.print("도서명?");
			vo.setTitle(sc.nextLine());

			System.out.print("저자?");
			vo.setAuthor(sc.nextLine());

			System.out.print("출판사?");
			vo.setPublisher(sc.nextLine());

			System.out.print("발행일?");
			vo.setPdate(sc.nextLine());

			listBook.put(code, vo);
			
			System.out.println("도서 등록 성공...\n");
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	// 도서 수정
	@Override
	public void updateBook() {
		System.out.println("\n>> 도서 정보 수정 <<");
		
		try {
			String code;
			BookVO vo;
			
			System.out.print("수정할 도서 코드?");
			code=sc.nextLine();
			
			if(! listBook.containsKey(code)) {
				System.out.println("등록된 도서가 아닙니다.\n");
				return;
			}
			vo=listBook.get(code);

			System.out.print("도서명?");
			vo.setTitle(sc.nextLine());

			System.out.print("저자?");
			vo.setAuthor(sc.nextLine());

			System.out.print("출판사?");
			vo.setPublisher(sc.nextLine());

			System.out.print("발행일?");
			vo.setPdate(sc.nextLine());

			System.out.println("도서 정보 수정 성공...\n");
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	
	@Override
	public BookVO readBook(String code) {
		BookVO vo=null;
		vo=listBook.get(code);
		return vo;
	}
	
	// 코드 검색
	@Override
	public void searchCodeBook() {
		System.out.println("\n>> 도서 코드 검색 <<");
		System.out.println("코드\t도서명\t\t저자\t출판사\t발행일");
		
		try {
			String code;
			System.out.print("검색코드?");
			code=sc.nextLine();
			BookVO vo=readBook(code);
			if(vo==null)
				System.out.println("등록된 코드가 없습니다.");
			else
				System.out.println(code+"\t"+vo);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		System.out.println();
	}

	// 제목 검색
	@Override
	public void searchTitleBook() {
		System.out.println("\n>> 도서명 검색 리스트 <<");
		System.out.println("코드\t도서명\t\t저자\t출판사\t발행일");
		
		try {
			String title;
			System.out.print("검색할 도서명?");
			title=sc.nextLine();
			Iterator<String> it=listBook.keySet().iterator();
			while(it.hasNext()) {
				String code=it.next();
				BookVO vo=listBook.get(code);
				if(vo.getTitle().startsWith(title))
					System.out.println(code+"\t"+vo);
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		System.out.println();
	}

	// 전체 도서 리스트
	@Override
	public void writeBookList() {
		System.out.println("\n>> 도서 전체 리스트 <<");
		System.out.println("코드\t도서명\t\t저자\t출판사\t발행일");
		
		Iterator<String> it=listBook.keySet().iterator();
		while(it.hasNext()) {
			String code=it.next();
			BookVO vo=listBook.get(code);
			System.out.println(code+"\t"+vo);
		}
		System.out.println();
	}
	
}
