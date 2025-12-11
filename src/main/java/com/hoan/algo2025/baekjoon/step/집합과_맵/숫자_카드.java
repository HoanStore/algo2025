package com.hoan.algo2025.baekjoon.step.집합과_맵;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.*;

/**
 * 문제
 * 숫자 카드는 정수 하나가 적혀져 있는 카드이다.
 * 상근이는 숫자 카드 N개를 가지고 있다.
 * 정수 M개가 주어졌을 때, 이 수가 적혀있는 숫자 카드를 상근이가 가지고 있는지 아닌지를 구하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 상근이가 가지고 있는 숫자 카드의 개수 N(1 ≤ N ≤ 500,000)이 주어진다.
 * 둘째 줄에는 숫자 카드에 적혀있는 정수가 주어진다.
 * 숫자 카드에 적혀있는 수는 -10,000,000보다 크거나 같고, 10,000,000보다 작거나 같다.
 * 두 숫자 카드에 같은 수가 적혀있는 경우는 없다.
 *
 * 셋째 줄에는 M(1 ≤ M ≤ 500,000)이 주어진다.
 * 넷째 줄에는 상근이가 가지고 있는 숫자 카드인지 아닌지를 구해야 할 M개의 정수가 주어지며,
 * 이 수는 공백으로 구분되어져 있다.
 * 이 수도 -10,000,000보다 크거나 같고, 10,000,000보다 작거나 같다
 *
 * 출력
 * 첫째 줄에 입력으로 주어진 M개의 수에 대해서,
 * 각 수가 적힌 숫자 카드를 상근이가 가지고 있으면 1을, 아니면 0을 공백으로 구분해 출력한다.
 *
 *
 * 5
 * 6 3 2 10 -10
 * 8
 * 10 9 -5 2 3 4 5 -10
 *
 * 1 0 0 1 1 0 0 1
 *
 *
 * 아이디어)
 * 상근이가 가지고 있는 수들을
 * HashSet에 넣는다.
 * HashSet은 Integer,Integer로 구성
 *
 */
public class 숫자_카드 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        Set<Long> holdingCards = new HashSet<>();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for(long i = 1; i <= N; i++){
                long card = sc.nextLong();
                holdingCards.add(card);
        }

        long M = sc.nextLong();

        for(long i = 1; i <= M; i++){
            long card = sc.nextLong();
            if(holdingCards.contains(card)) {
                bw.write("1 ");
            } else {
                bw.write("0 ");
            }

        }

        bw.flush();
        bw.close();

    }
}
