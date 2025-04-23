package com.hoan.algo2025.baekjoon.step.일차원_배열;

//5 4
//1 2
//3 4
//1 4
//2 2

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * 도현이는 바구니를 총 N개 가지고 있고, 각각의 바구니에는 1번부터 N번까지 번호가 순서대로 적혀져 있다.
 * 바구니는 일렬로 놓여져 있고, 가장 왼쪽 바구니를 1번째 바구니, 그 다음 바구니를 2번째 바구니, ..., 가장 오른쪽 바구니를 N번째 바구니라고 부른다.
 *
 * 도현이는 앞으로 M번 바구니의 순서를 역순으로 만들려고 한다.
 * 도현이는 한 번 순서를 역순으로 바꿀 때, 순서를 역순으로 만들 범위를 정하고, 그 범위에 들어있는 바구니의 순서를 역순으로 만든다.
 *
 * 바구니의 순서를 어떻게 바꿀지 주어졌을 때, M번 바구니의 순서를 역순으로 만든 다음, 바구니에 적혀있는 번호를 가장 왼쪽 바구니부터 출력하는 프로그램을 작성하시오.
 */
public class 바구니_뒤집기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int [] ints = new int[N];

        IntStream.range(0, ints.length).forEach(i -> ints[i] = i+1);

        for(int i=0; i<M; i++) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            reverseSubarray(ints, num1-1, num2-1);
        }
        IntStream.range(0, ints.length).forEach(i -> System.out.print(ints[i]+" "));
    }

    static void reverseSubarray(int[] arr, int a, int b) {
        while (a < b) {
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
            a++;
            b--;
        }
    }
}
