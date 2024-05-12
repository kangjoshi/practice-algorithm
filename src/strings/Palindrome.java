package strings;


import java.util.Arrays;
import java.util.stream.Collector;

/**
 * 유효한 팰린드롬
 * - 주어진 문자열이 팰린드롬인지 확인
 * 조건
 *  - 대소문자를 구분하지 않으며, 영문자와 숫자만을 대상으로 한다.
 * */

public class Palindrome {

    public static void main(String[] args) {

        var inputs = Arrays.asList("Do geese see God?",
                "level",
                "racecar",
                "A man, a plan, a canal, Panama!",
                "this is not palindromes");

        for (String input : inputs) {
            var palindrome = isPalindrome(input);
            System.out.println("입력: " + input + ", 결과: " + palindrome);
        }
    }

    /**
     * 시도
     * - 입력된 문자열에서 영문자, 숫자를 제외한 문자열은 제거
     * - 문자열의 시작과 끝부터 비교해가면서, 중간 위치의 문자까지 동일하다면 true 아니라면 false
     * 풀이
     * - 방법 1. 시도와 동일
     * - 방법 2. 허용하는 문자열로 이루어진 문자열로 만들어 두고 뒤집은 문자열과 동일 여부로 판단.
     * */
    public static boolean isPalindrome(String text) {
        // note: 문자열을 만드는 과정에서 다수의 string 객체가 만들어짐. 개선 가능할지
        text = text.toLowerCase()
                .chars()
                .mapToObj(i -> (char) i)
                .filter(Palindrome::allowedChar)
                .collect(Collector.of(
                        StringBuilder::new,
                        StringBuilder::append,
                        StringBuilder::append,
                        StringBuilder::toString));

        // 방법1
        /*
        var middle = text.length() / 2;
        for (int i = 0; i < middle; i++) {
            if (text.charAt(i) != text.charAt(text.length() - 1 - i)) {
                return false;
            }
        }
         */

        // 방법2
        return text.contentEquals(new StringBuilder(text).reverse());
    }

    public static boolean allowedChar(char c) {
        return Character.isLetterOrDigit(c);
    }
}
