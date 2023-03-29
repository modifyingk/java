package crawling;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CrawlPractice3 {

	public static void main(String[] args) {
		/*
		try {
			Document doc = Jsoup.connect("https://finance.naver.com/item/main.naver?code=005930").get();
			
			Elements list = doc.select(".blind");
			System.out.println(list.size());
			Element tag = list.get(16);
			System.out.println(tag.text());
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		*/
		try {
			Document doc2 = Jsoup.connect("https://news.naver.com/").get();
			
			Elements list2 = doc2.select(".Nitem_link_menu");
			System.out.println(list2.size());
			
			for (int i = 0; i < list2.size(); i++) {
				Element tag2 = list2.get(i);
				System.out.println(i + 1 + " : " + tag2.text());
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
