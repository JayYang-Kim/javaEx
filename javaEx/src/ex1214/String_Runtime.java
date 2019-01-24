package ex1214;

/* ��¥ : 2018.12.14
 * ���� : �ڹ��� �⺻ API Ŭ���� - (string)
 * ��Ÿ : 
 * */

public class String_Runtime {
	
	public static void stringTime() {
		System.out.println("String");
		
		long start = System.currentTimeMillis();
		
		// String�� �Һ��� ��Ģ
		String s = "a";
		
		for (int i = 1; i < 100000; i++) {
			s += "a";
		}
		
		System.out.println("���ڿ� ���� : " + s.length());
		
		long end = System.currentTimeMillis();
		
		System.out.println("����ð� : " + (end - start) + "ms");
	}
	
	public static void stringBufferTime() {
		System.out.println("String Buffer");
		
		long start = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer("a");
		
		for (int i = 1; i < 100000; i++) {
			sb.append("a");
		}
		
		System.out.println("���ڿ� ���� : " + sb.length());
		
		long end = System.currentTimeMillis();
		
		System.out.println("����ð� : " + (end - start) + "ms");
	}
	
	public static void main(String[] args) {
		stringTime();
		stringBufferTime();

	}

}
