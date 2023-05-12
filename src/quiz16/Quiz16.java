package quiz16;

import java.util.Scanner;

public class Quiz16 {

	public static void main(String[] args) {

		/*
		 * updown 게임
		 * 1~100까지 랜덤한 수를 1번 생성합니다. (반복문 밖에서)
		 * 
		 * 스캐너를 통해서 값을 입력 받습니다
		 * 랜덤 수가 입력받은 값보다 작으면 "더 작은 수를 입력하세요"
		 * 랜덤 수가 입력받은 값보다 크면 "더 큰 수를 입력하세요"
		 * 
		 * 정답을 맞추면 시도 횟수 : x회를 출력하고 종료합니다
		 * 
		 * 
		 * 에러가 발생하면 시도횟수는 증가하고 잘 다시 입력받을 수 있도록 코드 변경
		 * 
		 */

		Scanner scan = new Scanner(System.in);

		int ran = (int)(Math.random()*100+1);
		int count = 0;

		while(true) {

			try {

				System.out.print("정답 입력>");
				int a = scan.nextInt();

				count++;		

				if(ran==a) {
					System.out.println("정답입니다");
					System.out.println("시도 횟수:"+count);
					break;
				} else if(ran>a) {
					System.out.println("더 큰 수를 입력하세요");
				} else {
					System.out.println("더 작은 수를 입력하세요");
				}

			} catch(Exception e) {
				
				System.out.println("숫자를 입력해주십시오");
				scan.nextLine();
				count++;

			}
		}


	}

}
