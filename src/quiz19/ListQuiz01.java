package quiz19;

import java.util.*;

public class ListQuiz01 {

	public static void main(String[] args) {
		
		/*
		 * List 1번
		 * 1. list에 1~20까지 값을 순서대로 저장
		 * 2. list에 값을 순서대로 출력
		 */
		
		List<Integer> list = new ArrayList<>();
		
		for(int i=0; i<20; i++) {
			list.add(i+1);
		}
		
		//System.out.println(list.toString());
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
				
		/*
		 * List 2번
		 * 1. User를 저장하는 list 생성
		 * 2. 3개의 각각 다른 User객체를 만들고 순서대로 저장
		 * 3. User객체 안에 홍길동이 있으면 해당 객체의 name, age를 출력하는 코드
		 * 4. User객체 안에 홍길자가 있으면 해당 객체를 삭제 코드
		 */
		
		
		User user1 = new User("홍길동",10);
		User user2 = new User("이순신",20);
		User user3 = new User("홍길자",30);
		
		List<User> list2 = Arrays.asList(user1, user2, user3);

		//list.add(user1);
		//list.add(user2);
		//list.add(user3);
		

		//list2 내부에 있는 user 객체 조사
		for(int i=0; i<list2.size(); i++) {
			User user = list2.get(i);
			if(user.getName().equals("홍길동")) {
				System.out.println("이름:"+user.getName()+", 나이:"+user.getAge());
			}
		}
		
		
		for(int i=0; i<list2.size(); i++) {
			User user = list2.get(i);
			if(user.getName().equals("홍길자")) {
				list2.remove(i);
			}
		}
		
				
//		if(list2.contains("홍길자")) {
//			list2.remove("홍길자");
//		}
		
		

	}

}
