package com.hoan.algo2025.programmers.step0;

/**
 * my_string	result
 * "3 + 4"	7
 */
public class 문자열_계산하기 {
    public static void main(String[] args) {
        // String my_string = "3 + 4";
        String my_string = "3 + 4 - 1";
        int solution = solution(my_string);

        System.out.println("solution = " + solution);
    }

    public static int solution(String my_string) {
        String[] s = my_string.split(" ");
        int answer = Integer.parseInt(s[0]);

        for(int i=1; i<s.length; i++) {
            if(s[i].equals("+")) {
                answer += Integer.parseInt(s[i+1]);
            } else if(s[i].equals("-")) {
                answer -= Integer.parseInt(s[i+1]);
            }
        }
        return answer;
    }
}
