package com.hoan.algo2025.baekjoon.basic100;

import java.util.Scanner;
import java.util.Stack;

// 스택 인터페이스에서 이미 제공하는 것들임
public class _36_스택 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Stack<Integer> stores = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<N;i++){
            String command =  sc.next();

            if(command.equals("push")){
                stores.push(sc.nextInt());
            } else if(command.equals("pop")){
                if(stores.isEmpty()){
                    sb.append("-1\n");
                } else {
                    sb.append(stores.pop()+"\n");
                }
            } else if(command.equals("top")){
                if(stores.isEmpty()){
                    sb.append("-1\n");
                } else {
                    sb.append(stores.peek()+"\n");
                }
            } else if(command.equals("size")){
                sb.append(stores.size()+"\n");
            } else if(command.equals("empty")){
                if(stores.isEmpty()){
                    sb.append("1\n");
                } else {
                    sb.append("0\n");
                }
            }
        }

        System.out.println(sb);
    }
}
