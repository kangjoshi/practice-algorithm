package strings;

/**
 * 가장 긴 팰린드롬 부분 문자열
 * - 가장 긴 팰린드롬 부분 문자열을 출력
 * - dcbabcdd -> dcbabcd
 * 조건
 *  -
 * */

public class LongestPalindrome {

    int left = 0;
    int maxLen = 0;

    public String palindrome(String input) {
        if (input.length() < 2) {
            return input;
        }

        for (int i = 0; i < input.length(); i++) {
            extentPalindrome(input, i, i + 1); // 2칸 포인터
            extentPalindrome(input, i, i + 2); // 3칸 포인터
        }

        return input.substring(left, left + maxLen);
    }

    /**
     * 시도
     * - 풀이 참고
     * 풀이
     * -
     * 회고
     * - 풀이를이해 하기도 어려 웠다..
     * - 팰린드롬이 성립할 수 있는 조건을 찾고 주변으로 확장 해나가는 방법
     * - 시작점부터 찾는게 아니라 성립 하는 지점을 찾고 주변으로 확장 하는 방식, 많이 쓰일 것 같다.
     * */
    public void extentPalindrome(String str, int j, int k) {
        // j >= 0 : j가 첫자 이상이면서, k < str.lenth() : k가 마지막 글자 전 == 유효한 문자 범위 내
        while (j >= 0 && k < str.length() && str.charAt(j) == str.charAt(k)) {
            j--;
            k++;
        }

        if (maxLen < k - j - 1) {
            left = j + 1;   // 위에서 +1 되었기 때문
            maxLen = k - j - 1; // 위에서 -1 되었기 때문
        }
    }

    public static void main(String[] args) {
        var input = "adcbabcdd";

        var longestPalindrome = new LongestPalindrome();
        var palindrome = longestPalindrome.palindrome(input);
        System.out.println(palindrome);
    }



}
