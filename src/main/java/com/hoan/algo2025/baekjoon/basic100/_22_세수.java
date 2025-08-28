package com.hoan.algo2025.baekjoon.basic100;

import java.util.PriorityQueue;
import java.util.Scanner;

public class _22_세수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Integer> pq = new PriorityQueue<>();


        pq.add(sc.nextInt());
        pq.add(sc.nextInt());
        pq.add(sc.nextInt());

        pq.poll();
        System.out.println(pq.poll());

    }
}
