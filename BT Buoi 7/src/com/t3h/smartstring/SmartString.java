package com.t3h.smartstring;

import java.util.ArrayList;

public class SmartString {
    private String text;

    public SmartString(String text) {
        this.text = text;
    }

    public int dem(String str){
        return str.length();
    }

    public void filter(){
        ArrayList<News> arr= new ArrayList<>();
        String[] str = text.split("</item>");
        for (String s:str) {
            try{
            String title = s.substring(s.indexOf("<title>")+dem("<title><![CDATA["),s.indexOf("]]></title>"));
            String linkDetail = s.substring(s.indexOf("<link>")+dem("<link><![CDATA["),s.indexOf("]]></link>"));
            String imgLink = s.substring(s.indexOf("<img src=")+dem("<img src=\""),s.indexOf("/></a>"));
            String date = s.substring(s.indexOf("<pubDate>")+dem("<pubDate><![CDATA["),s.indexOf("]]></pubDate>"));
            News n = new News(title, linkDetail,imgLink,date);
            arr.add(n);
            }catch(StringIndexOutOfBoundsException ex){
                ex.printStackTrace();
            }
        }
        for (News n:arr) {
            n.inThongTin();
        }
    }



}
