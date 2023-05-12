package quiz19;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListQuiz02A {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		List<User> list = new ArrayList<>(); //배열 대체

		while(true) {

			System.out.println("[1.등록, | 2.회원정보확인 | 3.회원정보검색 | 4. 회원정보삭제 | 5.프로그램 종료]");
			System.out.print("메뉴(번호)>");
			int menu = scan.nextInt();

			switch(menu) {

			case 1 :
				//이름, 나이를 입력받아서 user 객체에 저장, 리스트에 순서대로 추가
				System.out.print("등록하실 이름을 입력하십시오 >");
				String name = scan.next();
				System.out.print("등록하실 나이를 입력하십시오 >");
				int age = scan.nextInt();

				User user = new User(name, age);
				list.add(user);

				System.out.println("등록 되었습니다");

				break;

			case 2 :
				//리스트에 담긴 모든 회원 이름, 나이를 출력
				for(User u : list) {
					System.out.println(u.getName()+"-"+u.getAge());
				}

				break;

			case 3 :
				//찾을 이름을 새롭게 입력받아서, 이름이 있다면, 이름과 나이를 출력
				//조건 - 찾는 이름이 없다면 "~~~는 목록에 없습니다" 출력합니다
				System.out.print("찾고 싶은 이름을 입력하십시오 >");
				String fine = scan.next();
				
				boolean bool = true;
				
				for(int i=0; i<list.size(); i++) {
					User user3 = list.get(i);
					if(user3.getName().equals(fine)) {
						System.out.println("이름:"+fine+", 나이:"+user3.getAge());
						bool = false; //실행했음
						break;
					}
					if(bool) {
						System.out.println("찾는 이름은 없습니다");
					}
						
					
				}


				break;

			case 4 :
				//삭제할 이름을 입력받아서, 이름과 동일한 User객체를 첫번째 1개만 삭제 
				System.out.print("삭제하고 싶은 이름을 입력하십시오 >");
				String del = scan.next();

				for(int i=0; i<list.size(); i++) {
					User user4 = list.get(i);
					if(user4.getName().equals(del)) {
						list.remove(i);
						System.out.println("삭제되었습니다");
						break;
					}
				}


			case 5:
				System.out.println("프로그램 종료");
				System.exit(0); //종료됨
				break;

			default :
				break;


			}

		}

	}

}
