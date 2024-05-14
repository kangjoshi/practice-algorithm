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
            System.out.print("input: " + String.valueOf(input));
            reverse(input);
            System.out.println(", reversed: " + String.valueOf(input));
        }
    }

    /**
     * 시도
     * - 0 - n, 1 - n-1 과 같이 중간까지 문자열 스위칭
     * 풀이
     * - while(start < end)을 사용 start++, end-- start와 end가 중앙에서 만날 때 까지
     * 회고
     * - 새로운 인스턴스를 반환하는게 아닌 경우 void로 지정 해야 되느게 맞는거 같기도?
     * */
    public static void reverse(final char [] input) {
        var middle = input.length / 2;
        var end = input.length - 1;

        for (int i = 0; i < middle; i++) {
            var temp = input[i];
            input[i] = input[end];
            input[end] = temp;
            end--;
        }
    }

}
