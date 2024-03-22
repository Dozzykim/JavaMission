package _11;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank {

	static Scanner input = new Scanner(System.in);
	static ArrayList <Account> myAccounts = new ArrayList<Account>();
	static int adminPw = 1111;

	public static void main(String[] args) {
		

		do {
			
			System.out.println("=========================");
			System.out.println("1. 계좌등록");
			System.out.println("2. 입금");
			System.out.println("3. 출금");
			System.out.println("4. 계좌조회");
			System.out.println("5. 계좌목록");
			System.out.println("6. 종료");
			System.out.println("=========================");
			System.out.print("입력>>	");

			/* 사용자 입력받기 */
			int num = input.nextInt();
			input.nextLine();
			// 엔터날리기

			if (num == 6) {
				System.out.println("시스템을 종료합니다.");
				break;
			}

			switch (num) {
			case 1:
				/*계좌등록*/
				newAccount();
				break;

			case 2:
				/*입금*/
				deposit();
				break;

			case 3:
				/* 출금 */
				withdraw();
				break;

			case 4:
				/* 계좌조회 */
				showAccount();
				break;

			case 5:
				/* 계좌목록 (관리자) */
				showAllAccount();
				break;

			default:
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}

		} while (true);
	} // main 메소드 끝

	
	
	
	
	
	/* 1. 계좌 등록 */
	public static void newAccount() {
		System.out.print("계좌번호>>  ");
		String accountNo = input.nextLine();
		for (Account account : myAccounts) {
			if (accountNo.equals(account.getAccountNo())) {
				System.out.println("이미 존재하는 계좌입니다.");
				return;
			}
		}
		System.out.print("예금주>>  ");
		String name = input.nextLine();
		System.out.print("최초예금액>>  ");
		int amount = input.nextInt();
		System.out.print("비밀번호>>  ");
		int pw = input.nextInt();
		Account account = new Account(name, accountNo, amount, pw);
		myAccounts.add(account);
		System.out.println("'" + name + "'" + " 님의 계좌가 개설되었습니다.");
	}//계좌등록 메서드 끝
	
	/* 2. 입금 */
	public static void deposit() {
		System.out.println("■■■■■■■■■■■■■■■■ 입금 ■■■■■■■■■■■■■■■■");
		int amount = 0;
		System.out.print("계좌번호>>  ");
		String inputAccountNo = input.nextLine();
		
		/* 여러 계좌를 저장한 객체에서 입력한 계좌번호와 일치하는 객체 꺼내오기 */
		for (Account account : myAccounts) {
			if (inputAccountNo.equals(account.getAccountNo())) {
				System.out.print("입금액>>  ");
				amount = input.nextInt();
				System.out.println("'"+account.getName()+"'"+" 님에게 입금하는게 맞으십니까?");
				System.out.println("1. 예");
				System.out.println("2. 아니오");
				System.out.print("입력>> ");
				do {
					int select = input.nextInt();
					switch (select) {
						case 1:
						account.setBalance(amount);
						System.out.println("'"+account.getName()+"'"+"님의 계좌에 " + amount + "원이 입금되었습니다.");
						System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						return;
						case 2:
						System.out.println("초기화면으로 돌아갑니다.");
						return;
						default:
						System.out.println("잘못 선택하셨습니다. 다시 입력하세요");
						continue;
					}
				} while (true);
			} else {
				System.out.println("일치하는 계좌가 없습니다.");
				System.out.println("초기화면으로 돌아갑니다.");
				continue;
			}
		}
	}//입금 메서드 끝
	
	/* 3. 출금 */
	public static void withdraw() {
		int amount = 0;
		
		System.out.println("■■■■■■■■■■■■■■■■ 출금 ■■■■■■■■■■■■■■■■");
		System.out.print("계좌번호>>  ");
		String inputAccountNo = input.nextLine();
		System.out.print("비밀번호>> ");
		int inputPw = input.nextInt();
		
		for (Account account : myAccounts) {
			if (account.getAccountNo().equals(inputAccountNo) && account.getPw()==inputPw) {
				System.out.println("출금액>>  ");
				amount = input.nextInt() * -1;
				account.setBalance(amount);
			} else {
				System.out.println("일치하는 계좌가 없거나, 비밀번호가 틀렸습니다.");
			}
		}
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
	}//출금 메서드 끝
	
	/* 4. 계좌조회 */
	public static void showAccount() {
		System.out.println("■■■■■■■■■■■■■■■■ 계좌조회 ■■■■■■■■■■■■■■■■");
		System.out.print("계좌번호>>  ");
		String checkAccount = input.nextLine();
		System.out.print("비밀번호>>  ");
		int checkPw = input.nextInt();
		input.nextLine(); // 혹시모를 엔터 날리기
		
		for (Account account : myAccounts) {
			if (account.getAccountNo().equals(checkAccount) && account.getPw()==checkPw) {
				System.out.println("'"+account.getName()+"'"+"님의 계좌잔액은 " + account.getBalance() + "원 입니다.");
				System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
				
			} else {
				System.out.println("정보와 일치하는 계좌가 존재하지 않습니다.");
				return;
			}
		}
	} //계좌조회 메서드 끝

	/* 5. 계좌목록 (관리자) */
	public static void showAllAccount() {
		System.out.println("관리자 비밀번호>>  ");
		int inputPw = input.nextInt();
		if (inputPw != adminPw) {
			System.out.println("잘못된 비밀번호 입니다.");
			return;
		}
		System.out.println("============== 계좌목록 ==============");
			System.out.println("예금주  			계좌번호			잔고");
			for (Account account : myAccounts) {
				System.out.println(account.getName() + "  			" + account.getAccountNo()+ "  			" +account.getBalance());
			}
			System.out.print("======================");
	}
}
