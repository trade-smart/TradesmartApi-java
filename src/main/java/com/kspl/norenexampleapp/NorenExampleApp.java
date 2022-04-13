/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.kspl.norenexampleapp;

import com.noren.javaapi.NorenApiJava;
import org.json.JSONArray;
import org.json.JSONObject;


/**
 *
 * @author itsku
 */
public class NorenExampleApp {

    public static void main(String[] args) {
        System.out.println("Hello and Welcom to Noren World!");
        NorenApiJava api = new com.noren.javaapi.NorenApiJava("http://kurma.kambala.co.in:9959/NorenWClient/");
        
        String response = api.login("MOBKUMAR", "Zxc@1234", "01-01-1970", "IDART_DESK", "12be8cef3b1758f5", "java-");
        System.out.println(response);
            
        JSONObject search_reply = api.search("NSE", "TCS"); 
        System.out.println(search_reply.toString());
        
        JSONObject reply = api.place_order("B","I", "NSE", "CANBK-EQ", 1, 0, "L", 220.0, "java", null, null, null, null, null, null); 
        System.out.println(reply.toString());
        
        JSONArray book; 
        book = api.get_order_book();
        System.out.println(book.toString());
        
        book = api.get_trade_book(); 
        if(book != null)
            System.out.println(book.toString());
        
        
    }
}
