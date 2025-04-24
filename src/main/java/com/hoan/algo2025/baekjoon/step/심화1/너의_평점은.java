package com.hoan.algo2025.baekjoon.step.심화1;

import java.util.Scanner;

public class 너의_평점은 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0;
        double cal = 0;


        for(int i=0; i<20; i++) {
            String line = sc.nextLine();
            String[] words = line.split(" ");

            double point = Double.parseDouble(words[1]);
            double grade = changeToDouble(words[2]);

            if(!words[2].equals("P")) {
                total += point;
                cal += (point * grade);
            }



        }

        System.out.println(cal / total);

    }

    private static double changeToDouble(String word) {
        switch (word) {
            case "A+":
                return 4.5;
            case "A0":
                return 4.0;
            case "B+":
                return 3.5;
            case "B0":
                return 3.0;
            case "C+":
                return 2.5;
            case "C0":
                return 2.0;
            case "D+":
                return 1.5;
            case "D0":
                return 1.0;
            case "F":
                return 0.0;
            default:
                return 0.0;
        }
    }

}
