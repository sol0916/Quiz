package quiz12;

public class Product {
	
	//private은 상속되지 않는다
	private String name;
	private int price;
	
	
	public Product(int price, String name) {
		this.price = price;
		this.name = name;
	}

	//getter / setter
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}
	
	
	

}
