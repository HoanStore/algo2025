package com.hoan.algo2025.baekjoon.basic100;

import java.util.Arrays;
import java.util.Scanner;

public class _35_수_정렬하기 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int [] nums = new int[N];

        for (int i = 0; i < N; i++) {
            nums[i] = input.nextInt();
        }

        Arrays.sort(nums);
        for (int num : nums) {
            System.out.println(num);
        }
    }
}
