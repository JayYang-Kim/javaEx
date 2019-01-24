package ex1227;

/* ��¥ : 2018.12.27
 * ���� : enum
 * ��Ÿ : 
 * */

enum Color2 {
	RED, GREEN, BLUE
}

class Test7 {
	private Color2 color;
	
	public void setColor(Color2 color) {
		this.color = color;
	}
	
	public Color2 getColor() {
		return color;
	}
}

public class Enum_Ex2 {

	public static void main(String[] args) {
		Test7 t = new Test7();
		
		t.setColor(Color2.RED);
		
		Color2 c = t.getColor();
		
		switch (c) {
		case RED : System.out.println("red"); break;
		case GREEN : System.out.println("grenn"); break;
		case BLUE : System.out.println("blue"); break;
		}
		
		for (Color2 col : Color2.values()) { // values() : ��ü ������
			System.out.println(col + " : " + col.ordinal()); // ordinal() : ��ġ
		}
	}

}
