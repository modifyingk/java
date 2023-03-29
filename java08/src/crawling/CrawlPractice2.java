package crawling;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CrawlPractice2 {

	public static void main(String[] args) {
		// 1. 사이트에 연결해서 html 문서 다 가져오기
		try {
			Document doc = Jsoup.connect("https://finance.naver.com/item/main.naver?code=005930").get();
			//Elements list = doc.select(".code");	// class가 "~~"인 태그를 다 찾아서 묶어서 가져옴
			// Elements는 ArrayList의 자식
			
//			System.out.println(list.size());
//			System.out.println(list.get(0));
//			System.out.println(list.get(1));
		
//			for (int i = 0; i < list.size(); i++) {
//				//System.out.println(list.get(i));
//				Element tag = list.get(i);	// Element는 태그를 나타냄
//				System.out.println(i + 1 + ": " + tag.text());	// text만 추출
//			}
			
//			System.out.println(list.size());
//			Element tag = list.get(0);
//			System.out.println(tag.text());
			
			Elements list = doc.select(".first");
			//System.out.println(list);
			System.out.println(list.size());
			for (int i = 0; i < list.size(); i++) {
				Element tag = list.get(i);
				System.out.println(tag.text());
				
			}
			Element tag = list.get(1);
			System.out.println(tag.text());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
