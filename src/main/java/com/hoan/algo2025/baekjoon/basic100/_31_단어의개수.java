package com.hoan.algo2025.baekjoon.basic100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class _31_단어의개수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine().trim();
        String [] lineParts = line.split(" ");

        if(line.length() == 0) {
            System.out.println(0);
        } else {
            System.out.println(lineParts.length);
        }
    }
}
