package laba3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Laba3 {
    public static void main(String[] args) {
        String text = "255.255.255.0";
        System.out.println(preOrPri(text));
    }

    public static boolean preOrPri(String text) {
        return text.matches("^(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$");
    }
}
