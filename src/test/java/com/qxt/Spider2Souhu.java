package com.qxt;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.qxt.cms.util.FileUtilIO;

public class Spider2Souhu {
	
	public static void main(String[] args) throws IOException {
		Document doc = Jsoup.connect("http://news.sohu.com/").get();
//		System.out.println(doc);
		Elements select = doc.select(".list16");
		for (Element div : select) {
//			System.out.println(div);
			Elements select2 = div.select("a[href]");
			for (Element a : select2) {
//				System.out.println(a);
				String title = a.attr("title");
				title = title.replace("|", "").replace("*", "").replace("\"", "").replace("?", "").replace("/", "")
						.replace("\\", "").replace(">", "").replace("<", "").replace(":", "");
//				System.out.println(title);
				String url = a.attr("href");
				if(!url.startsWith("http")) {
					url="http:"+url;
				}
				if(!url.contains("subject")&&!url.contains("sports")) {
					System.out.println(url);
					Document document = Jsoup.connect(url).get();
					Elements select3 = document.select("article");
					String content = null;
					for (Element art : select3) {
//					System.out.println(art.text());
						content = art.text();
						
					}
					FileUtilIO.writeFile("F:/news/"+title+".txt", content, "utf8");
				}
			}
			
		}

	}

}