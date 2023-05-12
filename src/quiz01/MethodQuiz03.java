package quiz01;

import java.util.Arrays;
import java.util.Scanner;

public class MethodQuiz03 {

	public static void main(String[] args) {
		
		//char배열의 요소를 문자열로 모두 붙여서 리턴
		char[] c = {'a', 'b', 'c', 'd', 'e'};
		String result1 = method6(c);
		System.out.println(result1); 
		
		//배열의 요소의 합을 리턴
		int[] i = {1,2,3,4,5,6,7,8,9,10};
		int result2 = method7(i);
		System.out.println(result2);

		
		//매개 변수를 배열에 저장하여 배열 리턴
		String[] result3 = method8("안녕", "하세요");
		System.out.println(Arrays.toString(result3));
				

	} //main
	
	static String method6(char[] c) {
		
		String str = "";
		for(int i=0; i<c.length; i++) {
			str += c[i];
		}	
		return str;
	}
	
	
	static int method7(int[] arr) {
		
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}		
		return sum;
	}
	
	
	static String[] method8(String s1, String s2) {
	
		String[] str = {s1, s2};
		
		return str;
	}

}
