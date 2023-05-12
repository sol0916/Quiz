package quiz18;

import java.util.Arrays;

public class ArrayQuiz01 {

	public static void main(String[] args) {

		//arr과 arr2는 길이가 1차이가 납니다
		//arr은 마라톤 참가자입니다
		//arr2는 마라톤 완주자입니다
		//완주하지 못한 사람을 리턴

		String[] arr = {"홍길동", "홍길자", "이순신", "신사임당"};
		String[] arr2 = {"홍길동", "이순신", "신사임당"};

		System.out.println(test(arr,arr2));

	}

	public static String test(String[] arr, String[] arr2) {

		Arrays.sort(arr);
		Arrays.sort(arr2);

		int index = 0;

		for(int i=0; i<arr.length; i++) {

			index = Arrays.binarySearch(arr2, arr[i]);
			if(index<0) {
				return "완주하지 못한 사람:"+arr[i];
			}
		}

		return "전부 완주했습니다";
	}

}
