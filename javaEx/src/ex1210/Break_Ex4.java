package ex1210;

/* ��¥ : 2018.12.10
 * ���� : Break�� ����
 * ��Ÿ : 
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
		
		// break�� �� ������ ����
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
