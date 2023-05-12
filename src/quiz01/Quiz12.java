package quiz01;

public class Quiz12 {
	
	public static void main(String[] args) {
		
		//1000까지 정수 중에서 4의 배수이면서, 8의 배수가 아닌 수의 count(개수)
				
		int num = 0;
		int count = 0;
		
		while(num<=1000) {
			if(num%4==0 && num%8!=0) {
				count++;
			}
			num++;
		}
		
		System.out.println("1000까지의 정수 중 4의 배수이면서 8의 배수가 아닌 수는 "+count+"개 입니다");
		
		
		
		// 50~100까지의 합계 구하기
				
		int num3 = 50;
		int sum = 0;
		
		while(num3<=100) {
			sum += num3;
			num3++;
		}
		
		System.out.println("50~100까지의 합계: "+sum);
		
		
	}

}
