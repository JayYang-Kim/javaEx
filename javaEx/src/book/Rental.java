package book;

import java.util.List;

public interface Rental {
	public void bookRental(String id); // 대여
	public void bookReturn(String id); // 반납
	public RentalVO readRental(String code); // 도서 코드에 대한 대여 정보
	
	public List<RentalVO> listAllRentalId(String id); // id별 전체 대여 도서 리스트
	public List<RentalVO> listRentalId(String id); // id별 현재 대여중인 도서 리스트
	public void removeRentalId(String id); // id별 대여 목록 지우기
	
	public void searchCodeRental();   // 도서 코드에 대한 대여 여부 검색
	public void writeRentalAllList(); // 전체 대여 리스트 출력
	public void writeRentalList();    // 현재 대여중인 도서 리스트 출력
	public void writeRentalListAllId(String id); // id별 전체 대여 도서 리스트 출력 
	public void writeRentalListId(String id); // id별 현재 대여중인 도서 리스트 출력 
}
