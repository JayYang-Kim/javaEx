package book;

public interface Book {
	public void insertBook();
	public void updateBook();
	public BookVO readBook(String code);
	public void searchCodeBook();
	public void searchTitleBook();
	public void writeBookList();
}
