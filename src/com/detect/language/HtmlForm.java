/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.detect.language;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author duylx
 */
public class HtmlForm {
    public HtmlForm(){};
    
    public static void main(String[] args) {
    final String str = "<tag>apple</tag><b>hello asdas ad^ #@$ !WE QEWQEQ A as **&&@ !!#~!</b><tag>orange</tag><tag>pear</tag><p>Le Xuan duy asbn asd asdnasdh asddmnadha  123 123n1n319@ !#@!#  12m313</p><p>Thời tiết sang thu cực kỳ\n" +
"\n" +
"lý tưởng để bữa tiệc lẩu nướng “hâm\n" +
"\n" +
"nóng” tình bạn và tình cảm gia\n" +
"\n" +
"đình bạn. Set cả lẩu và nướng được thiết kế\n" +
"\n" +
"giúp thực khách nếm thử những món đồ\n" +
"\n" +
"nướng và 3 loại lẩu được yêu thích nhất\n" +
"\n" +
"tại <b style=\"color:#ff4628\">King BBQ</b>.<br><br> Panchan miễn\n" +
"\n" +
"phí thay đổi theo ngày, thêm một chút cơm\n" +
"\n" +
"trộn, hay miến lạnh, hoặc bánh hải sản... là\n" +
"\n" +
"bạn có thể thưởng thức trọn vẹn những hương vị\n" +
"\n" +
"đặc trưng nhất của ẩm thực Hàn Quốc.</p>";
    System.out.println(Arrays.toString(getTagValues(str).toArray())); // Prints [apple, orange, pear]
}

private static final Pattern TAG_REGEX = Pattern.compile("<b>(.+?)</b>");

private static List<String> getTagValues(final String str) {
    final List<String> tagValues = new ArrayList<String>();
    final Matcher matcher = TAG_REGEX.matcher(str);
    while (matcher.find()) {
        tagValues.add(matcher.group(1).replaceAll("[^a-zA-Z0-9]", "").replaceAll("\\s", " "));
    }
    return tagValues;
}
}
