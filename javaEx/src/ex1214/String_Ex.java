package ex1214;

/* 날짜 : 2018.12.14
 * 내용 : 자바의 기본 API 클래스 - (string)
 * 기타 : 
 * */

public class String_Ex {

	public static void main(String[] args) {
		String s1 = "seoul";
		String s2 = "seoul";
		String s3 = new String("seoul");
		String s4 = "korea";
		
		System.out.println(s1 + " , " + s2 + " , " + s3);
		
		System.out.println(s1 == s2); // [결과] true  (주소비교)
		System.out.println(s1 == s3); // [결과] false (주소비교)
		
		// hasCode가 값다고 같은 객체가 아님
		System.out.println(s1.hashCode()); // [결과] 109324212
		System.out.println(s2.hashCode()); // [결과] 109324212
		System.out.println(s3.hashCode()); // [결과] 109324212
		
		// 주소값이 아닌 값을 비교
		System.out.println(s1.equals(s3)); // [결과] true
		
		s1 += "korea"; // String은 불변의 원칙. 다른곳에 메모리 할당
		
		System.out.println(s1); // "seoul" 메모리할당, "seoulkorea" 다른곳에 메모리 할당
		System.out.println(s2);
		
		s3 = s3 + 10; // String + Integer : String
		System.out.println(s1.equals(s3)); // "seoul" 메모리할당, "seoul10" 다른곳에 메모리 할당
	}

}
