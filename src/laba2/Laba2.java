package laba2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Laba2 {
    public static void main(String[] args) {
        String text = "при и пре преисполнились в познании и привыкли к этому";
        preOrPri(text);
    }

    public static void preOrPri(String text){
        Pattern pattern = Pattern.compile("[пре][при]\\S*\\b");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(text.substring(matcher.start(), matcher.end()));
        }

    }
}
