package quiz06;

public class Account {
	
	//한 사람의 은행 계좌
	/*
	 * accountNumber 변수 - 식별아이디
	 * password 변수 - 비밀번호
	 * balance 변수 - 잔고
	 * 
	 * 생성자
	 * 3가지를 모두 받아서 초기화하는 생성자
	 * 
	 * 메소드
	 * deposit : void - 잔고에 매개변수를 누적하는 기능
	 * withDraw : void - 잔고에서 매개변수를 차감하는 기능
	 * getBalance : int - 잔고를 리턴하는 기능
	 *
	 * 메인클래스에서는 각각의 기능을 확인
	 * 
	 */
	
	String accountNumber;
	String password;
	int balance;
	
	Account() {
		
	}
	
	Account(String number, String pw, int bal) {
		accountNumber = number;
		password = pw;
		balance = bal;
		
	}
	
	
	void deposit(int money) {
		if(money>0) {
		balance += money;
		System.out.println(money+"원 입금 되었습니다");
		System.out.println("현재 계좌잔고는 "+balance+"입니다");
		System.out.println();
		} else {
			System.out.println("입금이 0보다 작을수는 없습니다");
		}
		
	}
	
	void withDraw(int money) {
		if(balance>=money) {
			balance -= money;			
			System.out.println(money+"원 출금 되었습니다");
			System.out.println("현재 계좌잔고는 "+balance+"입니다");
			System.out.println();
		} else {
			System.out.println("잔고가 부족합니다 (잔고:"+balance+")");
		}
	}
	
	int getBalance() {	
		return balance;
	}
	

}
