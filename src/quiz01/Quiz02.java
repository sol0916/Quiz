package quiz01;

public class Quiz02 {
	
	public static void main(String[] args) {
		
		//1~100까지의 랜덤한 정수를 생성
		int num = (int)(Math.random() * 100) + 1;
				
		//랜덤하게 나온 수가 3의 배수인지, 3의 배수가 아닌지 3항 연산식으로 결과 출력
		//String result = num % 3 == 0 ? "3의 배수입니다" : "3의 배수가 아닙니다";		
		//System.out.println(num+"은 "+result);
		
		//출력문에 바로 수식 사용 가능
		System.out.println( num % 3 == 0 ? num+"는 3의 배수입니다" : num+"은 3의 배수가 아닙니다");

	}

}
