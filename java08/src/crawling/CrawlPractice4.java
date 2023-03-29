package crawling;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CrawlPractice4 {

	public static void main(String[] args) {

		String[] code = {"005930", "373220", "000660"};
		String[] company = {"삼성전자", "LG에너지솔루션", "SK하이닉스"};
		
		try {
//			Document doc = Jsoup.connect("https://finance.naver.com/item/main.naver?code=005930").get();
//			
//			Elements list = doc.select("td.first").select(".blind");
//			Element tag = list.get(0);	// 전일가
//			String yesterday = tag.text();
//
//			Element tag2 = list.get(1);	// 시가
//			String market = tag2.text();
//			
//			Elements list2 = doc.select("div.today").select(".blind");
//			Element tag3 = list.get(0);	// 현재가
//			String today = tag3.text();
//			
//			System.out.println("------------------");
//			System.out.println("회사명 : 삼성전자");
//			System.out.println("전일가 : " + yesterday);
//			System.out.println("시가 : " + market);
//			System.out.println("현재가 : " + today);
//			System.out.println("------------------");
			
			for (int i = 0; i < code.length; i++) {
				Document doc = Jsoup.connect("https://finance.naver.com/item/main.naver?code=" + code[i]).get();
				Elements list = doc.select("td.first").select(".blind");
				Element tag = list.get(0);
				Element tag2 = list.get(1);
				
				Elements list2 = doc.select("div.today").select(".blind");
				Element tag3 = list2.get(0);
				
				String yesterday = tag.text();
				String market = tag2.text();
				String today = tag3.text();
				
				System.out.println("------------------");
				System.out.println("☆ " + company[i] + " ☆");
				System.out.println("전일가 : " + yesterday);
				System.out.println("시가 : " + market);
				System.out.println("현재가 : " + today);
			}
			System.out.println("------------------");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
