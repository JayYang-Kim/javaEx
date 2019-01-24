package ex1205;

/* 날짜 : 2018.12.05
 * 내용 : 조건문 예제 (if)
 * 기타 : 
 * */
public class If_Test {

	public static void main(String[] args) {

		/*
		 1) if(n >= 10 && n < 20)
		 
		 2) if(ch != ' ' && ch != '\t')
		 
		 3) if(ch == 'x' || ch == 'X')
		 
		 4) if(y % 4 == 0) && (y % 100 != 0) || (y % 400 == 0)
		 
		 5) if(ch != 'Y') && (ch != 'y')
		 
		 6) if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) 
		 
		 // 65~90, 97~122
		 7) if(!(ch >= 'a' && ch <= 'z') || !(ch >= 'A' && ch <= 'Z'))
		 	if(ch < 65 || (ch > 90 && ch < 97) || ch > 122)
		 	if(ch < 'A' || (ch > 'Z' && ch < 'a') || ch > 'z')
		 
		 8) if(b==false)
		 	if(!b)
		 */ 
		
		int i = 1; // i = 1;
		int j = i++; // i = 1; j = 1
		if((i == ++j) | (i++ == j)) { // (2 == 2) | (2 == 2)
			i += j; // i = 3, j = 2
		}

	}

}
