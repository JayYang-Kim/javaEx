package ex1204;

/* ��¥ : 2018.12.04
 * ���� : ���� �ڷ��� �׽�Ʈ (���ڿ�)
 * ��Ÿ : 
 * */
public class Test4 {

	public static void main(String[] args) {
		String s1;
		String s2 = "seoul";
		
		s1 = "korea";
		System.out.println(s1 + " , " + s2);
		
		s1 = s1 + 9; // ���ڿ� ����
		System.out.println(s1);
		
		s2 = s2 + 'A'; // ���ڿ� ����
		System.out.println(s2);
		
		s1 = "java" + 'A'; 
		System.out.println(s1);
		
		s2 = 'A' + "java"; 
		System.out.println(s2);
		
		s2 = 10 + 'A' + "java"; 
		System.out.println(s2);
		
		//s2 = 10; // [������ ����] ������ String�� ����Ұ�
		
		s2 = "" + 10;
		System.out.println(s2);
	}

}
