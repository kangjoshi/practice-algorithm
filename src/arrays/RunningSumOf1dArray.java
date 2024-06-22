package arrays;

/**
 * Running Sum of 1d Array
 * - Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
 *      Return the running sum of nums.
 * 조건
 *  -
 * */

public class RunningSumOf1dArray {

    /**
     * 시도
     * - O(n)에 푸는 것이 목표
     * - 누적합을 저장하고 있는 변수 하나만 있으면 될 것 으로 예상
     * 풀이
     * -
     * 회고
     * - 결과에서 공간 복잡도가 비교적 후반대인데.. O(1)이므로 특별히 개선 필요성은 없을 것 같다.
     * */
    public static void main(String[] args) {

        var nums = new int[]{1, 2, 3, 4};
        var result = new int[nums.length];

        var sum = 0;
        for (int i = 0; i < nums.length; i++) {
            result[i] = sum + nums[i];
            sum += nums[i];
        }

        System.out.println(result);
    }


}
