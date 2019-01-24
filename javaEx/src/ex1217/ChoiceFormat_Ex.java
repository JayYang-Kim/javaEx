package ex1217;

import java.text.ChoiceFormat;

/* 날짜 : 2018.12.17
 * 내용 : java.text.choiceFormat
 * 기타 : 
 * */

public class ChoiceFormat_Ex {

	public static void main(String[] args) {
		double []limits = {0, 60, 70, 80, 90}; // 범위 값은 double형으로 반드시 오름차순으로 입력
		String []grade = {"F", "D", "C", "B", "A"};
		ChoiceFormat cf = new ChoiceFormat(limits, grade);
		
		System.out.println(cf.format(85)); // [결과] B
		System.out.println(cf.format(50)); // [결과] F
		
		System.out.println("==================================================");
		
		String p = "60#D|70#C|80<B|90#A"; // #은 해당 값 포함, < 포함 하지 않음
		
		ChoiceFormat cf2 = new ChoiceFormat(p);
		
		System.out.println(cf2.format(60)); // [결과] D
		System.out.println(cf2.format(50)); // [결과] D
		System.out.println(cf2.format(65)); // [결과] D
		System.out.println(cf2.format(80)); // [결과] C
		System.out.println(cf2.format(81)); // [결과] B
	}

}
