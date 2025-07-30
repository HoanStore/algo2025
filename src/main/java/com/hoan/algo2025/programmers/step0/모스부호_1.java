package com.hoan.algo2025.programmers.step0;

import java.util.HashMap;
import java.util.Map;

public class 모스부호_1 {
    public static void main(String[] args) {
//        String letter = ".... . .-.. .-.. ---";
        String letter = ".--. -.-- - .... --- -.";
        String solution = solution(letter);

        System.out.println("solution = " + solution);
    }

    public static String solution(String letter) {
        Map<String, String> morse = new HashMap<>();

        morse.put(".-", "a");
        morse.put("-...", "b");
        morse.put("-.-.", "c");
        morse.put("-..", "d");
        morse.put(".", "e");
        morse.put("..-.", "f");
        morse.put("--.", "g");
        morse.put("....", "h");
        morse.put("..", "i");
        morse.put(".---", "j");
        morse.put("-.-", "k");
        morse.put(".-..", "l");
        morse.put("--", "m");
        morse.put("-.", "n");
        morse.put("---", "o");
        morse.put(".--.", "p");
        morse.put("--.-", "q");
        morse.put(".-.", "r");
        morse.put("...", "s");
        morse.put("-", "t");
        morse.put("..-", "u");
        morse.put("...-", "v");
        morse.put(".--", "w");
        morse.put("-..-", "x");
        morse.put("-.--", "y");
        morse.put("--..", "z");

        StringBuilder sb = new StringBuilder();

        for(String token: letter.split(" ")) {
            sb.append(morse.get(token));
        }

        return sb.toString();
    }
}
