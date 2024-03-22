import java.util.Scanner;

public class _04 {
	//별트리찍기
	
	/* 정수 하나를 입력 받아, 정수형 변수 N에 초기화시키고
	 * 예시 <출력>과 같이 “*” 기호를 출력하는 프로그램을 작성하시오.
	 * 
	 * 예시 ↓↓↓
	 */
	
	//입력: 4
	
	//(출력예시)
	
	//...*
	//..***
	//.*****
	//*******

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		for (int i = 0; i < n; i++) {
			//공백
			for (int j = n-1; j > i; j--) {
				System.out.print(" ");
			}
			//별
			for (int j = 0; j < (2*i+1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		input.close();
	}
}
