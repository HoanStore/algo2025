package com.hoan.algo2025.baekjoon.basic100;

import java.util.Scanner;

public class _48_상수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num1 = sc.next();
        String num2 = sc.next();

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for(int i=num1.length()-1;i>=0;i--){
            sb1.append(num1.charAt(i));
        }

        for(int i=num2.length()-1;i>=0;i--){
            sb2.append(num2.charAt(i));
        }

        if(Integer.parseInt(sb1.toString()) > Integer.parseInt(sb2.toString())){
            System.out.println(sb1);
        } else {
            System.out.println(sb2);
        }



    }
}
