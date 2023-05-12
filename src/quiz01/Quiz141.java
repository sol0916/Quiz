package quiz01;

import java.util.Scanner;

public class Quiz141 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("가로 >");
		int w = scan.nextInt();
		System.out.println("세로 >");
		int h = scan.nextInt();

		//행
		for(int i=1; i<=h; i++) {

			for(int j=1; j<=w; j++) {
				if(i==1 || i==h) { //첫행, 마지막행
					System.out.print("*");
				} else { //첫행, 마지막행이 아닌 경우
					if(j==1 || j==h) { //첫열, 마지막열
						System.out.print("*");
					} else {
					System.out.print(" ");
					}
				}
			}
			System.out.println();
		}

	}
}
