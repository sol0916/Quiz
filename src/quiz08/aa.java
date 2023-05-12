package quiz08;

public class aa extends Cart {

	void buy(String product) {
		
		switch(product) {
		case "tv" :	 
			if(this.money<300) {
				System.out.println("금액이 부족합니다");
				return; //함수 종료
			} else {
				this.money -= 300;
			}
			break;
			
		case "com" :	 
			if(this.money<400) {
				System.out.println("금액이 부족합니다");
				return; //함수 종료
			} else {
				this.money -= 400;
			}
			break;
			
		case "radio" :	 
			if(this.money<500) {
				System.out.println("금액이 부족합니다");
				return; //함수 종료
			} else {
				this.money -= 500;
			}
			break;
			
			default:
				System.out.println("상품을 확인해주세요");
				return;
		}
	}

		void add(String product) {

			String[] newCart = new String[cart.length*2];

			for(int i=0; i<cart.length; i++) {
				newCart[i] = cart[i];
			}

			cart = newCart;
			newCart = null;
			i++;		
		}

		void info() {

			String str = "[";

			for(int j=0; j<i; j++) {
				str += cart[j] + " ";
			}		
			str += "]";

			System.out.println(str);

		}

	}
