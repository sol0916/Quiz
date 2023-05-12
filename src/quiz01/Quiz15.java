package quiz01;

import java.util.Scanner;

public class Quiz15 {

	public static void main(String[] args) {
		
		/*
		 * 1. 입력받은 수까지의 소수들의 합
		 * 입력 7
		 * -> 바깥 반복문은 7까지는 회전
		 * 
		 */
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 입력 >");
		int num = scan.nextInt();
		
		int sum = 0;
		
		for(int i=1; i<=num; i++) {
			
			int count = 0;
			
			for(int j=1; j<=i; j++) {				
				//System.out.println(i+"-"+j);
				//각각의 i값이 소수인지를 판별해서 소수라면, sum에 누적하는 코드
				//적절한 시점에 초기화를 해야함
				if(i%j==0) {
					count++;				
				}				
			}
			
			if(count==2) {
				
			}
			
		}
		System.out.print(sum+" ");
		
		scan.close();
		
	}

}
