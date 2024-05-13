package strings;

import java.util.List;

/**
 * 문자열 뒤집기
 * - 문자열을 뒤집는 함수를 작성
 * 조건
 *  - 입력 값은 문자 배열, 리턴 없이 입력 배열 내부를 직접 조작
 * */
public class ReverseText {

    public static void main(String[] args) {
        List<char[]> inputs = List.of(
                new char[]{'h', 'e', 'l', 'l', 'o'},
                new char[]{'1', '2', '3', '4'},
                new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'},
                new char[]{'문', '자', '열', '뒤', '집', '기'},
                new char[]{'l', 'e', 'v', 'e', 'l'}
        );

        for (char[] input : inputs) {
            System.out.println("input: " + String.valueOf(input) + ", output : " + String.valueOf(reverse(input)));
        }
    }

    /**
     * 시도
     * - 0 - n, 1 - n-1 과 같이 중간까지 문자열 스위칭
     * 풀이
     * -
     * */
    public static char[] reverse(final char [] input) {
        var middle = input.length / 2;
        var end = input.length - 1;

        for (int i = 0; i < middle; i++) {
            var temp = input[i];
            input[i] = input[end];
            input[end] = temp;
            end--;
        }

        return input;
    }

}
