package ex1228;

public class BookVO {
	private String bookName; // å �̸� / �ߺ� O
	private String bookNum; // å ��ȣ (8�ڸ�) / �ߺ�X 
	private String bookDate; // å ���� ��¥
	private boolean bookExist; // å ���� ���� (���� �뿩���� ����)
	
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
	public String getBookDate() {
		return bookDate;
	}
	public void setBookDate(String bookDate) {
		this.bookDate = bookDate;
	}
	public boolean isBookExist() {
		return bookExist;
	}
	public void setBookExist(boolean bookExist) {
		this.bookExist = bookExist;
	}
	
	
}
