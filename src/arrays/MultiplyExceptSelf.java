package arrays;

/**
 * 자신을 제외한 배열의 곱
 * - 배열을 입력받아 output[i]가 자신을 제외한 나머지 모든 엘리먼트의 곱셈 결과가 되도록 출력
 * 조건
 *  - 나눗셈을 하지 않고 O(n)에 풀이
 * */

public class MultiplyExceptSelf {

    public static void main(String[] args) {
        var numbers = new int[]{1, 3, 5, 7};

        var result = multiply(numbers);

        for (int number : result) {
            System.out.print(number + " ");
        }
    }

    /**
     * 시도
     * - 못풀었다..
     * 풀이
     * - 순서대로 곱셈하는 왼쪽 곱셈을 구하고, 역순으로 곱셈하는 오른쪽 곱셈을 곱해 줌.
     * 회고
     * - 어려웠다..
     * */
    public static int[] multiply(int[] numbers) {
        var result = new int[numbers.length];

        int p = 1;
        for(int i = 0; i < numbers.length; i++) {
            result[i] = p;
            p *= numbers[i];
        }

        p = 1;
        for (int i = numbers.length - 1; i >= 0; i--) {
            result[i] *= p;
            p *= numbers[i];
        }

        return result;
    }
}