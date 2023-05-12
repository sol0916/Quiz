package quiz05;

public class Calculator {
	
	int result;
	double pi = 3.14;
	
	void add(int num) {
		result += num;
		System.out.println("result에 값 추가:"+result);
	}
	
	void sub(int num) {
		result -= num;
		System.out.println("result에 값 차감:"+result);
	}
	
	double circle(int r) {
		return r*r*pi;
	}

}
