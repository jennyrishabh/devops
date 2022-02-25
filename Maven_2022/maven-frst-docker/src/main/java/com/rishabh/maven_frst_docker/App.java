package com.rishabh.maven_frst_docker;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;




/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        //System.out.println( "Hello World!" );
    	if(args.length < 1) {
    		System.out.println("plz provide an valid url : ");
    	}
    	else {
    		String url = args[0];
    		for(String link : getUrls(url)) {
    			System.out.println(link);
    		}
    		
    		
    	}
    	
    	
    }

	private static Set<String> getUrls(String url) throws IOException {
		// TODO Auto-generated method stub
		
		Document doc = Jsoup.connect(url).data("query", "docker").userAgent("Mozilla")
				.cookie("auth", "token").timeout(3000).get();
		
		Set<String> links = new HashSet<>();
		Elements e  = doc.select("a[href]");
		for(Element element : e) {
			links.add(element.attr("href"));
		}
		
		
		return links;
	}
}
