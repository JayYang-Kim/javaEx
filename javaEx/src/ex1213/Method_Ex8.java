package ex1213;

import java.util.Scanner;

/* 날짜 : 2018.12.12
 * 내용 : Class, Method 예제 
 * 기타 : 성적표를 출력하는 프로그램 (최대 50명)
 *      데이터 : 이름, 국어, 영어, 수학, 총점, 평균, 석차 => 50, 인원수
 *      기능 : 입력, 출력, 석차, 평점
 *      
 *      흐름도 : 1.입력 2.전체출력 3.종료
 * */

class Person {
	// 필드 생성
	String name; // private String name;
	int []score = new int[3];
	int tot, ave, rank; // 총점, 평균, 석차
}

class Score {
	// 필드 생성
	private Scanner sc = new Scanner(System.in);
	
	private int inwon; // 인원 수를 담을 변수
	private Person []list = new Person[50]; // 객체 생성 / Person a1, a2, a3 ... a50 (동일)
	
	// 입력 (Method)
	public void input() {
		// 인원수가 50이상이면 input 메소드 종료
		if (inwon >= 50) {
			System.out.println("인원수 입력 초과입니다.");
			return; // input 메소드 종료
		}
		
		System.out.println("데이터를 입력하세요.");
		
		String []tt = {"국어?", "영어?", "수학?"};
		
		list[inwon] = new Person(); // 메모리 할당
		
		System.out.println("이름을 입력해주세요.");
		
		// 이름 입력
		list[inwon].name = sc.next();
		
		// 0 ~ list[inwon].score.[길이]만큼 반복 / 0 ~ 2 (3번 반복)
		for (int i = 0; i < list[inwon].score.length; i++) {
			System.out.println(tt[i]); // [결과] 국어? 영어? 수학?
			// 점수 입력
			list[inwon].score[i] = sc.nextInt();
			
			// 총합 = 입력한 점수를 바로 더함
			list[inwon].tot += list[inwon].score[i];
		}
		
		// 평균 구하기 
		list[inwon].ave = list[inwon].tot / 3;
		
		// 인원수 증가
		inwon++;
	}
	
	// 출력 (Method)
	public void write() {
		System.out.println("데이터 출력");
		
		double p, t;
		
		rank();
		
		for (int i = 0; i < inwon; i ++) {
			System.out.print(list[i].name + "\t"); // 이름
			
			for (int j = 0; j < list[i].score.length; j++) {
				System.out.print(list[i].score[j] + "\t"); // 국어, 영어, 수학 점수 출력
			}
			
			System.out.print(list[i].tot + "\t"); // 총점 출력
			System.out.print(list[i].ave + "\t"); // 평균 출력
			System.out.print(list[i].rank);
			
			System.out.println();
			
			System.out.print("\t");
			
			System.out.println();
			
			t = 0;
			System.out.print("평점 : \t");
			for (int j = 0; j < list[i].score.length; j++) {
				p = grade(list[i].score[j]);
				t += p;
				System.out.print(grade(list[i].score[j]) + "\t");
			}
			
			System.out.print(t + "\t"); // 합계의 평점
			System.out.print((t/3) + "\n"); // 평균의 평점 
		}
	}
	
	// 평점 구하기 (Method)
	public double grade(int s) {
		double n;
		
		if(s >= 95) {
			n = 4.5;
		} else if (s >= 90) {
			n = 4.0;
		} else if (s >= 85) {
			n = 3.5;
		} else if (s >= 80) {
			n = 3.0;
		} else if (s >= 75) {
			n = 2.5;
		} else if (s >= 70) {
			n = 2.0;
		} else if (s >= 65) {
			n = 1.5;
		} else if (s >= 60) {
			n = 1.0;
		} else {
			n = 0.0;
		}
		
		return n;
	}
	
	// 석차 구하기
	public void rank() {
		for (int i = 0; i < inwon; i++) {
			list[i].rank = 1;
		}
		
		for (int i = 0; i < inwon - 1; i++) {
			for (int j = i + 1; j < inwon; j++) {
				if(list[i].tot > list[j].tot) {
					list[j].rank++;
				} else if (list[i].tot < list[j].tot) {
					list[i].rank++;
				}
			}
		}
	}
	
}

public class Method_Ex8 {
	
	public static void main(String[] args) {
		// 입력, 출력, 종료를 입력할 Scanner
		Scanner sc = new Scanner(System.in);
		
		// 입력, 출력, 종료 값을 가지고 있을 변수
		int n;
		
		// Score 메소드 객체 생성 (메모리 할당)
		Score ss = new Score();
		
		// 무한루프
		while(true) {
			// 1 ~ 3의 숫자가 아닐 경우 재입력 처리
			do {
				System.out.println("1.입력 2.출력 3.종료 =>");
				n = sc.nextInt();
			} while(n < 1 || n > 3);
			
			// 입력한 수에 따른 처리
			switch(n) {
			case 1 : ss.input();break; // input Method 실행
			case 2 : ss.write();break; // write Method 실행
			default : sc.close(); return; //입력 종료 및 main 메소드 끝내기
			}
		}
	}

}