package com.hoan.algo2025.programmers.step0;

import java.util.Arrays;

public class A로_B만들기 {
    public static void main(String[] args) {
        String before = "olleh";
        String after = "hello";

//        String before = "allpe";
//        String after = "apple";

        int solution = solution(before, after);

        int otherSolution = otherSolution(before, after);

        System.out.println("solution = " + solution);
        System.out.println("otherSolution = " + otherSolution);
    }

    public static int solution(String before, String after) {

        int [] alpa = new int[26];

        for(char c : before.toCharArray()) {
            alpa[c - 'a']++;
        }

        for(char c : after.toCharArray()) {
            alpa[c - 'a']--;
        }

        for (int num : alpa) {
            if(num != 0) {
                return 0;
            }
        }
        return 1;
    }

    public static int otherSolution(String before, String after) {
        char[] a = before.toCharArray();
        char[] b = after.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b) ? 1 : 0;
    }
}
