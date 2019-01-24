package book1;

public class BookVO {
	private String bookName; // 책 이름 / 중복 O
	private String bookNum; // 책 번호 (8자리) / 중복X 
	private String bookDate; // 책 빌린 날짜
	private boolean bookExist; // 책 빌린 여부 (현재 대여중인 상태)
	
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookNum() {
		return bookNum;
	}
	public void setBookNum(String bookNum) {
		this.bookNum = bookNum;
	}
	public boolean getBookExist() {
		return bookExist;
	}
	public void setBookExist(boolean bookExist) {
		this.bookExist = bookExist;
	}
}
