package book;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

// ���� ���� Ŭ����
public class BookImpl implements Book{
	private Scanner sc=new Scanner(System.in);
	private Map<String, BookVO> listBook=new TreeMap<>();
	
	public BookImpl() {
	}
	
	// ���� ���
	@Override
	public void insertBook() {
		System.out.println("\n>> ���� ��� <<");
		
		try {
			String code;
			BookVO vo=new BookVO();
			
			System.out.print("���� �ڵ�?");
			code=sc.nextLine();
			
			if(listBook.containsKey(code)) {
				System.out.println("��ϵ� ���� �ڵ��Դϴ�.\n");
				return;
			}

			System.out.print("������?");
			vo.setTitle(sc.nextLine());

			System.out.print("����?");
			vo.setAuthor(sc.nextLine());

			System.out.print("���ǻ�?");
			vo.setPublisher(sc.nextLine());

			System.out.print("������?");
			vo.setPdate(sc.nextLine());

			listBook.put(code, vo);
			
			System.out.println("���� ��� ����...\n");
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	// ���� ����
	@Override
	public void updateBook() {
		System.out.println("\n>> ���� ���� ���� <<");
		
		try {
			String code;
			BookVO vo;
			
			System.out.print("������ ���� �ڵ�?");
			code=sc.nextLine();
			
			if(! listBook.containsKey(code)) {
				System.out.println("��ϵ� ������ �ƴմϴ�.\n");
				return;
			}
			vo=listBook.get(code);

			System.out.print("������?");
			vo.setTitle(sc.nextLine());

			System.out.print("����?");
			vo.setAuthor(sc.nextLine());

			System.out.print("���ǻ�?");
			vo.setPublisher(sc.nextLine());

			System.out.print("������?");
			vo.setPdate(sc.nextLine());

			System.out.println("���� ���� ���� ����...\n");
			
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
	
	// �ڵ� �˻�
	@Override
	public void searchCodeBook() {
		System.out.println("\n>> ���� �ڵ� �˻� <<");
		System.out.println("�ڵ�\t������\t\t����\t���ǻ�\t������");
		
		try {
			String code;
			System.out.print("�˻��ڵ�?");
			code=sc.nextLine();
			BookVO vo=readBook(code);
			if(vo==null)
				System.out.println("��ϵ� �ڵ尡 �����ϴ�.");
			else
				System.out.println(code+"\t"+vo);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		System.out.println();
	}

	// ���� �˻�
	@Override
	public void searchTitleBook() {
		System.out.println("\n>> ������ �˻� ����Ʈ <<");
		System.out.println("�ڵ�\t������\t\t����\t���ǻ�\t������");
		
		try {
			String title;
			System.out.print("�˻��� ������?");
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

	// ��ü ���� ����Ʈ
	@Override
	public void writeBookList() {
		System.out.println("\n>> ���� ��ü ����Ʈ <<");
		System.out.println("�ڵ�\t������\t\t����\t���ǻ�\t������");
		
		Iterator<String> it=listBook.keySet().iterator();
		while(it.hasNext()) {
			String code=it.next();
			BookVO vo=listBook.get(code);
			System.out.println(code+"\t"+vo);
		}
		System.out.println();
	}
	
}
