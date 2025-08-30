package com.hoan.algo2025.baekjoon.basic100;

import java.util.Scanner;

public class _40_평균은_넘겠지 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int C = sc.nextInt();

        for(int i = 1; i <= C; i++){
            int studentCnt = sc.nextInt();
            int [] studentPoint = new int[studentCnt];

            for(int j=0; j<studentCnt; j++){
                studentPoint[j] = sc.nextInt();
            }

            String str = getAveragePercentage(studentPoint);
            sb.append(str).append("\n");
        }

        System.out.println(sb);
    }

    private static String getAveragePercentage(int[] studentPoint) {
        int sum = 0;
        int cnt = 0;
        for(int i = 0; i < studentPoint.length; i++){
            sum += studentPoint[i];
        }

        double average = (double) sum / studentPoint.length;

        for (int i = 0; i < studentPoint.length; i++) {
            if (studentPoint[i] > average) {
                cnt++;
            }
        }



        double result = Math.round((cnt / (double) studentPoint.length) * 100 * 1000) / 1000.0;
        return result + "%";    }




}
