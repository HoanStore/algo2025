package com.hoan.algo2025.baekjoon.step.브루트_포스;

import java.util.Scanner;

/**
 * 아이디어)
 * 첫번째가 B일때와, W일때로 가정해서
 * 다시 칠해야 하는 숫자를 계산
 * 그 중 작은 수가 정답
 */
public class 체스판_다시_칠하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        char [][] arr = new char[N][M];

        for(int i=0; i<N; i++){
            String line = sc.next();
            for(int j=0; j<line.length(); j++){
                arr[i][j]=line.charAt(j);
            }
        }

        int num1 = countChess(arr, 'B');
        int num2 = countChess(arr, 'W');

        System.out.println(Math.min(num1, num2));

    }

    private static int countChess(char[][] arr, char startChar) {
        int count = 0;
        char currentChar = startChar;

        for(int i=0; i<arr.length; i++){
            if(i % 2 == 0) {
                currentChar = startChar;
            } else {
                currentChar = startChar == 'B' ? 'W' : 'B';
            }


            for(int j=0; j<arr[0].length; j++){
                if(currentChar!=arr[i][j]) {
                    count++;
                }

                if(currentChar=='B') {
                    currentChar = 'W';
                } else {
                    currentChar = 'B';
                }
            }
        }

        return count;
    }

    private static void printArr(char[][] arr) {
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
