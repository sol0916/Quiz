package quiz04;

public class Main {

	public static void main(String[] args) {
		
		Warrior wr = new Warrior("전사");
		
		wr.info();
		wr.bash();
		
		System.out.println();
		
		Wizard wz = new Wizard("마법사");
		
		wz.info();
		wz.iceArrow();

	}

}
