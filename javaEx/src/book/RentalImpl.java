package book;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// �뿩 ���� Ŭ����
public class RentalImpl implements Rental {
	private Scanner sc=new Scanner(System.in);
	private List<RentalVO> listRental=new ArrayList<>();
	private Book book=null;
	
	public RentalImpl(Book book) {
		this.book=book;
	}
	
	@Override
	public void bookRental(String id) {
		System.out.println("\n>> ���� �뿩 <<");
		
		RentalVO vo=new RentalVO();
		char ch;
		
		try {
			System.out.print("�뿩�� ���� �ڵ�?");
			vo.setCode(sc.nextLine());
			
			BookVO bookVO = book.readBook(vo.getCode());
			if(bookVO==null) {
				System.out.println("��ϵ� ���� �ڵ尡 �ƴմϴ�.\n");
				return;
			}
			
			RentalVO rentalVO = readRental(vo.getCode());
			if(rentalVO!=null) {
				System.out.println("�뿩���� ���� �ڵ� �Դϴ�.\n");
				return;
			}
			
			System.out.print(bookVO.getTitle()+" ������ �뿩 �Ͻðڽ��ϱ�[Y/N] ?");
			ch=sc.nextLine().charAt(0);
			if(ch!='Y' && ch!='y') {
				return;
			}
			
			vo.setId(id); // ������ �α����� id�� �ƴ϶� ������ ���� �뿩�ϴ� ����� id�� �Է���
			// vo.setRentalDate(String.format("%tF", Calendar.getInstance()));
			System.out.print("�뿩 ����?");
			vo.setRentalDate(sc.nextLine());
			
			listRental.add(vo);
			
			System.out.println(bookVO.getTitle()+" ������ �뿩�� �Ϸ� �Ǿ����ϴ�.\n");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	@Override
	public void bookReturn(String id) {
		System.out.println("\n>> ���� �ݳ� <<");
		
		String code;
		
		try {
			System.out.print("�ݳ��� ���� �ڵ�?");
			code = sc.nextLine();
			
			BookVO bookVO = book.readBook(code);
			if(bookVO==null) {
				System.out.println("��ϵ� ���� �ڵ尡 �ƴմϴ�.\n");
				return;
			}
			
			// �����δ� ������ ���� �ݳ� ó����
			RentalVO rentalVO = readRental(code);
			if(rentalVO==null || ! rentalVO.getId().equals(id)) {
				System.out.println("�뿩�� ���� �ڵ尡 �ƴմϴ�.\n");
				return;
			}
			
			// rentalVO.setReturnDate(String.format("%tF", Calendar.getInstance()));
			System.out.print("�ݳ� ����?");
			rentalVO.setReturnDate(sc.nextLine());
			
			System.out.println(bookVO.getTitle()+" ������ �ݳ� ó���� �Ϸ� �Ǿ����ϴ�.\n");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	@Override
	public RentalVO readRental(String code) {
		RentalVO vo=null;
		
		for(RentalVO v:listRental) {
			if(v.getCode().equals(code) && v.getReturnDate()==null) {
				vo=v;
				break;
			}
		}
		
		return vo;
	}

	@Override
	public List<RentalVO> listRentalId(String id) {
		List<RentalVO> list=new ArrayList<>();
		
		for(RentalVO vo:listRental) {
			if(vo.getId().equals(id) && vo.getReturnDate()==null) {
				list.add(vo);
			}
		}		
		
		return list;
	}
	
	@Override
	public List<RentalVO> listAllRentalId(String id) {
		List<RentalVO> list=new ArrayList<>();
		
		for(RentalVO vo:listRental) {
			if(vo.getId().equals(id)) {
				list.add(vo);
			}
		}		
		
		return list;
	}
	
	@Override
	public void removeRentalId(String id) {
		for(RentalVO vo:listRental) {
			if(vo.getId().equals(id)) {
				listRental.remove(vo);
			}
		}		
	}

	@Override
	public void searchCodeRental() {
		System.out.println("\n>> ���� �ڵ忡 ���� �뿩 ���� �˻�  <<");
		
		String code;
		
		try {
			System.out.print("�˻��� ���� �ڵ�?");
			code = sc.nextLine();
			
			RentalVO rentalVO = readRental(code);
			if(rentalVO==null) {
				System.out.println("�뿩�� ���� �ڵ尡 �ƴմϴ�.\n");
				return;
			}
			
			System.out.println("�ڵ�\t���̵�\t�뿩��");
			System.out.print(rentalVO.getCode()+"\t");
			System.out.print(rentalVO.getId()+"\t");
			System.out.println(rentalVO.getRentalDate());
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	
	@Override
	public void writeRentalAllList() {
		System.out.println("\n>> ��ü �뿩 ����Ʈ <<");
		System.out.println("�ڵ�\t���̵�\t�뿩��\t�ݳ���");
		
		for(RentalVO vo:listRental) {
			System.out.print(vo.getCode()+"\t");
			System.out.print(vo.getId()+"\t");
			System.out.print(vo.getRentalDate()+"\t");
			System.out.println(vo.getReturnDate()==null?"�뿩��":vo.getReturnDate());
		}
		System.out.println();
	}

	@Override
	public void writeRentalList() {
		System.out.println("\n>> �뿩���� ���� ����Ʈ <<");
		System.out.println("�ڵ�\t���̵�\t�뿩��");
		
		for(RentalVO vo:listRental) {
			if(vo.getReturnDate()==null) {
				System.out.print(vo.getCode()+"\t");
				System.out.print(vo.getId()+"\t");
				System.out.println(vo.getRentalDate());
			}
		}
		System.out.println();
	}

	@Override
	public void writeRentalListAllId(String id) {
		System.out.println("\n>> ["+ id+"]���� ��ü �뿩 �̷� <<");
		System.out.println("�ڵ�\t���̵�\t�뿩��\t�ݳ���");
		
		for(RentalVO vo:listAllRentalId(id)) {
			System.out.print(vo.getCode()+"\t");
			System.out.print(vo.getId()+"\t");
			System.out.print(vo.getRentalDate()+"\t");
			System.out.println(vo.getReturnDate()==null?"�뿩��":vo.getReturnDate());
		}
		System.out.println();
	}
	
	@Override
	public void writeRentalListId(String id) {
		System.out.println("\n>> ["+ id+"]���� �뿩���� ���� ����Ʈ <<");
		System.out.println("�ڵ�\t���̵�\t�뿩��");
		
		for(RentalVO vo:listRentalId(id)) {
			System.out.print(vo.getCode()+"\t");
			System.out.print(vo.getId()+"\t");
			System.out.println(vo.getRentalDate());
		}
		System.out.println();
	}

}
