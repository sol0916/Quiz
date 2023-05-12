package quiz09;

public class MainClass {

	public static void main(String[] args) {
		
		SuperSonicAp sonic = new SuperSonicAp("sonic");
		
		sonic.takeOff();
		sonic.fly();
		System.out.println(sonic.info());
		sonic.flyMode = 1;
		sonic.fly();
		sonic.land();
		System.out.println(sonic.info());

	}

}
