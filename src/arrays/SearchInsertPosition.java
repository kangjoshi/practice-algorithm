package arrays;

import java.util.Arrays;

/**
 * Search Insert Position
 * - 중복이 없고 정렬 되어 있는 배열, 숫자가 주어 졌을 때 해당 숫자의 index를 구하라. 만약 index가 없다면 숫자가 들어갈 위치를 반환
 * 조건
 *  - O(log n) 알고리즘을 만들어야 한다.
 * */

public class SearchInsertPosition {

    public static void main(String[] args) {

        var nums = new int[]{1, 3, 5, 6, 7, 8, 9};
        var target = 0;

        var result = searchInsert(nums, target);

        System.out.println(result);
    }

    /**
     * 시도
     * - 주어진 배열을 절반씩 분할하면서 알맞은 배열 그룹(?) 찾기, 더 이상 배열을 분할 할 수 없다면 index 계산
     * 풀이
     * -
     * 회고
     * - 작은 단위로 문제를 쪼개서 생각 했더니 좀 더 풀기 수월 했다.
     * */
    public static int searchInsert(int[] nums, int target) {
        return divide(nums, target, 0);
    }

    public static int divide(int[] nums, int target, int index) {

        if (nums.length == 1) {
            if (nums[0] == target || nums[0] > target) {
                return index;
            } else {
                return index + 1;
            }
        }

        var harf = nums.length / 2;
        if (target >= nums[harf]) {
            return divide(Arrays.copyOfRange(nums, harf, nums.length), target, index + harf);
        }

        return divide(Arrays.copyOfRange(nums, 0, harf), target, index);
    }

}
