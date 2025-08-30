package com.hoan.algo2025.baekjoon.basic100;

import java.util.Scanner;

/**
 * 기수정렬과 비슷한 기법 사용
 */
public class _38_알파벳_찾기 {
    public static void main(String[] args) {
        int [] alpa = new int[26];

        for(int i = 0; i < alpa.length; i++){
            alpa[i] = -1;
        }

        Scanner sc = new Scanner(System.in);

        String word = sc.next();

        for(int i=0; i<word.length(); i++){
            int alpaIndex = (int) word.charAt(i) - 97;

            if(alpa[alpaIndex] == -1) {
                alpa[alpaIndex] = i;
            }
        }

        for (int num : alpa) {
            System.out.print(num+" ");
        }

    }
}
