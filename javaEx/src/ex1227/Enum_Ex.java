package ex1227;

/* ��¥ : 2018.12.27
 * ���� : enum
 * ��Ÿ : 
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
