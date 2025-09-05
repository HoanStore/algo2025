package com.hoan.algo2025.baekjoon.basic100;

import java.io.*;
import java.util.Scanner;

public class _58_A_PLUB_B_4 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        while (input.hasNextInt()) {
            int A = input.nextInt();
            int B = input.nextInt();
            System.out.println(A + B);
        }

        input.close();

    }
}
