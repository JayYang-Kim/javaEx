package tbook;

public class App {
	public static void main(String[] args) {
		Library lib=new Library();
		
		char ch;
		
		System.out.println("** �츮 ������ **");
		while(true) {
			System.out.println("\n[���� �޴�]");
			try {
				do {
					System.out.print("1.�������� 2.���� �뿩 �� �ݳ� 3.���� => ");
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
