package ex1214;

/* ��¥ : 2018.12.14
 * ���� : �ڹ��� �⺻ API Ŭ���� - (string)
 * ��Ÿ : 
 * */

public class String_Ex {

	public static void main(String[] args) {
		String s1 = "seoul";
		String s2 = "seoul";
		String s3 = new String("seoul");
		String s4 = "korea";
		
		System.out.println(s1 + " , " + s2 + " , " + s3);
		
		System.out.println(s1 == s2); // [���] true  (�ּҺ�)
		System.out.println(s1 == s3); // [���] false (�ּҺ�)
		
		// hasCode�� ���ٰ� ���� ��ü�� �ƴ�
		System.out.println(s1.hashCode()); // [���] 109324212
		System.out.println(s2.hashCode()); // [���] 109324212
		System.out.println(s3.hashCode()); // [���] 109324212
		
		// �ּҰ��� �ƴ� ���� ��
		System.out.println(s1.equals(s3)); // [���] true
		
		s1 += "korea"; // String�� �Һ��� ��Ģ. �ٸ����� �޸� �Ҵ�
		
		System.out.println(s1); // "seoul" �޸��Ҵ�, "seoulkorea" �ٸ����� �޸� �Ҵ�
		System.out.println(s2);
		
		s3 = s3 + 10; // String + Integer : String
		System.out.println(s1.equals(s3)); // "seoul" �޸��Ҵ�, "seoul10" �ٸ����� �޸� �Ҵ�
	}

}
