package quiz12;

public class MyCart {
	
	//1. 모든 변수와 메서드에 접근제한자를 선언하세요.
	private int money; //잔고
	private Product[] cart = new Product[1]; //상품을 저장할 배열
	private int i = 0; //cart의 순서
	
	//2. MyCart의 생성자는 money만 받아서 초기화
	public MyCart(int money) {
		this.money = money;
	}

	/*
	 * 3. buy(상품들의 부모타입) : void
	 * 
	 * 가진돈과 전달된 물건의 가격을 비교해서 돈이 적으면 "금액부족" 출력후 종료
	 * 가진돈이 충분하면 물건의 가격을 money에 빼고  add(상품) 메서드를 호출
     */ 
	public void buy(Product product) {
		
		if(product.getPrice()<=money) {
			
			money -= product.getPrice();
			add(product);			
			
		} else {
			System.out.println("금액이 부족합니다");
			System.out.println("현재 잔고:"+money);
			return;
		}
		
	}
	
	/*
	 * 4. add(상품들의 부모타입) : void
	 * 매개변수로 넘어온 상품을 cart배열에 순서대로 담아줍니다.
	 * 단, cart배열이 꽉 찼다면, 2배 크기의 카트배열로 옴겨주세요.
	 * 
	 * 마지막에는 info() 메서드를 호출합니다.
	 */
	
	private void add(Product product) {
		
		if(i>=cart.length) {
			Product[] newCart = new Product[cart.length*2];
			System.arraycopy(cart, 0, newCart, 0, cart.length);
			cart = newCart;
			newCart = null;
		}
		
		cart[i] = product;		
		i++;
		info();
	}
	
	/*
	 * 5.info()
	 * 장바구니 안에 담긴 물건의 목록(name)을 출력한다.
	 * 장바구니 안에 담긴 물건의 가격을 모두 더해서 출력
	 
	 * 메인에서 buy메서드 실행해서 확인합니다.
	 * 
	 */
	
	public void info() {
		
		int all = 0;
		String cartList = "";
		
		for(int j=0; j<i; j++) {
			cartList += (j+1) + "." + cart[j].getName() + " ";
			all += cart[j].getPrice();
		}
		
		
		System.out.println("===My Cartlist===");
		System.out.println(cartList);
		System.out.println("총 금액:"+all);
		System.out.println();
		
	}
	
	

}
