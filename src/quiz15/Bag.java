package quiz15;

public class Bag implements IBag {

	//크기가 100인 String[]을 선언해주세요.
	private String[] arrStr = new String[100];
	private int index = 0;

	@Override
	//저장 - 매개변수를 배열에 순서대로 저장
	public void insert(String item) {
		arrStr[index] = item;
		index++;
	}


	@Override
	//출력 - 배열안에 개수만큼 출력
	public void print() {
		String str = "";
		for(int i=0; i<index; i++) {
			str += i+"."+arrStr[i] + " ";
		}
		System.out.println(str);		
	}


	@Override
	//검색 - 값이 있다면 index를 return, 없다면 -1을 리턴(가장먼저 검색된 item순서 반환)
	public int search(String item) {
		for(int i=0; i<index; i++) {
			if(arrStr[i].equals(item)) {
				return i;
			}
		}	
		System.out.println("찾는 값이 없습니다");
		return -1;
	}


	@Override
	//삭제 - 배열의 요소를 삭제(가장먼저 찾게된 item하나만 삭제)
	public boolean delete(String item) {
		for(int i=0; i<index; i++) {
			if(arrStr[i].equals(item)) {
				for(int j=i; j<index-1; j++) {
					arrStr[j] = arrStr[j+1];
				}
				arrStr[index-1] = null;
//					String[] newArr = new String[arrStr.length];
//					System.arraycopy(arrStr, 0, newArr, 0, index);
//					arrStr = newArr;
//					newArr = null;
				System.out.println("삭제되었습니다");
				index--;
				return true;
			}
		}
		System.out.println("값을 찾지 못했습니다");
		return false;
	}

}
