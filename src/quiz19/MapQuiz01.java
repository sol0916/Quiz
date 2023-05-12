package quiz19;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MapQuiz01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		//맵을 이용하는데 key : 메뉴이름  value: 가격
		Map<String, Integer> map = new HashMap<>();

		while(true) {

			System.out.println("-----음식 메뉴 관리------");
			System.out.println("1. 신규 메뉴 등록"); //이미 등록된 메뉴인지 확인 후에 메뉴 등록
			System.out.println("2. 메뉴판 전체 보기"); //메뉴와 가격을 전부 출력
			System.out.println("3. 메뉴판 수정"); //변경할 메뉴를 받아서 메뉴가 있다면 가격을 수정
			System.out.println("4. 메뉴판 삭제"); //변경할 메뉴를 받아서 메뉴가 있다면 삭제
			System.out.println("5. 프로그램 종료"); //종료

			System.out.print("메뉴입력>");
			int menu = scan.nextInt();

			if(menu == 1) {

				System.out.print("등록하실 메뉴를 입력해주십시오 >");
				String menuName = scan.next();
				if(map.containsKey(menuName)) {
					System.out.println("이미 등록된 메뉴 입니다");
					break;
				}

				System.out.print("금액을 등록해주십시오 >");
				int price = scan.nextInt();


				map.put(menuName, price);
				System.out.println("등록되었습니다");

			} else if(menu == 2) { //메뉴판 전체 보기

				Set<Entry<String, Integer>> entrySet = map.entrySet();
				int i = 1;
				System.out.println("=====menu======");
				for(Entry<String, Integer> entry : entrySet) {
					System.out.println(i+". 메뉴:"+entry.getKey()+", 가격:"+entry.getValue()+"원");
					i++;
				}
				System.out.println();


			} else if(menu == 3) {// 메뉴판 수정

				System.out.print("수정하고 싶은 메뉴를 입력하십시오 >");
				String changeMenu = scan.next();

				if(map.containsKey(changeMenu)) {

					System.out.print("수정할 메뉴의 금액을 입력하십시오 >");
					int chagePrice = scan.nextInt();

					map.put(changeMenu, chagePrice);

					System.out.println("수정되었습니다");

				} else {
					System.out.println("해당 메뉴가 없습니다");
				}

			} else if(menu == 4) { //삭제

				System.out.print("삭제할 메뉴를 입력하십시오 >");
				String delMenu = scan.next();

				if(map.containsKey(delMenu)) {

					map.remove(delMenu);
					System.out.println("삭제 되었습니다");

				} else {
					System.out.println("해당 메뉴가 없습니다");
				}


			} else if(menu == 5) {

				System.out.println("프로그램 종료");
				System.exit(0);				

			}

		}


	}
}
