package Homework3;

import java.util.Arrays;

public class test {

    public static void main(String[] args) {

        String myst = "11.44.77";
        String[] strArr = myst.split("\\.");
        for (String e : strArr) {
            System.out.println(e);
        }
//        String str = "I love Java";
//        String[] words = str.split(" ");
//        for (String word : words) {
//            System.out.println(word);
//        }

//        String s = "m";
//        System.out.println(s.equals("m"));

    }
}
