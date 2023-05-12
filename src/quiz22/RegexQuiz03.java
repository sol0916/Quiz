package quiz22;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;

public class RegexQuiz03 {

	public static void main(String[] args) {
		
		/*
		 * 1.버퍼리더를 사용해서 건담.txt를 읽어들입니다
		 * 2.정규표현식을 이용해서 날짜, 지점, 등급, 내용, 가격을 정규표현식으로 패턴 분석
		 * Product 객체에 저장하고 리스트에 저장
		 * 
		 * 3. 외부라이브러리 (POI) - 자바에서 엑셀파일 xlsx 형태로 파일을 쓸 수 있도록 하는 기능
		 * 	  하나의 시트에 각 행데이터를 엑셀파일로 출력
		 */
		
		List<Product> list = new ArrayList<>();
		
		String path = "C:\\Users\\user\\Desktop\\course\\Java\\work\\Quiz\\src\\quiz22\\건담.txt";
		
		String p = "[0-9]+-[0-9]+-[0-9]+";
		String p2 = "[가-힣]+\\s[가-힣]+";
		String p3 = "\\[+[A-Z가-힣]+\\]+";
		
		String p5 = "[0-9,]+원";
		
		//p3의 마지막과 p5의 첫번째 배열의 문자열 자르기
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String info;
						
			while((info=br.readLine())!=null) {
						
				Matcher m = Pattern.compile(p).matcher(info);
				Matcher m2 = Pattern.compile(p2).matcher(info);
				Matcher m3 = Pattern.compile(p3).matcher(info);				  
				//Matcher m4 = Pattern.compile(p4).matcher(info);
				Matcher m5 = Pattern.compile(p5).matcher(info);
				
				int indexF = info.indexOf("]")+2; 
				int indexL = info.lastIndexOf("원")-5; 
				String m4 = info.substring(indexF, indexL);
				
				
				if(m.find()&&m2.find()&&m3.find()&&m5.find()) {

					Product product = new Product(m.group(),m2.group(),m3.group(),m4,m5.group());
					list.add(product);
				
					
				}
				
			}
			
			
			
			XSSFWorkbook workbook = new XSSFWorkbook();
			XSSFSheet sheet = workbook.createSheet("건담");
			int rowNo = 0;
			Row headerRow = sheet.createRow(rowNo++);
			headerRow.createCell(0).setCellValue("날짜");
			headerRow.createCell(1).setCellValue("지점");
			headerRow.createCell(2).setCellValue("등급");
			headerRow.createCell(3).setCellValue("내용");
			headerRow.createCell(4).setCellValue("가격");
			
			for(Product product : list) {
				Row row = sheet.createRow(rowNo++);
				row.createCell(0).setCellValue(product.getDay());
				row.createCell(1).setCellValue(product.getStore());
				row.createCell(2).setCellValue(product.getGrade());
				row.createCell(3).setCellValue(product.getDetail());
				row.createCell(4).setCellValue(product.getPrice());
			}
			
			workbook.write(new FileOutputStream("C:\\Users\\user\\Desktop\\course\\Java\\work\\Quiz\\src\\quiz22\\excel.xlsx"));
			
			
			 
		} catch(Exception e) {
			e.printStackTrace();
		}

	}

}
