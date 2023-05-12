package quiz01;

import java.util.Scanner;

public class Quiz11 {
	
	public static void main(String[] args) {
		
		/*
		 * 1. 정수를 입력 받습니다
		 * 2. 입력받은 수까지 약수의 합
		 * 
		 * 예시
		 * 입력수 10
		 * 약수의 합 18 
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 입력하십시오 >");
		int num = scan.nextInt();
		
		int i = 1;
		int sum = 0;
		
		while(i<=num) {
			if(num%i==0) {
				sum += i;
			}
			i++;
		}
		System.out.println(num+"의 약수의 합은 "+sum+"입니다");
		
		scan.close();
	}

}
