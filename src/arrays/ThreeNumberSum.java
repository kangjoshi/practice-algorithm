package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 세 수의 합
 * - 배열을 입력받아 합으로 0을 만들 수 있는 3개의 엘리먼트를 출력
 * 조건
 *  - 같은 값은 제거 되어야 함.
 * */

public class ThreeNumberSum {

    public static void main(String[] args) {
        var numbers = new int[]{-1, 0, 1, 2, -1, -5};
        var target = 0;

        var result = sum1(numbers, target);

        System.out.println(result);
    }

    /**
     * 시도
     * - 무식하게 O(n3)
     * - 투포인터로 개선
     * 풀이
     * -
     * */
    // 무식하게 풀어보기
    public static List<List<Integer>> sum1(int[] numbers, int target) {
        Arrays.sort(numbers);

        var result = new ArrayList<List<Integer>>();
        for (int i = 0; i < numbers.length - 2; i++) {
            if (i > 0 && numbers[i] == numbers[i - 1]) { // 중복 값을 막기 위해
                continue;
            }
            for (int j = i + 1; j < numbers.length - 1; j++) {
                if (j > i + 1 && numbers[j] == numbers[j - 1]) { // 중복 값을 막기 위해
                    continue;
                }
                for (int k = j + 1; k < numbers.length; k++) {
                    if (k > j + 1 && numbers[k] == numbers[k - 1]) { // 중복 값을 막기 위해
                        continue;
                    }
                    if (target == (numbers[i] + numbers[j] + numbers[k])) {
                        System.out.println(numbers[i] + " + " + numbers[j] + " + " + numbers[k]);
                        result.add(List.of(numbers[i], numbers[j], numbers[k]));
                    }
                }
            }
        }
        return result;
    }

    public static List<List<Integer>> sum2(int[] numbers, int target) {
        Arrays.sort(numbers);

        var result = new ArrayList<List<Integer>>();
        for (int i = 0; i < numbers.length - 2; i++) {

            // left, right

        }

        return null;
    }
}
