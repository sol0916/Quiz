package quiz08;

public class MyCart extends Cart {

	//1. 생성자는 money를 전달받고 money값 초기화, tv=300, com=400, radio=500;

	MyCart() {}

	MyCart(int money) {
		this.money = money;
		this.tv = 300;
		this.com = 400;
		this.radio = 500;
	}


	//2. buy(), add(), info() 메서드 오버라이드
	/*
	 * 상품명 "tv", "com", "radio"
	 * 
	 * buy(상품명) 기능
	 * 매개변수가 tv, com, radio라면 금액에서 상품가격을 차감하고, add() 메서드 실행
	 * 단, 올바른 상품이 아니거나, 금액이 부족할 경우에는 적절한 처리 
	 */

	void buy(String product) {
		switch (product) {
			case "tv": 
				if(money>tv) {
					money -= tv;
					add("tv");
				} else {
					System.out.println("잔액이 부족합니다 현재 잔액:"+money);
				}
				break;

			case "com" :
				if(money>com) {
					money -= com;
					add("com");
				} else {
					System.out.println("잔액이 부족합니다 현재 잔액:"+money);
				}
				break;

			case "radio" :
				if(money>radio) {
					money -= radio;
					add("radio");
				} else {
					System.out.println("잔액이 부족합니다 현재 잔액:"+money);
				}
				break;

			default:
				System.out.println("상품이 존재하지 않습니다");
				break;
			}
	}

	/*
	 * add(상품명) 기능
	 * 매개변수로 넘어온 상품을 cart배열에 순서대로 담아줍니다
	 * 단, cart배열이 꽉 찼다면, 2배 크기의 카트배열로 옮겨주세요
	 * 
	 * 마지막에는 info() 메서드를 호출합니다
	 */
	
	void add(String product) {
		i++;
		if(i==cart.length) { 
			String[] newCart = new String[cart.length*2];
			System.arraycopy(cart, 0, newCart, 0, cart.length);
			cart = newCart;
			newCart = null;			
			} 
		
		cart[i-1] = product;
		
		
		info();
		}


	/*
	 * info()는 
	 * cart배열에 담긴 물건 목록만(null 제외) 출력해주세요 => Arrays.toString 못 씀
	 */
	
	
	void info() {
		String cartList = "";
		
		System.out.println("===My Cart===");
//		for(int j=0; j<cart.length; j++) {
//			if(cart[j] != null) {
//			cartList += cart[j] + " ";
//			}
//		}
		for(int j=0; j<i; j++) {
			cartList += cart[j] + " ";
		}
		System.out.println(cartList);
		System.out.println("잔액:"+money);
	}
	

}
