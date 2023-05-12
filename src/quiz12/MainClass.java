package quiz12;

public class MainClass {

	public static void main(String[] args) {
		
		Radio radio = new Radio(); //300, sony
		Tv tv = new Tv();
		Computer com = new Computer();
			
		MyCart my = new MyCart(1000);
		my.buy(tv);
		my.buy(com);
		my.buy(radio);
		

	}

}
