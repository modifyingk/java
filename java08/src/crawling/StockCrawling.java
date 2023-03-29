package crawling;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class StockCrawling {

	String yesterday;
	String today;
	String market;
	String company;
	String result;
	
	public String crawling(String code) {

		// try 안에 있으면 tag 접근 불가! tag의 텍스트를 이용해서 return 불가
		// -> return 할 수 있도록 선언 범위를 밖으로 빼줌
		// 지역변수라서 초기화시켜줘야함
		Element tag = null, tag2 = null, tag3 = null, tag4 = null;
		
		try {

			Document doc = Jsoup.connect("https://finance.naver.com/item/main.naver?code=" + code).get();
			Elements list = doc.select("td.first").select(".blind");
			tag = list.get(0);
			tag2 = list.get(1);

			Elements list2 = doc.select("div.today").select(".blind");
			tag3 = list2.get(0);
			
			Elements list3 = doc.select(".wrap_company").select("a");
			tag4 = list3.get(0);
			
			yesterday = tag.text();
			market = tag2.text();
			today = tag3.text();
			company = tag4.text();

//			System.out.println("------------------");
//			System.out.println("☆ " + company + " ☆");
//			System.out.println("전일가 : " + yesterday);
//			System.out.println("현재가 : " + today);
//			System.out.println("시가 : " + market);
//			System.out.println("------------------");
			
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		String result = company + "\n---------------------\n전일가 : " + yesterday + "\n현재가 : " + today + "\n시가 : " + market;
		return result;
	}

}
