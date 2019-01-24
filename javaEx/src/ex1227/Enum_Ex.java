package ex1227;

/* 날짜 : 2018.12.27
 * 내용 : enum
 * 기타 : 
 * */

enum Color {
	RED, GREEN, BLUE
}

public class Enum_Ex {

	public static void main(String[] args) {
		Color ob = Color.BLUE;
		
		
		switch (ob) {
		case RED : System.out.println("red"); break;
		case GREEN : System.out.println("green"); break;
		case BLUE : System.out.println("blue"); break;
		}
	}

}
