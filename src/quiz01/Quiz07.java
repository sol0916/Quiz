package quiz01;

import java.util.Scanner;

public class Quiz07 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수 1의 값을 입력하세요 >");
		int a = scan.nextInt();
		System.out.println("연산을 선택하세요 [+, -, *, /]");
		String oper = scan.next();
		System.out.println("정수 2의 값을 입력하세요 >");
		int b = scan.nextInt();
				
		switch (oper) {
		
		case "+" :
			System.out.println("두 수의 덧셈 값은: "+(a+b));
			break;
			
		case "-" :
			System.out.println("두 수의 뺄셈 값은: "+(a-b));
			break;
			
		case "*" :
			System.out.println("두 수의 곱셈 값은: "+(a*b));
			break;
			
		case "/" :
			System.out.println("두 수의 나눗셈 값은: "+(a/b));
			break;		
			
		default :
			System.out.println("연산자는 [+, -, *, /]입니다");
			break;
		}
		
		scan.close();
		
	}

}
