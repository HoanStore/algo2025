package com.hoan.algo2025.baekjoon.basic100;

import java.util.Scanner;

// 배열의 합을 일단 구함
// 첫번째 인덱스부터 시작해서 합을 구함
// 만약 기존에 구한 값보다 큰 값이 있으면 변수에 그 값을 넣음.

public class _63_연속합 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] nums = new int[n];
        int maxSum = 0;

        for(int i=0;i<n;i++){
            int temp = sc.nextInt();
            nums[i] = temp;
            maxSum += temp;
        }

        for(int i=0; i<n;i++) {
            int tempSum = 0;
            for(int j=i; j<n; j++) {
                tempSum += nums[j];

                if(tempSum > maxSum) {
                    maxSum = tempSum;
                }
            }
        }
        System.out.println(maxSum);

    }
}
