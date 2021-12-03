package laba1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Laba1 {
    public static void main(String[] args) {
        String text = "12, -23.3, sasdsa, 240.3 24 245.2";
        floatType(text);
    }

    public static void floatType(String text){
        Pattern pattern = Pattern.compile("-?\\d+\\.\\d+(e\\+(\\d+))?");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(text.substring(matcher.start(), matcher.end()));
        }

    }
}
