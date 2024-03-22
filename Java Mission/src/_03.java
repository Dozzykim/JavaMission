
public class _03 {
	
	/*
	 * 정수 1부터 100까지 의 수를 출력하면서,
	 * 해당 수 가 3 또는 6 또는 9에 해당하는 경우
	 * 해당 정수 대신에 3, 6, 9가 포함되는 갯수만큼 “*” 를 출력
	 * 
	 */	
	
	public static void main(String[] args) {
		
		int[] nArr = new int [100];
		
		//1~100까지 숫자를 배열에 저장
		for (int i = 0; i < nArr.length; i++) {
			nArr[i] = i+1 ;
		}
		
		for (int i = 0; i < nArr.length; i++) {
			//한자리 수 중, 일의 자리가 3,6,9인 경우 (*)
			if (0 < nArr[i] && nArr[i] < 10) {
				if (nArr[i] % 3 == 0) {
					System.out.println("*");
				} else {
					System.out.println(nArr[i]);
				}
			}
			//두자리 수 체크
			else {
				int ten = nArr[i] / 10;
				int one = nArr[i] % 10;
				
				if (ten % 3 == 0) {
					System.out.print("*");
					if (one != 0 && one % 3 == 0) {
						System.out.print("*");
					}
					System.out.println();
				} else {
					System.out.println(nArr[i]);
				}
			}
		}
	}
}
