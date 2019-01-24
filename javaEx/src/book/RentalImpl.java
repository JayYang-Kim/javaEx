package book;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 대여 관리 클래스
public class RentalImpl implements Rental {
	private Scanner sc=new Scanner(System.in);
	private List<RentalVO> listRental=new ArrayList<>();
	private Book book=null;
	
	public RentalImpl(Book book) {
		this.book=book;
	}
	
	@Override
	public void bookRental(String id) {
		System.out.println("\n>> 도서 대여 <<");
		
		RentalVO vo=new RentalVO();
		char ch;
		
		try {
			System.out.print("대여할 도서 코드?");
			vo.setCode(sc.nextLine());
			
			BookVO bookVO = book.readBook(vo.getCode());
			if(bookVO==null) {
				System.out.println("등록된 도서 코드가 아닙니다.\n");
				return;
			}
			
			RentalVO rentalVO = readRental(vo.getCode());
			if(rentalVO!=null) {
				System.out.println("대여중인 도서 코드 입니다.\n");
				return;
			}
			
			System.out.print(bookVO.getTitle()+" 도서를 대여 하시겠습니까[Y/N] ?");
			ch=sc.nextLine().charAt(0);
			if(ch!='Y' && ch!='y') {
				return;
			}
			
			vo.setId(id); // 실제는 로그인한 id가 아니라 직원에 의해 대여하는 사람의 id를 입력함
			// vo.setRentalDate(String.format("%tF", Calendar.getInstance()));
			System.out.print("대여 일자?");
			vo.setRentalDate(sc.nextLine());
			
			listRental.add(vo);
			
			System.out.println(bookVO.getTitle()+" 도서의 대여가 완료 되었습니다.\n");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	@Override
	public void bookReturn(String id) {
		System.out.println("\n>> 도서 반납 <<");
		
		String code;
		
		try {
			System.out.print("반납할 도서 코드?");
			code = sc.nextLine();
			
			BookVO bookVO = book.readBook(code);
			if(bookVO==null) {
				System.out.println("등록된 도서 코드가 아닙니다.\n");
				return;
			}
			
			// 실제로는 직원에 의해 반납 처리됨
			RentalVO rentalVO = readRental(code);
			if(rentalVO==null || ! rentalVO.getId().equals(id)) {
				System.out.println("대여한 도서 코드가 아닙니다.\n");
				return;
			}
			
			// rentalVO.setReturnDate(String.format("%tF", Calendar.getInstance()));
			System.out.print("반납 일자?");
			rentalVO.setReturnDate(sc.nextLine());
			
			System.out.println(bookVO.getTitle()+" 도서의 반납 처리가 완료 되었습니다.\n");
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
		System.out.println("\n>> 도서 코드에 대한 대여 여부 검색  <<");
		
		String code;
		
		try {
			System.out.print("검색할 도서 코드?");
			code = sc.nextLine();
			
			RentalVO rentalVO = readRental(code);
			if(rentalVO==null) {
				System.out.println("대여된 도서 코드가 아닙니다.\n");
				return;
			}
			
			System.out.println("코드\t아이디\t대여일");
			System.out.print(rentalVO.getCode()+"\t");
			System.out.print(rentalVO.getId()+"\t");
			System.out.println(rentalVO.getRentalDate());
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	
	@Override
	public void writeRentalAllList() {
		System.out.println("\n>> 전체 대여 리스트 <<");
		System.out.println("코드\t아이디\t대여일\t반납일");
		
		for(RentalVO vo:listRental) {
			System.out.print(vo.getCode()+"\t");
			System.out.print(vo.getId()+"\t");
			System.out.print(vo.getRentalDate()+"\t");
			System.out.println(vo.getReturnDate()==null?"대여중":vo.getReturnDate());
		}
		System.out.println();
	}

	@Override
	public void writeRentalList() {
		System.out.println("\n>> 대여중인 도서 리스트 <<");
		System.out.println("코드\t아이디\t대여일");
		
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
		System.out.println("\n>> ["+ id+"]님의 전체 대여 이력 <<");
		System.out.println("코드\t아이디\t대여일\t반납일");
		
		for(RentalVO vo:listAllRentalId(id)) {
			System.out.print(vo.getCode()+"\t");
			System.out.print(vo.getId()+"\t");
			System.out.print(vo.getRentalDate()+"\t");
			System.out.println(vo.getReturnDate()==null?"대여중":vo.getReturnDate());
		}
		System.out.println();
	}
	
	@Override
	public void writeRentalListId(String id) {
		System.out.println("\n>> ["+ id+"]님의 대여중인 도서 리스트 <<");
		System.out.println("코드\t아이디\t대여일");
		
		for(RentalVO vo:listRentalId(id)) {
			System.out.print(vo.getCode()+"\t");
			System.out.print(vo.getId()+"\t");
			System.out.println(vo.getRentalDate());
		}
		System.out.println();
	}

}
