package com.company.study.strings;

import java.util.Scanner;

public class ReverseString {
    public static String reverseString(String str) {
        char[] strCharArray = str.toCharArray();
        for (int i = 0; i < strCharArray.length - i - 1; i++) {
            strCharArray[i] ^= strCharArray[strCharArray.length - i - 1];
            strCharArray[strCharArray.length - i - 1] ^= strCharArray[i];
            strCharArray[i] ^= strCharArray[strCharArray.length - i - 1];
        }
        return new String(strCharArray);
    }
}
