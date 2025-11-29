package com.hoan.algo2025.gpt.recursion;

/**
 * fibonacci(n) = f(n-1) + f(n-2)
 */
public class Fibonacchi {
    public static void main(String[] args) {
        int N = 20;
        int answer = fibonacchi(N);
        System.out.println(answer);
    }

    private static int fibonacchi(int n) {
        if(n <= 1) return n;
        return fibonacchi(n-1) + fibonacchi(n-2);
    }
}
