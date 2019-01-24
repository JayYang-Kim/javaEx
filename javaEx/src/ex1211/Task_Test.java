package ex1211;

import java.util.Scanner;

/* 날짜 : 2018.12.11
 * 내용 : Array 과제
 * 기타 : 배열의 배열 문제 4 ~ 8번, Insertion sort 문제 / 총 6문제중 2문제 풀어오기
 *      위의 문제를 풀지못할경우, 수업시간에 나간 문제 3개 풀기
 * */
public class Task_Test {

	public static void main(String[] args) {
		// 문제4) 5행 5열의 배열에 1~15까지의 수를 실행결과처럼 역 직각 삼각형 모양으로 채워 출력하는 프로그램
		/*int [][] n = new int[5][5];
		int a = 1;
		
		for (int i = 0; i < n.length; i++) {
			for (int j = i; j < n[i].length; j++) {
				n[i][j] = a;
				a++;
			}
		}
		
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n[i].length; j++) {
				if(n[i][j] == 0) {
					System.out.print("\t");
				} else {
					System.out.print(n[i][j] + "\t");
				}
				// 배열값 확인용
				// System.out.print(i + " : " + j + " : " + n[i][j] + "\n"); 
			}
			
			System.out.println();
		}*/
		
		// 문제6) A ~ Z까지 문자를 난수를 이용하여 발생하여 발생된 문자를 4 * 4 배열에  0행 0열부터 행우선으로 대입하여 출력하는 프로그램
		// 2차원 배열 중복값 비교쪽 수정필요
		/*char [][]eng = new char[4][4];
		
		for (int i = 0; i < eng.length; i++) {
			for (int j = 0; j < eng[i].length; j++) {
				// 난수값 eng배열에 대입
				eng[i][j] = (char)((Math.random() * 26) + 'A');
				
				// 중복값 비교
				for (int k = 0; k < j; k++) {
					if(eng[i][j] == eng[i][k]) {
						j--;
						break;
					}
				}
			}
		}
		
		for (int i = 0; i < eng.length; i++) {
			for (int j = 0; j < eng[i].length; j++) {
				System.out.print(eng[i][j] + "\t");
			}
			
			System.out.println();
		}*/
		
		// 예제2) 1~20까지의 수를 배열에 실행결과처럼 채워서 출력하는 프로그램
		// [조건] 5행 4열의 배열을 이용하여 작성한다.
		/*int [][] num = new int [5][4];
		int na = 1;
		
		for (int i = 0; i < num.length; i++) { // 행
			for (int j = 0; j < num[i].length; j++) { // 열
				num[i][j] = na;
				na++;
			}
		}
		
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				System.out.print(num[i][j] + "\t");
			}
			
			System.out.println();
		}*/
		
		// 예제3) 1~20까지의 수를 배열에 실행결과처럼 채워서 출력하는 프로그램
		// [조건] 5행 4열의 배열을 이용하여 작성한다.
		/*int[][] num = new int[5][4];
		int na = 1;

		for (int i = 0; i < num[i].length; i++) { // 열
			for (int j = 0; j < num.length; j++) { // 행
				num[j][i] = na;
				na++;
			}
		}

		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				System.out.print(num[i][j] + "\t");
			}

			System.out.println();
		}*/
		
		// 예제4) 5 * 4 행렬에 1~100까지의 난수를 발생하여 대입한 후 출력하고, 5 * 4 행렬을 4 * 5 행렬로 변환하여 출력하는 프로그램
		// [설명] 1 ~ 100 사이의 난수 발생
		/*int [][] num = new int[5][4];
		int [][] num2 = new int[4][5];
		
		// 5 * 4
		for (int i = 0; i < num.length; i++) { 
			for (int j = 0; j < num[i].length; j++) {
				num[i][j] = (int)(Math.random()*100) + 1;
			}
		}
		
		// 4 * 5
		for (int i = 0; i < num2.length; i++) { 
			for (int j = 0; j < num2[i].length; j++) { 
				num2[i][j] = num[j][i];
			}
		}
		
		System.out.println("5 * 4");
		
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				System.out.print(num[i][j] + "\t");
			}

			System.out.println();
		}
		
		System.out.println("4 * 5");
		
		for (int i = 0; i < num2.length; i++) {
			for (int j = 0; j < num2[i].length; j++) {
				System.out.print(num2[i][j] + "\t");
			}

			System.out.println();
		}*/
		
		// 문제3) 구매 개수를 입력받아 구매 개수만큼의 로또를 출력하는 프로그램을 작성하시오.
		/*Scanner sc = new Scanner(System.in);
		
		int []lotto = new int[6];
		int cnt = 0;
		
		// 1 ~ 5 사이가 아닌 경우 재입력 처리
		do {
			System.out.println("개수를 입력해주세요.");
			cnt = sc.nextInt();
		} while(cnt < 1 || cnt > 5);
		
		// lotto의 배열의 수만큼 난수를 출력
		for (int i = 0; i < cnt; i++) {
			for (int j = 0; j < lotto.length; j++) {
				lotto[j] = (int)(Math.random() * 45) + 1;
				
				// 중복 체크
				for(int k = 0; k < j; k++) {
					if (lotto[j] == lotto[k]) {
						j--;
						break;
					} else {
						
					}
				}
			}
			
			System.out.print((i+1) + "번째 : ");
			
			// for-each를 사용해서 출력 (난수)
			for (int n : lotto) { // lotto집합을 int n에 대입하여 출력
				System.out.print(n + "  ");
			}
			
			System.out.println();
		}*/
		
		// 문제6) 참고용
		char [][]arr = new char[4][4];
		int []dup = new int[26];
		int k;
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				k=(int)(Math.random()*26);
				if(dup[k]==0) {
					dup[k]++;
					arr[i][j]=(char)(k+'A');
				}
				else {
					j--;
					continue;
				}
			}
		}
		for(char []array : arr) {
			for(char ch : array) {
				System.out.print(ch+"\t");
			}
			System.out.println();
		}
	}

}
