package com.paflab3.sliit_paf;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class GetgreetingsApplication{

     private static String baseURL = "http://localhost:9090/";

     private static String defaultGreetingURL = "greeting";
     private static String namedGreetingURL = "greeting/name?name=hasi";

     public static void main(String[] args){}

     private static RestTemplate getHttpClient(){}

     private static Greeting getGreeting (String url){}

     private static Greeting getGreetingByName (String url){}

     private static void makeCalls(){}
     


}
