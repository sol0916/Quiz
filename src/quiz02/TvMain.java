package quiz02;

public class TvMain {

	public static void main(String[] args) {
		
		Tv tv = new Tv();
		
		int number = tv.changeChannel(5);
		System.out.println("현재 채널 번호는 "+number+"입니다");
		
		tv.power();
		tv.power();
		

	}

}
