package quiz01;

import java.util.Arrays;

public class Quiz21 {
	
	public static void main(String[] args) {
		
		/*
		 * 1.1~9까지 숫자중 절대 중복되지 않는 숫자 3개를 추출
		 *   arr를 랜덤하게 10번 섞어줍니다
		 *   0~2번째 값을 새로운 배열로 옮겨 담아보세요
		 */
		
		
		
		int[] arr = {1,2,3,4,5,6,7,8,9};
		
		
		for(int i=0; i<10; i++) {
			int num1 = (int)(Math.random()*arr.length);
			int num2 = (int)(Math.random()*arr.length);
			int temp = 0;
			
			temp = arr[num1];
			arr[num1] = arr[num2];
			arr[num2] = temp;
			
			System.out.println(Arrays.toString(arr));
		}
		
		
		int[] arr2 = new int[3];
		
		for(int i=0; i<3; i++) {
			
			arr2[i] = arr[i];
			
		}
		
		System.out.println(Arrays.toString(arr2));

		
		
		}
		
	}

