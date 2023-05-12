package quiz20;

import java.util.*;
import java.io.*;

public class FileQuiz01 {
	
	public static void main(String[] args) {
		
		 /*
		  * 1. 스캐너를 통해서 파일명을 입력을 받습니다
		  * 2. 입력 받은 파일을 filecopy로 복사해서 옮겨주면 됩니다
		  * 
		  */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("파일명을 입력해주십시오 (파일명 뒤 .형식까지 입력하십시오) >");
		String fileName = scan.next();
		
		String readPath = "C:\\Users\\user\\Desktop\\course\\Java\\file\\"+fileName;
		String writePath = "C:\\Users\\user\\Desktop\\course\\Java\\filecopy\\"+fileName;
		
		try (InputStream is = new FileInputStream(readPath);
				OutputStream os = new FileOutputStream(writePath)) {
			
			byte[] arrByte = new byte[2048];
			
			int result;
			
			while((result = is.read(arrByte)) != -1) {
				
				os.write(arrByte, 0, result);
				
			}
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
