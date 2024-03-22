package _11;

/*계좌 객체*/
/*잔액, 계좌번호, 비밀번호*/

/* 송금 한도: 백만원 (1,000,000원) */
public class Account {
	private String name;
	private String accountNo;
	private int balance = 0;
	private int pw;

	/* 기본 생성자 */
	public Account() {
		this.accountNo = "계좌없음";
		this.name = "이름없음";
		this.balance = 0;
	}

	/* 매개변수가 있는 생성자 */
	public Account(String name, String accountNo, int amount, int pw) {
		this.name = name;
		this.accountNo = accountNo;
		this.balance = amount;
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int amount) {
		if ((this.balance + amount) >= 0) {
			if (amount >= -1000000) {
				this.balance += amount;
			} else {
				System.out.println("한번에 송금 가능한 최대 금액은 1,000,000원 입니다.");
			}
		} else {
			System.out.println("계좌 잔액 부족");
		}
		
	}

	public int getPw() {
		return pw;
	}

	public void setPw(int pw) {
		this.pw = pw;
	}
	
	
}
