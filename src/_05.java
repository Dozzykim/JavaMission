import java.util.Scanner;

//치킨 메뉴판
/*
 * (조건)
 * - do~while 문, switch 문, static 메소드 정의 및 호출을 반드시 사용하시오.
 * - 정수1~3 입력 시, 해당 메뉴 이름과 주문안내 문구를 출력하시오.
 * - 정수 0~3 이외의 번호를 입력하면, 0~3 사이의 번호를 입력하도록 요청하는 안내문구를 출력하시오.
 * - 정수 0 입력 시, 주문한 메뉴 개수와 주문완료 메시지를 출력하시오.
*/

public class _05 {
	
	//메뉴 메소드!
	public static void menu() {
		
		System.out.println("********** 치킨 메뉴판 **********");
		System.out.println("       <메뉴판>     ");
		System.out.println(" 1. 양념");
		System.out.println(" 2. 후라이드");
		System.out.println(" 3. 양념 & 후라이드 반반");
		System.out.println(" 0. 종료");
		
		System.out.print("******번호: ");
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int orderedQty = 0;
		
		do {
			//메뉴 메소드
			menu();
			
			int n =  input.nextInt();
			System.out.println();
			System.out.println();
			
			if (n == 0) {
				System.out.println("총 " + orderedQty + "개의 상품이 주문되었습니다.");
				input.close();
				return;
			}
			
			switch (n) {
			
			case 1:
				System.out.println("'양념'치킨이 주문되었습니다.");
				orderedQty++;
				break;
			case 2:
				System.out.println("'후라이드'치킨이 주문되었습니다.");
				orderedQty++;
				break;
			case 3:
				System.out.println("'양념 & 후라이드 반반' 치킨이 주문되었습니다.");
				orderedQty++;
				break;

			default:
				System.out.println("0 ~ 3 사이의 번호를 입력하세요.");
				break;
			}
			
			System.out.println();
			System.out.println();
			
		} while (true);
	
	
		
	}

}
