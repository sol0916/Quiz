package quiz20;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class FileQuiz02Re {

	public static void main(String[] args) {


		/*
		 * 1. Date클래스를 이용해서 File경로에 하위폴더로 20230504file 폴더를 생성합니다
		 * 2. 스캐너로 파일명을 입력받고 BufferedWriter를 이용해서 .txt파일을 생성합니다.
		 * 3. 그만을 입력받을 떄 까지 엔터를 포함해서 입력 받습니다.
		 *    \r\n을 적절하게 이용해서 파일 출력을 완료 
		 *    
		 * 4. 파일을 다 썻다면 아무방법으로 읽어들여서 이클립스창에 출력.
		 */

		//오늘 날짜 불러오기
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		String now = sdf.format(date);
		
		//폴더 생성
		String path = "C:\\Users\\user\\Desktop\\course\\Java\\file\\"+now+"file";
		File file = new File(path);
		file.mkdir();

		Scanner scan = new Scanner(System.in);
		
		//파일 생성
		System.out.print("파일명을 입력해주십시오 >");
		String fileName = scan.next();
		String filePath = path+"\\"+fileName;


		try(BufferedWriter bw = new BufferedWriter(new FileWriter(filePath, true));
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				Reader fr = new FileReader(filePath)) {

			//파일에 내용 입력
			while(true) {

				System.out.println("내용을 입력하십시오");
				System.out.println("프로그램을 종료하시려면 '그만'을 입력하십시오");
				System.out.println(">");
				String word = br.readLine();
				if(word.equals("그만")) {
					break;
				}

				bw.write(word);
				bw.write("\r\n");
				bw.flush();


			}
			
			//파일 출력			
			int result;
			while((result=fr.read())!=-1) {
				System.out.print((char)result);				
			}
			
			//br.close();

		} catch(Exception e) {
			e.printStackTrace();
		}




	}

}
