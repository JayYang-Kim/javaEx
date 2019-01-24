package ex1214;

/* ��¥ : 2018.12.14
 * ���� : �ڹ��� �⺻ API Ŭ���� - (string)
 * ��Ÿ : 
 * */

public class String_Ex2 {

	public static void main(String[] args) {
		String s = "seoul korea";
		String s2;
		int n;
		char c;
		
		System.out.println("s : " + s); // [���] s : seoul korea
		
		// ���ڿ��� ���� ���ϱ�
		n = s.length(); 
		System.out.println("���� : " + n); // [���] 11
		
		//n = s2.length(); // [������ ����] �ʱ�ȭ��Ű�� �ʵǾ� �ִ� ����
		
		//s2 = null;
		//n = s2.length(); // [��Ÿ�� ����]
		
		// ���� �ѱ��ڸ� ����
		c = s.charAt(6); // index�� 0����
		System.out.println(c);
		
		// ���ڿ� ���� 
		// begin index����  (end - begin)�� ����
		s2 = s.substring(6, 9); // index�� 0����
		System.out.println(s2);
		
		// begin���� ���ڿ� ������ ����
		s2 = s.substring(6);
		System.out.println(s2);
		
		// �� ��
		System.out.println(s.equals("seoul korea")); // [���] true
		System.out.println(s.equals("Seoul Korea")); // [���] flase / ��ҹ��� ��
		
		System.out.println(s.equalsIgnoreCase("Seoul Korea")); // [���] true / ��ҹ��� �� ����
		
		// �պκи� �� (����)
		System.out.println(s.startsWith("seoul")); // [���]
		
		// �޺κи� �� (��)
		System.out.println(s.endsWith("korea")); // [���]
		
		// "seoul korea" : "seoul corea" ���ڿ� ��. �ٸ��� ascii �ڵ尪 ���
		n = s.compareTo("seoul corea");
		System.out.println(n); // [���] 8
		
		// kor�� ��ġ (���ʿ��� ã��)
		System.out.println(s.indexOf("kor")); // [���] 6 (index)
		System.out.println(s.indexOf("cor")); // [���] -1 (�����Ͱ� ������ -1)
		
		System.out.println(s.indexOf("o")); // [���] 2 (index)
		System.out.println(s.lastIndexOf("o")); // [���] 7 (index)
		
		s2 = "test.12.png";
		
		System.out.println(s2.substring(s2.lastIndexOf(".") + 1)); // [���] png
		
		// Ư�� ���ڿ� ����
		s = "�츮���� ���ѹα� ���ѵ�������";
		//s2 = s.replace("����", "����"); // ���Խ� ���Ұ�
		s2 = s.replaceAll("����", "����"); // ���Խ� ��밡��
		
		System.out.println(s2);
		
		// �Ϻκ� ���ڿ� ����
		// ���Խ�
		s = "�츮1���� ��222�� ��21214��";
		s2 = s.replaceAll("\\d", ""); // \\d : ���ڸ� ��Ÿ���� ���Խ�
		System.out.println(s2);
		
		s2 = s.replaceAll("\\d|\\s", ""); // \\s : ������ ��Ÿ���� ���Խ�
		System.out.println(s2);
		
		s = " ��  ��  ";
		System.out.println(":" + s + ":");
		System.out.println(":" + s.trim() + ":"); // ��, �� ���� ����
		System.out.println(":" + s.replaceAll("\\s", "")); // ��ü ���� ����
		
		// s = 300; // [������ ����] String s 
		n = 300;
		
		// ���� => ���ڿ��� ��ȯ
		s = "" + n;
		System.out.println(s);
		
		s = Integer.toString(n);
		System.out.println(s);
		
		// ���ڿ� => ������ ��ȯ
		s = "123";
		n = Integer.parseInt(s);
		System.out.println(n);
		
		// ���Ŀ� �°� ���ڿ��� ��ȯ
		n = 1234567;
		s = String.format("%,d", n); // 3�ڸ����� ,���
		System.out.println(s);
		
		// ���ڿ��� �ĸ��� ����
		s = "�ڹ�, �ȵ���̵�, ��";
		String []ss = s.split(","); // split ���Խ� ��� ����
		// String []ss = "�ڹ�, �ȵ���̵�, ��".split(",");
		
		for (String a : ss) {
			System.out.println(a);
		}
		
		s = "KOREA";
		//byte []bb = s.getBytes();
		byte []bb = "���ѹα�".getBytes(); 
		for (byte b : bb) {
			System.out.println(b);
		}
		
		s = "ABCBD";
		//System.out.println(s.indexOf(66)); // [���] 1
		System.out.println(s.indexOf('B')); // [���] 1
		System.out.println(s.indexOf('B', 2)); // [���] 3
		
		// �ҹ��� ����
		//s.toLowerCase(); ����ȵ�
		s = s.toLowerCase();
		System.out.println(s);
	}

}
