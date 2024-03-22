import java.util.Scanner;

public class _02 {
	//정수 하나를 입력 받아, 정수형 변수 N에 초기화시키고
	//정수 1부터 N까지 홀수의 합계와 짝수의 합계
	//그리고 정수 N의 약수를 구하여 예시 <출력>과 같이 출력하는 프로그램을 작성하시오.
	//( 1 ≤ N ≤ 100 )
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int N = input.nextInt();
		int nArr[] = new int[N]; //전체
		
		int oddSum = 0; //홀수 합
		int evenSum = 0; //짝수 합
		
		//1~N까지
		for (int i = 0 ; i < N; i++) {
			nArr[i] = i+1;
		}
		
		//첫번째 줄 홀수 합
		for (int i = 0; i < N; i++) {
			//홀수인지 체크 후 출력
			if (nArr[i] % 2 != 0) {
				System.out.print(nArr[i]);
				oddSum += nArr[i];
			} else {
				continue;
			}
			//마지막 배열요소 제외하고 모두 +로 연결하여 출력하도록
			if (i != N - 1) {
				System.out.print("+");
			}
		}
		System.out.print("=" + oddSum);
		System.out.println();
		
		
		//두번째 줄 짝수 합
		for (int i = 0 ; i < N; i++) {
			//짝수인지 체크 후 출력
			if (nArr[i] % 2 == 0) {
				System.out.print(nArr[i]);
				evenSum += nArr[i];
			} else {
				continue;
			}
			//마지막 배열요소 제외하고 모두 +로 연결하여 출력하도록
			if (i != N-1) {
				System.out.print("+");
			}
		}
		System.out.print("=" + evenSum);
		System.out.println();
		
		//약수 체크 (정수N이 쪼개지는 숫자..?)
		for (int i : nArr) {
			//N을 i로 나누었을때 나머지가 0이 되는지 체크 후 true면 해당 요소 출력
			if (N % i == 0) {
				System.out.print(i + " ");
			//아니면 반복 돌기
			} else {
				continue;
			}
		}
		
		input.close();
	}

}
