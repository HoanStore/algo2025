package com.hoan.algo2025.programmers.step0;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * 문제 설명
 * 정수 배열 date1과 date2가 주어집니다.
 * 두 배열은 각각 날짜를 나타내며 [year, month, day] 꼴로 주어집니다.
 * 각 배열에서 year는 연도를, month는 월을, day는 날짜를 나타냅니다.
 *
 * 만약 date1이 date2보다 앞서는 날짜라면 1을, 아니면 0을 return 하는 solution 함수를 완성해 주세요.
 *
 * 제한사항
 * date1의 길이 = date2의 길이 = 3
 * 0 ≤ year ≤ 10,000
 * 1 ≤ month ≤ 12
 * day는 month에 따라 가능한 날짜로 주어집니다.
 */
public class 날짜_비교하기 {

    public static void main(String[] args) {
//        int [] date1 = {2021, 12, 28};
//        int [] date2 = {2021, 12, 29};

        int [] date1 = {1024, 10, 24};
        int [] date2 = {1024, 10, 24};

        int solution = solution(date1, date2);

        System.out.println("solution = " + solution);
    }

    public static int solution(int[] date1, int[] date2) {

        LocalDate dateType1 = LocalDate.of(date1[0], date1[1], date1[2]);
        LocalDate dateType2 = LocalDate.of(date2[0], date2[1], date2[2]);

        return dateType1.isBefore(dateType2) ? 1 : 0;
    }
}
