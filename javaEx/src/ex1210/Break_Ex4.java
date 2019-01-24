package ex1210;

/* 날짜 : 2018.12.10
 * 내용 : Break문 예제
 * 기타 : 
 * */
public class Break_Ex4 {

	public static void main(String[] args) {
		/*int i, j, k;
		i = j = k = 0;
		
		while(true) {
			i++;
			while(true) {
				j++;
				while(true) {
					k++;
					if ((i+j+k) >= 10) {
						break;
					}
					
					System.out.println(i + " , " + j + " , " + k);
				}
				
				break;
			}
			
			break;
		}*/
		
		// break문 한 번으로 수정
		int i, j, k;
		i = j = k = 0;
		
		gogo :
		while(true) {
			i++;
			while(true) {
				j++;
				while(true) {
					k++;
					if ((i+j+k) >= 10) {
						break gogo;
					}
					
					System.out.println(i + " , " + j + " , " + k);
				}
			}
		}

	}

}
