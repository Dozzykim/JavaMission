
import java.util.Scanner;

/* 지그재그
 * 
 * 정수 N을 입력 받아,
 * N행 N열의 2차원 배열을 선언하시오.
 * 
 * 그리고 배열요소의 1부터 1씩 증가하는 값을 순서대로 저장하면서
 * 1 행이 증가할 때마다 배열요소에 접근하는 방향을 반대로 하여 값을 저장하고 출력하시오.
 */

public class _08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		int[][] arr = new int[n][n];
		int count = 1;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = count++;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < arr[i].length; j++) {
					System.out.print(arr[i][j] + " ");
				}
			} else {
				for (int j = arr[i].length - 1; j >= 0; j--) {
					System.out.print(arr[i][j] + " ");
				}
			}
			System.out.println();
		}
		input.close();
	}
}

//(입력) 3

//(출력)
// 1 2 3
// 6 5 4
// 7 8 9
