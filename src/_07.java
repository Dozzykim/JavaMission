import java.util.Scanner;

public class _07 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//성적 5개를 입력받을 1차원 배열 선언 및 생성
		int[] scores = new int [5];
		
		//성적을 입력받을 반복문 (5개 받아야하니까 5번 반복) //scores.length -> scores 배열의 길이 -> 5
		for (int i = 0 ; i < scores.length; i++) {
			int score = input.nextInt();
			scores[i] = score;
		}
		
		//삽입정렬 사용!
		
		//오름차순 출력
		for (int i = 1; i < scores.length; i++) {
			//임시로 저장해둘 변수 key 선언
			int key = scores[i];
			for(int j = i-1; j >= 0; j--) {
				if (key < scores[j]) {
					scores[j+1] = scores[j];
					scores[j] = key;
				} else {
					continue;
				}
			}
		}
		for (int i : scores) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		//내림차순 출력
		for (int i = 1; i < scores.length; i++) {
			//임시로 저장해둘 변수 key 선언
			int key = scores[i];
			for(int j = i-1; j >= 0; j--) {
				if (key > scores[j]) {
					scores[j+1] = scores[j];
					scores[j] = key;
				} else {
					continue;
				}
			}
		}
		for (int i : scores) {
			System.out.print(i + " ");
		}
		
		input.close();
	}
}

