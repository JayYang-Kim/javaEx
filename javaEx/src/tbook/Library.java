package tbook;

public class Library {
	private Book book=new Book();
	private Rental rent=new Rental(book);
	
	public void bookManage() {
		char ch;
		while(true) {
			System.out.println("\n[���� ����]");
			try {
				do {
					System.out.print("1.��� 2.���� 3.���� => ");
					ch=(char)System.in.read();
					System.in.skip(2);
				} while(ch<'1'||ch>'3');
				switch(ch) {
				case '1':book.insertBook();break;
				case '2':break;
				case '3':return;
				}
			} catch (Exception e) {
			}
		}
	}
	
	public void rentalManage() {
		char ch;
		while(true) {
			System.out.println("\n[���� �뿩]");
			try {
				do {
					System.out.print("1.�뿩 2.�ݳ� 3.���� => ");
					ch=(char)System.in.read();
					System.in.skip(2);
				} while(ch<'1'||ch>'3');
				switch(ch) {
				case '1':rent.bookRental();break;
				case '2':break;
				case '3':return;
				}
			} catch (Exception e) {
			}
		}
	}
	
}
