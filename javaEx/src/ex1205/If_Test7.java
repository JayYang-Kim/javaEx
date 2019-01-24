package ex1205;

import java.util.Scanner;

/* ��¥ : 2018.12.05
 * ���� : ���ǹ� ���� (if)
 * ��Ÿ : ������ ó�����ǿ� ���� ����ó�� ���α׷��� �ۼ��Ͻÿ�.
 * */
public class If_Test7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String num, name;
		int midterm, finals, absence, report;
		int midtermScore, finalsScore, attendScore, reportScore;
		int score;
		char grade;
		
		System.out.println("�й��� �Է����ּ���.");
		num = sc.nextLine();
		System.out.println("�̸��� �Է����ּ���.");
		name = sc.nextLine();
		System.out.println("�߰���� ������ �Է����ּ���.");
		midterm = sc.nextInt();
		System.out.println("�⸻��� ������ �Է����ּ���.");
		finals = sc.nextInt();
		System.out.println("�ἮȽ���� �Է����ּ���.");
		absence = sc.nextInt();
		System.out.println("����Ʈ ������ �Է����ּ���.");
		report = sc.nextInt();
		
		midtermScore = (int)(midterm * 0.4); // �߰���� ����
		finalsScore = (int)(finals * 0.4); // �⸻��� ����
		
		if(absence >= 6) {
			attendScore = 0;
		} else if (absence >= 4) {
			attendScore = 60;
		} else if (absence >= 2) {
			attendScore = 80;
		} else {
			attendScore = 100;
		}
		
		attendScore = (int)(attendScore * 0.1);
		reportScore = (int)(report * 0.1);
		
		score = midtermScore + finalsScore + attendScore + reportScore;
		
		if(score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} else if (score >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		
		System.out.println("\n�й�\t�̸�\t�߰����\t�⸻���\t�⼮����\t����Ʈ\t�ջ�����\t����");
		System.out.print(num+"\t");
		System.out.print(name+"\t");
		System.out.print(midtermScore+"\t");
		System.out.print(finalsScore+"\t");
		System.out.print(attendScore+"\t");
		System.out.print(reportScore+"\t");
		System.out.print(score+"\t");
		System.out.println(grade);
		
		sc.close();
	}

}
