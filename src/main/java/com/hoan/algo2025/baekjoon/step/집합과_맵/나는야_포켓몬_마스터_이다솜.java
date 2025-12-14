package com.hoan.algo2025.baekjoon.step.집합과_맵;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// HashMap에 저장하겠음
// 두 쌍을 만든다.
// 하나에는 번호가 키, 이름이 값
// 하나는 이름이 키, 번호가 값
public class 나는야_포켓몬_마스터_이다솜 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Map<Integer, String> dbUseNumber = new HashMap<>();
        Map<String, Integer> dbUseName = new HashMap<>();


        for (int i = 1; i <= N; i++) {
            String name = sc.next();

            dbUseNumber.put(i, name);
            dbUseName.put(name, i);
        }

        for(int i=1; i<=M; i++){
            String ask = sc.next();

            boolean isNumber = ask.matches("-?\\d+");

            if(isNumber) {
                String answer = dbUseNumber.get(Integer.parseInt(ask));
                bw.write(answer+"\n");
            } else {
                String answer = String.valueOf(dbUseName.get(ask));
                bw.write(answer+"\n");
            }

        }

        bw.flush();
        bw.close();



    }
}
