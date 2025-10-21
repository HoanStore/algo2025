package com.hoan.algo2025.programmers.step0;

import java.math.BigInteger;

public class 두_수의_합 {

    public static void main(String[] args) {
        String a = "18446744073709551615";
        String b = "287346502836570928366";

        String solution = solution(a, b);

        System.out.println("solution = " + solution);

    }

    public static String solution(String a, String b) {

        BigInteger aBig = new BigInteger(a);
        BigInteger bBig = new BigInteger(b);

        return String.valueOf(aBig.add(bBig));
    }
}
