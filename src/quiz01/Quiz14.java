package quiz01;

import java.util.Scanner;

public class Quiz14 {
	
	public static void main(String[] args) {
		
		/*
		 * 1. 가로, 세로길이를 입력을 받습니다
		 * 2. 가로, 세로길이 만큼 사각형을 출력합니다
		 * 3. 단, 윤곽만 나오면 됩니다
		 * 
		 * 힌트 : 1행, 마지막행, 1열 마지막열만 출력
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("가로 >");
		int num = scan.nextInt();
		System.out.println("세로 >");
		int num2 = scan.nextInt();
				
		for(int i=1; i<=num2; i++) {
			for(int j=1; j<=num; j++) {
				if(i==1||i==num2) {
					System.out.print("*");
				} else {
					System.out.print(j==1||j==num ? "*" : " ");
				}
			}
			System.out.println();
		}
		
		scan.close();
		
	}

}


