package quiz15;

public class MainClass {

	public static void main(String[] args) {
		
		IBag bag = new Bag();
		
		bag.insert("phone");
		bag.insert("airpot");
		bag.insert("pen");
		bag.insert("airpot");
		bag.print();
		int result = bag.search("airpot");
		System.out.println("해당 item은 "+result+"번에 있습니다");
		bag.delete("airpot");
		bag.print();

	}

}
