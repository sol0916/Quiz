package quiz01;

import java.util.Scanner;

public class Quiz17 {

	public static void main(String[] args) {

		//0이면 +, 1이면 -

		Scanner scan = new Scanner(System.in);				

		int countR = 0;
		int countW = 0;

		//누적할 변수는 반복문 밖에다가

		while(true) {

			int num1 = (int)(Math.random()*100+1);
			int num2 = (int)(Math.random()*100+1);
			int oper = (int)(Math.random()*2);

			int a1 = num1+num2;
			int a2 = num1-num2;
			
//			if(oper==0) {
//		   		System.out.print(" + ");
//				} else {
//					System.out.print(" - ");
//					}

			System.out.print(num1);

			System.out.print(num1+(oper==0 ? "+" : "-")+num2+" = ?");
			System.out.println("[문제를 그만 푸시려면 0을 입력하세요.]");
			System.out.print(">");
			int answer = scan.nextInt();

			//int correct = oper == 0? num1+num2 : num1 - num2;

			if(answer==a1 ||answer==a2) {
				System.out.println("정답입니다");
				countR++;
			} else if(answer==0) {
				System.out.println("프로그램 정상 종료");
				System.out.println("정답:"+countR);
				System.out.println("오답:"+countW);				
				break;
			} else {
				System.out.println("틀렸는데요?");
				countW++;
			} 

			System.out.println("---------------");

		}					

		



	}

}

