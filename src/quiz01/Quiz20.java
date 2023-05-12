package quiz01;

import java.util.Scanner;

public class Quiz20 {

	public static void main(String[] args) {
		
		//N개의 정수가 주어진다
		//이때, 최솟값과 최댓값을 구하는 프로그램 작성
		//백준  10818번 최소, 최대
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int[] arr = new int[N];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = scan.nextInt();
		}

		//백준 문제에서 주어진 범위 => 범위가 없으면 arr[0] 넣으면 됨
		int min = 1000001; //배열을 먼저 다 입력한 뒤에 값을 받아야 한다 그 전에는 0
		int max = -1000001;
		
		for(int i=0; i<arr.length; i++) {			
			
			if(min>arr[i]) {
				min = arr[i];
			}
			if(max<arr[i]) {
				max = arr[i];
			}			
		}
		
		System.out.println(min+" "+max);

	}

}
