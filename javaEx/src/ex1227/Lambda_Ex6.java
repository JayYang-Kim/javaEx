package ex1227;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

/* ��¥ : 2018.12.27
 * ���� : Lambda
 * ��Ÿ : �͸� Ŭ����
 * */

public class Lambda_Ex6 { 
	public static void main(String[] args) {	
		Consumer<String> c = t -> System.out.println(t + " �׽�Ʈ");
		c.accept("����");
		
		System.out.println(c);
		
		BiConsumer<String, String> b = (t, u) -> System.out.println(t + " : " + u);
		b.accept("����", "����");
		
		System.out.println(b);
	}
}
