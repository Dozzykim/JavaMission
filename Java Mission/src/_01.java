import java.util.Scanner;

public class _01 {

	//1. 학생의 영어, 수학, 자바 성적을 각각 정수형 변수 eng, math, java 로 선언하고
	//2. 순서대로 점수를 입력 받아
	//3. 성적의 총 합계와 평균을 계산하여 출력하는 프로그램을 작성하시오.

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int eng = input.nextInt();
		int math = input.nextInt();
		int java = input.nextInt();
		
		int sum = eng + math + java;
		double avg = sum / 3.0;
		
		System.out.println("영어 점수: " + eng);
		System.out.println("수학 점수: " + math);
		System.out.println("자바 점수: " + java);
		System.out.println("총점: " + sum);
		System.out.println("평균: " + avg);
		
		input.close();
	}
}
