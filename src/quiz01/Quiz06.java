package quiz01;

import java.util.*;

public class Quiz06 {

	public static void main(String[] args) {

		/*
		 * if구문 밖에 선언된 변수를 잘 활용합니다.
		 * 
		 * 정수 3개를 입력을 받습니다.
		 * 
		 * 가장 큰 값, 중간 값, 작은 값을 구분해서 출력. (조건 - 같은 수는 없다)
		 * 
		 */
		int max = 0;
		int mid = 0;
		int min = 0;

		Scanner scan = new Scanner(System.in);

		System.out.print("첫번째 숫자를 입력하세요 >");
		int a = scan.nextInt();
		System.out.print("두번째 숫자를 입력하세요 >");
		int b = scan.nextInt();
		System.out.print("세번째 숫자를 입력하세요 >");
		int c = scan.nextInt();



		if(a==b || b==c || a==c) {
			System.out.println("같은 값이 포함되어 있습니다");
			System.out.println("다시 입력해주세요");	
		} else if(a>b && a>c) {
			max = a;
			if(b>c) {
				mid = b;
				min = c;
			} else {
				mid = c;
				min = b;
			}
			System.out.println("가장 큰 값은: "+max+" 중간 값은: "+mid+" 작은 값은: "+min);			

		} else if(b>a && b>c) {
			max = b;
			if(a>c) {
				mid = a;
				min = c;
			} else {
				mid = c;
				min = a;
			}			
			System.out.println("가장 큰 값은: "+max+" 중간 값은: "+mid+" 작은 값은: "+min);			

		} else if(c>a && c>b) {
			max = c;
			if(a>b) {
				mid = a;
				min = b;
			} else {
				mid = b;
				min = a;
			}
			System.out.println("가장 큰 값은: "+max+" 중간 값은: "+mid+" 작은 값은: "+min);
		}
		
		scan.close();
		
	}

}
