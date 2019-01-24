package ex1227;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

/* 날짜 : 2018.12.27
 * 내용 : Lambda
 * 기타 : 익명 클래스
 * */

public class Lambda_Ex6 { 
	public static void main(String[] args) {	
		Consumer<String> c = t -> System.out.println(t + " 테스트");
		c.accept("람다");
		
		System.out.println(c);
		
		BiConsumer<String, String> b = (t, u) -> System.out.println(t + " : " + u);
		b.accept("람다", "뭐지");
		
		System.out.println(b);
	}
}
