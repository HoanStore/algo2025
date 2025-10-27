package com.hoan.algo2025.programmers.step0;

/**
 * 문제 설명
 * 2차원 좌표 평면에 변이 축과 평행한 직사각형이 있습니다.
 * 직사각형 네 꼭짓점의 좌표 [[x1, y1], [x2, y2], [x3, y3], [x4, y4]]가 담겨있는 배열 dots가 매개변수로 주어질 때,
 * 직사각형의 넓이를 return 하도록 solution 함수를 완성해보세요.
 *
 * 제한사항
 * dots의 길이 = 4
 * dots의 원소의 길이 = 2
 * -256 < dots[i]의 원소 < 256
 * 잘못된 입력은 주어지지 않습니다.
 * 입출력 예
 * dots	result
 * [[1, 1], [2, 1], [2, 2], [1, 2]]	1
 * [[-1, -1], [1, 1], [1, -1], [-1, 1]]	4
 */
public class 직사각형_넓이_구하기 {
    public static void main(String[] args) {
        // int[][] dots = {{1, 1}, {2, 1}, {2, 2}, {1, 2}};
        int[][] dots = {{-1, -1}, {1, 1}, {1, -1}, {-1, 1}};

        int solution = solution(dots);

        System.out.println("solution = " + solution);
    }

    public static int solution(int[][] dots) {
        int adjacent = dots[0][0] == dots[1][0] ? Math.abs(dots[0][0] - dots[2][0]) : Math.abs(dots[0][0] - dots[1][0]);
        int opposite = dots[0][1] == dots[1][1] ? Math.abs(dots[0][1] - dots[2][1]) : Math.abs(dots[0][1] - dots[1][1]);

        return adjacent * opposite;
    }
}
