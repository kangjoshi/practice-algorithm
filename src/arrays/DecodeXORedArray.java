package arrays;

/**
 * Decode XORed Array
 * - There is a hidden integer array arr that consists of n non-negative integers.
 * - It was encoded into another integer array encoded of length n - 1, such that encoded[i] = arr[i] XOR arr[i + 1]. For example, if arr = [1,0,2,1], then encoded = [1,2,3].
 * - given the encoded array. You are also given an integer first, that is the first element of arr, i.e. arr[0].
 * - Return the original array arr
 * 조건
 *  -
 * */

public class DecodeXORedArray {

    public static void main(String[] args) {

        var encoded = new int[]{1, 2, 3};
        var first = 1;

        var result = decode(encoded, first);
        System.out.println(result);
    }

    /**
     * 시도
     * - 순회하면서 이전 값과 현재 값을 xor 연산하여 결과 저장
     * 풀이
     * -
     * */
    public static int[] decode(int[] encoded, int first) {
        var result = new int[encoded.length + 1];
        result[0] = first;

        for (int i = 0; i < encoded.length; i++) {
            result[i + 1] = result[i] ^ encoded[i];
        }
        return result;
    }
}
