package quiz11;

public class MainClass {

	public static void main(String[] args) {
		
		Computer com = new Computer();
		
		com.computerInfo();
		
		
		//getter
		Monitor m = com.getMn();
		m.info();

	}

}
