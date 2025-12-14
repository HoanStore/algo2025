package com.hoan.algo2025.baekjoon.step.집합과_맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 4
 * Baha enter
 * Askar enter
 * Baha leave
 * Artem enter
 *
 * Askar
 * Artem
 */
public class 회사에_있는_사람 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Set<String> set = new TreeSet<>(Collections.reverseOrder());

        for(int i = 0; i < N; i++){
            String [] entres = br.readLine().split(" ");

            if(entres[1].equals("enter")) {
                set.add(entres[0]);
            } else {
                set.remove(entres[0]);
            }
        }

        for (String s : set) {
            System.out.println(s);
        }

    }
}
