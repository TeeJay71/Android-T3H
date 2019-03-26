package com.t3h.smartstring;

public class Main {
    public static void main(String[] args) {
        SmartString smartString = new SmartString("    <item>\n" +
                "      <title><![CDATA[Dự án cao cấp quận Long Biên đã trở lại đường đua]]></title>\n" +
                "      <link><![CDATA[http://dantri.com.vn/nha-dat/du-an-cao-cap-quan-long-bien-da-tro-lai-duong-dua-20170612104930159.htm]]></link>\n" +
                "      <guid isPermaLink=\"false\"><![CDATA[aa072862-dc18-4bd6-8187-7cffe8e787c7]]></guid>\n" +
                "      <description><![CDATA[<a href=\"http://dantri.com.vn/nha-dat/du-an-cao-cap-quan-long-bien-da-tro-lai-duong-dua-20170612104930159.htm\"><img src=\"https://dantricdn.com/zoom/80_50/2017/untitled1-1497238454764.jpg\" /></a>]]></description>\n" +
                "      <pubDate><![CDATA[Mon, 12 Jun 2017 10:50:00 GMT+7]]></pubDate>\n" +
                "    </item>\n" +
                "    <item>\n" +
                "      <title><![CDATA[Dùng ảnh người khác tạo tài khoản Facebook bị phạt 10-20 triệu đồng]]></title>\n" +
                "      <link><![CDATA[http://dantri.com.vn/suc-manh-so/dung-anh-nguoi-khac-tao-tai-khoan-facebook-bi-phat-10-20-trieu-dong-2017061210513045.htm]]></link>\n" +
                "      <guid isPermaLink=\"false\"><![CDATA[f29f74f5-2194-4e17-a017-8382be0131f8]]></guid>\n" +
                "      <description><![CDATA[<a href=\"http://dantri.com.vn/suc-manh-so/dung-anh-nguoi-khac-tao-tai-khoan-facebook-bi-phat-10-20-trieu-dong-2017061210513045.htm\"><img src=\"https://dantricdn.com/zoom/80_50/2017/facebook-1497239322966.jpeg\" /></a>]]></description>\n" +
                "      <pubDate><![CDATA[Mon, 12 Jun 2017 10:50:00 GMT+7]]></pubDate>\n" +
                "    </item>\n");
        smartString.filter();
    }

}
