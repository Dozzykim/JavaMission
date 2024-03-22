import java.util.Random;
import java.util.Scanner;

public class _06 {
	/*
	 * 정수 N을 입력받아 N개의 게임의 로또 번호를 출력하시오.
	 * 
	 * 즉, 6개의 배열요소를 갖는 1차원 배열을 선언하여 1~45 사이의 랜덤한 값을 중복되지 않도록 저장하고 출력하는 과정을 N번 반복하시오.
	 * 
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random num = new Random();

		System.out.print("몇 게임?: ");
		int n = input.nextInt();

		int[] lotto = new int[6];

		for (int i = 0; i < n; i++) {
			System.out.print("[" + (i + 1) + " 게임]");
			for (int j = 0; j < lotto.length; j++) {
				lotto[j] = num.nextInt(45) + 1;

				// 중복제거
				for (int k = 0; k < j; k++) {
					// 중복되면 j 반복문(번호뽑기) 다시 진행
					if (lotto[j] == lotto[k]) {
						j--;
						break;
					} else {
						continue;
					}
				}
			}
			// 오름차순 정렬..
			//외부 for문: 인덱스 0부터 인덱스 5까지 체크
			for (int j = 0; j < lotto.length; j++) {
				//내부 for문: 인덱스 k번 비교해서 인덱스 끝까지 이동
				for (int k = 1; k < lotto.length; k++) {
					int key;
					if (lotto[k] < lotto[k - 1]) {
						key = lotto[k];
						lotto[k] = lotto[k - 1];
						lotto[k - 1] = key;
					}
				}

			}

			// 게임당 생성된 배열 출력
			for (int j : lotto) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		input.close();
	}
}
