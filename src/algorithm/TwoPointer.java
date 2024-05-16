package algorithm;

import java.util.IllegalFormatCodePointException;

/**
 * 투 포인터 알고리즘
 * - 1차원 배열에서 각자 다른 원소를 가리키는 2개의 포인터를 사용하여 목표값을 구함.
 * - O(n2) -> O(n)으로 시간 복잡도 향상 가능
 * - !!연속된 구간의 원소를 처리하거나, 정렬된 배열에서 사용 가능
 * */
public class TwoPointer {

    public static void main(String[] args) {
        var numbers = new int[]{1, 3, 6, 5, 2, 7 ,9};
        var target = 9;

        var left = 0;
        var right = 0;
        var sum = 0;

        // left, right : 두개의 포인터
        // 현재 구간의 합이 x 보다 크거나 같다면 left++
        //  - left의 포인터가 이동할 때는 빼주기
        // 현재 구간의 합이 x 보다 작다면 right++

        // 결론은 end가 처음부터 끝까지 순회하므로 시간 복잡도는 O(n)와 동일
        while (right < numbers.length) {
            System.out.println(left + ", " + right + " = " + sum);

            if (sum < target) {
                sum += numbers[right];
                right++;
            } else {
                if (sum == target) {
                    System.out.println(left + ", " + right);
                }
                sum -= numbers[left];
                left++;
            }
        }
    }
}
