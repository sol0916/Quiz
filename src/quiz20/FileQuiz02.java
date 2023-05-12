package quiz20;

import java.io.*;
import java.util.*;
import java.text.*;

public class FileQuiz02 {

	public static void main(String[] args) {

		/*
		 * 1. Date클래스를 이용해서 File경로에 하위폴더로 20230504file 폴더를 생성합니다
		 * 2. 스캐너로 파일명을 입력받고 BufferedWriter를 이용해서 .txt파일을 생성합니다.
		 * 3. 그만을 입력받을 떄 까지 엔터를 포함해서 입력 받습니다.
		 *    \r\n을 적절하게 이용해서 파일 출력을 완료 
		 *    
		 * 4. 파일을 다 썻다면 아무방법으로 읽어들여서 이클립스창에 출력.
		 */

		//오늘 날짜 받아오기
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		String nowTime = sdf.format(date);

		String path = "C:\\Users\\user\\Desktop\\course\\Java\\file\\"+nowTime+"file";

		File file = new File(path);
		file.mkdir(); //폴더 생성

		Scanner scan = new Scanner(System.in);

		System.out.print("파일명을 입력하십시오 (무슨 형식인지 쓰십시오) >");
		String fileName = scan.next();
		String filePath = path+"\\"+fileName;
		scan.nextLine();

		try(BufferedWriter bw = new BufferedWriter(new FileWriter(filePath, true));
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

			String word = "";

			while(!(word=br.readLine()).equals("그만")) {
				

				System.out.println("내용을 입력하십시오.");
				System.out.println("프로그램을 종료하시려면 '그만'을 입력해주십시오");
				System.out.print(">");
				
				bw.write(word);
				bw.write("\r\n");
				bw.flush();				

			}

			//bw.close();

			String result;

			while((result=br.readLine())!=null) {
				System.out.println(result);
			}


		} catch (Exception e) {
			e.printStackTrace();			
		}


	}

}
