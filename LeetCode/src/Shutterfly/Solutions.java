package Shutterfly;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.io.UnsupportedEncodingException; 
import java.net.MalformedURLException; 
import java.net.URL; 
 

public class Solutions {

	public static void main(String args[]) throws MalformedURLException, UnsupportedEncodingException
	{
		 // base URL 
        String baseurl = "https://www.geeksforgeeks.org/?q="; 
  
        // String to be encoded 
        String query = "mobile"; 
  
        System.out.println("URL without encoding :"); 
        URL url = new URL(baseurl + query); 
        System.out.println(url); 
  
        // encode() method 
        System.out.println("URL after encoding :"); 
        url = new URL(baseurl + URLEncoder.encode(query, "UTF-8")); 
        System.out.println(url); 
	}
}
