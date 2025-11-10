package com.hoan.algo2025.programmers.step0;

import java.util.Arrays;

/**
 * 머쓱이는 RPG게임을 하고 있습니다.
 * 게임에는 up, down, left, right 방향키가 있으며 각 키를 누르면
 * 위, 아래, 왼쪽, 오른쪽으로 한 칸씩 이동합니다.
 *
 * 예를 들어 [0,0]에서
 * up을 누른다면 캐릭터의 좌표는 [0, 1],
 * down을 누른다면 [0, -1],
 * left를 누른다면 [-1, 0],
 * right를 누른다면 [1, 0]입니다.
 *
 * 머쓱이가 입력한 방향키의 배열 keyinput와 맵의 크기 board이 매개변수로 주어집니다.
 * 캐릭터는 항상 [0,0]에서 시작할 때 키 입력이 모두 끝난 뒤에
 * 캐릭터의 좌표 [x, y]를 return하도록 solution 함수를 완성해주세요.
 *
 * [0, 0]은 board의 정 중앙에 위치합니다.
 * 예를 들어 board의 가로 크기가 9라면
 * 캐릭터는 왼쪽으로 최대 [-4, 0]까지 오른쪽으로 최대 [4, 0]까지 이동할 수 있습니다.
 *
 *
 * board은 [가로 크기, 세로 크기] 형태로 주어집니다.
 * board의 가로 크기와 세로 크기는 홀수입니다.
 * board의 크기를 벗어난 방향키 입력은 무시합니다.
 * 0 ≤ keyinput의 길이 ≤ 50
 * 1 ≤ board[0] ≤ 99
 * 1 ≤ board[1] ≤ 99
 * keyinput은 항상 up, down, left, right만 주어집니다.
 *
 *
 * keyinput	board	result
 * ["left", "right", "up", "right", "right"]	[11, 11]	[2, 1]
 * ["down", "down", "down", "down", "down"]	[7, 9]	[0, -4]
 *
 */
public class 캐릭터의_좌표 {
    public static void main(String[] args) {
//        String [] keyinput = {"left", "right", "up", "right", "right"};
//        int [] board = {11, 11};

        String [] keyinput = {"down", "down", "down", "down", "down"};
        int [] board = {7, 9};


        int[] solution = solution(keyinput, board);
        System.out.println(Arrays.toString(solution));
    }


    public static int[] solution(String[] keyinput, int[] board) {
        int x = 0;
        int y = 0;

        for(String key: keyinput) {

            if(key.equals("left") && ((board[0] / 2) * -1) <= (x - 1) ) {
                x = x - 1;
            }

            if(key.equals("right") && ((board[0] / 2)) >= (x + 1)) {
                x = x + 1;
            }

            if(key.equals("up") && ((board[1] / 2)) >= (y + 1)) {
                y = y + 1;
            }

            if(key.equals("down") && ((board[1] / 2) * -1) <= (y - 1)) {
                y = y - 1;
            }
        }

        return new int[]{x, y};
    }
}
