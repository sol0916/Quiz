package quiz01;

public class MethodQuiz01 {

	public static void main(String[] args) {
		
		method1(); //출력 메소드

		String r1 = method2("안녕하세요");
		System.out.println(r1); //매개변수 리턴
		
		int r2 = method3(5, 6, 6.5);
		System.out.println(r2); //합
		
		String r3 = method4(5);
		System.out.println(r3); //홀짝
		
		method5("안녕 ", 5); //int만큼 String 반복 출력
		
		int r4 = maxNum(7, 5);
		System.out.println(r4); //큰 수 리턴
		
		//절대값 => 음수를 입력해도 양수로 출력
		System.out.println(abs(-5)); //절대값 리턴 
			
		
		String str = java(7);
		System.out.println(str);
		

	} //main
	
	static void method1() {
		System.out.println("안녕");
	}
	
	static String method2(String s) {
		return s;
	}
	
	static int method3(int a, int b, double c) {
				
		return a + b + (int)c;
	}
	
	static String method4(int a) {
		
		String result = "";		
		result = a%2==0 ? "짝수" : "홀수";
		
		return result;
	}
	
	static void method5(String s, int a) {
		
		String str = "";
		for(int i=1; i<=a; i++) {
			str += s;
		}
		System.out.println(str);
	}
	
	static int maxNum(int a, int b) {
		
		int max = 0;
		
		max = a<b ? b : a;
		
		return max;
	}
	
	static int abs(int a) {
		if(a<0) {
			return -a;
		}
		return a;
	}


	
	static String java(int a) {

		String str = "";
		for(int i=1; i<=a; i++) {
			str += i%2==0 ? "바" : "자";			
		}
		
		return str;
	}

	

}
