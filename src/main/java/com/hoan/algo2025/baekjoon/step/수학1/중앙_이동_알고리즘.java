package com.hoan.algo2025.baekjoon.step.수학1;

import java.util.Scanner;

public class 중앙_이동_알고리즘 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int [] arr = new int[16];
        arr[0] = 2;

        for(int i=1; i<arr.length; i++){
            arr[i] = (arr[i-1] * 2) -1;
         }


        System.out.println((long) Math.pow(arr[n], 2));

    }

//    public static void main(String[] args) throws Exception {
//        int n = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine().trim());
//        long side = (1L << n) + 1;   // 2^n + 1
//        long ans  = side * side;     // 정수 제곱
//        System.out.println(ans);
//    }

}
