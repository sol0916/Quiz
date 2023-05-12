package quiz19;

import java.util.*;

public class SetQuiz01 {

	public static void main(String[] args) {
		
		/*
		 * 중복되지 않는 6자리 수 (로또번호)
		 * 
		 * 1. Random 객체를 이용해서 1~45까지 랜덤한 수를 생성
		 * 2. Set에 6개의 랜덤한 로또 번호를 저장해주세요
		 * 
		 */
		
		
		TreeSet<Integer> set = new TreeSet<>();
		Random r = new Random();
		
		while(set.size()!=6) {
			//int ran = (int)(Math.random()*45)+1;
			int ran = r.nextInt(45)+1;
			set.add(ran);
		}
		
		System.out.println(set.toString());
		
		
		for(int num : set) {
			System.out.print(num+" ");
		}

	}

}
