package tbook;

public class App {
	public static void main(String[] args) {
		Library lib=new Library();
		
		char ch;
		
		System.out.println("** 우리 도서관 **");
		while(true) {
			System.out.println("\n[메인 메뉴]");
			try {
				do {
					System.out.print("1.도서관리 2.도서 대여 및 반납 3.종료 => ");
					ch=(char)System.in.read();
					System.in.skip(2);
				} while(ch<'1'||ch>'3');
				switch(ch) {
				case '1':lib.bookManage();break;
				case '2':lib.rentalManage();break;
				case '3':System.exit(0);
				}
			} catch (Exception e) {
			}
		}

	}
}
