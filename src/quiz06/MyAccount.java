package quiz06;

import java.util.*;

public class MyAccount extends Account {

	/*
	   철수는 Account를 상속받는 나의계좌를 만드려고 한다.
	   기존에 가지고 있는 withDraw()기능이 마음에 들지 않았다.

	   Account를 상속받고
	   withDraw()를 오버라이딩하여 사용자의 입력(Scanner)를 통해 비밀번호가 일치하면
	   금액을 감소시키려고 한다.
	   또한 balance보다 큰 금액을 출금하려는 경우에는 "잔액부족" 을 출력해주어야한다.
	   withDraw() 메서드를 오버라이딩 해주세요.

	 */
	
	
	MyAccount() {
		
	}
	
	MyAccount(String number, String pw, int bal) {
		accountNumber = number;
		password = pw;
		balance = bal;
		
	}
	

	Scanner scan = new Scanner(System.in);


	void withDraw(int money) {
		System.out.print("패스워드를 입력하십시오 >");
		String pwRe = scan.next();
		
		if(password.equals(pwRe)) {
			if(balance>=money) {
				balance -= money;			
				System.out.println(money+"원 출금 되었습니다");
				System.out.println("현재 계좌잔고는 "+balance+"입니다");
				System.out.println();
			} else {
				System.out.println("잔고가 부족합니다 (잔고:"+balance+")");
			}
		} else {
			System.out.println("비밀번호가 틀렸습니다");
		}
	}


}
