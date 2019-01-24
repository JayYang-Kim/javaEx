package book;

public class BookVO {
	              // 도서명, 저자, 출판사, 발행일
	private String title, author, publisher, pdate;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getPdate() {
		return pdate;
	}

	public void setPdate(String pdate) {
		this.pdate = pdate;
	}

	@Override
	public String toString() {
		String s = null;
		if(title==null)
			return s;
		
		s=title+"\t\t"+author+"\t"+publisher+"\t"+pdate;
		return s;
	}
}
