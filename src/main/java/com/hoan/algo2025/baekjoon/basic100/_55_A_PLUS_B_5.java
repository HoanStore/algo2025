package com.hoan.algo2025.baekjoon.basic100;

import java.io.*;

public class _55_A_PLUS_B_5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String [] s = br.readLine().split(" ");

            if(s[0].equals("0") && s[1].equals("0")) {
                break;
            }

            bw.write(Integer.parseInt(s[0])+Integer.parseInt(s[1])+"");
            bw.write("\n");
        }

        bw.flush();
        bw.close();

    }
}
