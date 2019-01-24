package tbook;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

// �뿩 ���� Ŭ����
public class Rental {
	private BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	private List<RentalVO> listRental=new ArrayList<>();
	private Book book=null;
	
	public Rental(Book book) {
		this.book=book;
	}
	
	public void bookRental() {
		System.out.println("\n>> ���� �뿩 <<");
		
		RentalVO vo=new RentalVO();
		try {
			System.out.print("�����ڵ�?");
			vo.setCode(br.readLine());
			
			BookVO bookVO = book.readBook(vo.getCode());
			if(bookVO==null) {
				System.out.println("��ϵ� �����ڵ尡 �ƴմϴ�.\n");
				return;
			}
			System.out.println("������ : " + bookVO.getTitle());
			
			System.out.print("�뿩�ϴ� ��� ���̵�?");
			vo.setId(br.readLine());
			
			listRental.add(vo);
			
			System.out.println("���� �뿩 ����...\n");
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	
}
