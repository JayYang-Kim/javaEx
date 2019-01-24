package ex1217;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

/* 날짜 : 2018.12.17
 * 내용 : NumberFormat
 * 기타 : 숫자 형태의 형식을 맞추는데 사용
 * */

public class Number_Ex2 {

	public static void main(String[] args) {
		try {
			NumberFormat nf = NumberFormat.getInstance();
			String s1 = "1000";
			String s2 = "1000.12";
			String s3 = "1,000";
			
			// Number : Integer, Long, Double 클래스등의 슈퍼클래스
			Number n1 = nf.parse(s1);
			Number n2 = nf.parse(s2);
			Number n3 = nf.parse(s3);
			
			System.out.println(n1);
			System.out.println(n2);
			System.out.println(n3);
			
			double d = (Double)n2;
			System.out.println(d);
			
			s1 = "1,234";
			s2 = "2,112";
			
			Long i1 = (Long)nf.parse(s1);
			Long i2 = (Long)nf.parse(s2);
			System.out.println(i1 + i2);
			
			NumberFormat nf2 = NumberFormat.getCurrencyInstance();
			s1 = nf2.format(12345);
			System.out.println(s1); // [결과] \12,345
			
			NumberFormat nf3 = NumberFormat.getCurrencyInstance(Locale.US);
			s1 = nf3.format(12345);
			System.out.println(s1); // [결과] $12,345.00
			
			// NumberFormat : 추상 클래스이므로 new로 생성 불가
			
			//DecimalFormat df = new DecimalFormat("#,##0");
			//DecimalFormat df = new DecimalFormat("#,##0.##"); // 소숫점 밑에 자리 2자리만
			DecimalFormat df = new DecimalFormat("#,##0.0#"); // 소숫점 밑에 자리가 없을 경우 0찍어줌 (있거나 없거나 무조건 나옴)
			s1 = df.format(123456);
			System.out.println(s1);

			s1 = df.format(123456.5688);
			System.out.println(s1);
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
