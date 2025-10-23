package com.hoan.algo2025.programmers.step0;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 영어 점수와 수학 점수의 평균 점수를 기준으로 학생들의 등수를 매기려고 합니다.
 * 영어 점수와 수학 점수를 담은 2차원 정수 배열 score가 주어질 때,
 * 영어 점수와 수학 점수의 평균을 기준으로 매긴 등수를 담은 배열을 return하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 * 0 ≤ score[0], score[1] ≤ 100
 * 1 ≤ score의 길이 ≤ 10
 * score의 원소 길이는 2입니다.
 * score는 중복된 원소를 갖지 않습니다.
 *
 *
 * score	result
 * [[80, 70], [90, 50], [40, 70], [50, 80]]	[1, 2, 4, 3]
 * [[80, 70], [70, 80], [30, 50], [90, 100], [100, 90], [100, 100], [10, 30]]	[4, 4, 6, 2, 2, 1, 7]
 *
 */
public class 등수_매기기 {
    public static void main(String[] args) {
        int [][] score = {{80, 70}, {90, 50}, {40, 70}, {50, 80}};
        // int [][] score = {{80, 70}, {70, 80}, {30, 50}, {90, 100}, {100, 90}, {100, 100}, {10, 30}};

        int[] solution = solution(score);

        System.out.println(Arrays.toString(solution));

    }

    public static int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        double [] averages = new double[score.length];
        double [] averagesForSort = new double[score.length];


        for(int i=0; i<score.length; i++){
            averages[i] = (double) (score[i][0] + score[i][1]) / 2;
        }

        System.arraycopy(averages, 0, averagesForSort, 0, averages.length);

        Arrays.sort(averagesForSort);

        HashMap<Double, Integer> map = new HashMap<>();

        int rank = 1;
        for(int i=averagesForSort.length-1; i>=0; i--){
            if(map.get(averagesForSort[i]) != null){
                rank++;
                continue;
            }
            map.put(averagesForSort[i], rank++);
        }

        for(int i=0; i<averages.length; i++){
            answer[i] = map.getOrDefault(averages[i], 0);
        }

        return answer;
    }
}
