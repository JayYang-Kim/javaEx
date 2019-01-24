package ex1217;

import java.text.ChoiceFormat;

/* ��¥ : 2018.12.17
 * ���� : java.text.choiceFormat
 * ��Ÿ : 
 * */

public class ChoiceFormat_Ex {

	public static void main(String[] args) {
		double []limits = {0, 60, 70, 80, 90}; // ���� ���� double������ �ݵ�� ������������ �Է�
		String []grade = {"F", "D", "C", "B", "A"};
		ChoiceFormat cf = new ChoiceFormat(limits, grade);
		
		System.out.println(cf.format(85)); // [���] B
		System.out.println(cf.format(50)); // [���] F
		
		System.out.println("==================================================");
		
		String p = "60#D|70#C|80<B|90#A"; // #�� �ش� �� ����, < ���� ���� ����
		
		ChoiceFormat cf2 = new ChoiceFormat(p);
		
		System.out.println(cf2.format(60)); // [���] D
		System.out.println(cf2.format(50)); // [���] D
		System.out.println(cf2.format(65)); // [���] D
		System.out.println(cf2.format(80)); // [���] C
		System.out.println(cf2.format(81)); // [���] B
	}

}
