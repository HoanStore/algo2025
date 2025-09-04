package com.hoan.algo2025.baekjoon.basic100;

import java.io.*;

public class _53_빠른_A_PLUS_B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for(int i=0;i<N;i++) {
            String[] s = br.readLine().split(" ");

            bw.append(Integer.parseInt(s[0])+Integer.parseInt(s[1])+"");
            bw.append("\n");

        }

        bw.flush();
        bw.close();
    }
}
