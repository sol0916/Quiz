package quiz02;

public class AccountMain {

	public static void main(String[] args) {
		
		Account account = new Account("123-456", "000", 1000);
		
		account.deposit(1000);
		account.withDraw(500);
	
		int check = account.getBalance();
		System.out.println("계좌잔고: "+check+"원");
		
		
	}

}
