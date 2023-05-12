package quiz05;

public class MainClass {

	public static void main(String[] args) {
		/* 요구사항
		 * Calculator를 부모클래스로 선언하세요.
		 * Calculator를 상속받는 Computer클래스 생성 합니다.
		 * 
		 * Calculator의 멤버변수 result, pi를 선언하세요
		 * Calculator의 메서드
		 * add(int) : void - result에 값을 누적시키는 기능
		 * sub(int) : void - result에 값을 차감시키는 기능
		 * circle(int) : double - pi를 이용해서 원의 넓이를 구하는 기능
		 * ------------------------------------------------------------------
		 * Computer 클래스의 메서드
		 * circle()메서드를 오버라이딩 하고, pi대신 하는 Math.PI를 사용해서 원의 넓이를 구하세요.
		 * rect(double) : double - 정사각형의 넓이 를 리턴
		 * rect(double, double) : double - 직사각형의 넓이 를 리턴
		 * rect(double, double, double) : double - 직육면체의 넓이 를 리턴
		 * 
		 * 
		 * 메인클래스에서 Calculator, Computer를 생성하고 메서드를 확인하세요.
		 */
		

		Calculator cal = new Calculator();
		//result에 값 +
		cal.add(10);
		//result에 값 -
		cal.sub(5);
		//원의 넓이 구하기(double pi = 3.14)
		double calResult = cal.circle(3);
		System.out.println("double pi변수를 이용한 원의 넓이:"+calResult);
		
		Computer com = new Computer();
		
		//원의 넓이 구하기(Math.PI 이용)
		double comResult1 = com.circle(3);
		System.out.println("Math.PI를 이용한 원의 넓이:"+comResult1);
		double comResult2 = com.circle(7);
		System.out.println("Math.PI를 이용한 원의 넓이:"+comResult2);
		
		//정사각형 넓이 구하기
		double comResult3 = com.rect(2);
		System.out.println("정사각형 넓이:"+comResult3);
		//직사각형 넓이 구하기
		double comResult4 = com.rect(3, 5);
		System.out.println("직사각형 넓이:"+comResult4);
		//직육면체 넓이 구하기
		double comResult5 = com.rect(3, 5, 7);
		System.out.println("직육면체 넓이:"+comResult5);
		
	}
}
