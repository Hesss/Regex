package laba5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Laba5 {
    public static void main(String[] args) {
        String text = "съешь ещё этих мягких французских булок, да выпей чаю";
        System.out.println("Длина: " + text.length());
        System.out.println("Проверка на пунктуацию: " +isPunctuation(text));
        System.out.println("Проверка на палиндром: " +isPalindrome(text));
    }

    public static boolean isPalindrome(String text) {
        StringBuilder sb = new StringBuilder(text);
        sb.reverse();
        return text.equals(sb.toString());
    }

    public static boolean isPunctuation(String text) {
        Pattern pattern = Pattern.compile("\\p{Punct}");
        Matcher matcher = pattern.matcher(text);
        if(matcher.find())return true;
        else return false;
    }
}
