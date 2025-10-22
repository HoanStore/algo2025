package com.hoan.algo2025.programmers.step0;

import java.util.ArrayList;
import java.util.List;

/**
 * 직사각형 형태의 그림 파일이 있고,
 * 이 그림 파일은 1 × 1 크기의 정사각형 크기의 픽셀로 이루어져 있습니다.
 * 이 그림 파일을 나타낸 문자열 배열 picture과 정수 k가 매개변수로 주어질 때,
 * 이 그림 파일을 가로 세로로 k배 늘린 그림 파일을 나타내도록 문자열 배열을 return 하는 solution 함수를 작성해 주세요.
 *
 *
 * 제한사항
 * 1 ≤ picture의 길이 ≤ 20
 * 1 ≤ picture의 원소의 길이 ≤ 20
 * 모든 picture의 원소의 길이는 같습니다.
 * picture의 원소는 '.'과 'x'로 이루어져 있습니다.
 * 1 ≤ k ≤ 10
 *
 *
 *
 */
public class 그림_확대 {
    public static void main(String[] args) {

        String [] picture = {".xx...xx.", "x..x.x..x", "x...x...x", ".x.....x.", "..x...x..", "...x.x...", "....x...."};
        int k = 2;

        String[] solution = solution(picture, k);

        for (String s : solution) {
            System.out.println(s);
        }
    }


    public static String[] solution(String[] picture, int k) {

        List<String> myAnswer = new ArrayList<>();

        for(int i = 0; i < picture.length; i++){
            StringBuilder sb = new StringBuilder();
            for(int j=0; j<picture[i].length(); j++){
                for(int z=0; z<k; z++) {
                    sb.append(picture[i].charAt(j));
                }
            }

            for(int j=0; j<k; j++) {
                myAnswer.add(sb.toString());
            }

            sb.setLength(0);
        }

        return myAnswer.stream().toArray(String[]::new);
    }

}
