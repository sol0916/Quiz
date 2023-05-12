package quiz01;

import java.util.Scanner;

public class Quiz13 {

	public static void main(String[] args) {
		
		//전부 for문으로 작성
		//1. 7~100까지 정수 중에 7의 배수만 가로로 출력
		
		int count = 0;
		
		for(int i=7; i<=100; i++) {
			
			if(i%7==0) {
				count = i;
				System.out.print(count+" ");
			}									
		}
		
	  /*	for(int i=7; i<=100; i+=7) {
			System.out.print(i+" ");
		} */

		 System.out.println();
	
		 
		//2. 1~200까지 정수 중에 9의 배수의 개수를 출력
		
		int count2 = 0;
		
		for(int i=1; i<=200; i++) {
			
			if(i%9==0) {
				count2++;
			}
		}
		System.out.println("9의 배수의 개수: "+count2);
		
		
		
		
		//3. 50~100사이의 두 수의 합
		
		int sum = 0;
		
		for(int i=50; i<=100; i++) {
			
			sum += i;
			
		}
		System.out.println("50~100의 합:"+sum);
		
		
		//4. A~Z까지 가로로 붙여서 출력, A=65, Z=90
		
		for(int i=65; i<=90; i++) {
			
			char c = (char)i;
			System.out.print(c+" ");
		}
		
		System.out.println();
		
	
		for(char c='A'; c<='Z'; c++) {
			System.out.print(c+" ");
		}
		System.out.println();
		
		String str = "";
		for(char c = 'A'; c<='Z'; c++) {
			str += c;
		}
		System.out.println(str);
		
		
		//5. 입력받은 정수까지 팩토리얼 (5팩토리얼 = 5 * 4 * 3 * 2 * 1)
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 입력하십시오 > ");
		int num = scan.nextInt();
		
		int sum2 = 1;
		 for(int i=1; i<=num; i++) {
			sum2 *= i;			
		} 
		 System.out.println(num+"팩토리얼은 "+sum2);

		 
//		int sum2 = 1;
//		for(int i=1; i<=num; i++) {
//			sum2 *= i;
//		}
//		System.out.println(num+"!은 "+sum2);
		
		
		scan.close();
		
	}

}
