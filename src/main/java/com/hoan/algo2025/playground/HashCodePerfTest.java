package com.hoan.algo2025.playground;

import java.util.HashMap;
import java.util.Map;

public class HashCodePerfTest {
    private static final int SIZE = 1_000_000;
    private static final int ITERATIONS = 50;

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < SIZE; i++) {
            map.put("Key" + i, i);
        }

        long start = System.nanoTime();
        for (int t = 0; t < ITERATIONS; t++) {
            for (int i = 0; i < SIZE; i++) {
                map.get("Key" + i);
            }
        }
        long end = System.nanoTime();
        System.out.printf("총 소요 시간: %.2fms%n", (end - start) / 1_000_000.0);
    }
}


