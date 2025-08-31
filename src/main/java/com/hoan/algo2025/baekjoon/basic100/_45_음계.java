package com.hoan.algo2025.baekjoon.basic100;

import java.util.Scanner;

public class _45_음계 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String ascending = "1 2 3 4 5 6 7 8";
        String descending = "8 7 6 5 4 3 2 1";


        String str = sc.nextLine().trim();

        if(str.equals(ascending)){
            System.out.println("ascending");
        } else if(str.equals(descending)){
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }


    }
}
