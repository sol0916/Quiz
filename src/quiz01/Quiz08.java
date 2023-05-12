package quiz01;

import java.util.Scanner;

public class Quiz08 {

	public static void main(String[] args) {

		String[] arr = {"안녕", "hello", "니하오", "오하~", "#$%^"};

		/*
		 * 1. 랜덤수를 생성하고, 이 랜덤수를 이용해서 배열의 랜덤한 값이 출력되게 처리
		 * 2. 출력된 문자열이 어느 나라 언어인지 판별해서 출력
		 * 
		 */		
		Scanner scan =  new Scanner(System.in);
		int num = (int)(Math.random()*arr.length);

		switch(num) {

		case 0:
			System.out.println("선택된 단어: "+arr[0]);
			System.out.println("한국어 입니다");
			break;

		case 1:
			System.out.println("선택된 단어: "+arr[1]);
			System.out.println("영어 입니다");
			break;

		case 2:
			System.out.println("선택된 단어: "+arr[2]);
			System.out.println("중국어 입니다");
			break;

		case 3:
			System.out.println("선택된 단어: "+arr[3]);
			System.out.println("일본어 입니다");
			break;

		case 4:
			System.out.println("선택된 단어: "+arr[4]);
			System.out.println("알수 없는 언어 입니다");
			break; 

		}
		
		int index = (int)(Math.random()*arr.length);
		System.out.println("선택된 단어 : "+arr[index]);

		switch(arr[index]) {

		case "안녕":
			System.out.println("한국어 입니다");
			break;

		case "hello":
			System.out.println("영어 입니다");
			break;

		case "니하오":
			System.out.println("중국어 입니다");
			break;

		case "오하~":
			System.out.println("일본어 입니다");
			break;

		default :
			System.out.println("알수 없는 언어 입니다");
			break; 

		}
		
		scan.close();


	}

}
