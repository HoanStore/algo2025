package com.hoan.algo2025.programmers.step0;

/**
 * 이차원 정수 배열 arr이 매개변수로 주어집니다.
 * arr의 행의 수가 더 많다면 열의 수가 행의 수와 같아지도록 각 행의 끝에 0을 추가하고,
 * 열의 수가 더 많다면 행의 수가 열의 수와 같아지도록
 * 각 열의 끝에 0을 추가한 이차원 배열을 return 하는 solution 함수를 작성해 주세요.
 *
 *
 * 1 ≤ arr의 길이 ≤ 100
 * 1 ≤ arr의 원소의 길이 ≤ 100
 * arr의 모든 원소의 길이는 같습니다.
 * 1 ≤ arr의 원소의 원소 ≤ 1,000
 *
 * [[572, 22, 37], [287, 726, 384], [85, 137, 292], [487, 13, 876]]
 *
 * [[572, 22, 37, 0], [287, 726, 384, 0], [85, 137, 292, 0], [487, 13, 876, 0]]
 *
 *
 */
public class 정사각형_만들기 {
    public static void main(String[] args) {
        int [][] arr = {{572, 22, 37}, {287, 726, 384}, {85, 137, 292}, {487, 13, 876}};

        int[][] solution = solution(arr);

        for (int[] ints : solution) {
            for (int anInt : ints) {
                System.out.print(anInt+" ");
            }
            System.out.println();
        }

    }

    public static int[][] solution(int[][] arr) {

        int maxNum = Math.max(arr.length, arr[0].length);
        int[][] answer = new int[maxNum][maxNum];

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                answer[i][j]=arr[i][j];
            }
        }

        return answer;
    }

    public static int[][] solution2(int[][] arr) {
        int maxNum = Math.max(arr.length, arr[0].length);
        int[][] answer = new int[maxNum][maxNum];

        for(int i=0; i<arr.length; i++){
            System.arraycopy(arr[i], 0, answer[i], 0, arr[i].length);
        }

        return answer;
    }
}
