package tbook;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

// ���� ���� Ŭ����
public class Book {
	private BufferedReader br=new BufferedReader(
			new InputStreamReader(System.in));
	private List<BookVO> listBook=new ArrayList<>();
	
	public Book() {
	}
	
	// ���� ���
	public void insertBook() {
		BookVO vo=new BookVO();
		try {
			System.out.println("\n>> ���� ��� <<");
			
			System.out.print("�ڵ�?");
			vo.setCode(br.readLine());
			
			if(readBook(vo.getCode())!=null) {
				System.out.println("��ϵ� �ڵ��Դϴ�.\n");
				return;
			}
			
			System.out.print("������?");
			vo.setTitle(br.readLine());
			
			listBook.add(vo);
			
			System.out.println("������� ����...\n");
			
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
