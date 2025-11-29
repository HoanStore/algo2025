package com.hoan.algo2025.baekjoon.step.기하_1;

import java.util.Arrays;
import java.util.Scanner;

public class 셰_막대 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int [] arr = new int[3];

        arr[0] = a;
        arr[1] = b;
        arr[2] = c;

        Arrays.sort(arr);

        int answer = arr[0];
        answer += arr[1];

        answer += Math.min(arr[0] + arr[1] - 1, arr[2]);
        System.out.println(answer);

    }
}
