package arrays;

import java.util.Arrays;

/**
 * 배열 파티션 1
 * - n개의 페어를 이용한 min(a, b)의 합으로 만들 수 있는 가장 큰 수를 출력
 * 조건
 *  -
 * */

public class ArrayPartition {

    public static void main(String[] args) {
        var input = new int[]{1, 3, 4, 2};

        var sum = arrayPairSum(input);
        System.out.println(sum);
    }

    /**
     * 시도
     * - 정렬 후 홀수번째 값의 합을 구하면 될 것 같다.
     * 풀이
     * -
     * */
    public static int arrayPairSum(int[] nums) {
        if (nums.length == 2) {
            return Math.min(nums[0], nums[1]);
        }

        Arrays.sort(nums);
        var sum = 0;
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }
        return sum;
    }
}
