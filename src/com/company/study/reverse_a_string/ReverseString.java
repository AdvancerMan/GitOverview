package com.company.study.reverse_a_string;

import java.util.Scanner;

public class ReverseString {
    public static void test() {
        Scanner scan  = new Scanner(System.in);
        String str =  scan.next();
        StringBuilder reversedStr = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i++) {
            reversedStr.append(i);
        }
        System.out.println(reversedStr);
    }
}
