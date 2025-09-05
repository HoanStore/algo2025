package com.hoan.algo2025.baekjoon.basic100;

import java.io.*;

public class _61_A_PLUS_B_6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for(int i=0; i<N; i++){
            String[] split = br.readLine().split(",");
            bw.write((Integer.parseInt(split[0])+Integer.parseInt(split[1]))+"\n");
        }

        bw.flush();
        bw.close();

    }
}
