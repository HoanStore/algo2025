package com.hoan.algo2025.baekjoon.step.기하_1;

import java.io.*;
import java.util.Arrays;

/**
 * 삼각형의 세 변의 길이가 주어질 때 변의 길이에 따라 다음과 같이 정의한다.
 *
 * Equilateral :  세 변의 길이가 모두 같은 경우
 * Isosceles : 두 변의 길이만 같은 경우
 * Scalene : 세 변의 길이가 모두 다른 경우
 * 단 주어진 세 변의 길이가 삼각형의 조건을 만족하지 못하는 경우에는 "Invalid" 를 출력한다.
 * 예를 들어 6, 3, 2가 이 경우에 해당한다. 가장 긴 변의 길이보다 나머지 두 변의 길이의 합이 길지 않으면 삼각형의 조건을 만족하지 못한다.
 *
 * 세 변의 길이가 주어질 때 위 정의에 따른 결과를 출력하시오.
 *
 *
 * 7 7 7
 * 6 5 4
 * 3 2 5
 * 6 2 6
 * 0 0 0
 * 
 * Equilateral
 * Scalene
 * Invalid
 * Isosceles
 */
public class 삼각형과_세_변 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String line = br.readLine();
            String[] s = line.split(" ");

            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);
            int c = Integer.parseInt(s[2]);

            int [] arr = new int[3];

            arr[0] = a;
            arr[1] = b;
            arr[2] = c;

            Arrays.sort(arr);

            if(a + b + c == 0) {
                break;
            }


            if(arr[0] + arr[1] < arr[2]) {
                bw.write("Invalid\n");
            } else if(a == b && a == c ) {
                bw.write("Equilateral\n");
            } else if( (a == b && b != c) || (a == c && b != c) || (b == c && a != b) ) {
                bw.write("Isosceles\n");
            } else if(a != b && b != c) {
                bw.write("Scalene\n");
            }
        }

        bw.flush();
        bw.close();
        
        

    }
}
