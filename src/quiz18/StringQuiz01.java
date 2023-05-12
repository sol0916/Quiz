package quiz18;

import java.util.*;

public class StringQuiz01 {

	public static void main(String[] args) {


		/*
		 * 스캐너를 사용해서 id를 입력받습니다
		 * 아이디는 공백을 포함해서 받을 수 있습니다 nextLine()
		 * 
		 * 단, 공백을 제거한 아이디가 5글자 미만이면 다시 입력받습니다
		 * 	  5글자 이상이면 "id가 등록되었습니다" 출력 후 종료
		 * 
		 */


		Scanner scan = new Scanner(System.in);

		int index = 0;

		while(true) {

			System.out.print("사용하실 ID를 입력하십시오 >");
			String id = scan.nextLine();

			String str = ""; 
			str = id.replace(" ", "");

			if(str.length()<5) {
				System.out.println("ID는 5글자 이상으로 설정해주십시오");
				index++;
			} else {
				System.out.println("id가 등록 되었습니다");
				break;				
			}			

		}

	}

}