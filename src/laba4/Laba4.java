package laba4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Laba4 {
    public static void main(String[] args) {
        String text = "(3 + 5)) – 9 × 4";
        System.out.println(checkBracket(text));
    }

    public static boolean checkBracket(String text) {
        int counter1 = 0;
        int counter2 = 0;
        Pattern pattern1 = Pattern.compile("(\\()");
        Matcher matcher1 = pattern1.matcher(text);
        Pattern pattern2 = Pattern.compile("(\\))");
        Matcher matcher2 = pattern2.matcher(text);
        while (matcher1.find()) {
            counter1++;
       }
        while (matcher2.find()) {
            counter2++;
        }
        if(counter1==counter2)return true;
        else return false;
    }

}
