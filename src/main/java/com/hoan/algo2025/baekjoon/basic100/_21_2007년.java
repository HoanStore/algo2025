package com.hoan.algo2025.baekjoon.basic100;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class _21_2007년 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int month = sc.nextInt();
        int day = sc.nextInt();

        LocalDate localDate = LocalDate.of(2007, month, day);

        String ans = localDate.getDayOfWeek()
                .getDisplayName(TextStyle.SHORT, Locale.ENGLISH)
                .toUpperCase(Locale.ROOT);

        System.out.println(ans);
    }
}
