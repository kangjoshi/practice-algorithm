package arrays;

import java.util.*;

/**
 * Relative Ranks
 * - n 크기를 가지는 score 배열이 주어졌을 때 랭킹을 구해라.
 * - 1등은 Gold Medal, 2등은 Silver Medal 3등은 Bronze Medal 4등 부터는 xth로 출력
 * 조건
 *  - 각 score는 중복되지 않음.
 * */

public class RelativeRanks {

    public static void main(String[] args) {
        var scores = new int[]{4, 3, 5, 2, 1};

        var result = relativeRanks(scores);

        System.out.println(result);

    }

    /**
     * 시도
     * - 정렬 후 인덱스로 위치를 찾기
     * 풀이
     * -
     * 회고
     * - 이차원 배열로 값과 index를 저장 하는 기법은 많이 쓰일 것 같다!
     * */
    public static String[] relativeRanks(int[] score) {
        var result = new String[score.length];

        var pairs = new int[score.length][2];
        for (int i = 0; i < score.length; i++) {
            pairs[i][0] = score[i];
            pairs[i][1] = i;
        }

        Arrays.sort(pairs, (a, b) -> b[0] - a[0]);

        for (int i = 0; i < pairs.length; i++) {
            result[pairs[i][1]] = convert(i + 1);
        }

        return result;
    }

    public static String convert(int rank) {
        if (rank == 1){
            return "Gold Medal";
        } else if (rank == 2){
            return "Silver Medal";
        } else if(rank == 3) {
            return "Bronze Medal";
        }

        return rank + "";
    }
}
