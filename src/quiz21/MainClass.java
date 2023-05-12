package quiz21;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.io.*;



public class MainClass {

	public static void main(String[] args) {

		//지역명, 규모구분, 연도, 월, 분양가격 -> 1행 x 4800개
		//List<객체>
		/*
		 * 1. 버퍼리더 이용해서 한줄씩 읽습니다
		 * 2. split(",", 5)를 사용해서 Data 객체에 한줄 단위로 저장하고 
		 * 	  (최소크기 5보장 (데이터가 항상 일정하지는 않게 때문에 최소기준 필요) 구분자는 ,로)
		 * 3. List<Data>에 하나씩 추가를 합니다
		 * 
		 * 4. 람다식을 이용해서 (지역:서울, 4분기중 9~12월, 분양가격: 2000이상)인 객체만 뽑아서
		 * 새로운 리스트로 반환 
		 *  
		 */

		List<Data> list = new ArrayList<>();

		String path = "C:\\Users\\user\\Desktop\\course\\Java\\work\\Quiz\\src\\quiz21\\주택도시보증공사_전국 평균 분양가격.csv";


		try(BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path), "EUC-KR"));) {

			br.readLine(); //(제목행) 한번 넘어감

			String info;
			while((info=br.readLine())!=null) {
				String[] strArr = info.split(",",5);

				String region = strArr[0];
				String size = strArr[1];
				String year = strArr[2];
				String month = strArr[3];
				String price = strArr[4].replace(" ", "").replace(",","").replace("\"","").replace("-", "");

				//공백이라면, "0" 대입
				price = price.equals("") ? "0" : price;

				Data data = new Data(region, size, year, month, price); 
				list.add(data);

			}


			List<Data> result = list.stream()
								.filter(a -> a.getRegion().equals("서울")&&Integer.parseInt(a.getMonth())>=9&&Integer.parseInt(a.getPrice())>=2000)
								.collect(Collectors.toList());
			for(Data d : result) {
			System.out.println(d.getRegion() +": "+ d.getMonth()+"월 " + d.getPrice()+"원");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}


	}

}
